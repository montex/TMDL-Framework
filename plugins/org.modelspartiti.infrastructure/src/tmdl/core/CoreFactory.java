/**
 */
package tmdl.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tmdl.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = tmdl.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameter Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Simple</em>'.
	 * @generated
	 */
	ParameterSimple createParameterSimple();

	/**
	 * Returns a new object of class '<em>Parameter Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Array</em>'.
	 * @generated
	 */
	ParameterArray createParameterArray();

	/**
	 * Returns a new object of class '<em>Assignment Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Simple</em>'.
	 * @generated
	 */
	AssignmentSimple createAssignmentSimple();

	/**
	 * Returns a new object of class '<em>Assignment Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Array</em>'.
	 * @generated
	 */
	AssignmentArray createAssignmentArray();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
