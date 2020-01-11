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
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__PLACES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activity Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__ACTIVITY_TEMPLATES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__PARAMETERS = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__GLOBAL_VARIABLES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Custom Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__CUSTOM_TYPE = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__GATES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__ARCS = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>SANT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT_FEATURE_COUNT = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 9;

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
	 * The feature id for the '<em><b>Marking</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TEMPLATE__MARKING = SANPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TEMPLATE_FEATURE_COUNT = SANPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Place Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TEMPLATE_OPERATION_COUNT = SANPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link sant_dev.impl.MultiplicityRangeOperatorImpl <em>Multiplicity Range Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.MultiplicityRangeOperatorImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getMultiplicityRangeOperator()
	 * @generated
	 */
	int MULTIPLICITY_RANGE_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_OPERATOR__MIN = CorePackage.MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_OPERATOR__MAX = CorePackage.MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_OPERATOR__STEP = CorePackage.MULTIPLICITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiplicity Range Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_OPERATOR_FEATURE_COUNT = CorePackage.MULTIPLICITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Multiplicity Range Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_OPERATOR_OPERATION_COUNT = CorePackage.MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.MultiplicityArrayIntegerFromRealImpl <em>Multiplicity Array Integer From Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.MultiplicityArrayIntegerFromRealImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getMultiplicityArrayIntegerFromReal()
	 * @generated
	 */
	int MULTIPLICITY_ARRAY_INTEGER_FROM_REAL = 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ARRAY_INTEGER_FROM_REAL__VALUES = CorePackage.MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Array Integer From Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ARRAY_INTEGER_FROM_REAL_FEATURE_COUNT = CorePackage.MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Convert Double To Int</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ARRAY_INTEGER_FROM_REAL___CONVERT_DOUBLE_TO_INT = CorePackage.MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplicity Array Integer From Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ARRAY_INTEGER_FROM_REAL_OPERATION_COUNT = CorePackage.MULTIPLICITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link sant_dev.impl.ActivityTemplateImpl <em>Activity Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.ActivityTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getActivityTemplate()
	 * @generated
	 */
	int ACTIVITY_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE__NAME = SANPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cases Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE__CASES_TEMPLATE = SANPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE_FEATURE_COUNT = SANPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE_OPERATION_COUNT = SANPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.CasesSpecificationImpl <em>Cases Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.CasesSpecificationImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecification()
	 * @generated
	 */
	int CASES_SPECIFICATION = 5;

	/**
	 * The number of structural features of the '<em>Cases Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cases Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.CasesSpecificationConcreteImpl <em>Cases Specification Concrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.CasesSpecificationConcreteImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecificationConcrete()
	 * @generated
	 */
	int CASES_SPECIFICATION_CONCRETE = 6;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_CONCRETE__CASES = CASES_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cases Specification Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_CONCRETE_FEATURE_COUNT = CASES_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cases Specification Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_CONCRETE_OPERATION_COUNT = CASES_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.CasesSpecificationArrayImpl <em>Cases Specification Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.CasesSpecificationArrayImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecificationArray()
	 * @generated
	 */
	int CASES_SPECIFICATION_ARRAY = 7;

	/**
	 * The feature id for the '<em><b>Num Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_ARRAY__NUM_CASES = CASES_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_ARRAY__P = CASES_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cases Specification Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_ARRAY_FEATURE_COUNT = CASES_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cases Specification Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_ARRAY_OPERATION_COUNT = CASES_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.CasesSpecificationParametricImpl <em>Cases Specification Parametric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.CasesSpecificationParametricImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecificationParametric()
	 * @generated
	 */
	int CASES_SPECIFICATION_PARAMETRIC = 8;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PARAMETRIC__PARAMETER = CASES_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PARAMETRIC__P = CASES_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cases Specification Parametric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PARAMETRIC_FEATURE_COUNT = CASES_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cases Specification Parametric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PARAMETRIC_OPERATION_COUNT = CASES_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.CasesSpecificationRangeOperatorImpl <em>Cases Specification Range Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.CasesSpecificationRangeOperatorImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecificationRangeOperator()
	 * @generated
	 */
	int CASES_SPECIFICATION_RANGE_OPERATOR = 9;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_RANGE_OPERATOR__MIN = CASES_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_RANGE_OPERATOR__MAX = CASES_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_RANGE_OPERATOR__STEP = CASES_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_RANGE_OPERATOR__P = CASES_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cases Specification Range Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_RANGE_OPERATOR_FEATURE_COUNT = CASES_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cases Specification Range Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_RANGE_OPERATOR_OPERATION_COUNT = CASES_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.TimedActivityTemplateImpl <em>Timed Activity Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.TimedActivityTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getTimedActivityTemplate()
	 * @generated
	 */
	int TIMED_ACTIVITY_TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_TEMPLATE__NAME = ACTIVITY_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Cases Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_TEMPLATE__CASES_TEMPLATE = ACTIVITY_TEMPLATE__CASES_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Time Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION = ACTIVITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_TEMPLATE__ACTIVATION = ACTIVITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reactivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_TEMPLATE__REACTIVATION = ACTIVITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timed Activity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_TEMPLATE_FEATURE_COUNT = ACTIVITY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timed Activity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_TEMPLATE_OPERATION_COUNT = ACTIVITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.InstantaneousActivityTemplateImpl <em>Instantaneous Activity Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.InstantaneousActivityTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getInstantaneousActivityTemplate()
	 * @generated
	 */
	int INSTANTANEOUS_ACTIVITY_TEMPLATE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_TEMPLATE__NAME = ACTIVITY_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Cases Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_TEMPLATE__CASES_TEMPLATE = ACTIVITY_TEMPLATE__CASES_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Instantaneous Activity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_TEMPLATE_FEATURE_COUNT = ACTIVITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instantaneous Activity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_TEMPLATE_OPERATION_COUNT = ACTIVITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.MarkingTemplateImpl <em>Marking Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.MarkingTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getMarkingTemplate()
	 * @generated
	 */
	int MARKING_TEMPLATE = 12;

	/**
	 * The feature id for the '<em><b>Id Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE__ID_PLACE = 0;

	/**
	 * The number of structural features of the '<em>Marking Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marking Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.MarkingTemplateSimpleImpl <em>Marking Template Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.MarkingTemplateSimpleImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getMarkingTemplateSimple()
	 * @generated
	 */
	int MARKING_TEMPLATE_SIMPLE = 13;

	/**
	 * The feature id for the '<em><b>Id Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_SIMPLE__ID_PLACE = MARKING_TEMPLATE__ID_PLACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_SIMPLE__VALUE = MARKING_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking Template Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_SIMPLE_FEATURE_COUNT = MARKING_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking Template Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_SIMPLE_OPERATION_COUNT = MARKING_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.MarkingTemplateGlobalVariableImpl <em>Marking Template Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.MarkingTemplateGlobalVariableImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getMarkingTemplateGlobalVariable()
	 * @generated
	 */
	int MARKING_TEMPLATE_GLOBAL_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Id Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_GLOBAL_VARIABLE__ID_PLACE = MARKING_TEMPLATE__ID_PLACE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_GLOBAL_VARIABLE__VARIABLE = MARKING_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking Template Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_GLOBAL_VARIABLE_FEATURE_COUNT = MARKING_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking Template Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_TEMPLATE_GLOBAL_VARIABLE_OPERATION_COUNT = MARKING_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.GateTemplateImpl <em>Gate Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.GateTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getGateTemplate()
	 * @generated
	 */
	int GATE_TEMPLATE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_TEMPLATE__NAME = SANPackage.GATE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_TEMPLATE__FUNCTION = SANPackage.GATE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_TEMPLATE__PLACES = SANPackage.GATE__PLACES;

	/**
	 * The feature id for the '<em><b>Place Template</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_TEMPLATE__PLACE_TEMPLATE = SANPackage.GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_TEMPLATE_FEATURE_COUNT = SANPackage.GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gate Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_TEMPLATE_OPERATION_COUNT = SANPackage.GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.OutputGateImpl <em>Output Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.OutputGateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getOutputGate()
	 * @generated
	 */
	int OUTPUT_GATE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__NAME = GATE_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__FUNCTION = GATE_TEMPLATE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__PLACES = GATE_TEMPLATE__PLACES;

	/**
	 * The feature id for the '<em><b>Place Template</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__PLACE_TEMPLATE = GATE_TEMPLATE__PLACE_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Output Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_FEATURE_COUNT = GATE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_OPERATION_COUNT = GATE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.OutputGateConcreteImpl <em>Output Gate Concrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.OutputGateConcreteImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getOutputGateConcrete()
	 * @generated
	 */
	int OUTPUT_GATE_CONCRETE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE__NAME = OUTPUT_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE__FUNCTION = OUTPUT_GATE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE__PLACES = OUTPUT_GATE__PLACES;

	/**
	 * The feature id for the '<em><b>Place Template</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE__PLACE_TEMPLATE = OUTPUT_GATE__PLACE_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE__CASE = OUTPUT_GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Gate Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE_FEATURE_COUNT = OUTPUT_GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Gate Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE_OPERATION_COUNT = OUTPUT_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.OutputGateTemplateImpl <em>Output Gate Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.OutputGateTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getOutputGateTemplate()
	 * @generated
	 */
	int OUTPUT_GATE_TEMPLATE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE__NAME = OUTPUT_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE__FUNCTION = OUTPUT_GATE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE__PLACES = OUTPUT_GATE__PLACES;

	/**
	 * The feature id for the '<em><b>Place Template</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE__PLACE_TEMPLATE = OUTPUT_GATE__PLACE_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE__ACTIVITY = OUTPUT_GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Gate Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE_FEATURE_COUNT = OUTPUT_GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Gate Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE_OPERATION_COUNT = OUTPUT_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.InputGateTemplateImpl <em>Input Gate Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.InputGateTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getInputGateTemplate()
	 * @generated
	 */
	int INPUT_GATE_TEMPLATE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_TEMPLATE__NAME = GATE_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_TEMPLATE__FUNCTION = GATE_TEMPLATE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_TEMPLATE__PLACES = GATE_TEMPLATE__PLACES;

	/**
	 * The feature id for the '<em><b>Place Template</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_TEMPLATE__PLACE_TEMPLATE = GATE_TEMPLATE__PLACE_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_TEMPLATE__PREDICATE = GATE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_TEMPLATE__ACTIVITY = GATE_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Gate Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_TEMPLATE_FEATURE_COUNT = GATE_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Gate Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_TEMPLATE_OPERATION_COUNT = GATE_TEMPLATE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link sant_dev.impl.ArcTemplateImpl <em>Arc Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.ArcTemplateImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getArcTemplate()
	 * @generated
	 */
	int ARC_TEMPLATE = 20;

	/**
	 * The number of structural features of the '<em>Arc Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TEMPLATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arc Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.InputArcImpl <em>Input Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.InputArcImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getInputArc()
	 * @generated
	 */
	int INPUT_ARC = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__SOURCE = ARC_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__TARGET = ARC_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC_FEATURE_COUNT = ARC_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC_OPERATION_COUNT = ARC_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant_dev.impl.OutputArcImpl <em>Output Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant_dev.impl.OutputArcImpl
	 * @see sant_dev.impl.SANT_DEVPackageImpl#getOutputArc()
	 * @generated
	 */
	int OUTPUT_ARC = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__SOURCE = ARC_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__TARGET = ARC_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC_FEATURE_COUNT = ARC_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC_OPERATION_COUNT = ARC_TEMPLATE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see sant_dev.SANT#getPlaces()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getActivityTemplates <em>Activity Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Templates</em>'.
	 * @see sant_dev.SANT#getActivityTemplates()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_ActivityTemplates();

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
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see sant_dev.SANT#getGates()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.SANT#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see sant_dev.SANT#getArcs()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Arcs();

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
	 * Returns the meta object for the containment reference list '{@link sant_dev.PlaceTemplate#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marking</em>'.
	 * @see sant_dev.PlaceTemplate#getMarking()
	 * @see #getPlaceTemplate()
	 * @generated
	 */
	EReference getPlaceTemplate_Marking();

	/**
	 * Returns the meta object for class '{@link sant_dev.MultiplicityRangeOperator <em>Multiplicity Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Range Operator</em>'.
	 * @see sant_dev.MultiplicityRangeOperator
	 * @generated
	 */
	EClass getMultiplicityRangeOperator();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.MultiplicityRangeOperator#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see sant_dev.MultiplicityRangeOperator#getMin()
	 * @see #getMultiplicityRangeOperator()
	 * @generated
	 */
	EAttribute getMultiplicityRangeOperator_Min();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.MultiplicityRangeOperator#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see sant_dev.MultiplicityRangeOperator#getMax()
	 * @see #getMultiplicityRangeOperator()
	 * @generated
	 */
	EAttribute getMultiplicityRangeOperator_Max();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.MultiplicityRangeOperator#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see sant_dev.MultiplicityRangeOperator#getStep()
	 * @see #getMultiplicityRangeOperator()
	 * @generated
	 */
	EAttribute getMultiplicityRangeOperator_Step();

	/**
	 * Returns the meta object for class '{@link sant_dev.MultiplicityArrayIntegerFromReal <em>Multiplicity Array Integer From Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Array Integer From Real</em>'.
	 * @see sant_dev.MultiplicityArrayIntegerFromReal
	 * @generated
	 */
	EClass getMultiplicityArrayIntegerFromReal();

	/**
	 * Returns the meta object for the attribute list '{@link sant_dev.MultiplicityArrayIntegerFromReal#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see sant_dev.MultiplicityArrayIntegerFromReal#getValues()
	 * @see #getMultiplicityArrayIntegerFromReal()
	 * @generated
	 */
	EAttribute getMultiplicityArrayIntegerFromReal_Values();

	/**
	 * Returns the meta object for the '{@link sant_dev.MultiplicityArrayIntegerFromReal#convertDoubleToInt() <em>Convert Double To Int</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert Double To Int</em>' operation.
	 * @see sant_dev.MultiplicityArrayIntegerFromReal#convertDoubleToInt()
	 * @generated
	 */
	EOperation getMultiplicityArrayIntegerFromReal__ConvertDoubleToInt();

	/**
	 * Returns the meta object for class '{@link sant_dev.ActivityTemplate <em>Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Template</em>'.
	 * @see sant_dev.ActivityTemplate
	 * @generated
	 */
	EClass getActivityTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link sant_dev.ActivityTemplate#getCasesTemplate <em>Cases Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cases Template</em>'.
	 * @see sant_dev.ActivityTemplate#getCasesTemplate()
	 * @see #getActivityTemplate()
	 * @generated
	 */
	EReference getActivityTemplate_CasesTemplate();

	/**
	 * Returns the meta object for class '{@link sant_dev.CasesSpecification <em>Cases Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification</em>'.
	 * @see sant_dev.CasesSpecification
	 * @generated
	 */
	EClass getCasesSpecification();

	/**
	 * Returns the meta object for class '{@link sant_dev.CasesSpecificationConcrete <em>Cases Specification Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification Concrete</em>'.
	 * @see sant_dev.CasesSpecificationConcrete
	 * @generated
	 */
	EClass getCasesSpecificationConcrete();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.CasesSpecificationConcrete#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see sant_dev.CasesSpecificationConcrete#getCases()
	 * @see #getCasesSpecificationConcrete()
	 * @generated
	 */
	EReference getCasesSpecificationConcrete_Cases();

	/**
	 * Returns the meta object for class '{@link sant_dev.CasesSpecificationArray <em>Cases Specification Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification Array</em>'.
	 * @see sant_dev.CasesSpecificationArray
	 * @generated
	 */
	EClass getCasesSpecificationArray();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.CasesSpecificationArray#getNumCases <em>Num Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cases</em>'.
	 * @see sant_dev.CasesSpecificationArray#getNumCases()
	 * @see #getCasesSpecificationArray()
	 * @generated
	 */
	EAttribute getCasesSpecificationArray_NumCases();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.CasesSpecificationArray#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see sant_dev.CasesSpecificationArray#getP()
	 * @see #getCasesSpecificationArray()
	 * @generated
	 */
	EReference getCasesSpecificationArray_P();

	/**
	 * Returns the meta object for class '{@link sant_dev.CasesSpecificationParametric <em>Cases Specification Parametric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification Parametric</em>'.
	 * @see sant_dev.CasesSpecificationParametric
	 * @generated
	 */
	EClass getCasesSpecificationParametric();

	/**
	 * Returns the meta object for the containment reference '{@link sant_dev.CasesSpecificationParametric#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see sant_dev.CasesSpecificationParametric#getParameter()
	 * @see #getCasesSpecificationParametric()
	 * @generated
	 */
	EReference getCasesSpecificationParametric_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.CasesSpecificationParametric#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see sant_dev.CasesSpecificationParametric#getP()
	 * @see #getCasesSpecificationParametric()
	 * @generated
	 */
	EReference getCasesSpecificationParametric_P();

	/**
	 * Returns the meta object for class '{@link sant_dev.CasesSpecificationRangeOperator <em>Cases Specification Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification Range Operator</em>'.
	 * @see sant_dev.CasesSpecificationRangeOperator
	 * @generated
	 */
	EClass getCasesSpecificationRangeOperator();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.CasesSpecificationRangeOperator#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see sant_dev.CasesSpecificationRangeOperator#getMin()
	 * @see #getCasesSpecificationRangeOperator()
	 * @generated
	 */
	EAttribute getCasesSpecificationRangeOperator_Min();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.CasesSpecificationRangeOperator#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see sant_dev.CasesSpecificationRangeOperator#getMax()
	 * @see #getCasesSpecificationRangeOperator()
	 * @generated
	 */
	EAttribute getCasesSpecificationRangeOperator_Max();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.CasesSpecificationRangeOperator#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see sant_dev.CasesSpecificationRangeOperator#getStep()
	 * @see #getCasesSpecificationRangeOperator()
	 * @generated
	 */
	EAttribute getCasesSpecificationRangeOperator_Step();

	/**
	 * Returns the meta object for the containment reference list '{@link sant_dev.CasesSpecificationRangeOperator#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see sant_dev.CasesSpecificationRangeOperator#getP()
	 * @see #getCasesSpecificationRangeOperator()
	 * @generated
	 */
	EReference getCasesSpecificationRangeOperator_P();

	/**
	 * Returns the meta object for class '{@link sant_dev.TimedActivityTemplate <em>Timed Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Activity Template</em>'.
	 * @see sant_dev.TimedActivityTemplate
	 * @generated
	 */
	EClass getTimedActivityTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link sant_dev.TimedActivityTemplate#getTimeDistribution <em>Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Distribution</em>'.
	 * @see sant_dev.TimedActivityTemplate#getTimeDistribution()
	 * @see #getTimedActivityTemplate()
	 * @generated
	 */
	EReference getTimedActivityTemplate_TimeDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link sant_dev.TimedActivityTemplate#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see sant_dev.TimedActivityTemplate#getActivation()
	 * @see #getTimedActivityTemplate()
	 * @generated
	 */
	EReference getTimedActivityTemplate_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link sant_dev.TimedActivityTemplate#getReactivation <em>Reactivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reactivation</em>'.
	 * @see sant_dev.TimedActivityTemplate#getReactivation()
	 * @see #getTimedActivityTemplate()
	 * @generated
	 */
	EReference getTimedActivityTemplate_Reactivation();

	/**
	 * Returns the meta object for class '{@link sant_dev.InstantaneousActivityTemplate <em>Instantaneous Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantaneous Activity Template</em>'.
	 * @see sant_dev.InstantaneousActivityTemplate
	 * @generated
	 */
	EClass getInstantaneousActivityTemplate();

	/**
	 * Returns the meta object for class '{@link sant_dev.MarkingTemplate <em>Marking Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Template</em>'.
	 * @see sant_dev.MarkingTemplate
	 * @generated
	 */
	EClass getMarkingTemplate();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.MarkingTemplate#getIdPlace <em>Id Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Place</em>'.
	 * @see sant_dev.MarkingTemplate#getIdPlace()
	 * @see #getMarkingTemplate()
	 * @generated
	 */
	EAttribute getMarkingTemplate_IdPlace();

	/**
	 * Returns the meta object for class '{@link sant_dev.MarkingTemplateSimple <em>Marking Template Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Template Simple</em>'.
	 * @see sant_dev.MarkingTemplateSimple
	 * @generated
	 */
	EClass getMarkingTemplateSimple();

	/**
	 * Returns the meta object for the attribute '{@link sant_dev.MarkingTemplateSimple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sant_dev.MarkingTemplateSimple#getValue()
	 * @see #getMarkingTemplateSimple()
	 * @generated
	 */
	EAttribute getMarkingTemplateSimple_Value();

	/**
	 * Returns the meta object for class '{@link sant_dev.MarkingTemplateGlobalVariable <em>Marking Template Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Template Global Variable</em>'.
	 * @see sant_dev.MarkingTemplateGlobalVariable
	 * @generated
	 */
	EClass getMarkingTemplateGlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link sant_dev.MarkingTemplateGlobalVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see sant_dev.MarkingTemplateGlobalVariable#getVariable()
	 * @see #getMarkingTemplateGlobalVariable()
	 * @generated
	 */
	EReference getMarkingTemplateGlobalVariable_Variable();

	/**
	 * Returns the meta object for class '{@link sant_dev.GateTemplate <em>Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Template</em>'.
	 * @see sant_dev.GateTemplate
	 * @generated
	 */
	EClass getGateTemplate();

	/**
	 * Returns the meta object for the reference list '{@link sant_dev.GateTemplate#getPlaceTemplate <em>Place Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Place Template</em>'.
	 * @see sant_dev.GateTemplate#getPlaceTemplate()
	 * @see #getGateTemplate()
	 * @generated
	 */
	EReference getGateTemplate_PlaceTemplate();

	/**
	 * Returns the meta object for class '{@link sant_dev.OutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate</em>'.
	 * @see sant_dev.OutputGate
	 * @generated
	 */
	EClass getOutputGate();

	/**
	 * Returns the meta object for class '{@link sant_dev.OutputGateConcrete <em>Output Gate Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate Concrete</em>'.
	 * @see sant_dev.OutputGateConcrete
	 * @generated
	 */
	EClass getOutputGateConcrete();

	/**
	 * Returns the meta object for the reference '{@link sant_dev.OutputGateConcrete#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Case</em>'.
	 * @see sant_dev.OutputGateConcrete#getCase()
	 * @see #getOutputGateConcrete()
	 * @generated
	 */
	EReference getOutputGateConcrete_Case();

	/**
	 * Returns the meta object for class '{@link sant_dev.OutputGateTemplate <em>Output Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate Template</em>'.
	 * @see sant_dev.OutputGateTemplate
	 * @generated
	 */
	EClass getOutputGateTemplate();

	/**
	 * Returns the meta object for the reference list '{@link sant_dev.OutputGateTemplate#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see sant_dev.OutputGateTemplate#getActivity()
	 * @see #getOutputGateTemplate()
	 * @generated
	 */
	EReference getOutputGateTemplate_Activity();

	/**
	 * Returns the meta object for class '{@link sant_dev.InputGateTemplate <em>Input Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Gate Template</em>'.
	 * @see sant_dev.InputGateTemplate
	 * @generated
	 */
	EClass getInputGateTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link sant_dev.InputGateTemplate#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see sant_dev.InputGateTemplate#getPredicate()
	 * @see #getInputGateTemplate()
	 * @generated
	 */
	EReference getInputGateTemplate_Predicate();

	/**
	 * Returns the meta object for the reference list '{@link sant_dev.InputGateTemplate#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see sant_dev.InputGateTemplate#getActivity()
	 * @see #getInputGateTemplate()
	 * @generated
	 */
	EReference getInputGateTemplate_Activity();

	/**
	 * Returns the meta object for class '{@link sant_dev.ArcTemplate <em>Arc Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Template</em>'.
	 * @see sant_dev.ArcTemplate
	 * @generated
	 */
	EClass getArcTemplate();

	/**
	 * Returns the meta object for class '{@link sant_dev.InputArc <em>Input Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Arc</em>'.
	 * @see sant_dev.InputArc
	 * @generated
	 */
	EClass getInputArc();

	/**
	 * Returns the meta object for the reference '{@link sant_dev.InputArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sant_dev.InputArc#getSource()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_Source();

	/**
	 * Returns the meta object for the reference '{@link sant_dev.InputArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sant_dev.InputArc#getTarget()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_Target();

	/**
	 * Returns the meta object for class '{@link sant_dev.OutputArc <em>Output Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Arc</em>'.
	 * @see sant_dev.OutputArc
	 * @generated
	 */
	EClass getOutputArc();

	/**
	 * Returns the meta object for the reference '{@link sant_dev.OutputArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sant_dev.OutputArc#getSource()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_Source();

	/**
	 * Returns the meta object for the reference '{@link sant_dev.OutputArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sant_dev.OutputArc#getTarget()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_Target();

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
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__PLACES = eINSTANCE.getSANT_Places();

		/**
		 * The meta object literal for the '<em><b>Activity Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__ACTIVITY_TEMPLATES = eINSTANCE.getSANT_ActivityTemplates();

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
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__GATES = eINSTANCE.getSANT_Gates();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__ARCS = eINSTANCE.getSANT_Arcs();

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
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TEMPLATE__MARKING = eINSTANCE.getPlaceTemplate_Marking();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.MultiplicityRangeOperatorImpl <em>Multiplicity Range Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.MultiplicityRangeOperatorImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getMultiplicityRangeOperator()
		 * @generated
		 */
		EClass MULTIPLICITY_RANGE_OPERATOR = eINSTANCE.getMultiplicityRangeOperator();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_OPERATOR__MIN = eINSTANCE.getMultiplicityRangeOperator_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_OPERATOR__MAX = eINSTANCE.getMultiplicityRangeOperator_Max();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_OPERATOR__STEP = eINSTANCE.getMultiplicityRangeOperator_Step();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.MultiplicityArrayIntegerFromRealImpl <em>Multiplicity Array Integer From Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.MultiplicityArrayIntegerFromRealImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getMultiplicityArrayIntegerFromReal()
		 * @generated
		 */
		EClass MULTIPLICITY_ARRAY_INTEGER_FROM_REAL = eINSTANCE.getMultiplicityArrayIntegerFromReal();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ARRAY_INTEGER_FROM_REAL__VALUES = eINSTANCE.getMultiplicityArrayIntegerFromReal_Values();

		/**
		 * The meta object literal for the '<em><b>Convert Double To Int</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ARRAY_INTEGER_FROM_REAL___CONVERT_DOUBLE_TO_INT = eINSTANCE.getMultiplicityArrayIntegerFromReal__ConvertDoubleToInt();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.ActivityTemplateImpl <em>Activity Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.ActivityTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getActivityTemplate()
		 * @generated
		 */
		EClass ACTIVITY_TEMPLATE = eINSTANCE.getActivityTemplate();

		/**
		 * The meta object literal for the '<em><b>Cases Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TEMPLATE__CASES_TEMPLATE = eINSTANCE.getActivityTemplate_CasesTemplate();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.CasesSpecificationImpl <em>Cases Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.CasesSpecificationImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecification()
		 * @generated
		 */
		EClass CASES_SPECIFICATION = eINSTANCE.getCasesSpecification();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.CasesSpecificationConcreteImpl <em>Cases Specification Concrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.CasesSpecificationConcreteImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecificationConcrete()
		 * @generated
		 */
		EClass CASES_SPECIFICATION_CONCRETE = eINSTANCE.getCasesSpecificationConcrete();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_CONCRETE__CASES = eINSTANCE.getCasesSpecificationConcrete_Cases();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.CasesSpecificationArrayImpl <em>Cases Specification Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.CasesSpecificationArrayImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecificationArray()
		 * @generated
		 */
		EClass CASES_SPECIFICATION_ARRAY = eINSTANCE.getCasesSpecificationArray();

		/**
		 * The meta object literal for the '<em><b>Num Cases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASES_SPECIFICATION_ARRAY__NUM_CASES = eINSTANCE.getCasesSpecificationArray_NumCases();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_ARRAY__P = eINSTANCE.getCasesSpecificationArray_P();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.CasesSpecificationParametricImpl <em>Cases Specification Parametric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.CasesSpecificationParametricImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecificationParametric()
		 * @generated
		 */
		EClass CASES_SPECIFICATION_PARAMETRIC = eINSTANCE.getCasesSpecificationParametric();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_PARAMETRIC__PARAMETER = eINSTANCE.getCasesSpecificationParametric_Parameter();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_PARAMETRIC__P = eINSTANCE.getCasesSpecificationParametric_P();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.CasesSpecificationRangeOperatorImpl <em>Cases Specification Range Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.CasesSpecificationRangeOperatorImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getCasesSpecificationRangeOperator()
		 * @generated
		 */
		EClass CASES_SPECIFICATION_RANGE_OPERATOR = eINSTANCE.getCasesSpecificationRangeOperator();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASES_SPECIFICATION_RANGE_OPERATOR__MIN = eINSTANCE.getCasesSpecificationRangeOperator_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASES_SPECIFICATION_RANGE_OPERATOR__MAX = eINSTANCE.getCasesSpecificationRangeOperator_Max();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASES_SPECIFICATION_RANGE_OPERATOR__STEP = eINSTANCE.getCasesSpecificationRangeOperator_Step();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_RANGE_OPERATOR__P = eINSTANCE.getCasesSpecificationRangeOperator_P();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.TimedActivityTemplateImpl <em>Timed Activity Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.TimedActivityTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getTimedActivityTemplate()
		 * @generated
		 */
		EClass TIMED_ACTIVITY_TEMPLATE = eINSTANCE.getTimedActivityTemplate();

		/**
		 * The meta object literal for the '<em><b>Time Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION = eINSTANCE.getTimedActivityTemplate_TimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTIVITY_TEMPLATE__ACTIVATION = eINSTANCE.getTimedActivityTemplate_Activation();

		/**
		 * The meta object literal for the '<em><b>Reactivation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTIVITY_TEMPLATE__REACTIVATION = eINSTANCE.getTimedActivityTemplate_Reactivation();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.InstantaneousActivityTemplateImpl <em>Instantaneous Activity Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.InstantaneousActivityTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getInstantaneousActivityTemplate()
		 * @generated
		 */
		EClass INSTANTANEOUS_ACTIVITY_TEMPLATE = eINSTANCE.getInstantaneousActivityTemplate();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.MarkingTemplateImpl <em>Marking Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.MarkingTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getMarkingTemplate()
		 * @generated
		 */
		EClass MARKING_TEMPLATE = eINSTANCE.getMarkingTemplate();

		/**
		 * The meta object literal for the '<em><b>Id Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING_TEMPLATE__ID_PLACE = eINSTANCE.getMarkingTemplate_IdPlace();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.MarkingTemplateSimpleImpl <em>Marking Template Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.MarkingTemplateSimpleImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getMarkingTemplateSimple()
		 * @generated
		 */
		EClass MARKING_TEMPLATE_SIMPLE = eINSTANCE.getMarkingTemplateSimple();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING_TEMPLATE_SIMPLE__VALUE = eINSTANCE.getMarkingTemplateSimple_Value();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.MarkingTemplateGlobalVariableImpl <em>Marking Template Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.MarkingTemplateGlobalVariableImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getMarkingTemplateGlobalVariable()
		 * @generated
		 */
		EClass MARKING_TEMPLATE_GLOBAL_VARIABLE = eINSTANCE.getMarkingTemplateGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING_TEMPLATE_GLOBAL_VARIABLE__VARIABLE = eINSTANCE.getMarkingTemplateGlobalVariable_Variable();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.GateTemplateImpl <em>Gate Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.GateTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getGateTemplate()
		 * @generated
		 */
		EClass GATE_TEMPLATE = eINSTANCE.getGateTemplate();

		/**
		 * The meta object literal for the '<em><b>Place Template</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE_TEMPLATE__PLACE_TEMPLATE = eINSTANCE.getGateTemplate_PlaceTemplate();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.OutputGateImpl <em>Output Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.OutputGateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getOutputGate()
		 * @generated
		 */
		EClass OUTPUT_GATE = eINSTANCE.getOutputGate();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.OutputGateConcreteImpl <em>Output Gate Concrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.OutputGateConcreteImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getOutputGateConcrete()
		 * @generated
		 */
		EClass OUTPUT_GATE_CONCRETE = eINSTANCE.getOutputGateConcrete();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_GATE_CONCRETE__CASE = eINSTANCE.getOutputGateConcrete_Case();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.OutputGateTemplateImpl <em>Output Gate Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.OutputGateTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getOutputGateTemplate()
		 * @generated
		 */
		EClass OUTPUT_GATE_TEMPLATE = eINSTANCE.getOutputGateTemplate();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_GATE_TEMPLATE__ACTIVITY = eINSTANCE.getOutputGateTemplate_Activity();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.InputGateTemplateImpl <em>Input Gate Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.InputGateTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getInputGateTemplate()
		 * @generated
		 */
		EClass INPUT_GATE_TEMPLATE = eINSTANCE.getInputGateTemplate();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_GATE_TEMPLATE__PREDICATE = eINSTANCE.getInputGateTemplate_Predicate();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_GATE_TEMPLATE__ACTIVITY = eINSTANCE.getInputGateTemplate_Activity();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.ArcTemplateImpl <em>Arc Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.ArcTemplateImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getArcTemplate()
		 * @generated
		 */
		EClass ARC_TEMPLATE = eINSTANCE.getArcTemplate();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.InputArcImpl <em>Input Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.InputArcImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getInputArc()
		 * @generated
		 */
		EClass INPUT_ARC = eINSTANCE.getInputArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ARC__SOURCE = eINSTANCE.getInputArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ARC__TARGET = eINSTANCE.getInputArc_Target();

		/**
		 * The meta object literal for the '{@link sant_dev.impl.OutputArcImpl <em>Output Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant_dev.impl.OutputArcImpl
		 * @see sant_dev.impl.SANT_DEVPackageImpl#getOutputArc()
		 * @generated
		 */
		EClass OUTPUT_ARC = eINSTANCE.getOutputArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ARC__SOURCE = eINSTANCE.getOutputArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ARC__TARGET = eINSTANCE.getOutputArc_Target();

	}

} //SANT_DEVPackage
