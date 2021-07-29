/**
 */
package paramlist;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see paramlist.ParamlistFactory
 * @model kind="package"
 * @generated
 */
public interface ParamlistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "paramlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "sant2san.params";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "paramlist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParamlistPackage eINSTANCE = paramlist.impl.ParamlistPackageImpl.init();

	/**
	 * The meta object id for the '{@link paramlist.impl.ParamListImpl <em>Param List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paramlist.impl.ParamListImpl
	 * @see paramlist.impl.ParamlistPackageImpl#getParamList()
	 * @generated
	 */
	int PARAM_LIST = 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST__ASSIGNMENTS = 0;

	/**
	 * The number of structural features of the '<em>Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link paramlist.ParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param List</em>'.
	 * @see paramlist.ParamList
	 * @generated
	 */
	EClass getParamList();

	/**
	 * Returns the meta object for the containment reference list '{@link paramlist.ParamList#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see paramlist.ParamList#getAssignments()
	 * @see #getParamList()
	 * @generated
	 */
	EReference getParamList_Assignments();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParamlistFactory getParamlistFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link paramlist.impl.ParamListImpl <em>Param List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paramlist.impl.ParamListImpl
		 * @see paramlist.impl.ParamlistPackageImpl#getParamList()
		 * @generated
		 */
		EClass PARAM_LIST = eINSTANCE.getParamList();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_LIST__ASSIGNMENTS = eINSTANCE.getParamList_Assignments();

	}

} //ParamlistPackage
