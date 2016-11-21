/**
 */
package sant;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see sant.SANTFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SANTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/templates/san/sant";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sant";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANTPackage eINSTANCE = sant.impl.SANTPackageImpl.init();

	/**
	 * The meta object id for the '{@link sant.impl.SANTImpl <em>SANT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.SANTImpl
	 * @see sant.impl.SANTPackageImpl#getSANT()
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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__PARAMETERS = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__PLACES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__ACTIVITIES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__GLOBAL_VARIABLES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__ARCS = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__GATES = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT__INITIALIZATION = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>SANT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANT_FEATURE_COUNT = CorePackage.TEMPLATE_MODEL_FEATURE_COUNT + 8;

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
	 * The meta object id for the '{@link sant.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.NamedElementImpl
	 * @see sant.impl.SANTPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___HAS_VARIABILITY = 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link sant.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.PlaceImpl
	 * @see sant.impl.SANTPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__MULTIPLICITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE___HAS_VARIABILITY = NAMED_ELEMENT___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.NormalPlaceImpl <em>Normal Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.NormalPlaceImpl
	 * @see sant.impl.SANTPackageImpl#getNormalPlace()
	 * @generated
	 */
	int NORMAL_PLACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PLACE__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PLACE__MULTIPLICITY = PLACE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PLACE__MARKING = PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PLACE_FEATURE_COUNT = PLACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PLACE___HAS_VARIABILITY = PLACE___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Normal Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PLACE_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExtendedPlaceImpl <em>Extended Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExtendedPlaceImpl
	 * @see sant.impl.SANTPackageImpl#getExtendedPlace()
	 * @generated
	 */
	int EXTENDED_PLACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE__MULTIPLICITY = PLACE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE__MARKING = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE__TYPE = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE_FEATURE_COUNT = PLACE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE___HAS_VARIABILITY = PLACE___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Extended Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ActivityImpl
	 * @see sant.impl.SANTPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CASES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___HAS_VARIABILITY = NAMED_ELEMENT___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.CasesSpecificationImpl <em>Cases Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.CasesSpecificationImpl
	 * @see sant.impl.SANTPackageImpl#getCasesSpecification()
	 * @generated
	 */
	int CASES_SPECIFICATION = 6;

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
	 * The meta object id for the '{@link sant.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.CaseImpl
	 * @see sant.impl.SANTPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ID = 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__P = 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant.impl.CasesSpecificationCasesImpl <em>Cases Specification Cases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.CasesSpecificationCasesImpl
	 * @see sant.impl.SANTPackageImpl#getCasesSpecificationCases()
	 * @generated
	 */
	int CASES_SPECIFICATION_CASES = 8;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_CASES__CASES = CASES_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cases Specification Cases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_CASES_FEATURE_COUNT = CASES_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cases Specification Cases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_CASES_OPERATION_COUNT = CASES_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.CasesSpecificationProbabilityArrayImpl <em>Cases Specification Probability Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.CasesSpecificationProbabilityArrayImpl
	 * @see sant.impl.SANTPackageImpl#getCasesSpecificationProbabilityArray()
	 * @generated
	 */
	int CASES_SPECIFICATION_PROBABILITY_ARRAY = 9;

	/**
	 * The feature id for the '<em><b>PValues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES = CASES_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cases Specification Probability Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PROBABILITY_ARRAY_FEATURE_COUNT = CASES_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cases Specification Probability Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PROBABILITY_ARRAY_OPERATION_COUNT = CASES_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.CasesSpecificationParametricImpl <em>Cases Specification Parametric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.CasesSpecificationParametricImpl
	 * @see sant.impl.SANTPackageImpl#getCasesSpecificationParametric()
	 * @generated
	 */
	int CASES_SPECIFICATION_PARAMETRIC = 10;

	/**
	 * The feature id for the '<em><b>Num Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PARAMETRIC__NUM_CASES = CASES_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PExpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION = CASES_SPECIFICATION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link sant.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ArcImpl
	 * @see sant.impl.SANTPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 11;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant.impl.InputArcImpl <em>Input Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.InputArcImpl
	 * @see sant.impl.SANTPackageImpl#getInputArc()
	 * @generated
	 */
	int INPUT_ARC = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__SOURCE = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__TARGET = ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.OutputArcImpl <em>Output Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.OutputArcImpl
	 * @see sant.impl.SANTPackageImpl#getOutputArc()
	 * @generated
	 */
	int OUTPUT_ARC = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__SOURCE = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__TARGET = ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.GateImpl
	 * @see sant.impl.SANTPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__PLACES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___HAS_VARIABILITY = NAMED_ELEMENT___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.OutputGateImpl <em>Output Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.OutputGateImpl
	 * @see sant.impl.SANTPackageImpl#getOutputGate()
	 * @generated
	 */
	int OUTPUT_GATE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__FUNCTION = GATE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__PLACES = GATE__PLACES;

	/**
	 * The number of structural features of the '<em>Output Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE___HAS_VARIABILITY = GATE___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Output Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.OutputGateConcreteImpl <em>Output Gate Concrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.OutputGateConcreteImpl
	 * @see sant.impl.SANTPackageImpl#getOutputGateConcrete()
	 * @generated
	 */
	int OUTPUT_GATE_CONCRETE = 16;

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
	 * The feature id for the '<em><b>Activity Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE__ACTIVITY_CASE = OUTPUT_GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Gate Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE_FEATURE_COUNT = OUTPUT_GATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE___HAS_VARIABILITY = OUTPUT_GATE___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Output Gate Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_CONCRETE_OPERATION_COUNT = OUTPUT_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.OutputGateTemplateImpl <em>Output Gate Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.OutputGateTemplateImpl
	 * @see sant.impl.SANTPackageImpl#getOutputGateTemplate()
	 * @generated
	 */
	int OUTPUT_GATE_TEMPLATE = 17;

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
	 * The feature id for the '<em><b>Activity</b></em>' reference.
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
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE___HAS_VARIABILITY = OUTPUT_GATE___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Output Gate Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_TEMPLATE_OPERATION_COUNT = OUTPUT_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.InputGateImpl <em>Input Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.InputGateImpl
	 * @see sant.impl.SANTPackageImpl#getInputGate()
	 * @generated
	 */
	int INPUT_GATE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__FUNCTION = GATE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__PLACES = GATE__PLACES;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__PREDICATE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__ACTIVITY = GATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE___HAS_VARIABILITY = GATE___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Input Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.InstantaneousActivityImpl <em>Instantaneous Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.InstantaneousActivityImpl
	 * @see sant.impl.SANTPackageImpl#getInstantaneousActivity()
	 * @generated
	 */
	int INSTANTANEOUS_ACTIVITY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__CASES = ACTIVITY__CASES;

	/**
	 * The number of structural features of the '<em>Instantaneous Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY___HAS_VARIABILITY = ACTIVITY___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Instantaneous Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.TimedActivityImpl <em>Timed Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.TimedActivityImpl
	 * @see sant.impl.SANTPackageImpl#getTimedActivity()
	 * @generated
	 */
	int TIMED_ACTIVITY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__CASES = ACTIVITY__CASES;

	/**
	 * The feature id for the '<em><b>Time Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__TIME_DISTRIBUTION = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__ACTIVATION = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reactivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__REACTIVATION = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timed Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY___HAS_VARIABILITY = ACTIVITY___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Timed Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.DistributionImpl
	 * @see sant.impl.SANTPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 21;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionImpl
	 * @see sant.impl.SANTPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SEGMENTS = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant.ExpressionSegment <em>Expression Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.ExpressionSegment
	 * @see sant.impl.SANTPackageImpl#getExpressionSegment()
	 * @generated
	 */
	int EXPRESSION_SEGMENT = 23;

	/**
	 * The number of structural features of the '<em>Expression Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SEGMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionTextImpl <em>Expression Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionTextImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionText()
	 * @generated
	 */
	int EXPRESSION_TEXT = 24;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEXT__TEXT = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEXT_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEXT_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionMarkingImpl <em>Expression Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionMarkingImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionMarking()
	 * @generated
	 */
	int EXPRESSION_MARKING = 25;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MARKING__PLACE = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MARKING__INDEX = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MARKING_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MARKING_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionVariableImpl <em>Expression Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionVariableImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionVariable()
	 * @generated
	 */
	int EXPRESSION_VARIABLE = 26;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE__VARIABLE = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionTemplateExpressionImpl <em>Expression Template Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionTemplateExpressionImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionTemplateExpression()
	 * @generated
	 */
	int EXPRESSION_TEMPLATE_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEMPLATE_EXPRESSION__EXP = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Template Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEMPLATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Template Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEMPLATE_EXPRESSION_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionIterationElementImpl <em>Expression Iteration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionIterationElementImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionIterationElement()
	 * @generated
	 */
	int EXPRESSION_ITERATION_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ITERATION_ELEMENT__ITERATOR = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ITERATION_ELEMENT__I = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Iteration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ITERATION_ELEMENT_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Iteration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ITERATION_ELEMENT_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionActivityCasesNumberImpl <em>Expression Activity Cases Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionActivityCasesNumberImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionActivityCasesNumber()
	 * @generated
	 */
	int EXPRESSION_ACTIVITY_CASES_NUMBER = 29;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Activity Cases Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTIVITY_CASES_NUMBER_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE = EXPRESSION_SEGMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE__ELIST = EXPRESSION_SEGMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Activity Cases Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTIVITY_CASES_NUMBER_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionPlaceTemplateSizeImpl <em>Expression Place Template Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionPlaceTemplateSizeImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionPlaceTemplateSize()
	 * @generated
	 */
	int EXPRESSION_PLACE_TEMPLATE_SIZE = 30;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLACE_TEMPLATE_SIZE__PLACE = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Place Template Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLACE_TEMPLATE_SIZE_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLACE_TEMPLATE_SIZE___EVALUATE = EXPRESSION_SEGMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLACE_TEMPLATE_SIZE___EVALUATE__ELIST = EXPRESSION_SEGMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Place Template Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLACE_TEMPLATE_SIZE_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionIfThenElseImpl <em>Expression If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionIfThenElseImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionIfThenElse()
	 * @generated
	 */
	int EXPRESSION_IF_THEN_ELSE = 31;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IF_THEN_ELSE__CONDITION = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IF_THEN_ELSE__IF_TRUE = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IF_THEN_ELSE__IF_FALSE = EXPRESSION_SEGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IF_THEN_ELSE_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Expression If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_IF_THEN_ELSE_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExpressionLoopImpl <em>Expression Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExpressionLoopImpl
	 * @see sant.impl.SANTPackageImpl#getExpressionLoop()
	 * @generated
	 */
	int EXPRESSION_LOOP = 32;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LOOP__BEGIN = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LOOP__END = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LOOP__DO = EXPRESSION_SEGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LOOP_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Expression Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LOOP_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.VariabilityIterator <em>Variability Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.VariabilityIterator
	 * @see sant.impl.SANTPackageImpl#getVariabilityIterator()
	 * @generated
	 */
	int VARIABILITY_ITERATOR = 33;

	/**
	 * The number of structural features of the '<em>Variability Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_ITERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Variability Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_ITERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant.impl.ThisContextIteratorImpl <em>This Context Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ThisContextIteratorImpl
	 * @see sant.impl.SANTPackageImpl#getThisContextIterator()
	 * @generated
	 */
	int THIS_CONTEXT_ITERATOR = 34;

	/**
	 * The number of structural features of the '<em>This Context Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_CONTEXT_ITERATOR_FEATURE_COUNT = VARIABILITY_ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_CONTEXT_ITERATOR___EVALUATE__ELIST = VARIABILITY_ITERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_CONTEXT_ITERATOR___EVALUATE = VARIABILITY_ITERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>This Context Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_CONTEXT_ITERATOR_OPERATION_COUNT = VARIABILITY_ITERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link sant.impl.LoopIteratorImpl <em>Loop Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.LoopIteratorImpl
	 * @see sant.impl.SANTPackageImpl#getLoopIterator()
	 * @generated
	 */
	int LOOP_ITERATOR = 35;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ITERATOR__LOOP = VARIABILITY_ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ITERATOR_FEATURE_COUNT = VARIABILITY_ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ITERATOR_OPERATION_COUNT = VARIABILITY_ITERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.MarkingImpl
	 * @see sant.impl.SANTPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 36;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sant.impl.MarkingSimpleImpl <em>Marking Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.MarkingSimpleImpl
	 * @see sant.impl.SANTPackageImpl#getMarkingSimple()
	 * @generated
	 */
	int MARKING_SIMPLE = 58;

	/**
	 * The number of structural features of the '<em>Marking Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_SIMPLE_FEATURE_COUNT = MARKING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Marking Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_SIMPLE_OPERATION_COUNT = MARKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.MarkingIntegerImpl <em>Marking Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.MarkingIntegerImpl
	 * @see sant.impl.SANTPackageImpl#getMarkingInteger()
	 * @generated
	 */
	int MARKING_INTEGER = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_INTEGER__VALUE = MARKING_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_INTEGER_FEATURE_COUNT = MARKING_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_INTEGER_OPERATION_COUNT = MARKING_SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.MarkingExtendedImpl <em>Marking Extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.MarkingExtendedImpl
	 * @see sant.impl.SANTPackageImpl#getMarkingExtended()
	 * @generated
	 */
	int MARKING_EXTENDED = 38;

	/**
	 * The number of structural features of the '<em>Marking Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_EXTENDED_FEATURE_COUNT = MARKING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Marking Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_EXTENDED_OPERATION_COUNT = MARKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.GlobalVariableImpl
	 * @see sant.impl.SANTPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Variability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE___HAS_VARIABILITY = NAMED_ELEMENT___HAS_VARIABILITY;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.MarkingVariableSimpleImpl <em>Marking Variable Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.MarkingVariableSimpleImpl
	 * @see sant.impl.SANTPackageImpl#getMarkingVariableSimple()
	 * @generated
	 */
	int MARKING_VARIABLE_SIMPLE = 40;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_VARIABLE_SIMPLE__VARIABLE = MARKING_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking Variable Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_VARIABLE_SIMPLE_FEATURE_COUNT = MARKING_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking Variable Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_VARIABLE_SIMPLE_OPERATION_COUNT = MARKING_SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ExponentialImpl <em>Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ExponentialImpl
	 * @see sant.impl.SANTPackageImpl#getExponential()
	 * @generated
	 */
	int EXPONENTIAL = 41;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL__RATE = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.NormalImpl
	 * @see sant.impl.SANTPackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 42;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__MEAN = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__VARIANCE = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.GammaImpl <em>Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.GammaImpl
	 * @see sant.impl.SANTPackageImpl#getGamma()
	 * @generated
	 */
	int GAMMA = 43;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__ALPHA = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__BETA = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.BinomialImpl <em>Binomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.BinomialImpl
	 * @see sant.impl.SANTPackageImpl#getBinomial()
	 * @generated
	 */
	int BINOMIAL = 44;

	/**
	 * The feature id for the '<em><b>T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL__T = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL__P = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binomial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binomial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.DeterministicImpl <em>Deterministic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.DeterministicImpl
	 * @see sant.impl.SANTPackageImpl#getDeterministic()
	 * @generated
	 */
	int DETERMINISTIC = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC__VALUE = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deterministic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Deterministic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.LognormalImpl <em>Lognormal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.LognormalImpl
	 * @see sant.impl.SANTPackageImpl#getLognormal()
	 * @generated
	 */
	int LOGNORMAL = 46;

	/**
	 * The feature id for the '<em><b>Mu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGNORMAL__MU = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha Squared</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGNORMAL__ALPHA_SQUARED = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lognormal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGNORMAL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lognormal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGNORMAL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.BetaImpl <em>Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.BetaImpl
	 * @see sant.impl.SANTPackageImpl#getBeta()
	 * @generated
	 */
	int BETA = 47;

	/**
	 * The feature id for the '<em><b>Alpha1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__ALPHA1 = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beta1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__BETA1 = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.NegativeBinomialImpl <em>Negative Binomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.NegativeBinomialImpl
	 * @see sant.impl.SANTPackageImpl#getNegativeBinomial()
	 * @generated
	 */
	int NEGATIVE_BINOMIAL = 48;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_BINOMIAL__S = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_BINOMIAL__P = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Negative Binomial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_BINOMIAL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Negative Binomial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_BINOMIAL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.GeometricImpl <em>Geometric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.GeometricImpl
	 * @see sant.impl.SANTPackageImpl#getGeometric()
	 * @generated
	 */
	int GEOMETRIC = 49;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC__P = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geometric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ErlangImpl <em>Erlang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ErlangImpl
	 * @see sant.impl.SANTPackageImpl#getErlang()
	 * @generated
	 */
	int ERLANG = 50;

	/**
	 * The feature id for the '<em><b>M</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG__M = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG__BETA = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erlang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erlang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.UniformImpl <em>Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.UniformImpl
	 * @see sant.impl.SANTPackageImpl#getUniform()
	 * @generated
	 */
	int UNIFORM = 51;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__LOWER_BOUND = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__UPPER_BOUND = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.HyperExponentialImpl <em>Hyper Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.HyperExponentialImpl
	 * @see sant.impl.SANTPackageImpl#getHyperExponential()
	 * @generated
	 */
	int HYPER_EXPONENTIAL = 52;

	/**
	 * The feature id for the '<em><b>Rate0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_EXPONENTIAL__RATE0 = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_EXPONENTIAL__P0 = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hyper Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_EXPONENTIAL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hyper Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_EXPONENTIAL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.WeibullImpl <em>Weibull</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.WeibullImpl
	 * @see sant.impl.SANTPackageImpl#getWeibull()
	 * @generated
	 */
	int WEIBULL = 53;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL__ALPHA = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL__BETA = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weibull</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Weibull</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.TriangularImpl <em>Triangular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.TriangularImpl
	 * @see sant.impl.SANTPackageImpl#getTriangular()
	 * @generated
	 */
	int TRIANGULAR = 54;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR__MIN = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Middle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR__MIDDLE = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR__MAX = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Triangular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Triangular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ConditionalWeibullImpl <em>Conditional Weibull</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ConditionalWeibullImpl
	 * @see sant.impl.SANTPackageImpl#getConditionalWeibull()
	 * @generated
	 */
	int CONDITIONAL_WEIBULL = 55;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_WEIBULL__ALPHA = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_WEIBULL__BETA = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_WEIBULL__T = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Weibull</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_WEIBULL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Weibull</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_WEIBULL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.HypoExponentialImpl <em>Hypo Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.HypoExponentialImpl
	 * @see sant.impl.SANTPackageImpl#getHypoExponential()
	 * @generated
	 */
	int HYPO_EXPONENTIAL = 56;

	/**
	 * The feature id for the '<em><b>Rate0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPO_EXPONENTIAL__RATE0 = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hypo Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPO_EXPONENTIAL_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hypo Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPO_EXPONENTIAL_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.ParetoImpl <em>Pareto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.ParetoImpl
	 * @see sant.impl.SANTPackageImpl#getPareto()
	 * @generated
	 */
	int PARETO = 57;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARETO__LOWER_BOUND = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARETO__SHAPE = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pareto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARETO_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pareto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARETO_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.MarkingStringImpl <em>Marking String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.MarkingStringImpl
	 * @see sant.impl.SANTPackageImpl#getMarkingString()
	 * @generated
	 */
	int MARKING_STRING = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_STRING__VALUE = MARKING_EXTENDED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_STRING_FEATURE_COUNT = MARKING_EXTENDED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_STRING_OPERATION_COUNT = MARKING_EXTENDED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.impl.MarkingVariableExtendedImpl <em>Marking Variable Extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.impl.MarkingVariableExtendedImpl
	 * @see sant.impl.SANTPackageImpl#getMarkingVariableExtended()
	 * @generated
	 */
	int MARKING_VARIABLE_EXTENDED = 60;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_VARIABLE_EXTENDED__VARIABLE = MARKING_EXTENDED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking Variable Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_VARIABLE_EXTENDED_FEATURE_COUNT = MARKING_EXTENDED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking Variable Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_VARIABLE_EXTENDED_OPERATION_COUNT = MARKING_EXTENDED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sant.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.VariableType
	 * @see sant.impl.SANTPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 61;

	/**
	 * The meta object id for the '{@link sant.ExtendedPlaceType <em>Extended Place Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sant.ExtendedPlaceType
	 * @see sant.impl.SANTPackageImpl#getExtendedPlaceType()
	 * @generated
	 */
	int EXTENDED_PLACE_TYPE = 62;

	/**
	 * The meta object id for the '<em>Code Fragment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see sant.impl.SANTPackageImpl#getCodeFragment()
	 * @generated
	 */
	int CODE_FRAGMENT = 63;


	/**
	 * Returns the meta object for class '{@link sant.SANT <em>SANT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SANT</em>'.
	 * @see sant.SANT
	 * @generated
	 */
	EClass getSANT();

	/**
	 * Returns the meta object for the attribute '{@link sant.SANT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sant.SANT#getName()
	 * @see #getSANT()
	 * @generated
	 */
	EAttribute getSANT_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.SANT#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sant.SANT#getParameters()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.SANT#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see sant.SANT#getPlaces()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.SANT#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see sant.SANT#getActivities()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.SANT#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variables</em>'.
	 * @see sant.SANT#getGlobalVariables()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_GlobalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.SANT#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see sant.SANT#getArcs()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.SANT#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see sant.SANT#getGates()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.SANT#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initialization</em>'.
	 * @see sant.SANT#getInitialization()
	 * @see #getSANT()
	 * @generated
	 */
	EReference getSANT_Initialization();

	/**
	 * Returns the meta object for class '{@link sant.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see sant.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link sant.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sant.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the '{@link sant.NamedElement#hasVariability() <em>Has Variability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Variability</em>' operation.
	 * @see sant.NamedElement#hasVariability()
	 * @generated
	 */
	EOperation getNamedElement__HasVariability();

	/**
	 * Returns the meta object for class '{@link sant.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see sant.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Place#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see sant.Place#getMultiplicity()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Multiplicity();

	/**
	 * Returns the meta object for class '{@link sant.NormalPlace <em>Normal Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Place</em>'.
	 * @see sant.NormalPlace
	 * @generated
	 */
	EClass getNormalPlace();

	/**
	 * Returns the meta object for the containment reference '{@link sant.NormalPlace#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see sant.NormalPlace#getMarking()
	 * @see #getNormalPlace()
	 * @generated
	 */
	EReference getNormalPlace_Marking();

	/**
	 * Returns the meta object for class '{@link sant.ExtendedPlace <em>Extended Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Place</em>'.
	 * @see sant.ExtendedPlace
	 * @generated
	 */
	EClass getExtendedPlace();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExtendedPlace#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see sant.ExtendedPlace#getMarking()
	 * @see #getExtendedPlace()
	 * @generated
	 */
	EReference getExtendedPlace_Marking();

	/**
	 * Returns the meta object for the attribute '{@link sant.ExtendedPlace#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sant.ExtendedPlace#getType()
	 * @see #getExtendedPlace()
	 * @generated
	 */
	EAttribute getExtendedPlace_Type();

	/**
	 * Returns the meta object for class '{@link sant.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see sant.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Activity#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cases</em>'.
	 * @see sant.Activity#getCases()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Cases();

	/**
	 * Returns the meta object for class '{@link sant.CasesSpecification <em>Cases Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification</em>'.
	 * @see sant.CasesSpecification
	 * @generated
	 */
	EClass getCasesSpecification();

	/**
	 * Returns the meta object for class '{@link sant.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see sant.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Case#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ID</em>'.
	 * @see sant.Case#getID()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_ID();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Case#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see sant.Case#getP()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_P();

	/**
	 * Returns the meta object for class '{@link sant.CasesSpecificationCases <em>Cases Specification Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification Cases</em>'.
	 * @see sant.CasesSpecificationCases
	 * @generated
	 */
	EClass getCasesSpecificationCases();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.CasesSpecificationCases#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see sant.CasesSpecificationCases#getCases()
	 * @see #getCasesSpecificationCases()
	 * @generated
	 */
	EReference getCasesSpecificationCases_Cases();

	/**
	 * Returns the meta object for class '{@link sant.CasesSpecificationProbabilityArray <em>Cases Specification Probability Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification Probability Array</em>'.
	 * @see sant.CasesSpecificationProbabilityArray
	 * @generated
	 */
	EClass getCasesSpecificationProbabilityArray();

	/**
	 * Returns the meta object for the reference '{@link sant.CasesSpecificationProbabilityArray#getPValues <em>PValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PValues</em>'.
	 * @see sant.CasesSpecificationProbabilityArray#getPValues()
	 * @see #getCasesSpecificationProbabilityArray()
	 * @generated
	 */
	EReference getCasesSpecificationProbabilityArray_PValues();

	/**
	 * Returns the meta object for class '{@link sant.CasesSpecificationParametric <em>Cases Specification Parametric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cases Specification Parametric</em>'.
	 * @see sant.CasesSpecificationParametric
	 * @generated
	 */
	EClass getCasesSpecificationParametric();

	/**
	 * Returns the meta object for the containment reference '{@link sant.CasesSpecificationParametric#getNumCases <em>Num Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num Cases</em>'.
	 * @see sant.CasesSpecificationParametric#getNumCases()
	 * @see #getCasesSpecificationParametric()
	 * @generated
	 */
	EReference getCasesSpecificationParametric_NumCases();

	/**
	 * Returns the meta object for the containment reference '{@link sant.CasesSpecificationParametric#getPExpression <em>PExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PExpression</em>'.
	 * @see sant.CasesSpecificationParametric#getPExpression()
	 * @see #getCasesSpecificationParametric()
	 * @generated
	 */
	EReference getCasesSpecificationParametric_PExpression();

	/**
	 * Returns the meta object for class '{@link sant.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see sant.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for class '{@link sant.InputArc <em>Input Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Arc</em>'.
	 * @see sant.InputArc
	 * @generated
	 */
	EClass getInputArc();

	/**
	 * Returns the meta object for the reference '{@link sant.InputArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sant.InputArc#getSource()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_Source();

	/**
	 * Returns the meta object for the reference '{@link sant.InputArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sant.InputArc#getTarget()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_Target();

	/**
	 * Returns the meta object for class '{@link sant.OutputArc <em>Output Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Arc</em>'.
	 * @see sant.OutputArc
	 * @generated
	 */
	EClass getOutputArc();

	/**
	 * Returns the meta object for the reference '{@link sant.OutputArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sant.OutputArc#getSource()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_Source();

	/**
	 * Returns the meta object for the reference '{@link sant.OutputArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sant.OutputArc#getTarget()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_Target();

	/**
	 * Returns the meta object for class '{@link sant.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see sant.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Gate#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see sant.Gate#getFunction()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Function();

	/**
	 * Returns the meta object for the reference list '{@link sant.Gate#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Places</em>'.
	 * @see sant.Gate#getPlaces()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Places();

	/**
	 * Returns the meta object for class '{@link sant.OutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate</em>'.
	 * @see sant.OutputGate
	 * @generated
	 */
	EClass getOutputGate();

	/**
	 * Returns the meta object for class '{@link sant.OutputGateConcrete <em>Output Gate Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate Concrete</em>'.
	 * @see sant.OutputGateConcrete
	 * @generated
	 */
	EClass getOutputGateConcrete();

	/**
	 * Returns the meta object for the reference '{@link sant.OutputGateConcrete#getActivityCase <em>Activity Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Case</em>'.
	 * @see sant.OutputGateConcrete#getActivityCase()
	 * @see #getOutputGateConcrete()
	 * @generated
	 */
	EReference getOutputGateConcrete_ActivityCase();

	/**
	 * Returns the meta object for class '{@link sant.OutputGateTemplate <em>Output Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate Template</em>'.
	 * @see sant.OutputGateTemplate
	 * @generated
	 */
	EClass getOutputGateTemplate();

	/**
	 * Returns the meta object for the reference '{@link sant.OutputGateTemplate#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see sant.OutputGateTemplate#getActivity()
	 * @see #getOutputGateTemplate()
	 * @generated
	 */
	EReference getOutputGateTemplate_Activity();

	/**
	 * Returns the meta object for class '{@link sant.InputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Gate</em>'.
	 * @see sant.InputGate
	 * @generated
	 */
	EClass getInputGate();

	/**
	 * Returns the meta object for the containment reference '{@link sant.InputGate#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see sant.InputGate#getPredicate()
	 * @see #getInputGate()
	 * @generated
	 */
	EReference getInputGate_Predicate();

	/**
	 * Returns the meta object for the reference '{@link sant.InputGate#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see sant.InputGate#getActivity()
	 * @see #getInputGate()
	 * @generated
	 */
	EReference getInputGate_Activity();

	/**
	 * Returns the meta object for class '{@link sant.InstantaneousActivity <em>Instantaneous Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantaneous Activity</em>'.
	 * @see sant.InstantaneousActivity
	 * @generated
	 */
	EClass getInstantaneousActivity();

	/**
	 * Returns the meta object for class '{@link sant.TimedActivity <em>Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Activity</em>'.
	 * @see sant.TimedActivity
	 * @generated
	 */
	EClass getTimedActivity();

	/**
	 * Returns the meta object for the containment reference '{@link sant.TimedActivity#getTimeDistribution <em>Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Distribution</em>'.
	 * @see sant.TimedActivity#getTimeDistribution()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_TimeDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link sant.TimedActivity#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see sant.TimedActivity#getActivation()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link sant.TimedActivity#getReactivation <em>Reactivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reactivation</em>'.
	 * @see sant.TimedActivity#getReactivation()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_Reactivation();

	/**
	 * Returns the meta object for class '{@link sant.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see sant.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for class '{@link sant.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see sant.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.Expression#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see sant.Expression#getSegments()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Segments();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionSegment <em>Expression Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Segment</em>'.
	 * @see sant.ExpressionSegment
	 * @generated
	 */
	EClass getExpressionSegment();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Text</em>'.
	 * @see sant.ExpressionText
	 * @generated
	 */
	EClass getExpressionText();

	/**
	 * Returns the meta object for the attribute '{@link sant.ExpressionText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see sant.ExpressionText#getText()
	 * @see #getExpressionText()
	 * @generated
	 */
	EAttribute getExpressionText_Text();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionMarking <em>Expression Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Marking</em>'.
	 * @see sant.ExpressionMarking
	 * @generated
	 */
	EClass getExpressionMarking();

	/**
	 * Returns the meta object for the reference '{@link sant.ExpressionMarking#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see sant.ExpressionMarking#getPlace()
	 * @see #getExpressionMarking()
	 * @generated
	 */
	EReference getExpressionMarking_Place();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExpressionMarking#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see sant.ExpressionMarking#getIndex()
	 * @see #getExpressionMarking()
	 * @generated
	 */
	EReference getExpressionMarking_Index();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionVariable <em>Expression Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Variable</em>'.
	 * @see sant.ExpressionVariable
	 * @generated
	 */
	EClass getExpressionVariable();

	/**
	 * Returns the meta object for the reference '{@link sant.ExpressionVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see sant.ExpressionVariable#getVariable()
	 * @see #getExpressionVariable()
	 * @generated
	 */
	EReference getExpressionVariable_Variable();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionTemplateExpression <em>Expression Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Template Expression</em>'.
	 * @see sant.ExpressionTemplateExpression
	 * @generated
	 */
	EClass getExpressionTemplateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExpressionTemplateExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see sant.ExpressionTemplateExpression#getExp()
	 * @see #getExpressionTemplateExpression()
	 * @generated
	 */
	EReference getExpressionTemplateExpression_Exp();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionIterationElement <em>Expression Iteration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Iteration Element</em>'.
	 * @see sant.ExpressionIterationElement
	 * @generated
	 */
	EClass getExpressionIterationElement();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExpressionIterationElement#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see sant.ExpressionIterationElement#getIterator()
	 * @see #getExpressionIterationElement()
	 * @generated
	 */
	EReference getExpressionIterationElement_Iterator();

	/**
	 * Returns the meta object for the attribute '{@link sant.ExpressionIterationElement#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I</em>'.
	 * @see sant.ExpressionIterationElement#getI()
	 * @see #getExpressionIterationElement()
	 * @generated
	 */
	EAttribute getExpressionIterationElement_I();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionActivityCasesNumber <em>Expression Activity Cases Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Activity Cases Number</em>'.
	 * @see sant.ExpressionActivityCasesNumber
	 * @generated
	 */
	EClass getExpressionActivityCasesNumber();

	/**
	 * Returns the meta object for the reference '{@link sant.ExpressionActivityCasesNumber#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see sant.ExpressionActivityCasesNumber#getActivity()
	 * @see #getExpressionActivityCasesNumber()
	 * @generated
	 */
	EReference getExpressionActivityCasesNumber_Activity();

	/**
	 * Returns the meta object for the '{@link sant.ExpressionActivityCasesNumber#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see sant.ExpressionActivityCasesNumber#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getExpressionActivityCasesNumber__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionPlaceTemplateSize <em>Expression Place Template Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Place Template Size</em>'.
	 * @see sant.ExpressionPlaceTemplateSize
	 * @generated
	 */
	EClass getExpressionPlaceTemplateSize();

	/**
	 * Returns the meta object for the reference '{@link sant.ExpressionPlaceTemplateSize#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see sant.ExpressionPlaceTemplateSize#getPlace()
	 * @see #getExpressionPlaceTemplateSize()
	 * @generated
	 */
	EReference getExpressionPlaceTemplateSize_Place();

	/**
	 * Returns the meta object for the '{@link sant.ExpressionPlaceTemplateSize#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see sant.ExpressionPlaceTemplateSize#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getExpressionPlaceTemplateSize__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionIfThenElse <em>Expression If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression If Then Else</em>'.
	 * @see sant.ExpressionIfThenElse
	 * @generated
	 */
	EClass getExpressionIfThenElse();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExpressionIfThenElse#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see sant.ExpressionIfThenElse#getCondition()
	 * @see #getExpressionIfThenElse()
	 * @generated
	 */
	EReference getExpressionIfThenElse_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExpressionIfThenElse#getIfTrue <em>If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If True</em>'.
	 * @see sant.ExpressionIfThenElse#getIfTrue()
	 * @see #getExpressionIfThenElse()
	 * @generated
	 */
	EReference getExpressionIfThenElse_IfTrue();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExpressionIfThenElse#getIfFalse <em>If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If False</em>'.
	 * @see sant.ExpressionIfThenElse#getIfFalse()
	 * @see #getExpressionIfThenElse()
	 * @generated
	 */
	EReference getExpressionIfThenElse_IfFalse();

	/**
	 * Returns the meta object for class '{@link sant.ExpressionLoop <em>Expression Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Loop</em>'.
	 * @see sant.ExpressionLoop
	 * @generated
	 */
	EClass getExpressionLoop();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExpressionLoop#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see sant.ExpressionLoop#getBegin()
	 * @see #getExpressionLoop()
	 * @generated
	 */
	EReference getExpressionLoop_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ExpressionLoop#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see sant.ExpressionLoop#getEnd()
	 * @see #getExpressionLoop()
	 * @generated
	 */
	EReference getExpressionLoop_End();

	/**
	 * Returns the meta object for the containment reference list '{@link sant.ExpressionLoop#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do</em>'.
	 * @see sant.ExpressionLoop#getDo()
	 * @see #getExpressionLoop()
	 * @generated
	 */
	EReference getExpressionLoop_Do();

	/**
	 * Returns the meta object for class '{@link sant.VariabilityIterator <em>Variability Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability Iterator</em>'.
	 * @see sant.VariabilityIterator
	 * @generated
	 */
	EClass getVariabilityIterator();

	/**
	 * Returns the meta object for class '{@link sant.ThisContextIterator <em>This Context Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Context Iterator</em>'.
	 * @see sant.ThisContextIterator
	 * @generated
	 */
	EClass getThisContextIterator();

	/**
	 * Returns the meta object for class '{@link sant.LoopIterator <em>Loop Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Iterator</em>'.
	 * @see sant.LoopIterator
	 * @generated
	 */
	EClass getLoopIterator();

	/**
	 * Returns the meta object for the reference '{@link sant.LoopIterator#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop</em>'.
	 * @see sant.LoopIterator#getLoop()
	 * @see #getLoopIterator()
	 * @generated
	 */
	EReference getLoopIterator_Loop();

	/**
	 * Returns the meta object for class '{@link sant.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see sant.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for class '{@link sant.MarkingInteger <em>Marking Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Integer</em>'.
	 * @see sant.MarkingInteger
	 * @generated
	 */
	EClass getMarkingInteger();

	/**
	 * Returns the meta object for the containment reference '{@link sant.MarkingInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see sant.MarkingInteger#getValue()
	 * @see #getMarkingInteger()
	 * @generated
	 */
	EReference getMarkingInteger_Value();

	/**
	 * Returns the meta object for class '{@link sant.MarkingExtended <em>Marking Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Extended</em>'.
	 * @see sant.MarkingExtended
	 * @generated
	 */
	EClass getMarkingExtended();

	/**
	 * Returns the meta object for class '{@link sant.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see sant.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link sant.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sant.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for class '{@link sant.MarkingVariableSimple <em>Marking Variable Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Variable Simple</em>'.
	 * @see sant.MarkingVariableSimple
	 * @generated
	 */
	EClass getMarkingVariableSimple();

	/**
	 * Returns the meta object for the reference '{@link sant.MarkingVariableSimple#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see sant.MarkingVariableSimple#getVariable()
	 * @see #getMarkingVariableSimple()
	 * @generated
	 */
	EReference getMarkingVariableSimple_Variable();

	/**
	 * Returns the meta object for class '{@link sant.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential</em>'.
	 * @see sant.Exponential
	 * @generated
	 */
	EClass getExponential();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Exponential#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate</em>'.
	 * @see sant.Exponential#getRate()
	 * @see #getExponential()
	 * @generated
	 */
	EReference getExponential_Rate();

	/**
	 * Returns the meta object for class '{@link sant.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see sant.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Normal#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see sant.Normal#getMean()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Mean();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Normal#getVariance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variance</em>'.
	 * @see sant.Normal#getVariance()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Variance();

	/**
	 * Returns the meta object for class '{@link sant.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamma</em>'.
	 * @see sant.Gamma
	 * @generated
	 */
	EClass getGamma();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Gamma#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see sant.Gamma#getAlpha()
	 * @see #getGamma()
	 * @generated
	 */
	EReference getGamma_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Gamma#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see sant.Gamma#getBeta()
	 * @see #getGamma()
	 * @generated
	 */
	EReference getGamma_Beta();

	/**
	 * Returns the meta object for class '{@link sant.Binomial <em>Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binomial</em>'.
	 * @see sant.Binomial
	 * @generated
	 */
	EClass getBinomial();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Binomial#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>T</em>'.
	 * @see sant.Binomial#getT()
	 * @see #getBinomial()
	 * @generated
	 */
	EReference getBinomial_T();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Binomial#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see sant.Binomial#getP()
	 * @see #getBinomial()
	 * @generated
	 */
	EReference getBinomial_P();

	/**
	 * Returns the meta object for class '{@link sant.Deterministic <em>Deterministic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic</em>'.
	 * @see sant.Deterministic
	 * @generated
	 */
	EClass getDeterministic();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Deterministic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see sant.Deterministic#getValue()
	 * @see #getDeterministic()
	 * @generated
	 */
	EReference getDeterministic_Value();

	/**
	 * Returns the meta object for class '{@link sant.Lognormal <em>Lognormal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lognormal</em>'.
	 * @see sant.Lognormal
	 * @generated
	 */
	EClass getLognormal();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Lognormal#getMu <em>Mu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mu</em>'.
	 * @see sant.Lognormal#getMu()
	 * @see #getLognormal()
	 * @generated
	 */
	EReference getLognormal_Mu();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Lognormal#getAlphaSquared <em>Alpha Squared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha Squared</em>'.
	 * @see sant.Lognormal#getAlphaSquared()
	 * @see #getLognormal()
	 * @generated
	 */
	EReference getLognormal_AlphaSquared();

	/**
	 * Returns the meta object for class '{@link sant.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beta</em>'.
	 * @see sant.Beta
	 * @generated
	 */
	EClass getBeta();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Beta#getAlpha1 <em>Alpha1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha1</em>'.
	 * @see sant.Beta#getAlpha1()
	 * @see #getBeta()
	 * @generated
	 */
	EReference getBeta_Alpha1();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Beta#getBeta1 <em>Beta1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta1</em>'.
	 * @see sant.Beta#getBeta1()
	 * @see #getBeta()
	 * @generated
	 */
	EReference getBeta_Beta1();

	/**
	 * Returns the meta object for class '{@link sant.NegativeBinomial <em>Negative Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Binomial</em>'.
	 * @see sant.NegativeBinomial
	 * @generated
	 */
	EClass getNegativeBinomial();

	/**
	 * Returns the meta object for the containment reference '{@link sant.NegativeBinomial#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see sant.NegativeBinomial#getS()
	 * @see #getNegativeBinomial()
	 * @generated
	 */
	EReference getNegativeBinomial_S();

	/**
	 * Returns the meta object for the containment reference '{@link sant.NegativeBinomial#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see sant.NegativeBinomial#getP()
	 * @see #getNegativeBinomial()
	 * @generated
	 */
	EReference getNegativeBinomial_P();

	/**
	 * Returns the meta object for class '{@link sant.Geometric <em>Geometric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometric</em>'.
	 * @see sant.Geometric
	 * @generated
	 */
	EClass getGeometric();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Geometric#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see sant.Geometric#getP()
	 * @see #getGeometric()
	 * @generated
	 */
	EReference getGeometric_P();

	/**
	 * Returns the meta object for class '{@link sant.Erlang <em>Erlang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erlang</em>'.
	 * @see sant.Erlang
	 * @generated
	 */
	EClass getErlang();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Erlang#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>M</em>'.
	 * @see sant.Erlang#getM()
	 * @see #getErlang()
	 * @generated
	 */
	EReference getErlang_M();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Erlang#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see sant.Erlang#getBeta()
	 * @see #getErlang()
	 * @generated
	 */
	EReference getErlang_Beta();

	/**
	 * Returns the meta object for class '{@link sant.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform</em>'.
	 * @see sant.Uniform
	 * @generated
	 */
	EClass getUniform();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Uniform#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see sant.Uniform#getLowerBound()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Uniform#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see sant.Uniform#getUpperBound()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_UpperBound();

	/**
	 * Returns the meta object for class '{@link sant.HyperExponential <em>Hyper Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Exponential</em>'.
	 * @see sant.HyperExponential
	 * @generated
	 */
	EClass getHyperExponential();

	/**
	 * Returns the meta object for the containment reference '{@link sant.HyperExponential#getRate0 <em>Rate0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate0</em>'.
	 * @see sant.HyperExponential#getRate0()
	 * @see #getHyperExponential()
	 * @generated
	 */
	EReference getHyperExponential_Rate0();

	/**
	 * Returns the meta object for the containment reference '{@link sant.HyperExponential#getP0 <em>P0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P0</em>'.
	 * @see sant.HyperExponential#getP0()
	 * @see #getHyperExponential()
	 * @generated
	 */
	EReference getHyperExponential_P0();

	/**
	 * Returns the meta object for class '{@link sant.Weibull <em>Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull</em>'.
	 * @see sant.Weibull
	 * @generated
	 */
	EClass getWeibull();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Weibull#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see sant.Weibull#getAlpha()
	 * @see #getWeibull()
	 * @generated
	 */
	EReference getWeibull_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Weibull#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see sant.Weibull#getBeta()
	 * @see #getWeibull()
	 * @generated
	 */
	EReference getWeibull_Beta();

	/**
	 * Returns the meta object for class '{@link sant.Triangular <em>Triangular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular</em>'.
	 * @see sant.Triangular
	 * @generated
	 */
	EClass getTriangular();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Triangular#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see sant.Triangular#getMin()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Min();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Triangular#getMiddle <em>Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middle</em>'.
	 * @see sant.Triangular#getMiddle()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Middle();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Triangular#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see sant.Triangular#getMax()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Max();

	/**
	 * Returns the meta object for class '{@link sant.ConditionalWeibull <em>Conditional Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Weibull</em>'.
	 * @see sant.ConditionalWeibull
	 * @generated
	 */
	EClass getConditionalWeibull();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ConditionalWeibull#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see sant.ConditionalWeibull#getAlpha()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ConditionalWeibull#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see sant.ConditionalWeibull#getBeta()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_Beta();

	/**
	 * Returns the meta object for the containment reference '{@link sant.ConditionalWeibull#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>T</em>'.
	 * @see sant.ConditionalWeibull#getT()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_T();

	/**
	 * Returns the meta object for class '{@link sant.HypoExponential <em>Hypo Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypo Exponential</em>'.
	 * @see sant.HypoExponential
	 * @generated
	 */
	EClass getHypoExponential();

	/**
	 * Returns the meta object for the containment reference '{@link sant.HypoExponential#getRate0 <em>Rate0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate0</em>'.
	 * @see sant.HypoExponential#getRate0()
	 * @see #getHypoExponential()
	 * @generated
	 */
	EReference getHypoExponential_Rate0();

	/**
	 * Returns the meta object for class '{@link sant.Pareto <em>Pareto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pareto</em>'.
	 * @see sant.Pareto
	 * @generated
	 */
	EClass getPareto();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Pareto#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see sant.Pareto#getLowerBound()
	 * @see #getPareto()
	 * @generated
	 */
	EReference getPareto_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link sant.Pareto#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see sant.Pareto#getShape()
	 * @see #getPareto()
	 * @generated
	 */
	EReference getPareto_Shape();

	/**
	 * Returns the meta object for class '{@link sant.MarkingSimple <em>Marking Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Simple</em>'.
	 * @see sant.MarkingSimple
	 * @generated
	 */
	EClass getMarkingSimple();

	/**
	 * Returns the meta object for class '{@link sant.MarkingString <em>Marking String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking String</em>'.
	 * @see sant.MarkingString
	 * @generated
	 */
	EClass getMarkingString();

	/**
	 * Returns the meta object for the attribute '{@link sant.MarkingString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sant.MarkingString#getValue()
	 * @see #getMarkingString()
	 * @generated
	 */
	EAttribute getMarkingString_Value();

	/**
	 * Returns the meta object for class '{@link sant.MarkingVariableExtended <em>Marking Variable Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Variable Extended</em>'.
	 * @see sant.MarkingVariableExtended
	 * @generated
	 */
	EClass getMarkingVariableExtended();

	/**
	 * Returns the meta object for the reference '{@link sant.MarkingVariableExtended#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see sant.MarkingVariableExtended#getVariable()
	 * @see #getMarkingVariableExtended()
	 * @generated
	 */
	EReference getMarkingVariableExtended_Variable();

	/**
	 * Returns the meta object for enum '{@link sant.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see sant.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link sant.ExtendedPlaceType <em>Extended Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Extended Place Type</em>'.
	 * @see sant.ExtendedPlaceType
	 * @generated
	 */
	EEnum getExtendedPlaceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Code Fragment</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCodeFragment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SANTFactory getSANTFactory();

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
		 * The meta object literal for the '{@link sant.impl.SANTImpl <em>SANT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.SANTImpl
		 * @see sant.impl.SANTPackageImpl#getSANT()
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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__PARAMETERS = eINSTANCE.getSANT_Parameters();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__PLACES = eINSTANCE.getSANT_Places();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__ACTIVITIES = eINSTANCE.getSANT_Activities();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__GLOBAL_VARIABLES = eINSTANCE.getSANT_GlobalVariables();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__ARCS = eINSTANCE.getSANT_Arcs();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__GATES = eINSTANCE.getSANT_Gates();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANT__INITIALIZATION = eINSTANCE.getSANT_Initialization();

		/**
		 * The meta object literal for the '{@link sant.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.NamedElementImpl
		 * @see sant.impl.SANTPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Has Variability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___HAS_VARIABILITY = eINSTANCE.getNamedElement__HasVariability();

		/**
		 * The meta object literal for the '{@link sant.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.PlaceImpl
		 * @see sant.impl.SANTPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__MULTIPLICITY = eINSTANCE.getPlace_Multiplicity();

		/**
		 * The meta object literal for the '{@link sant.impl.NormalPlaceImpl <em>Normal Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.NormalPlaceImpl
		 * @see sant.impl.SANTPackageImpl#getNormalPlace()
		 * @generated
		 */
		EClass NORMAL_PLACE = eINSTANCE.getNormalPlace();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_PLACE__MARKING = eINSTANCE.getNormalPlace_Marking();

		/**
		 * The meta object literal for the '{@link sant.impl.ExtendedPlaceImpl <em>Extended Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExtendedPlaceImpl
		 * @see sant.impl.SANTPackageImpl#getExtendedPlace()
		 * @generated
		 */
		EClass EXTENDED_PLACE = eINSTANCE.getExtendedPlace();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PLACE__MARKING = eINSTANCE.getExtendedPlace_Marking();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_PLACE__TYPE = eINSTANCE.getExtendedPlace_Type();

		/**
		 * The meta object literal for the '{@link sant.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ActivityImpl
		 * @see sant.impl.SANTPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CASES = eINSTANCE.getActivity_Cases();

		/**
		 * The meta object literal for the '{@link sant.impl.CasesSpecificationImpl <em>Cases Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.CasesSpecificationImpl
		 * @see sant.impl.SANTPackageImpl#getCasesSpecification()
		 * @generated
		 */
		EClass CASES_SPECIFICATION = eINSTANCE.getCasesSpecification();

		/**
		 * The meta object literal for the '{@link sant.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.CaseImpl
		 * @see sant.impl.SANTPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ID = eINSTANCE.getCase_ID();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__P = eINSTANCE.getCase_P();

		/**
		 * The meta object literal for the '{@link sant.impl.CasesSpecificationCasesImpl <em>Cases Specification Cases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.CasesSpecificationCasesImpl
		 * @see sant.impl.SANTPackageImpl#getCasesSpecificationCases()
		 * @generated
		 */
		EClass CASES_SPECIFICATION_CASES = eINSTANCE.getCasesSpecificationCases();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_CASES__CASES = eINSTANCE.getCasesSpecificationCases_Cases();

		/**
		 * The meta object literal for the '{@link sant.impl.CasesSpecificationProbabilityArrayImpl <em>Cases Specification Probability Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.CasesSpecificationProbabilityArrayImpl
		 * @see sant.impl.SANTPackageImpl#getCasesSpecificationProbabilityArray()
		 * @generated
		 */
		EClass CASES_SPECIFICATION_PROBABILITY_ARRAY = eINSTANCE.getCasesSpecificationProbabilityArray();

		/**
		 * The meta object literal for the '<em><b>PValues</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES = eINSTANCE.getCasesSpecificationProbabilityArray_PValues();

		/**
		 * The meta object literal for the '{@link sant.impl.CasesSpecificationParametricImpl <em>Cases Specification Parametric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.CasesSpecificationParametricImpl
		 * @see sant.impl.SANTPackageImpl#getCasesSpecificationParametric()
		 * @generated
		 */
		EClass CASES_SPECIFICATION_PARAMETRIC = eINSTANCE.getCasesSpecificationParametric();

		/**
		 * The meta object literal for the '<em><b>Num Cases</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_PARAMETRIC__NUM_CASES = eINSTANCE.getCasesSpecificationParametric_NumCases();

		/**
		 * The meta object literal for the '<em><b>PExpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION = eINSTANCE.getCasesSpecificationParametric_PExpression();

		/**
		 * The meta object literal for the '{@link sant.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ArcImpl
		 * @see sant.impl.SANTPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '{@link sant.impl.InputArcImpl <em>Input Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.InputArcImpl
		 * @see sant.impl.SANTPackageImpl#getInputArc()
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
		 * The meta object literal for the '{@link sant.impl.OutputArcImpl <em>Output Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.OutputArcImpl
		 * @see sant.impl.SANTPackageImpl#getOutputArc()
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

		/**
		 * The meta object literal for the '{@link sant.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.GateImpl
		 * @see sant.impl.SANTPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__FUNCTION = eINSTANCE.getGate_Function();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__PLACES = eINSTANCE.getGate_Places();

		/**
		 * The meta object literal for the '{@link sant.impl.OutputGateImpl <em>Output Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.OutputGateImpl
		 * @see sant.impl.SANTPackageImpl#getOutputGate()
		 * @generated
		 */
		EClass OUTPUT_GATE = eINSTANCE.getOutputGate();

		/**
		 * The meta object literal for the '{@link sant.impl.OutputGateConcreteImpl <em>Output Gate Concrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.OutputGateConcreteImpl
		 * @see sant.impl.SANTPackageImpl#getOutputGateConcrete()
		 * @generated
		 */
		EClass OUTPUT_GATE_CONCRETE = eINSTANCE.getOutputGateConcrete();

		/**
		 * The meta object literal for the '<em><b>Activity Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_GATE_CONCRETE__ACTIVITY_CASE = eINSTANCE.getOutputGateConcrete_ActivityCase();

		/**
		 * The meta object literal for the '{@link sant.impl.OutputGateTemplateImpl <em>Output Gate Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.OutputGateTemplateImpl
		 * @see sant.impl.SANTPackageImpl#getOutputGateTemplate()
		 * @generated
		 */
		EClass OUTPUT_GATE_TEMPLATE = eINSTANCE.getOutputGateTemplate();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_GATE_TEMPLATE__ACTIVITY = eINSTANCE.getOutputGateTemplate_Activity();

		/**
		 * The meta object literal for the '{@link sant.impl.InputGateImpl <em>Input Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.InputGateImpl
		 * @see sant.impl.SANTPackageImpl#getInputGate()
		 * @generated
		 */
		EClass INPUT_GATE = eINSTANCE.getInputGate();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_GATE__PREDICATE = eINSTANCE.getInputGate_Predicate();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_GATE__ACTIVITY = eINSTANCE.getInputGate_Activity();

		/**
		 * The meta object literal for the '{@link sant.impl.InstantaneousActivityImpl <em>Instantaneous Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.InstantaneousActivityImpl
		 * @see sant.impl.SANTPackageImpl#getInstantaneousActivity()
		 * @generated
		 */
		EClass INSTANTANEOUS_ACTIVITY = eINSTANCE.getInstantaneousActivity();

		/**
		 * The meta object literal for the '{@link sant.impl.TimedActivityImpl <em>Timed Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.TimedActivityImpl
		 * @see sant.impl.SANTPackageImpl#getTimedActivity()
		 * @generated
		 */
		EClass TIMED_ACTIVITY = eINSTANCE.getTimedActivity();

		/**
		 * The meta object literal for the '<em><b>Time Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTIVITY__TIME_DISTRIBUTION = eINSTANCE.getTimedActivity_TimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTIVITY__ACTIVATION = eINSTANCE.getTimedActivity_Activation();

		/**
		 * The meta object literal for the '<em><b>Reactivation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTIVITY__REACTIVATION = eINSTANCE.getTimedActivity_Reactivation();

		/**
		 * The meta object literal for the '{@link sant.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.DistributionImpl
		 * @see sant.impl.SANTPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionImpl
		 * @see sant.impl.SANTPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SEGMENTS = eINSTANCE.getExpression_Segments();

		/**
		 * The meta object literal for the '{@link sant.ExpressionSegment <em>Expression Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.ExpressionSegment
		 * @see sant.impl.SANTPackageImpl#getExpressionSegment()
		 * @generated
		 */
		EClass EXPRESSION_SEGMENT = eINSTANCE.getExpressionSegment();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionTextImpl <em>Expression Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionTextImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionText()
		 * @generated
		 */
		EClass EXPRESSION_TEXT = eINSTANCE.getExpressionText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_TEXT__TEXT = eINSTANCE.getExpressionText_Text();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionMarkingImpl <em>Expression Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionMarkingImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionMarking()
		 * @generated
		 */
		EClass EXPRESSION_MARKING = eINSTANCE.getExpressionMarking();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MARKING__PLACE = eINSTANCE.getExpressionMarking_Place();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MARKING__INDEX = eINSTANCE.getExpressionMarking_Index();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionVariableImpl <em>Expression Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionVariableImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionVariable()
		 * @generated
		 */
		EClass EXPRESSION_VARIABLE = eINSTANCE.getExpressionVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_VARIABLE__VARIABLE = eINSTANCE.getExpressionVariable_Variable();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionTemplateExpressionImpl <em>Expression Template Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionTemplateExpressionImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionTemplateExpression()
		 * @generated
		 */
		EClass EXPRESSION_TEMPLATE_EXPRESSION = eINSTANCE.getExpressionTemplateExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TEMPLATE_EXPRESSION__EXP = eINSTANCE.getExpressionTemplateExpression_Exp();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionIterationElementImpl <em>Expression Iteration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionIterationElementImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionIterationElement()
		 * @generated
		 */
		EClass EXPRESSION_ITERATION_ELEMENT = eINSTANCE.getExpressionIterationElement();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ITERATION_ELEMENT__ITERATOR = eINSTANCE.getExpressionIterationElement_Iterator();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_ITERATION_ELEMENT__I = eINSTANCE.getExpressionIterationElement_I();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionActivityCasesNumberImpl <em>Expression Activity Cases Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionActivityCasesNumberImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionActivityCasesNumber()
		 * @generated
		 */
		EClass EXPRESSION_ACTIVITY_CASES_NUMBER = eINSTANCE.getExpressionActivityCasesNumber();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY = eINSTANCE.getExpressionActivityCasesNumber_Activity();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE__ELIST = eINSTANCE.getExpressionActivityCasesNumber__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionPlaceTemplateSizeImpl <em>Expression Place Template Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionPlaceTemplateSizeImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionPlaceTemplateSize()
		 * @generated
		 */
		EClass EXPRESSION_PLACE_TEMPLATE_SIZE = eINSTANCE.getExpressionPlaceTemplateSize();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_PLACE_TEMPLATE_SIZE__PLACE = eINSTANCE.getExpressionPlaceTemplateSize_Place();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_PLACE_TEMPLATE_SIZE___EVALUATE__ELIST = eINSTANCE.getExpressionPlaceTemplateSize__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionIfThenElseImpl <em>Expression If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionIfThenElseImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionIfThenElse()
		 * @generated
		 */
		EClass EXPRESSION_IF_THEN_ELSE = eINSTANCE.getExpressionIfThenElse();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_IF_THEN_ELSE__CONDITION = eINSTANCE.getExpressionIfThenElse_Condition();

		/**
		 * The meta object literal for the '<em><b>If True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_IF_THEN_ELSE__IF_TRUE = eINSTANCE.getExpressionIfThenElse_IfTrue();

		/**
		 * The meta object literal for the '<em><b>If False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_IF_THEN_ELSE__IF_FALSE = eINSTANCE.getExpressionIfThenElse_IfFalse();

		/**
		 * The meta object literal for the '{@link sant.impl.ExpressionLoopImpl <em>Expression Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExpressionLoopImpl
		 * @see sant.impl.SANTPackageImpl#getExpressionLoop()
		 * @generated
		 */
		EClass EXPRESSION_LOOP = eINSTANCE.getExpressionLoop();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LOOP__BEGIN = eINSTANCE.getExpressionLoop_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LOOP__END = eINSTANCE.getExpressionLoop_End();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LOOP__DO = eINSTANCE.getExpressionLoop_Do();

		/**
		 * The meta object literal for the '{@link sant.VariabilityIterator <em>Variability Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.VariabilityIterator
		 * @see sant.impl.SANTPackageImpl#getVariabilityIterator()
		 * @generated
		 */
		EClass VARIABILITY_ITERATOR = eINSTANCE.getVariabilityIterator();

		/**
		 * The meta object literal for the '{@link sant.impl.ThisContextIteratorImpl <em>This Context Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ThisContextIteratorImpl
		 * @see sant.impl.SANTPackageImpl#getThisContextIterator()
		 * @generated
		 */
		EClass THIS_CONTEXT_ITERATOR = eINSTANCE.getThisContextIterator();

		/**
		 * The meta object literal for the '{@link sant.impl.LoopIteratorImpl <em>Loop Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.LoopIteratorImpl
		 * @see sant.impl.SANTPackageImpl#getLoopIterator()
		 * @generated
		 */
		EClass LOOP_ITERATOR = eINSTANCE.getLoopIterator();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_ITERATOR__LOOP = eINSTANCE.getLoopIterator_Loop();

		/**
		 * The meta object literal for the '{@link sant.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.MarkingImpl
		 * @see sant.impl.SANTPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '{@link sant.impl.MarkingIntegerImpl <em>Marking Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.MarkingIntegerImpl
		 * @see sant.impl.SANTPackageImpl#getMarkingInteger()
		 * @generated
		 */
		EClass MARKING_INTEGER = eINSTANCE.getMarkingInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING_INTEGER__VALUE = eINSTANCE.getMarkingInteger_Value();

		/**
		 * The meta object literal for the '{@link sant.impl.MarkingExtendedImpl <em>Marking Extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.MarkingExtendedImpl
		 * @see sant.impl.SANTPackageImpl#getMarkingExtended()
		 * @generated
		 */
		EClass MARKING_EXTENDED = eINSTANCE.getMarkingExtended();

		/**
		 * The meta object literal for the '{@link sant.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.GlobalVariableImpl
		 * @see sant.impl.SANTPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '{@link sant.impl.MarkingVariableSimpleImpl <em>Marking Variable Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.MarkingVariableSimpleImpl
		 * @see sant.impl.SANTPackageImpl#getMarkingVariableSimple()
		 * @generated
		 */
		EClass MARKING_VARIABLE_SIMPLE = eINSTANCE.getMarkingVariableSimple();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING_VARIABLE_SIMPLE__VARIABLE = eINSTANCE.getMarkingVariableSimple_Variable();

		/**
		 * The meta object literal for the '{@link sant.impl.ExponentialImpl <em>Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ExponentialImpl
		 * @see sant.impl.SANTPackageImpl#getExponential()
		 * @generated
		 */
		EClass EXPONENTIAL = eINSTANCE.getExponential();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL__RATE = eINSTANCE.getExponential_Rate();

		/**
		 * The meta object literal for the '{@link sant.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.NormalImpl
		 * @see sant.impl.SANTPackageImpl#getNormal()
		 * @generated
		 */
		EClass NORMAL = eINSTANCE.getNormal();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL__MEAN = eINSTANCE.getNormal_Mean();

		/**
		 * The meta object literal for the '<em><b>Variance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL__VARIANCE = eINSTANCE.getNormal_Variance();

		/**
		 * The meta object literal for the '{@link sant.impl.GammaImpl <em>Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.GammaImpl
		 * @see sant.impl.SANTPackageImpl#getGamma()
		 * @generated
		 */
		EClass GAMMA = eINSTANCE.getGamma();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMMA__ALPHA = eINSTANCE.getGamma_Alpha();

		/**
		 * The meta object literal for the '<em><b>Beta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMMA__BETA = eINSTANCE.getGamma_Beta();

		/**
		 * The meta object literal for the '{@link sant.impl.BinomialImpl <em>Binomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.BinomialImpl
		 * @see sant.impl.SANTPackageImpl#getBinomial()
		 * @generated
		 */
		EClass BINOMIAL = eINSTANCE.getBinomial();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINOMIAL__T = eINSTANCE.getBinomial_T();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINOMIAL__P = eINSTANCE.getBinomial_P();

		/**
		 * The meta object literal for the '{@link sant.impl.DeterministicImpl <em>Deterministic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.DeterministicImpl
		 * @see sant.impl.SANTPackageImpl#getDeterministic()
		 * @generated
		 */
		EClass DETERMINISTIC = eINSTANCE.getDeterministic();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETERMINISTIC__VALUE = eINSTANCE.getDeterministic_Value();

		/**
		 * The meta object literal for the '{@link sant.impl.LognormalImpl <em>Lognormal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.LognormalImpl
		 * @see sant.impl.SANTPackageImpl#getLognormal()
		 * @generated
		 */
		EClass LOGNORMAL = eINSTANCE.getLognormal();

		/**
		 * The meta object literal for the '<em><b>Mu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGNORMAL__MU = eINSTANCE.getLognormal_Mu();

		/**
		 * The meta object literal for the '<em><b>Alpha Squared</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGNORMAL__ALPHA_SQUARED = eINSTANCE.getLognormal_AlphaSquared();

		/**
		 * The meta object literal for the '{@link sant.impl.BetaImpl <em>Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.BetaImpl
		 * @see sant.impl.SANTPackageImpl#getBeta()
		 * @generated
		 */
		EClass BETA = eINSTANCE.getBeta();

		/**
		 * The meta object literal for the '<em><b>Alpha1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETA__ALPHA1 = eINSTANCE.getBeta_Alpha1();

		/**
		 * The meta object literal for the '<em><b>Beta1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETA__BETA1 = eINSTANCE.getBeta_Beta1();

		/**
		 * The meta object literal for the '{@link sant.impl.NegativeBinomialImpl <em>Negative Binomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.NegativeBinomialImpl
		 * @see sant.impl.SANTPackageImpl#getNegativeBinomial()
		 * @generated
		 */
		EClass NEGATIVE_BINOMIAL = eINSTANCE.getNegativeBinomial();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_BINOMIAL__S = eINSTANCE.getNegativeBinomial_S();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_BINOMIAL__P = eINSTANCE.getNegativeBinomial_P();

		/**
		 * The meta object literal for the '{@link sant.impl.GeometricImpl <em>Geometric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.GeometricImpl
		 * @see sant.impl.SANTPackageImpl#getGeometric()
		 * @generated
		 */
		EClass GEOMETRIC = eINSTANCE.getGeometric();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRIC__P = eINSTANCE.getGeometric_P();

		/**
		 * The meta object literal for the '{@link sant.impl.ErlangImpl <em>Erlang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ErlangImpl
		 * @see sant.impl.SANTPackageImpl#getErlang()
		 * @generated
		 */
		EClass ERLANG = eINSTANCE.getErlang();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERLANG__M = eINSTANCE.getErlang_M();

		/**
		 * The meta object literal for the '<em><b>Beta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERLANG__BETA = eINSTANCE.getErlang_Beta();

		/**
		 * The meta object literal for the '{@link sant.impl.UniformImpl <em>Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.UniformImpl
		 * @see sant.impl.SANTPackageImpl#getUniform()
		 * @generated
		 */
		EClass UNIFORM = eINSTANCE.getUniform();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFORM__LOWER_BOUND = eINSTANCE.getUniform_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFORM__UPPER_BOUND = eINSTANCE.getUniform_UpperBound();

		/**
		 * The meta object literal for the '{@link sant.impl.HyperExponentialImpl <em>Hyper Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.HyperExponentialImpl
		 * @see sant.impl.SANTPackageImpl#getHyperExponential()
		 * @generated
		 */
		EClass HYPER_EXPONENTIAL = eINSTANCE.getHyperExponential();

		/**
		 * The meta object literal for the '<em><b>Rate0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPER_EXPONENTIAL__RATE0 = eINSTANCE.getHyperExponential_Rate0();

		/**
		 * The meta object literal for the '<em><b>P0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPER_EXPONENTIAL__P0 = eINSTANCE.getHyperExponential_P0();

		/**
		 * The meta object literal for the '{@link sant.impl.WeibullImpl <em>Weibull</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.WeibullImpl
		 * @see sant.impl.SANTPackageImpl#getWeibull()
		 * @generated
		 */
		EClass WEIBULL = eINSTANCE.getWeibull();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIBULL__ALPHA = eINSTANCE.getWeibull_Alpha();

		/**
		 * The meta object literal for the '<em><b>Beta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIBULL__BETA = eINSTANCE.getWeibull_Beta();

		/**
		 * The meta object literal for the '{@link sant.impl.TriangularImpl <em>Triangular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.TriangularImpl
		 * @see sant.impl.SANTPackageImpl#getTriangular()
		 * @generated
		 */
		EClass TRIANGULAR = eINSTANCE.getTriangular();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGULAR__MIN = eINSTANCE.getTriangular_Min();

		/**
		 * The meta object literal for the '<em><b>Middle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGULAR__MIDDLE = eINSTANCE.getTriangular_Middle();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGULAR__MAX = eINSTANCE.getTriangular_Max();

		/**
		 * The meta object literal for the '{@link sant.impl.ConditionalWeibullImpl <em>Conditional Weibull</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ConditionalWeibullImpl
		 * @see sant.impl.SANTPackageImpl#getConditionalWeibull()
		 * @generated
		 */
		EClass CONDITIONAL_WEIBULL = eINSTANCE.getConditionalWeibull();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_WEIBULL__ALPHA = eINSTANCE.getConditionalWeibull_Alpha();

		/**
		 * The meta object literal for the '<em><b>Beta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_WEIBULL__BETA = eINSTANCE.getConditionalWeibull_Beta();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_WEIBULL__T = eINSTANCE.getConditionalWeibull_T();

		/**
		 * The meta object literal for the '{@link sant.impl.HypoExponentialImpl <em>Hypo Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.HypoExponentialImpl
		 * @see sant.impl.SANTPackageImpl#getHypoExponential()
		 * @generated
		 */
		EClass HYPO_EXPONENTIAL = eINSTANCE.getHypoExponential();

		/**
		 * The meta object literal for the '<em><b>Rate0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPO_EXPONENTIAL__RATE0 = eINSTANCE.getHypoExponential_Rate0();

		/**
		 * The meta object literal for the '{@link sant.impl.ParetoImpl <em>Pareto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.ParetoImpl
		 * @see sant.impl.SANTPackageImpl#getPareto()
		 * @generated
		 */
		EClass PARETO = eINSTANCE.getPareto();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARETO__LOWER_BOUND = eINSTANCE.getPareto_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARETO__SHAPE = eINSTANCE.getPareto_Shape();

		/**
		 * The meta object literal for the '{@link sant.impl.MarkingSimpleImpl <em>Marking Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.MarkingSimpleImpl
		 * @see sant.impl.SANTPackageImpl#getMarkingSimple()
		 * @generated
		 */
		EClass MARKING_SIMPLE = eINSTANCE.getMarkingSimple();

		/**
		 * The meta object literal for the '{@link sant.impl.MarkingStringImpl <em>Marking String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.MarkingStringImpl
		 * @see sant.impl.SANTPackageImpl#getMarkingString()
		 * @generated
		 */
		EClass MARKING_STRING = eINSTANCE.getMarkingString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING_STRING__VALUE = eINSTANCE.getMarkingString_Value();

		/**
		 * The meta object literal for the '{@link sant.impl.MarkingVariableExtendedImpl <em>Marking Variable Extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.impl.MarkingVariableExtendedImpl
		 * @see sant.impl.SANTPackageImpl#getMarkingVariableExtended()
		 * @generated
		 */
		EClass MARKING_VARIABLE_EXTENDED = eINSTANCE.getMarkingVariableExtended();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING_VARIABLE_EXTENDED__VARIABLE = eINSTANCE.getMarkingVariableExtended_Variable();

		/**
		 * The meta object literal for the '{@link sant.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.VariableType
		 * @see sant.impl.SANTPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link sant.ExtendedPlaceType <em>Extended Place Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sant.ExtendedPlaceType
		 * @see sant.impl.SANTPackageImpl#getExtendedPlaceType()
		 * @generated
		 */
		EEnum EXTENDED_PLACE_TYPE = eINSTANCE.getExtendedPlaceType();

		/**
		 * The meta object literal for the '<em>Code Fragment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see sant.impl.SANTPackageImpl#getCodeFragment()
		 * @generated
		 */
		EDataType CODE_FRAGMENT = eINSTANCE.getCodeFragment();

	}

} //SANTPackage
