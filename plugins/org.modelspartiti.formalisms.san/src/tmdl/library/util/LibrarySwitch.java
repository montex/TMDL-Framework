/**
 */
package tmdl.library.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tmdl.library.*;

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
 * @see tmdl.library.LibraryPackage
 * @generated
 */
public class LibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = LibraryPackage.eINSTANCE;
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
			case LibraryPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.MODEL_INTERFACE: {
				ModelInterface modelInterface = (ModelInterface)theEObject;
				T result = caseModelInterface(modelInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TEMPLATE_SPECIFICATION: {
				TemplateSpecification templateSpecification = (TemplateSpecification)theEObject;
				T result = caseTemplateSpecification(templateSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TEMPLATE_ATOMIC: {
				TemplateAtomic templateAtomic = (TemplateAtomic)theEObject;
				T result = caseTemplateAtomic(templateAtomic);
				if (result == null) result = caseTemplateSpecification(templateAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.TEMPLATE_COMPOSITE: {
				TemplateComposite templateComposite = (TemplateComposite)theEObject;
				T result = caseTemplateComposite(templateComposite);
				if (result == null) result = caseTemplateSpecification(templateComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.INTERFACE_VARIABLE: {
				InterfaceVariable interfaceVariable = (InterfaceVariable)theEObject;
				T result = caseInterfaceVariable(interfaceVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.COMPOSITION_RULE: {
				CompositionRule compositionRule = (CompositionRule)theEObject;
				T result = caseCompositionRule(compositionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.COMPOSITION_RULE_ALL: {
				CompositionRuleAll compositionRuleAll = (CompositionRuleAll)theEObject;
				T result = caseCompositionRuleAll(compositionRuleAll);
				if (result == null) result = caseCompositionRule(compositionRuleAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.COMPOSITION_RULE_MATCH: {
				CompositionRuleMatch compositionRuleMatch = (CompositionRuleMatch)theEObject;
				T result = caseCompositionRuleMatch(compositionRuleMatch);
				if (result == null) result = caseCompositionRule(compositionRuleMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.COMPOSITION_RULE_FORWARDS: {
				CompositionRuleForwards compositionRuleForwards = (CompositionRuleForwards)theEObject;
				T result = caseCompositionRuleForwards(compositionRuleForwards);
				if (result == null) result = caseCompositionRule(compositionRuleForwards);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Interface Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceVariable(InterfaceVariable object) {
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

} //LibrarySwitch
