/**
 */
package tmdl.library;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tmdl.library.LibraryPackage
 * @generated
 */
public interface LibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryFactory eINSTANCE = tmdl.library.impl.LibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Model Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Interface</em>'.
	 * @generated
	 */
	ModelInterface createModelInterface();

	/**
	 * Returns a new object of class '<em>Template Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Atomic</em>'.
	 * @generated
	 */
	TemplateAtomic createTemplateAtomic();

	/**
	 * Returns a new object of class '<em>Template Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Composite</em>'.
	 * @generated
	 */
	TemplateComposite createTemplateComposite();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Interface Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Variable</em>'.
	 * @generated
	 */
	InterfaceVariable createInterfaceVariable();

	/**
	 * Returns a new object of class '<em>Multiplicity Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Value</em>'.
	 * @generated
	 */
	MultiplicityValue createMultiplicityValue();

	/**
	 * Returns a new object of class '<em>Multiplicity Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Array</em>'.
	 * @generated
	 */
	MultiplicityArray createMultiplicityArray();

	/**
	 * Returns a new object of class '<em>Multiplicity Parametric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Parametric</em>'.
	 * @generated
	 */
	MultiplicityParametric createMultiplicityParametric();

	/**
	 * Returns a new object of class '<em>Composition Rule All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Rule All</em>'.
	 * @generated
	 */
	CompositionRuleAll createCompositionRuleAll();

	/**
	 * Returns a new object of class '<em>Composition Rule Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Rule Match</em>'.
	 * @generated
	 */
	CompositionRuleMatch createCompositionRuleMatch();

	/**
	 * Returns a new object of class '<em>Composition Rule Forwards</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Rule Forwards</em>'.
	 * @generated
	 */
	CompositionRuleForwards createCompositionRuleForwards();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LibraryPackage getLibraryPackage();

} //LibraryFactory
