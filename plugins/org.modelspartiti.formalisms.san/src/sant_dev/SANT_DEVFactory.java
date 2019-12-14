/**
 */
package sant_dev;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sant_dev.SANT_DEVPackage
 * @generated
 */
public interface SANT_DEVFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANT_DEVFactory eINSTANCE = sant_dev.impl.SANT_DEVFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SANT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SANT</em>'.
	 * @generated
	 */
	SANT createSANT();

	/**
	 * Returns a new object of class '<em>Place Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Template</em>'.
	 * @generated
	 */
	PlaceTemplate createPlaceTemplate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SANT_DEVPackage getSANT_DEVPackage();

} //SANT_DEVFactory
