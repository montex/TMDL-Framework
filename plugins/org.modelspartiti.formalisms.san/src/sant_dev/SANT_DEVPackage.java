/**
 */
package sant_dev;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import san.SANPackage;

import tmdl.core.CorePackage;

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
 * @see sant_dev.SANT_DEVFactory
 * @model kind="package"
 * @generated
 */
public interface SANT_DEVPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sant_dev";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/templates/san/sant_dev";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sant_dev";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANT_DEVPackage eINSTANCE = sant_dev.impl.SANT_DEVPackageImpl.init();

	/**
	 * The meta object id for the '{@link sant_dev.impl.SANTImpl <em>SANT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.SANTImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getSANT()
	 * @generated
	 */
	int SANT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__NAME = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__TEMPLATE_PLACES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__PLACE = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__PARAMETERS = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__GLOBAL_VARIABLES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Custom Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__CUSTOM_TYPE = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>SANT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT_FEATURE_COUNT = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Concretize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT___CONCRETIZE__ELIST = CorePackage.TEMPLATE_MODEL___CONCRETIZE__ELIST;

	/**
	 * The number of operations of the '<em>SANT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT_OPERATION_COUNT = CorePackage.TEMPLATE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.PlaceTemplateImpl <em>Place Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.PlaceTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getPlaceTemplate()
	 * @generated
	 */
	int PLACE_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TEMPLATE__NAME = SANPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TEMPLATE__MULTIPLICITY = SANPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TEMPLATE_FEATURE_COUNT = SANPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generated Place</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TEMPLATE___GENERATED_PLACE__MULTIPLICITY = SANPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Place Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TEMPLATE_OPERATION_COUNT = SANPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link sant_dev.SANT <em>SANT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SANT</em>'.
	 * @see sant_dev.SANT
	 * @generated
	 */
	EClass getSANT();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.SANT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sant_dev.SANT#getName()
	 * @see #getSANT()
	 * @generated
	 */
	EAttribute getSANT_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getTemplatePlaces <em>Template Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Places</em>'.
	 * @see sant_dev.SANT#getTemplatePlaces()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_TemplatePlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see sant_dev.SANT#getPlace()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sant_dev.SANT#getParameters()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variables</em>'.
	 * @see sant_dev.SANT#getGlobalVariables()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_GlobalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getCustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Type</em>'.
	 * @see sant_dev.SANT#getCustomType()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_CustomType();

	/**
	 * Returns the meta object for class '{@link sant_dev.PlaceTemplate <em>Place Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Template</em>'.
	 * @see sant_dev.PlaceTemplate
	 * @generated
	 */
	EClass getPlaceTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link sant_dev.PlaceTemplate#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see sant_dev.PlaceTemplate#getMultiplicity()
	 * @see #getPlaceTemplate()
	 * @generated
	 */
	EReference getPlaceTemplate_Multiplicity();

	/**
	 * Returns the meta object for the '{@link sant_dev.PlaceTemplate#generatedPlace(tmdl.core.Multiplicity) <em>Generated Place</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generated Place</em>' operation.
	 * @see sant_dev.PlaceTemplate#generatedPlace(tmdl.core.Multiplicity)
	 * @generated
	 */
	EOperation getPlaceTemplate__GeneratedPlace__Multiplicity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SANT_DEVFactory getSANT_DEVFactory();

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
		 * The meta object literal for the '{@link sant_dev.impl.SANTImpl <em>SANT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.SANTImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getSANT()
		 * @generated
		 */
		EClass SANT = eINSTANCE.getSANT();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SANT__NAME = eINSTANCE.getSANT_Name();

		/**
		 * The meta object literal for the '<em><b>Template Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__TEMPLATE_PLACES = eINSTANCE.getSANT_TemplatePlaces();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__PLACE = eINSTANCE.getSANT_Place();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__PARAMETERS = eINSTANCE.getSANT_Parameters();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__GLOBAL_VARIABLES = eINSTANCE.getSANT_GlobalVariables();

		/**
		 * The meta object literal for the '<em><b>Custom Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__CUSTOM_TYPE = eINSTANCE.getSANT_CustomType();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.PlaceTemplateImpl <em>Place Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.PlaceTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getPlaceTemplate()
		 * @generated
		 */
		EClass PLACE_TEMPLATE = eINSTANCE.getPlaceTemplate();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TEMPLATE__MULTIPLICITY = eINSTANCE.getPlaceTemplate_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Generated Place</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE_TEMPLATE___GENERATED_PLACE__MULTIPLICITY = eINSTANCE.getPlaceTemplate__GeneratedPlace__Multiplicity();

	}

} //SANT_DEVPackage
