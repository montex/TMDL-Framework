/**
 */
package sant_dev.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import san.Gate;
import san.NamedElement;
import sant_dev.*;

import tmdl.core.Multiplicity;
import tmdl.core.TemplateModel;

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
 * @see sant_dev.SANT_DEVPackage
 * @generated
 */
public class SANT_DEVSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SANT_DEVPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT_DEVSwitch() {
		if (modelPackage == null) {
			modelPackage = SANT_DEVPackage.eINSTANCE;
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
			case SANT_DEVPackage.SANT: {
				SANT sant = (SANT)theEObject;
				T result = caseSANT(sant);
				if (result == null) result = caseTemplateModel(sant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.PLACE_TEMPLATE: {
				PlaceTemplate placeTemplate = (PlaceTemplate)theEObject;
				T result = casePlaceTemplate(placeTemplate);
				if (result == null) result = caseNamedElement(placeTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.MULTIPLICITY_RANGE_OPERATOR: {
				MultiplicityRangeOperator multiplicityRangeOperator = (MultiplicityRangeOperator)theEObject;
				T result = caseMultiplicityRangeOperator(multiplicityRangeOperator);
				if (result == null) result = caseMultiplicity(multiplicityRangeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.MULTIPLICITY_ARRAY_INTEGER_FROM_REAL: {
				MultiplicityArrayIntegerFromReal multiplicityArrayIntegerFromReal = (MultiplicityArrayIntegerFromReal)theEObject;
				T result = caseMultiplicityArrayIntegerFromReal(multiplicityArrayIntegerFromReal);
				if (result == null) result = caseMultiplicity(multiplicityArrayIntegerFromReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.ACTIVITY_TEMPLATE: {
				ActivityTemplate activityTemplate = (ActivityTemplate)theEObject;
				T result = caseActivityTemplate(activityTemplate);
				if (result == null) result = caseNamedElement(activityTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.CASES_SPECIFICATION: {
				CasesSpecification casesSpecification = (CasesSpecification)theEObject;
				T result = caseCasesSpecification(casesSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE: {
				CasesSpecificationValue casesSpecificationValue = (CasesSpecificationValue)theEObject;
				T result = caseCasesSpecificationValue(casesSpecificationValue);
				if (result == null) result = caseCasesSpecification(casesSpecificationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY: {
				CasesSpecificationArray casesSpecificationArray = (CasesSpecificationArray)theEObject;
				T result = caseCasesSpecificationArray(casesSpecificationArray);
				if (result == null) result = caseCasesSpecification(casesSpecificationArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC: {
				CasesSpecificationParametric casesSpecificationParametric = (CasesSpecificationParametric)theEObject;
				T result = caseCasesSpecificationParametric(casesSpecificationParametric);
				if (result == null) result = caseCasesSpecification(casesSpecificationParametric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR: {
				CasesSpecificationRangeOperator casesSpecificationRangeOperator = (CasesSpecificationRangeOperator)theEObject;
				T result = caseCasesSpecificationRangeOperator(casesSpecificationRangeOperator);
				if (result == null) result = caseCasesSpecification(casesSpecificationRangeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.TIMED_ACTIVITY_TEMPLATE: {
				TimedActivityTemplate timedActivityTemplate = (TimedActivityTemplate)theEObject;
				T result = caseTimedActivityTemplate(timedActivityTemplate);
				if (result == null) result = caseActivityTemplate(timedActivityTemplate);
				if (result == null) result = caseNamedElement(timedActivityTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.INSTANTANEOUS_ACTIVITY_TEMPLATE: {
				InstantaneousActivityTemplate instantaneousActivityTemplate = (InstantaneousActivityTemplate)theEObject;
				T result = caseInstantaneousActivityTemplate(instantaneousActivityTemplate);
				if (result == null) result = caseActivityTemplate(instantaneousActivityTemplate);
				if (result == null) result = caseNamedElement(instantaneousActivityTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.MARKING_TEMPLATE: {
				MarkingTemplate markingTemplate = (MarkingTemplate)theEObject;
				T result = caseMarkingTemplate(markingTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.MARKING_TEMPLATE_SIMPLE: {
				MarkingTemplateSimple markingTemplateSimple = (MarkingTemplateSimple)theEObject;
				T result = caseMarkingTemplateSimple(markingTemplateSimple);
				if (result == null) result = caseMarkingTemplate(markingTemplateSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.MARKING_TEMPLATE_GLOBAL_VARIABLE: {
				MarkingTemplateGlobalVariable markingTemplateGlobalVariable = (MarkingTemplateGlobalVariable)theEObject;
				T result = caseMarkingTemplateGlobalVariable(markingTemplateGlobalVariable);
				if (result == null) result = caseMarkingTemplate(markingTemplateGlobalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE: {
				OutputGateTemplate outputGateTemplate = (OutputGateTemplate)theEObject;
				T result = caseOutputGateTemplate(outputGateTemplate);
				if (result == null) result = caseGate(outputGateTemplate);
				if (result == null) result = caseNamedElement(outputGateTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANT_DEVPackage.INPUT_GATE_TEMPLATE: {
				InputGateTemplate inputGateTemplate = (InputGateTemplate)theEObject;
				T result = caseInputGateTemplate(inputGateTemplate);
				if (result == null) result = caseGate(inputGateTemplate);
				if (result == null) result = caseNamedElement(inputGateTemplate);
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
	 * Returns the result of interpreting the object as an instance of '<em>Place Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceTemplate(PlaceTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Range Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Range Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityRangeOperator(MultiplicityRangeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Array Integer From Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Array Integer From Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityArrayIntegerFromReal(MultiplicityArrayIntegerFromReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityTemplate(ActivityTemplate object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Cases Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cases Specification Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasesSpecificationValue(CasesSpecificationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cases Specification Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cases Specification Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasesSpecificationArray(CasesSpecificationArray object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Cases Specification Range Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cases Specification Range Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasesSpecificationRangeOperator(CasesSpecificationRangeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Activity Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Activity Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedActivityTemplate(TimedActivityTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantaneous Activity Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantaneous Activity Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantaneousActivityTemplate(InstantaneousActivityTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingTemplate(MarkingTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Template Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Template Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingTemplateSimple(MarkingTemplateSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking Template Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking Template Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkingTemplateGlobalVariable(MarkingTemplateGlobalVariable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Input Gate Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Gate Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputGateTemplate(InputGateTemplate object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicity(Multiplicity object) {
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

} //SANT_DEVSwitch
