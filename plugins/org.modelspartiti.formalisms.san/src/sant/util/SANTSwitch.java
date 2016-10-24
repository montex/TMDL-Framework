/**
 */
package sant.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sant.*;

import tmdl.core.TemplateModel;

import tmdl.expressions.TemplateExpression;
import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sant.SANTPackage
 * @generated
 */
public class SANTSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SANTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANTSwitch() {
		if (modelPackage == null) {
			modelPackage = SANTPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SANTPackage.SANT: {
				SANT sant = (SANT)theEObject;
				T result = caseSANT(sant);
				if (result == null) result = caseTemplateModel(sant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNamedElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.NORMAL_PLACE: {
				NormalPlace normalPlace = (NormalPlace)theEObject;
				T result = caseNormalPlace(normalPlace);
				if (result == null) result = casePlace(normalPlace);
				if (result == null) result = caseNamedElement(normalPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXTENDED_PLACE: {
				ExtendedPlace extendedPlace = (ExtendedPlace)theEObject;
				T result = caseExtendedPlace(extendedPlace);
				if (result == null) result = casePlace(extendedPlace);
				if (result == null) result = caseNamedElement(extendedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.CASES_SPECIFICATION: {
				CasesSpecification casesSpecification = (CasesSpecification)theEObject;
				T result = caseCasesSpecification(casesSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.CASES_SPECIFICATION_CASES: {
				CasesSpecificationCases casesSpecificationCases = (CasesSpecificationCases)theEObject;
				T result = caseCasesSpecificationCases(casesSpecificationCases);
				if (result == null) result = caseCasesSpecification(casesSpecificationCases);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY: {
				CasesSpecificationProbabilityArray casesSpecificationProbabilityArray = (CasesSpecificationProbabilityArray)theEObject;
				T result = caseCasesSpecificationProbabilityArray(casesSpecificationProbabilityArray);
				if (result == null) result = caseCasesSpecification(casesSpecificationProbabilityArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC: {
				CasesSpecificationParametric casesSpecificationParametric = (CasesSpecificationParametric)theEObject;
				T result = caseCasesSpecificationParametric(casesSpecificationParametric);
				if (result == null) result = caseCasesSpecification(casesSpecificationParametric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.ARC: {
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.INPUT_ARC: {
				InputArc inputArc = (InputArc)theEObject;
				T result = caseInputArc(inputArc);
				if (result == null) result = caseArc(inputArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.OUTPUT_ARC: {
				OutputArc outputArc = (OutputArc)theEObject;
				T result = caseOutputArc(outputArc);
				if (result == null) result = caseArc(outputArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.OUTPUT_GATE: {
				OutputGate outputGate = (OutputGate)theEObject;
				T result = caseOutputGate(outputGate);
				if (result == null) result = caseGate(outputGate);
				if (result == null) result = caseNamedElement(outputGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.OUTPUT_GATE_CONCRETE: {
				OutputGateConcrete outputGateConcrete = (OutputGateConcrete)theEObject;
				T result = caseOutputGateConcrete(outputGateConcrete);
				if (result == null) result = caseOutputGate(outputGateConcrete);
				if (result == null) result = caseGate(outputGateConcrete);
				if (result == null) result = caseNamedElement(outputGateConcrete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.OUTPUT_GATE_TEMPLATE: {
				OutputGateTemplate outputGateTemplate = (OutputGateTemplate)theEObject;
				T result = caseOutputGateTemplate(outputGateTemplate);
				if (result == null) result = caseOutputGate(outputGateTemplate);
				if (result == null) result = caseGate(outputGateTemplate);
				if (result == null) result = caseNamedElement(outputGateTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.INPUT_GATE: {
				InputGate inputGate = (InputGate)theEObject;
				T result = caseInputGate(inputGate);
				if (result == null) result = caseGate(inputGate);
				if (result == null) result = caseNamedElement(inputGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.INSTANTANEOUS_ACTIVITY: {
				InstantaneousActivity instantaneousActivity = (InstantaneousActivity)theEObject;
				T result = caseInstantaneousActivity(instantaneousActivity);
				if (result == null) result = caseActivity(instantaneousActivity);
				if (result == null) result = caseNamedElement(instantaneousActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.TIMED_ACTIVITY: {
				TimedActivity timedActivity = (TimedActivity)theEObject;
				T result = caseTimedActivity(timedActivity);
				if (result == null) result = caseActivity(timedActivity);
				if (result == null) result = caseNamedElement(timedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.DISTRIBUTION: {
				Distribution distribution = (Distribution)theEObject;
				T result = caseDistribution(distribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_SEGMENT: {
				ExpressionSegment expressionSegment = (ExpressionSegment)theEObject;
				T result = caseExpressionSegment(expressionSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_TEXT: {
				ExpressionText expressionText = (ExpressionText)theEObject;
				T result = caseExpressionText(expressionText);
				if (result == null) result = caseExpressionSegment(expressionText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_MARKING: {
				ExpressionMarking expressionMarking = (ExpressionMarking)theEObject;
				T result = caseExpressionMarking(expressionMarking);
				if (result == null) result = caseExpressionSegment(expressionMarking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_VARIABLE: {
				ExpressionVariable expressionVariable = (ExpressionVariable)theEObject;
				T result = caseExpressionVariable(expressionVariable);
				if (result == null) result = caseExpressionSegment(expressionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_TEMPLATE_EXPRESSION: {
				ExpressionTemplateExpression expressionTemplateExpression = (ExpressionTemplateExpression)theEObject;
				T result = caseExpressionTemplateExpression(expressionTemplateExpression);
				if (result == null) result = caseExpressionSegment(expressionTemplateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_ITERATION_ELEMENT: {
				ExpressionIterationElement expressionIterationElement = (ExpressionIterationElement)theEObject;
				T result = caseExpressionIterationElement(expressionIterationElement);
				if (result == null) result = caseExpressionSegment(expressionIterationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER: {
				ExpressionActivityCasesNumber expressionActivityCasesNumber = (ExpressionActivityCasesNumber)theEObject;
				T result = caseExpressionActivityCasesNumber(expressionActivityCasesNumber);
				if (result == null) result = caseExpressionSegment(expressionActivityCasesNumber);
				if (result == null) result = caseTemplateExpressionInteger(expressionActivityCasesNumber);
				if (result == null) result = caseTemplateExpression(expressionActivityCasesNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_PLACE_TEMPLATE_SIZE: {
				ExpressionPlaceTemplateSize expressionPlaceTemplateSize = (ExpressionPlaceTemplateSize)theEObject;
				T result = caseExpressionPlaceTemplateSize(expressionPlaceTemplateSize);
				if (result == null) result = caseExpressionSegment(expressionPlaceTemplateSize);
				if (result == null) result = caseTemplateExpressionInteger(expressionPlaceTemplateSize);
				if (result == null) result = caseTemplateExpression(expressionPlaceTemplateSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_IF_THEN_ELSE: {
				ExpressionIfThenElse expressionIfThenElse = (ExpressionIfThenElse)theEObject;
				T result = caseExpressionIfThenElse(expressionIfThenElse);
				if (result == null) result = caseExpressionSegment(expressionIfThenElse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPRESSION_LOOP: {
				ExpressionLoop expressionLoop = (ExpressionLoop)theEObject;
				T result = caseExpressionLoop(expressionLoop);
				if (result == null) result = caseExpressionSegment(expressionLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.VARIABILITY_ITERATOR: {
				VariabilityIterator variabilityIterator = (VariabilityIterator)theEObject;
				T result = caseVariabilityIterator(variabilityIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.THIS_CONTEXT_ITERATOR: {
				ThisContextIterator thisContextIterator = (ThisContextIterator)theEObject;
				T result = caseThisContextIterator(thisContextIterator);
				if (result == null) result = caseVariabilityIterator(thisContextIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.LOOP_ITERATOR: {
				LoopIterator loopIterator = (LoopIterator)theEObject;
				T result = caseLoopIterator(loopIterator);
				if (result == null) result = caseVariabilityIterator(loopIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.MARKING: {
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.MARKING_INTEGER: {
				MarkingInteger markingInteger = (MarkingInteger)theEObject;
				T result = caseMarkingInteger(markingInteger);
				if (result == null) result = caseMarkingSimple(markingInteger);
				if (result == null) result = caseMarking(markingInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.MARKING_EXTENDED: {
				MarkingExtended markingExtended = (MarkingExtended)theEObject;
				T result = caseMarkingExtended(markingExtended);
				if (result == null) result = caseMarking(markingExtended);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = caseNamedElement(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.MARKING_VARIABLE_SIMPLE: {
				MarkingVariableSimple markingVariableSimple = (MarkingVariableSimple)theEObject;
				T result = caseMarkingVariableSimple(markingVariableSimple);
				if (result == null) result = caseMarkingSimple(markingVariableSimple);
				if (result == null) result = caseMarking(markingVariableSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.EXPONENTIAL: {
				Exponential exponential = (Exponential)theEObject;
				T result = caseExponential(exponential);
				if (result == null) result = caseDistribution(exponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.NORMAL: {
				Normal normal = (Normal)theEObject;
				T result = caseNormal(normal);
				if (result == null) result = caseDistribution(normal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.GAMMA: {
				Gamma gamma = (Gamma)theEObject;
				T result = caseGamma(gamma);
				if (result == null) result = caseDistribution(gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.BINOMIAL: {
				Binomial binomial = (Binomial)theEObject;
				T result = caseBinomial(binomial);
				if (result == null) result = caseDistribution(binomial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.DETERMINISTIC: {
				Deterministic deterministic = (Deterministic)theEObject;
				T result = caseDeterministic(deterministic);
				if (result == null) result = caseDistribution(deterministic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.LOGNORMAL: {
				Lognormal lognormal = (Lognormal)theEObject;
				T result = caseLognormal(lognormal);
				if (result == null) result = caseDistribution(lognormal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.BETA: {
				Beta beta = (Beta)theEObject;
				T result = caseBeta(beta);
				if (result == null) result = caseDistribution(beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.NEGATIVE_BINOMIAL: {
				NegativeBinomial negativeBinomial = (NegativeBinomial)theEObject;
				T result = caseNegativeBinomial(negativeBinomial);
				if (result == null) result = caseDistribution(negativeBinomial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.GEOMETRIC: {
				Geometric geometric = (Geometric)theEObject;
				T result = caseGeometric(geometric);
				if (result == null) result = caseDistribution(geometric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.ERLANG: {
				Erlang erlang = (Erlang)theEObject;
				T result = caseErlang(erlang);
				if (result == null) result = caseDistribution(erlang);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.UNIFORM: {
				Uniform uniform = (Uniform)theEObject;
				T result = caseUniform(uniform);
				if (result == null) result = caseDistribution(uniform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.HYPER_EXPONENTIAL: {
				HyperExponential hyperExponential = (HyperExponential)theEObject;
				T result = caseHyperExponential(hyperExponential);
				if (result == null) result = caseDistribution(hyperExponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.WEIBULL: {
				Weibull weibull = (Weibull)theEObject;
				T result = caseWeibull(weibull);
				if (result == null) result = caseDistribution(weibull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.TRIANGULAR: {
				Triangular triangular = (Triangular)theEObject;
				T result = caseTriangular(triangular);
				if (result == null) result = caseDistribution(triangular);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.CONDITIONAL_WEIBULL: {
				ConditionalWeibull conditionalWeibull = (ConditionalWeibull)theEObject;
				T result = caseConditionalWeibull(conditionalWeibull);
				if (result == null) result = caseDistribution(conditionalWeibull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.HYPO_EXPONENTIAL: {
				HypoExponential hypoExponential = (HypoExponential)theEObject;
				T result = caseHypoExponential(hypoExponential);
				if (result == null) result = caseDistribution(hypoExponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.PARETO: {
				Pareto pareto = (Pareto)theEObject;
				T result = casePareto(pareto);
				if (result == null) result = caseDistribution(pareto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.MARKING_SIMPLE: {
				MarkingSimple markingSimple = (MarkingSimple)theEObject;
				T result = caseMarkingSimple(markingSimple);
				if (result == null) result = caseMarking(markingSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.MARKING_STRING: {
				MarkingString markingString = (MarkingString)theEObject;
				T result = caseMarkingString(markingString);
				if (result == null) result = caseMarkingExtended(markingString);
				if (result == null) result = caseMarking(markingString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANTPackage.MARKING_VARIABLE_EXTENDED: {
				MarkingVariableExtended markingVariableExtended = (MarkingVariableExtended)theEObject;
				T result = caseMarkingVariableExtended(markingVariableExtended);
				if (result == null) result = caseMarkingExtended(markingVariableExtended);
				if (result == null) result = caseMarking(markingVariableExtended);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SANT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SANT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSANT(SANT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalPlace(NormalPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedPlace(ExtendedPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cases Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cases Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasesSpecification(CasesSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cases Specification Cases</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cases Specification Cases</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasesSpecificationCases(CasesSpecificationCases object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cases Specification Probability Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cases Specification Probability Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasesSpecificationProbabilityArray(CasesSpecificationProbabilityArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cases Specification Parametric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cases Specification Parametric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasesSpecificationParametric(CasesSpecificationParametric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputArc(InputArc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputArc(OutputArc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputGate(OutputGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Gate Concrete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Gate Concrete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputGateConcrete(OutputGateConcrete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Gate Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Gate Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputGateTemplate(OutputGateTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputGate(InputGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantaneous Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantaneous Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantaneousActivity(InstantaneousActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedActivity(TimedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistribution(Distribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionSegment(ExpressionSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionText(ExpressionText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionMarking(ExpressionMarking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionVariable(ExpressionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Template Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Template Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionTemplateExpression(ExpressionTemplateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Iteration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Iteration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionIterationElement(ExpressionIterationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Activity Cases Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Activity Cases Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionActivityCasesNumber(ExpressionActivityCasesNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Place Template Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Place Template Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionPlaceTemplateSize(ExpressionPlaceTemplateSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression If Then Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionIfThenElse(ExpressionIfThenElse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionLoop(ExpressionLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variability Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variability Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariabilityIterator(VariabilityIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Context Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Context Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThisContextIterator(ThisContextIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopIterator(LoopIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingInteger(MarkingInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Extended</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Extended</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingExtended(MarkingExtended object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Variable Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Variable Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingVariableSimple(MarkingVariableSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponential(Exponential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormal(Normal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamma(Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binomial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binomial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinomial(Binomial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deterministic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deterministic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeterministic(Deterministic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lognormal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lognormal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLognormal(Lognormal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeta(Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Binomial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Binomial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeBinomial(NegativeBinomial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometric(Geometric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erlang</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erlang</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErlang(Erlang object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniform(Uniform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyper Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyper Exponential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperExponential(HyperExponential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weibull</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weibull</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeibull(Weibull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangular(Triangular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Weibull</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Weibull</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalWeibull(ConditionalWeibull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypo Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypo Exponential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypoExponential(HypoExponential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pareto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pareto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePareto(Pareto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingSimple(MarkingSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingString(MarkingString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Variable Extended</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Variable Extended</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingVariableExtended(MarkingVariableExtended object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateModel(TemplateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpression(TemplateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionInteger(TemplateExpressionInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SANTSwitch
