package sant2san.queries

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.modelspartiti.formalisms.san.san.Activity
import org.modelspartiti.formalisms.san.san.ExpressionText
import org.modelspartiti.formalisms.san.san.Place
import org.modelspartiti.formalisms.san.san.SAN
import org.modelspartiti.formalisms.san.san.SANPackage
import org.modelspartiti.formalisms.san.san.impl.InputGateImpl
import org.modelspartiti.formalisms.san.san.impl.OutputGateImpl
import org.modelspartiti.formalisms.san.sant.InputGateTemplate
import org.modelspartiti.formalisms.san.sant.OutputGateTemplate
import org.modelspartiti.formalisms.san.sant.SANT
import org.modelspartiti.formalisms.san.sant.SANTPackage
import org.modelspartiti.infrastructure.tmdl.core.AssignmentArray
import org.modelspartiti.infrastructure.tmdl.core.CorePackage
import org.modelspartiti.infrastructure.tmdl.core.MultiplicityParametric
import org.modelspartiti.infrastructure.tmdl.core.ParameterArray
import org.modelspartiti.formalisms.san.san.Expression
import org.modelspartiti.formalisms.san.san.NamedElement
import com.google.common.collect.Iterators
import java.util.List
import java.util.Iterator

class Sant2SanTransformation {
	/** VIATRA Query Pattern group **/
	val extension Sant2SanQueries sant2san = Sant2SanQueries.instance

	/** EMF metamodels **/
	val extension SANTPackage santPackage = SANTPackage.eINSTANCE
	val extension SANPackage sanPackage = SANPackage.eINSTANCE
	val extension CorePackage corePackage = CorePackage.eINSTANCE

	extension IModelManipulations manipulation

	protected ViatraQueryEngine engine
	protected Resource resource

	/* costanti */
	val FUNCTION_CONST = 0;
	val PREDICATE_CONST = 1;

	val SANT sant
	val SAN san
	val EList<AssignmentArray> params

	new(SANT sant, SAN san, EList<AssignmentArray> params) {
		this.sant = sant
		this.san = san
		this.params = params
		resource = sant.eResource
		val scope = new EMFScope(resource)
		// this.engine = engine
		this.engine = ViatraQueryEngine.on(scope)
		this.manipulation = new SimpleModelManipulations(engine)
	// execute
	}

	public def execute() {

		san.set(SAN_Name, sant.name.concat(" derived"))

		val places = engine.getMatcher(placeInstance).allMatches

		for (match : places) {
			val place = match.place
			san.createChild(SAN_Places, sanPackage.place) => [
				set(namedElement_Name, place.name)
				set(place_Type, place.type)
				set(place_Marking, place.marking)
			]
		}

		val activities = engine.getMatcher(instantActivityInstance).allMatches

		for (match : activities) {
			val activity = match.activity

			san.createChild(SAN_Activities, sanPackage.instantaneousActivity) => [
				set(namedElement_Name, activity.name)
				it.createChild(activity_Cases, sanPackage.^case) => [
					set(case_ID, match.cases.ID)
					set(case_P, match.cases.p)
				]
			]
		}

		val inputArcs = engine.getMatcher(inputArcInstance).allMatches

		for (match : inputArcs) {
			val source = san.places.findFirst[it.name == match.arc.source.name]
			val target = san.activities.findFirst[it.name == match.arc.target.name]

			san.createChild(SAN_Arcs, sanPackage.inputArc) => [
				set(sanPackage.inputArc_Source, source)
				set(sanPackage.inputArc_Target, target)
			]
		}

		val outputArcs = engine.getMatcher(outputArcInstance).allMatches

		for (match : outputArcs) {
			val source = san.activities.findFirst[it.name == match.arc.source.name].cases.get(0)
			val target = san.places.findFirst[it.name == match.arc.target.name]

			san.createChild(SAN_Arcs, sanPackage.outputArc) => [
				set(sanPackage.outputArc_Source, source)
				set(sanPackage.outputArc_Target, target)
			]
		}

		val tempPlace = engine.getMatcher(placeTemplateInstance).allMatches

		for (match : tempPlace) {
			val mul = match.place.multiplicity as MultiplicityParametric
			val values = params.findFirst[it.parameter.name == mul.parameter.name].values
			for (placeVal : values) {
				val place = match.place
				san.createChild(SAN_Places, sanPackage.place) => [
					set(namedElement_Name, place.name.concat(placeVal.intValue.toString))
					it.createChild(place_Type, primitiveType)
					it.createChild(place_Marking, markingSimple)
				]
			}

		}

		val timedActivitiesTemp = engine.getMatcher(timedActivityTemplateInstance).allMatches
		// TODO activation and reactivation expression transformation
		for (match : timedActivitiesTemp) {
			val casesAssign = match.activity.casesTemplate.eGet(
				casesSpecificationProbabilityArray_CaseParameter) as ParameterArray
			val probAssign = match.activity.casesTemplate.eGet(
				casesSpecificationProbabilityArray_PValues) as ParameterArray
			val casesIt = params.findFirst[it.parameter.name == casesAssign.name].values.iterator
			val probIt = params.findFirst[it.parameter.name == probAssign.name].values.iterator

			san.createChild(SAN_Activities, sanPackage.timedActivity) => [
				set(namedElement_Name, match.activity.name)

				it.set(timedActivity_TimeDistribution, match.activity.timeDistribution)

				while (casesIt.hasNext) {
					it.createChild(activity_Cases, sanPackage.^case) => [
						set(case_ID, casesIt.next.intValue)
						it.createChild(case_P, sanPackage.expression) => [
							it.createChild(expression_Segments, expressionText) => [
								set(expressionText_Text, probIt.next.toString)
							]
						]
					]
				}

			]

		}

		val inputGatesTemp = engine.getMatcher(inputGateTemplateInstance).allMatches

		for (match : inputGatesTemp) {
			val inputGate_temp = match.get(0) as InputGateTemplate

			san.createChild(SAN_Gates, sanPackage.inputGate) => [

				val EList<Activity> inputActivities = new BasicEList<Activity>()
				val EList<Place> inputPlaces = new BasicEList<Place>()

				for (act : inputGate_temp.activity) {
					inputActivities.add(san.activities.findFirst[it.name == act.name])
				}
				for (place : inputGate_temp.places) {
					inputPlaces.add(san.places.findFirst[it.name == place.name])
				}
				for (place : inputGate_temp.placeTemplate) {
					inputPlaces.addAll(san.places.filter[it.name.matches(^place.name)])
				}

				add(inputGate_Activity, inputActivities)
				set(namedElement_Name, inputGate_temp.name)
				add(gate_Places, inputPlaces)
				var exp = inputGate_temp.function.segments.get(0) as ExpressionText // TODO una solo expression text ad expression?
				val func_text = expEval(FUNCTION_CONST, exp.text, it)
				it.createChild(gate_Function, sanPackage.expression) => [
					it.createChild(expression_Segments, expressionText) => [
						set(expressionText_Text, func_text)
					]
				]

				exp = inputGate_temp.predicate.segments.get(0) as ExpressionText; // TODO una solo expression text ad expression?
				val pred_text = expEval(PREDICATE_CONST, exp.text, it)
				it.createChild(inputGate_Predicate, sanPackage.expression) => [
					it.createChild(expression_Segments, expressionText) => [
						set(expressionText_Text, pred_text)
					]
				]

			]

		}

		val outputGatesTemp = engine.getMatcher(outputGateTemplateInstance).allMatches

		for (match : outputGatesTemp) {
			val outputGate_temp = match.get(0) as OutputGateTemplate

			for (act : outputGate_temp.activity) {
				val cases = san.activities.findFirst[it.name == act.name].cases

				for (cs : cases) {

					san.createChild(SAN_Gates, sanPackage.outputGate) => [

						// val EList<Case> outputActivityCases = new BasicEList<Case>()
						val EList<Place> outuputPlaces = new BasicEList<Place>()

						for (place : outputGate_temp.places) {
							outuputPlaces.add(san.places.findFirst[it.name == place.name])
						}
						for (place : outputGate_temp.placeTemplate) {
							outuputPlaces.add(san.places.findFirst[it.name.matches(place.name + cs.ID.toString)])
						}

						add(outputGate_ActivityCase, cs)
						set(namedElement_Name, outputGate_temp.name.concat(cs.ID.toString))
						add(gate_Places, outuputPlaces)
						var exp = outputGate_temp.function.segments.get(0) as ExpressionText // TODO una solo expression text ad expression?
						val func_text = expEval(FUNCTION_CONST, exp.text, it)
						it.createChild(gate_Function, sanPackage.expression) => [
							it.createChild(expression_Segments, expressionText) => [
								set(expressionText_Text, func_text)
							]
						]

					]

				}

			}

		}

	}

	/*
	 * expType: 0 = function, 1 = predicate
	 * expText: testo expression
	 */
	private def String expEval(int expType, String expText, EObject gate) {

		var subStr = ""
		var expEvalued = expText

		if (gate instanceof InputGateImpl) {
			if (expType == FUNCTION_CONST) {
				if (expEvalued.matches(".*@ALL.*")) {
					val entity = expEvalued.substring(expEvalued.indexOf("(") + 1, expEvalued.indexOf(")"))
					println(entity)
					subStr = expEvalued.substring(expEvalued.indexOf("{") + 1, expEvalued.indexOf("}"))
					println(subStr)
					var entities = san.eAllContents.filter [
						it instanceof NamedElement && it.eGet(namedElement_Name).toString.matches(entity + "[0-9\\.]*") ||
							it.eGet(namedElement_Name).toString.matches(entity)
					]

					var text = ""
					while (entities.hasNext) {
						val tmp = subStr
						text = text + tmp.replace(entity, entities.next.eGet(namedElement_Name).toString)
						if (entities.hasNext)
							text = text + ";"
					}
					println(text)
					expEvalued = expEvalued.replace(subStr, text).trim
					expEvalued = expEvalued.replace("@ALL(" + entity + ")", "").trim
					expEvalued = expEvalued.replace("{", "").trim
					expEvalued = expEvalued.replace("}", "").trim
					println(expEvalued)
					expEvalued = expEval(expType, expEvalued, gate)
				}
			} else if (expType == PREDICATE_CONST) {
				if (expEvalued.matches(".*@ALL.*")) {
					val entity = expEvalued.substring(expEvalued.indexOf("(") + 1, expEvalued.indexOf(")"))
					subStr = expEvalued.substring(expEvalued.indexOf("{") + 1, expEvalued.indexOf("}"))

					var entities = san.eAllContents.filter [
						it instanceof NamedElement && it.eGet(namedElement_Name).toString.matches(entity + "[0-9\\.]*") ||
							it.eGet(namedElement_Name).toString.matches(entity)
					]

					var text = ""
					while (entities.hasNext) {
						val tmp = subStr
						text = text + tmp.replace(entity, entities.next.eGet(namedElement_Name).toString)
						if (entities.hasNext)
							text = text + " && "
					}

					expEvalued = expEvalued.replace(subStr, text).trim
					expEvalued = expEvalued.replace("@ALL(" + entity + ")", "").trim
					expEvalued = expEvalued.replace("{", "").trim
					expEvalued = expEvalued.replace("}", "").trim
					expEvalued = expEval(expType, expEvalued, gate)
				}
			}
		} else if (gate instanceof OutputGateImpl) {
			if (expType == FUNCTION_CONST) {
				if (expEvalued.matches(".*@CASE.*")) {
					expEvalued = expEvalued.replace("@CASE", gate.activityCase.get(0).ID.toString)
					expEvalued = expEval(expType, expEvalued, gate)
				} else if (expEvalued.matches(".*@ALL.*")) {
					val entity = expEvalued.substring(expEvalued.indexOf("(") + 1, expEvalued.indexOf(")"))
					subStr = expEvalued.substring(expEvalued.indexOf("{") + 1, expEvalued.indexOf("}"))

					var entities = san.eAllContents.filter [
						it instanceof NamedElement && it.eGet(namedElement_Name).toString.matches(entity + "[0-9\\.]*") ||
							it.eGet(namedElement_Name).toString.matches(entity)
					]

					var text = ""
					while (entities.hasNext) {
						val tmp = subStr
						text = text + tmp.replace(entity, entities.next.eGet(namedElement_Name).toString)
						if (entities.hasNext)
							text = text + " && "
					}

					expEvalued = expEvalued.replace(subStr, text).trim
					expEvalued = expEvalued.replace("@ALL(" + entity + ")", "").trim
					expEvalued = expEvalued.replace("{", "").trim
					expEvalued = expEvalued.replace("}", "").trim
					expEvalued = expEval(expType, expEvalued, gate)
				}
			}
		}

		if (expEvalued.matches(".*@..*")) {
			println("entrato Param")
			subStr = expEvalued.substring(expEvalued.indexOf("@") + 1, expEvalued.indexOf("@") + 2)
			expEvalued = expEvalued.replace("@" + subStr, "Val") // TODO AssignmentArray -> Assignment
			expEvalued = expEval(expType, expEvalued, gate)
		} else if (expEvalued.matches(".*@.\\[.*")) {
			println("entrato vector")
			subStr = expEvalued.substring(expEvalued.indexOf("@") + 1, expEvalued.indexOf("@") + 2)
		}

		println(expEvalued)
		return expEvalued

	}

}
