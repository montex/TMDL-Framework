/**
 */
package org.modelspartiti.infrastructure.tmdl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.modelspartiti.infrastructure.tmdl.*;

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
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage
 * @generated
 */
public class tmdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static tmdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmdlSwitch() {
		if (modelPackage == null) {
			modelPackage = tmdlPackage.eINSTANCE;
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
			case tmdlPackage.TMDL_SPECIFICATION: {
				TMDLSpecification tmdlSpecification = (TMDLSpecification)theEObject;
				T result = caseTMDLSpecification(tmdlSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.TEMPLATE_SPECIFICATION: {
				TemplateSpecification templateSpecification = (TemplateSpecification)theEObject;
				T result = caseTemplateSpecification(templateSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.TEMPLATE_ATOMIC: {
				TemplateAtomic templateAtomic = (TemplateAtomic)theEObject;
				T result = caseTemplateAtomic(templateAtomic);
				if (result == null) result = caseTemplateSpecification(templateAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.TEMPLATE_COMPOSITE: {
				TemplateComposite templateComposite = (TemplateComposite)theEObject;
				T result = caseTemplateComposite(templateComposite);
				if (result == null) result = caseTemplateSpecification(templateComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.VARIANT: {
				Variant variant = (Variant)theEObject;
				T result = caseVariant(variant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.BLOCK_REALIZATION: {
				BlockRealization blockRealization = (BlockRealization)theEObject;
				T result = caseBlockRealization(blockRealization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.MODEL_INTERFACE: {
				ModelInterface modelInterface = (ModelInterface)theEObject;
				T result = caseModelInterface(modelInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.MODEL_INTERF_SIMPLE: {
				ModelInterfSimple modelInterfSimple = (ModelInterfSimple)theEObject;
				T result = caseModelInterfSimple(modelInterfSimple);
				if (result == null) result = caseModelInterface(modelInterfSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.MODEL_INTERF_ARRAY: {
				ModelInterfArray modelInterfArray = (ModelInterfArray)theEObject;
				T result = caseModelInterfArray(modelInterfArray);
				if (result == null) result = caseModelInterface(modelInterfArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.COMPOSITION_RULE: {
				CompositionRule compositionRule = (CompositionRule)theEObject;
				T result = caseCompositionRule(compositionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.COMPOSITION_RULE_FORWARDS: {
				CompositionRuleForwards compositionRuleForwards = (CompositionRuleForwards)theEObject;
				T result = caseCompositionRuleForwards(compositionRuleForwards);
				if (result == null) result = caseCompositionRule(compositionRuleForwards);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.COMPOSITION_RULE_ALL: {
				CompositionRuleAll compositionRuleAll = (CompositionRuleAll)theEObject;
				T result = caseCompositionRuleAll(compositionRuleAll);
				if (result == null) result = caseCompositionRule(compositionRuleAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.COMPOSITION_RULE_MATCH: {
				CompositionRuleMatch compositionRuleMatch = (CompositionRuleMatch)theEObject;
				T result = caseCompositionRuleMatch(compositionRuleMatch);
				if (result == null) result = caseCompositionRule(compositionRuleMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.COMP_ITEM: {
				CompItem compItem = (CompItem)theEObject;
				T result = caseCompItem(compItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.VALUE_INT: {
				ValueInt valueInt = (ValueInt)theEObject;
				T result = caseValueInt(valueInt);
				if (result == null) result = caseValue(valueInt);
				if (result == null) result = caseMultiplicity(valueInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.VALUE_DOUBLE: {
				ValueDouble valueDouble = (ValueDouble)theEObject;
				T result = caseValueDouble(valueDouble);
				if (result == null) result = caseValue(valueDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.VALUE_ARRAY: {
				ValueArray valueArray = (ValueArray)theEObject;
				T result = caseValueArray(valueArray);
				if (result == null) result = caseValue(valueArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.VALUE_ARRAY_INT: {
				ValueArrayInt valueArrayInt = (ValueArrayInt)theEObject;
				T result = caseValueArrayInt(valueArrayInt);
				if (result == null) result = caseValueArray(valueArrayInt);
				if (result == null) result = caseMultiplicity(valueArrayInt);
				if (result == null) result = caseValue(valueArrayInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.VALUE_ARRAY_DOUBLE: {
				ValueArrayDouble valueArrayDouble = (ValueArrayDouble)theEObject;
				T result = caseValueArrayDouble(valueArrayDouble);
				if (result == null) result = caseValueArray(valueArrayDouble);
				if (result == null) result = caseValue(valueArrayDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.MULTIPLICITY: {
				Multiplicity multiplicity = (Multiplicity)theEObject;
				T result = caseMultiplicity(multiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.PARAMETRIC: {
				Parametric parametric = (Parametric)theEObject;
				T result = caseParametric(parametric);
				if (result == null) result = caseMultiplicity(parametric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.PARAMBINDING: {
				Parambinding parambinding = (Parambinding)theEObject;
				T result = caseParambinding(parambinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.AVAILABILITY: {
				Availability availability = (Availability)theEObject;
				T result = caseAvailability(availability);
				if (result == null) result = caseMetric(availability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.RELIABILITY: {
				Reliability reliability = (Reliability)theEObject;
				T result = caseReliability(reliability);
				if (result == null) result = caseMetric(reliability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.MEAN_TIME_TO_FAILURE: {
				MeanTimeToFailure meanTimeToFailure = (MeanTimeToFailure)theEObject;
				T result = caseMeanTimeToFailure(meanTimeToFailure);
				if (result == null) result = caseMetric(meanTimeToFailure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case tmdlPackage.STATE_METAVARIABLE: {
				StateMetavariable stateMetavariable = (StateMetavariable)theEObject;
				T result = caseStateMetavariable(stateMetavariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMDL Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMDL Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMDLSpecification(TMDLSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSpecification(TemplateSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateAtomic(TemplateAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateComposite(TemplateComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariant(Variant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockRealization(BlockRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelInterface(ModelInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Interf Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Interf Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelInterfSimple(ModelInterfSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Interf Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Interf Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelInterfArray(ModelInterfArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionRule(CompositionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Rule Forwards</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Rule Forwards</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionRuleForwards(CompositionRuleForwards object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Rule All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Rule All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionRuleAll(CompositionRuleAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Rule Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Rule Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionRuleMatch(CompositionRuleMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompItem(CompItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueInt(ValueInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueDouble(ValueDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueArray(ValueArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Array Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Array Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueArrayInt(ValueArrayInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Array Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Array Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueArrayDouble(ValueArrayDouble object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametric(Parametric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parambinding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parambinding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParambinding(Parambinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailability(Availability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliability(Reliability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mean Time To Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mean Time To Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeanTimeToFailure(MeanTimeToFailure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Metavariable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Metavariable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMetavariable(StateMetavariable object) {
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

} //tmdlSwitch
