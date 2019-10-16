/**
 */
package san.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import san.*;
import tmdl.core.ConcreteModel;

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
 * @see san.SANPackage
 * @generated
 */
public class SANSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SANPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANSwitch() {
		if (modelPackage == null) {
			modelPackage = SANPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SANPackage.SAN: {
				SAN san = (SAN)theEObject;
				T1 result = caseSAN(san);
				if (result == null) result = caseConcreteModel(san);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.PLACE: {
				Place place = (Place)theEObject;
				T1 result = casePlace(place);
				if (result == null) result = caseNamedElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T1 result = caseActivity(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T1 result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.CASE: {
				Case case_ = (Case)theEObject;
				T1 result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.ARC: {
				Arc arc = (Arc)theEObject;
				T1 result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.INPUT_ARC: {
				InputArc inputArc = (InputArc)theEObject;
				T1 result = caseInputArc(inputArc);
				if (result == null) result = caseArc(inputArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.OUTPUT_ARC: {
				OutputArc outputArc = (OutputArc)theEObject;
				T1 result = caseOutputArc(outputArc);
				if (result == null) result = caseArc(outputArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T1 result = caseGate(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.OUTPUT_GATE: {
				OutputGate outputGate = (OutputGate)theEObject;
				T1 result = caseOutputGate(outputGate);
				if (result == null) result = caseGate(outputGate);
				if (result == null) result = caseNamedElement(outputGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.INPUT_GATE: {
				InputGate inputGate = (InputGate)theEObject;
				T1 result = caseInputGate(inputGate);
				if (result == null) result = caseGate(inputGate);
				if (result == null) result = caseNamedElement(inputGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.INSTANTANEOUS_ACTIVITY: {
				InstantaneousActivity instantaneousActivity = (InstantaneousActivity)theEObject;
				T1 result = caseInstantaneousActivity(instantaneousActivity);
				if (result == null) result = caseActivity(instantaneousActivity);
				if (result == null) result = caseNamedElement(instantaneousActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.TIMED_ACTIVITY: {
				TimedActivity timedActivity = (TimedActivity)theEObject;
				T1 result = caseTimedActivity(timedActivity);
				if (result == null) result = caseActivity(timedActivity);
				if (result == null) result = caseNamedElement(timedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.DISTRIBUTION: {
				Distribution distribution = (Distribution)theEObject;
				T1 result = caseDistribution(distribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T1 result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION_TEXT: {
				ExpressionText expressionText = (ExpressionText)theEObject;
				T1 result = caseExpressionText(expressionText);
				if (result == null) result = caseExpressionSegment(expressionText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION_MARKING: {
				ExpressionMarking expressionMarking = (ExpressionMarking)theEObject;
				T1 result = caseExpressionMarking(expressionMarking);
				if (result == null) result = caseExpressionSegment(expressionMarking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION_VARIABLE: {
				ExpressionVariable expressionVariable = (ExpressionVariable)theEObject;
				T1 result = caseExpressionVariable(expressionVariable);
				if (result == null) result = caseExpressionSegment(expressionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING: {
				Marking marking = (Marking)theEObject;
				T1 result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_INTEGER: {
				MarkingInteger markingInteger = (MarkingInteger)theEObject;
				T1 result = caseMarkingInteger(markingInteger);
				if (result == null) result = caseMarkingSimple(markingInteger);
				if (result == null) result = caseMarking(markingInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_EXTENDED: {
				MarkingExtended markingExtended = (MarkingExtended)theEObject;
				T1 result = caseMarkingExtended(markingExtended);
				if (result == null) result = caseMarking(markingExtended);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T1 result = caseGlobalVariable(globalVariable);
				if (result == null) result = caseNamedElement(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_GLOBAL_VARIABLE_SIMPLE: {
				MarkingGlobalVariableSimple markingGlobalVariableSimple = (MarkingGlobalVariableSimple)theEObject;
				T1 result = caseMarkingGlobalVariableSimple(markingGlobalVariableSimple);
				if (result == null) result = caseMarkingSimple(markingGlobalVariableSimple);
				if (result == null) result = caseMarking(markingGlobalVariableSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPONENTIAL: {
				Exponential exponential = (Exponential)theEObject;
				T1 result = caseExponential(exponential);
				if (result == null) result = caseDistribution(exponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NORMAL: {
				Normal normal = (Normal)theEObject;
				T1 result = caseNormal(normal);
				if (result == null) result = caseDistribution(normal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.GAMMA: {
				Gamma gamma = (Gamma)theEObject;
				T1 result = caseGamma(gamma);
				if (result == null) result = caseDistribution(gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.BINOMIAL: {
				Binomial binomial = (Binomial)theEObject;
				T1 result = caseBinomial(binomial);
				if (result == null) result = caseDistribution(binomial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.DETERMINISTIC: {
				Deterministic deterministic = (Deterministic)theEObject;
				T1 result = caseDeterministic(deterministic);
				if (result == null) result = caseDistribution(deterministic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.LOGNORMAL: {
				Lognormal lognormal = (Lognormal)theEObject;
				T1 result = caseLognormal(lognormal);
				if (result == null) result = caseDistribution(lognormal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.BETA: {
				Beta beta = (Beta)theEObject;
				T1 result = caseBeta(beta);
				if (result == null) result = caseDistribution(beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NEGATIVE_BINOMIAL: {
				NegativeBinomial negativeBinomial = (NegativeBinomial)theEObject;
				T1 result = caseNegativeBinomial(negativeBinomial);
				if (result == null) result = caseDistribution(negativeBinomial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.GEOMETRIC: {
				Geometric geometric = (Geometric)theEObject;
				T1 result = caseGeometric(geometric);
				if (result == null) result = caseDistribution(geometric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.ERLANG: {
				Erlang erlang = (Erlang)theEObject;
				T1 result = caseErlang(erlang);
				if (result == null) result = caseDistribution(erlang);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.UNIFORM: {
				Uniform uniform = (Uniform)theEObject;
				T1 result = caseUniform(uniform);
				if (result == null) result = caseDistribution(uniform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.HYPER_EXPONENTIAL: {
				HyperExponential hyperExponential = (HyperExponential)theEObject;
				T1 result = caseHyperExponential(hyperExponential);
				if (result == null) result = caseDistribution(hyperExponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.WEIBULL: {
				Weibull weibull = (Weibull)theEObject;
				T1 result = caseWeibull(weibull);
				if (result == null) result = caseDistribution(weibull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.TRIANGULAR: {
				Triangular triangular = (Triangular)theEObject;
				T1 result = caseTriangular(triangular);
				if (result == null) result = caseDistribution(triangular);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.CONDITIONAL_WEIBULL: {
				ConditionalWeibull conditionalWeibull = (ConditionalWeibull)theEObject;
				T1 result = caseConditionalWeibull(conditionalWeibull);
				if (result == null) result = caseDistribution(conditionalWeibull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.HYPO_EXPONENTIAL: {
				HypoExponential hypoExponential = (HypoExponential)theEObject;
				T1 result = caseHypoExponential(hypoExponential);
				if (result == null) result = caseDistribution(hypoExponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.PARETO: {
				Pareto pareto = (Pareto)theEObject;
				T1 result = casePareto(pareto);
				if (result == null) result = caseDistribution(pareto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION_SEGMENT: {
				ExpressionSegment expressionSegment = (ExpressionSegment)theEObject;
				T1 result = caseExpressionSegment(expressionSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_SIMPLE: {
				MarkingSimple markingSimple = (MarkingSimple)theEObject;
				T1 result = caseMarkingSimple(markingSimple);
				if (result == null) result = caseMarking(markingSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NORMAL_PLACE: {
				NormalPlace normalPlace = (NormalPlace)theEObject;
				T1 result = caseNormalPlace(normalPlace);
				if (result == null) result = casePlace(normalPlace);
				if (result == null) result = caseNamedElement(normalPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXTENDED_PLACE: {
				ExtendedPlace<?> extendedPlace = (ExtendedPlace<?>)theEObject;
				T1 result = caseExtendedPlace(extendedPlace);
				if (result == null) result = casePlace(extendedPlace);
				if (result == null) result = caseNamedElement(extendedPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_STRING: {
				MarkingString markingString = (MarkingString)theEObject;
				T1 result = caseMarkingString(markingString);
				if (result == null) result = caseMarkingExtended(markingString);
				if (result == null) result = caseMarking(markingString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_GLOBAL_VARIABLE_EXTENDED: {
				MarkingGlobalVariableExtended markingGlobalVariableExtended = (MarkingGlobalVariableExtended)theEObject;
				T1 result = caseMarkingGlobalVariableExtended(markingGlobalVariableExtended);
				if (result == null) result = caseMarkingExtended(markingGlobalVariableExtended);
				if (result == null) result = caseMarking(markingGlobalVariableExtended);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXTENDED_TYPE_DEFINITION: {
				ExtendedTypeDefinition extendedTypeDefinition = (ExtendedTypeDefinition)theEObject;
				T1 result = caseExtendedTypeDefinition(extendedTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T1 result = caseArrayType(arrayType);
				if (result == null) result = caseExtendedTypeDefinition(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NORMAL_EXTENDED_TYPE: {
				NormalExtendedType normalExtendedType = (NormalExtendedType)theEObject;
				T1 result = caseNormalExtendedType(normalExtendedType);
				if (result == null) result = caseExtendedTypeDefinition(normalExtendedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSAN(SAN object) {
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
	public T1 casePlace(Place object) {
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
	public T1 caseActivity(Activity object) {
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
	public T1 caseNamedElement(NamedElement object) {
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
	public T1 caseCase(Case object) {
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
	public T1 caseArc(Arc object) {
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
	public T1 caseInputArc(InputArc object) {
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
	public T1 caseOutputArc(OutputArc object) {
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
	public T1 caseGate(Gate object) {
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
	public T1 caseOutputGate(OutputGate object) {
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
	public T1 caseInputGate(InputGate object) {
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
	public T1 caseInstantaneousActivity(InstantaneousActivity object) {
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
	public T1 caseTimedActivity(TimedActivity object) {
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
	public T1 caseDistribution(Distribution object) {
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
	public T1 caseExpression(Expression object) {
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
	public T1 caseExpressionText(ExpressionText object) {
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
	public T1 caseExpressionMarking(ExpressionMarking object) {
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
	public T1 caseExpressionVariable(ExpressionVariable object) {
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
	public T1 caseMarking(Marking object) {
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
	public T1 caseMarkingInteger(MarkingInteger object) {
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
	public T1 caseMarkingExtended(MarkingExtended object) {
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
	public T1 caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Global Variable Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Global Variable Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMarkingGlobalVariableSimple(MarkingGlobalVariableSimple object) {
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
	public T1 caseExponential(Exponential object) {
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
	public T1 caseNormal(Normal object) {
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
	public T1 caseGamma(Gamma object) {
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
	public T1 caseBinomial(Binomial object) {
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
	public T1 caseDeterministic(Deterministic object) {
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
	public T1 caseLognormal(Lognormal object) {
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
	public T1 caseBeta(Beta object) {
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
	public T1 caseNegativeBinomial(NegativeBinomial object) {
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
	public T1 caseGeometric(Geometric object) {
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
	public T1 caseErlang(Erlang object) {
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
	public T1 caseUniform(Uniform object) {
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
	public T1 caseHyperExponential(HyperExponential object) {
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
	public T1 caseWeibull(Weibull object) {
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
	public T1 caseTriangular(Triangular object) {
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
	public T1 caseConditionalWeibull(ConditionalWeibull object) {
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
	public T1 caseHypoExponential(HypoExponential object) {
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
	public T1 casePareto(Pareto object) {
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
	public T1 caseExpressionSegment(ExpressionSegment object) {
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
	public T1 caseMarkingSimple(MarkingSimple object) {
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
	public T1 caseNormalPlace(NormalPlace object) {
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
	public <T extends ExtendedTypeDefinition> T1 caseExtendedPlace(ExtendedPlace<T> object) {
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
	public T1 caseMarkingString(MarkingString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Global Variable Extended</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Global Variable Extended</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMarkingGlobalVariableExtended(MarkingGlobalVariableExtended object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExtendedTypeDefinition(ExtendedTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Extended Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Extended Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNormalExtendedType(NormalExtendedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConcreteModel(ConcreteModel object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //SANSwitch
