/**
 */
package paramlist;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see paramlist.ParamlistPackage
 * @generated
 */
public interface ParamlistFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParamlistFactory eINSTANCE = paramlist.impl.ParamlistFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Param List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param List</em>'.
	 * @generated
	 */
	ParamList createParamList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParamlistPackage getParamlistPackage();

} //ParamlistFactory
