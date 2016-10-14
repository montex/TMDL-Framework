/**
 */
package tmdl.scenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tmdl.scenario.ScenarioPackage
 * @generated
 */
public interface ScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioFactory eINSTANCE = tmdl.scenario.impl.ScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Variant Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant Atomic</em>'.
	 * @generated
	 */
	VariantAtomic createVariantAtomic();

	/**
	 * Returns a new object of class '<em>Variant Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant Composite</em>'.
	 * @generated
	 */
	VariantComposite createVariantComposite();

	/**
	 * Returns a new object of class '<em>Block Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Realization</em>'.
	 * @generated
	 */
	BlockRealization createBlockRealization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScenarioPackage getScenarioPackage();

} //ScenarioFactory
