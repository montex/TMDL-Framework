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
public class SANSwitch<T> extends Switch<T> {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SANPackage.SAN: {
				SAN san = (SAN)theEObject;
				T result = caseSAN(san);
				if (result == null) result = caseConcreteModel(san);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseNamedElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.INSTANTANEOUS_ACTIVITY: {
				InstantaneousActivity instantaneousActivity = (InstantaneousActivity)theEObject;
				T result = caseInstantaneousActivity(instantaneousActivity);
				if (result == null) result = caseActivity(instantaneousActivity);
				if (result == null) result = caseNamedElement(instantaneousActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.TIMED_ACTIVITY: {
				TimedActivity timedActivity = (TimedActivity)theEObject;
				T result = caseTimedActivity(timedActivity);
				if (result == null) result = caseActivity(timedActivity);
				if (result == null) result = caseNamedElement(timedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.ARC: {
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.INPUT_ARC: {
				InputArc inputArc = (InputArc)theEObject;
				T result = caseInputArc(inputArc);
				if (result == null) result = caseArc(inputArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.OUTPUT_ARC: {
				OutputArc outputArc = (OutputArc)theEObject;
				T result = caseOutputArc(outputArc);
				if (result == null) result = caseArc(outputArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.OUTPUT_GATE: {
				OutputGate outputGate = (OutputGate)theEObject;
				T result = caseOutputGate(outputGate);
				if (result == null) result = caseGate(outputGate);
				if (result == null) result = caseNamedElement(outputGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.INPUT_GATE: {
				InputGate inputGate = (InputGate)theEObject;
				T result = caseInputGate(inputGate);
				if (result == null) result = caseGate(inputGate);
				if (result == null) result = caseNamedElement(inputGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.DISTRIBUTION: {
				Distribution distribution = (Distribution)theEObject;
				T result = caseDistribution(distribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION_TEXT: {
				ExpressionText expressionText = (ExpressionText)theEObject;
				T result = caseExpressionText(expressionText);
				if (result == null) result = caseExpressionSegment(expressionText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION_MARKING: {
				ExpressionMarking expressionMarking = (ExpressionMarking)theEObject;
				T result = caseExpressionMarking(expressionMarking);
				if (result == null) result = caseExpressionSegment(expressionMarking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION_VARIABLE: {
				ExpressionVariable expressionVariable = (ExpressionVariable)theEObject;
				T result = caseExpressionVariable(expressionVariable);
				if (result == null) result = caseExpressionSegment(expressionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING: {
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = caseNamedElement(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPONENTIAL: {
				Exponential exponential = (Exponential)theEObject;
				T result = caseExponential(exponential);
				if (result == null) result = caseDistribution(exponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NORMAL: {
				Normal normal = (Normal)theEObject;
				T result = caseNormal(normal);
				if (result == null) result = caseDistribution(normal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.GAMMA: {
				Gamma gamma = (Gamma)theEObject;
				T result = caseGamma(gamma);
				if (result == null) result = caseDistribution(gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.BINOMIAL: {
				Binomial binomial = (Binomial)theEObject;
				T result = caseBinomial(binomial);
				if (result == null) result = caseDistribution(binomial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.DETERMINISTIC: {
				Deterministic deterministic = (Deterministic)theEObject;
				T result = caseDeterministic(deterministic);
				if (result == null) result = caseDistribution(deterministic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.LOGNORMAL: {
				Lognormal lognormal = (Lognormal)theEObject;
				T result = caseLognormal(lognormal);
				if (result == null) result = caseDistribution(lognormal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.BETA: {
				Beta beta = (Beta)theEObject;
				T result = caseBeta(beta);
				if (result == null) result = caseDistribution(beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NEGATIVE_BINOMIAL: {
				NegativeBinomial negativeBinomial = (NegativeBinomial)theEObject;
				T result = caseNegativeBinomial(negativeBinomial);
				if (result == null) result = caseDistribution(negativeBinomial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.GEOMETRIC: {
				Geometric geometric = (Geometric)theEObject;
				T result = caseGeometric(geometric);
				if (result == null) result = caseDistribution(geometric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.ERLANG: {
				Erlang erlang = (Erlang)theEObject;
				T result = caseErlang(erlang);
				if (result == null) result = caseDistribution(erlang);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.UNIFORM: {
				Uniform uniform = (Uniform)theEObject;
				T result = caseUniform(uniform);
				if (result == null) result = caseDistribution(uniform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.HYPER_EXPONENTIAL: {
				HyperExponential hyperExponential = (HyperExponential)theEObject;
				T result = caseHyperExponential(hyperExponential);
				if (result == null) result = caseDistribution(hyperExponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.WEIBULL: {
				Weibull weibull = (Weibull)theEObject;
				T result = caseWeibull(weibull);
				if (result == null) result = caseDistribution(weibull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.TRIANGULAR: {
				Triangular triangular = (Triangular)theEObject;
				T result = caseTriangular(triangular);
				if (result == null) result = caseDistribution(triangular);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.CONDITIONAL_WEIBULL: {
				ConditionalWeibull conditionalWeibull = (ConditionalWeibull)theEObject;
				T result = caseConditionalWeibull(conditionalWeibull);
				if (result == null) result = caseDistribution(conditionalWeibull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.HYPO_EXPONENTIAL: {
				HypoExponential hypoExponential = (HypoExponential)theEObject;
				T result = caseHypoExponential(hypoExponential);
				if (result == null) result = caseDistribution(hypoExponential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.PARETO: {
				Pareto pareto = (Pareto)theEObject;
				T result = casePareto(pareto);
				if (result == null) result = caseDistribution(pareto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.EXPRESSION_SEGMENT: {
				ExpressionSegment expressionSegment = (ExpressionSegment)theEObject;
				T result = caseExpressionSegment(expressionSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = caseType(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.CUSTOM_TYPE_DEFINITION: {
				CustomTypeDefinition customTypeDefinition = (CustomTypeDefinition)theEObject;
				T result = caseCustomTypeDefinition(customTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.CUSTOM_TYPE_ARRAY: {
				CustomTypeArray customTypeArray = (CustomTypeArray)theEObject;
				T result = caseCustomTypeArray(customTypeArray);
				if (result == null) result = caseCustomTypeDefinition(customTypeArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.CUSTOM_TYPE_STRUCT: {
				CustomTypeStruct customTypeStruct = (CustomTypeStruct)theEObject;
				T result = caseCustomTypeStruct(customTypeStruct);
				if (result == null) result = caseCustomTypeDefinition(customTypeStruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_SIMPLE: {
				MarkingSimple markingSimple = (MarkingSimple)theEObject;
				T result = caseMarkingSimple(markingSimple);
				if (result == null) result = caseMarking(markingSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_GLOBAL_VARIABLE: {
				MarkingGlobalVariable markingGlobalVariable = (MarkingGlobalVariable)theEObject;
				T result = caseMarkingGlobalVariable(markingGlobalVariable);
				if (result == null) result = caseMarking(markingGlobalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.MARKING_EXTENDED: {
				MarkingExtended markingExtended = (MarkingExtended)theEObject;
				T result = caseMarkingExtended(markingExtended);
				if (result == null) result = caseMarking(markingExtended);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = caseNode(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.LEAF_NODE: {
				LeafNode leafNode = (LeafNode)theEObject;
				T result = caseLeafNode(leafNode);
				if (result == null) result = caseNode(leafNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.LEAF_NODE_STRING: {
				LeafNodeString leafNodeString = (LeafNodeString)theEObject;
				T result = caseLeafNodeString(leafNodeString);
				if (result == null) result = caseLeafNode(leafNodeString);
				if (result == null) result = caseNode(leafNodeString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.LEAF_NODE_STRUCT: {
				LeafNodeStruct leafNodeStruct = (LeafNodeStruct)theEObject;
				T result = caseLeafNodeStruct(leafNodeStruct);
				if (result == null) result = caseNode(leafNodeStruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANPackage.LEAF_NODE_GLOBAL_VARIABLE: {
				LeafNodeGlobalVariable leafNodeGlobalVariable = (LeafNodeGlobalVariable)theEObject;
				T result = caseLeafNodeGlobalVariable(leafNodeGlobalVariable);
				if (result == null) result = caseLeafNode(leafNodeGlobalVariable);
				if (result == null) result = caseNode(leafNodeGlobalVariable);
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
	public T caseSAN(SAN object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTypeDefinition(CustomTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Type Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Type Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTypeArray(CustomTypeArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Type Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Type Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTypeStruct(CustomTypeStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Marking Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingGlobalVariable(MarkingGlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafNode(LeafNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Node String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Node String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafNodeString(LeafNodeString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Node Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Node Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafNodeStruct(LeafNodeStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Node Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Node Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafNodeGlobalVariable(LeafNodeGlobalVariable object) {
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
	public T caseConcreteModel(ConcreteModel object) {
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

} //SANSwitch
