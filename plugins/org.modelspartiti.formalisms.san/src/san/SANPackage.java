/**
 */
package san;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see san.SANFactory
 * @model kind="package"
 * @generated
 */
public interface SANPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "san";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/templates/san/san";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "san";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANPackage eINSTANCE = san.impl.SANPackageImpl.init();

	/**
	 * The meta object id for the '{@link san.impl.SANImpl <em>SAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.SANImpl
	 * @see san.impl.SANPackageImpl#getSAN()
	 * @generated
	 */
	int SAN = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN__PLACES = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN__NAME = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN__ACTIVITIES = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN__GLOBAL_VARIABLES = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN__ARCS = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN__GATES = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN__INITIALIZATION = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>SAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_FEATURE_COUNT = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Templatize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN___TEMPLATIZE = CorePackage.CONCRETE_MODEL___TEMPLATIZE;

	/**
	 * The number of operations of the '<em>SAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_OPERATION_COUNT = CorePackage.CONCRETE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.NamedElementImpl
	 * @see san.impl.SANPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

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
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link san.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.PlaceImpl
	 * @see san.impl.SANPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ActivityImpl
	 * @see san.impl.SANPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
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
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.CaseImpl
	 * @see san.impl.SANPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
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
	 * The meta object id for the '{@link san.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ArcImpl
	 * @see san.impl.SANPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 5;

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
	 * The meta object id for the '{@link san.impl.InputArcImpl <em>Input Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.InputArcImpl
	 * @see san.impl.SANPackageImpl#getInputArc()
	 * @generated
	 */
	int INPUT_ARC = 6;

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
	 * The meta object id for the '{@link san.impl.OutputArcImpl <em>Output Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.OutputArcImpl
	 * @see san.impl.SANPackageImpl#getOutputArc()
	 * @generated
	 */
	int OUTPUT_ARC = 7;

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
	 * The meta object id for the '{@link san.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.GateImpl
	 * @see san.impl.SANPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 8;

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
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.OutputGateImpl <em>Output Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.OutputGateImpl
	 * @see san.impl.SANPackageImpl#getOutputGate()
	 * @generated
	 */
	int OUTPUT_GATE = 9;

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
	 * The feature id for the '<em><b>Activity Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__ACTIVITY_CASE = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.InputGateImpl <em>Input Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.InputGateImpl
	 * @see san.impl.SANPackageImpl#getInputGate()
	 * @generated
	 */
	int INPUT_GATE = 10;

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
	 * The number of operations of the '<em>Input Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.InstantaneousActivityImpl <em>Instantaneous Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.InstantaneousActivityImpl
	 * @see san.impl.SANPackageImpl#getInstantaneousActivity()
	 * @generated
	 */
	int INSTANTANEOUS_ACTIVITY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
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
	 * The number of operations of the '<em>Instantaneous Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.TimedActivityImpl <em>Timed Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.TimedActivityImpl
	 * @see san.impl.SANPackageImpl#getTimedActivity()
	 * @generated
	 */
	int TIMED_ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
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
	 * The number of operations of the '<em>Timed Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.DistributionImpl
	 * @see san.impl.SANPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 13;

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
	 * The meta object id for the '{@link san.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ExpressionImpl
	 * @see san.impl.SANPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 14;

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
	 * The meta object id for the '{@link san.impl.ExpressionSegmentImpl <em>Expression Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ExpressionSegmentImpl
	 * @see san.impl.SANPackageImpl#getExpressionSegment()
	 * @generated
	 */
	int EXPRESSION_SEGMENT = 40;

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
	 * The meta object id for the '{@link san.impl.ExpressionTextImpl <em>Expression Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ExpressionTextImpl
	 * @see san.impl.SANPackageImpl#getExpressionText()
	 * @generated
	 */
	int EXPRESSION_TEXT = 15;

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
	 * The meta object id for the '{@link san.impl.ExpressionMarkingImpl <em>Expression Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ExpressionMarkingImpl
	 * @see san.impl.SANPackageImpl#getExpressionMarking()
	 * @generated
	 */
	int EXPRESSION_MARKING = 16;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MARKING__PLACE = EXPRESSION_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MARKING_FEATURE_COUNT = EXPRESSION_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MARKING_OPERATION_COUNT = EXPRESSION_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.ExpressionVariableImpl <em>Expression Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ExpressionVariableImpl
	 * @see san.impl.SANPackageImpl#getExpressionVariable()
	 * @generated
	 */
	int EXPRESSION_VARIABLE = 17;

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
	 * The meta object id for the '{@link san.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.MarkingImpl
	 * @see san.impl.SANPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 18;

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
	 * The meta object id for the '{@link san.impl.MarkingSimpleImpl <em>Marking Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.MarkingSimpleImpl
	 * @see san.impl.SANPackageImpl#getMarkingSimple()
	 * @generated
	 */
	int MARKING_SIMPLE = 41;

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
	 * The meta object id for the '{@link san.impl.MarkingIntegerImpl <em>Marking Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.MarkingIntegerImpl
	 * @see san.impl.SANPackageImpl#getMarkingInteger()
	 * @generated
	 */
	int MARKING_INTEGER = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
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
	 * The meta object id for the '{@link san.impl.MarkingExtendedImpl <em>Marking Extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.MarkingExtendedImpl
	 * @see san.impl.SANPackageImpl#getMarkingExtended()
	 * @generated
	 */
	int MARKING_EXTENDED = 20;

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
	 * The meta object id for the '{@link san.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.GlobalVariableImpl
	 * @see san.impl.SANPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 21;

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
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.MarkingVariableSimpleImpl <em>Marking Variable Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.MarkingVariableSimpleImpl
	 * @see san.impl.SANPackageImpl#getMarkingVariableSimple()
	 * @generated
	 */
	int MARKING_VARIABLE_SIMPLE = 22;

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
	 * The meta object id for the '{@link san.impl.ExponentialImpl <em>Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ExponentialImpl
	 * @see san.impl.SANPackageImpl#getExponential()
	 * @generated
	 */
	int EXPONENTIAL = 23;

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
	 * The meta object id for the '{@link san.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.NormalImpl
	 * @see san.impl.SANPackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 24;

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
	 * The meta object id for the '{@link san.impl.GammaImpl <em>Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.GammaImpl
	 * @see san.impl.SANPackageImpl#getGamma()
	 * @generated
	 */
	int GAMMA = 25;

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
	 * The meta object id for the '{@link san.impl.BinomialImpl <em>Binomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.BinomialImpl
	 * @see san.impl.SANPackageImpl#getBinomial()
	 * @generated
	 */
	int BINOMIAL = 26;

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
	 * The meta object id for the '{@link san.impl.DeterministicImpl <em>Deterministic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.DeterministicImpl
	 * @see san.impl.SANPackageImpl#getDeterministic()
	 * @generated
	 */
	int DETERMINISTIC = 27;

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
	 * The meta object id for the '{@link san.impl.LognormalImpl <em>Lognormal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.LognormalImpl
	 * @see san.impl.SANPackageImpl#getLognormal()
	 * @generated
	 */
	int LOGNORMAL = 28;

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
	 * The meta object id for the '{@link san.impl.BetaImpl <em>Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.BetaImpl
	 * @see san.impl.SANPackageImpl#getBeta()
	 * @generated
	 */
	int BETA = 29;

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
	 * The meta object id for the '{@link san.impl.NegativeBinomialImpl <em>Negative Binomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.NegativeBinomialImpl
	 * @see san.impl.SANPackageImpl#getNegativeBinomial()
	 * @generated
	 */
	int NEGATIVE_BINOMIAL = 30;

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
	 * The meta object id for the '{@link san.impl.GeometricImpl <em>Geometric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.GeometricImpl
	 * @see san.impl.SANPackageImpl#getGeometric()
	 * @generated
	 */
	int GEOMETRIC = 31;

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
	 * The meta object id for the '{@link san.impl.ErlangImpl <em>Erlang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ErlangImpl
	 * @see san.impl.SANPackageImpl#getErlang()
	 * @generated
	 */
	int ERLANG = 32;

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
	 * The meta object id for the '{@link san.impl.UniformImpl <em>Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.UniformImpl
	 * @see san.impl.SANPackageImpl#getUniform()
	 * @generated
	 */
	int UNIFORM = 33;

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
	 * The meta object id for the '{@link san.impl.HyperExponentialImpl <em>Hyper Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.HyperExponentialImpl
	 * @see san.impl.SANPackageImpl#getHyperExponential()
	 * @generated
	 */
	int HYPER_EXPONENTIAL = 34;

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
	 * The meta object id for the '{@link san.impl.WeibullImpl <em>Weibull</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.WeibullImpl
	 * @see san.impl.SANPackageImpl#getWeibull()
	 * @generated
	 */
	int WEIBULL = 35;

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
	 * The meta object id for the '{@link san.impl.TriangularImpl <em>Triangular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.TriangularImpl
	 * @see san.impl.SANPackageImpl#getTriangular()
	 * @generated
	 */
	int TRIANGULAR = 36;

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
	 * The meta object id for the '{@link san.impl.ConditionalWeibullImpl <em>Conditional Weibull</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ConditionalWeibullImpl
	 * @see san.impl.SANPackageImpl#getConditionalWeibull()
	 * @generated
	 */
	int CONDITIONAL_WEIBULL = 37;

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
	 * The meta object id for the '{@link san.impl.HypoExponentialImpl <em>Hypo Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.HypoExponentialImpl
	 * @see san.impl.SANPackageImpl#getHypoExponential()
	 * @generated
	 */
	int HYPO_EXPONENTIAL = 38;

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
	 * The meta object id for the '{@link san.impl.ParetoImpl <em>Pareto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ParetoImpl
	 * @see san.impl.SANPackageImpl#getPareto()
	 * @generated
	 */
	int PARETO = 39;

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
	 * The meta object id for the '{@link san.impl.NormalPlaceImpl <em>Normal Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.NormalPlaceImpl
	 * @see san.impl.SANPackageImpl#getNormalPlace()
	 * @generated
	 */
	int NORMAL_PLACE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PLACE__NAME = PLACE__NAME;

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
	 * The number of operations of the '<em>Normal Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_PLACE_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.ExtendedPlaceImpl <em>Extended Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.ExtendedPlaceImpl
	 * @see san.impl.SANPackageImpl#getExtendedPlace()
	 * @generated
	 */
	int EXTENDED_PLACE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE__NAME = PLACE__NAME;

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
	 * The number of operations of the '<em>Extended Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PLACE_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link san.impl.MarkingStringImpl <em>Marking String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.MarkingStringImpl
	 * @see san.impl.SANPackageImpl#getMarkingString()
	 * @generated
	 */
	int MARKING_STRING = 44;

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
	 * The meta object id for the '{@link san.impl.MarkingVariableExtendedImpl <em>Marking Variable Extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.impl.MarkingVariableExtendedImpl
	 * @see san.impl.SANPackageImpl#getMarkingVariableExtended()
	 * @generated
	 */
	int MARKING_VARIABLE_EXTENDED = 45;

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
	 * The meta object id for the '{@link san.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.VariableType
	 * @see san.impl.SANPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 46;

	/**
	 * The meta object id for the '{@link san.ExtendedPlaceType <em>Extended Place Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see san.ExtendedPlaceType
	 * @see san.impl.SANPackageImpl#getExtendedPlaceType()
	 * @generated
	 */
	int EXTENDED_PLACE_TYPE = 47;

	/**
	 * The meta object id for the '<em>Code Fragment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see san.impl.SANPackageImpl#getCodeFragment()
	 * @generated
	 */
	int CODE_FRAGMENT = 48;


	/**
	 * Returns the meta object for class '{@link san.SAN <em>SAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAN</em>'.
	 * @see san.SAN
	 * @generated
	 */
	EClass getSAN();

	/**
	 * Returns the meta object for the containment reference list '{@link san.SAN#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see san.SAN#getPlaces()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Places();

	/**
	 * Returns the meta object for the attribute '{@link san.SAN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see san.SAN#getName()
	 * @see #getSAN()
	 * @generated
	 */
	EAttribute getSAN_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link san.SAN#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see san.SAN#getActivities()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link san.SAN#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variables</em>'.
	 * @see san.SAN#getGlobalVariables()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_GlobalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link san.SAN#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see san.SAN#getArcs()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link san.SAN#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see san.SAN#getGates()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link san.SAN#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initialization</em>'.
	 * @see san.SAN#getInitialization()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Initialization();

	/**
	 * Returns the meta object for class '{@link san.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see san.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for class '{@link san.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see san.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link san.Activity#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see san.Activity#getCases()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Cases();

	/**
	 * Returns the meta object for class '{@link san.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see san.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link san.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see san.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link san.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see san.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link san.Case#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see san.Case#getID()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_ID();

	/**
	 * Returns the meta object for the containment reference '{@link san.Case#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see san.Case#getP()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_P();

	/**
	 * Returns the meta object for class '{@link san.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see san.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for class '{@link san.InputArc <em>Input Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Arc</em>'.
	 * @see san.InputArc
	 * @generated
	 */
	EClass getInputArc();

	/**
	 * Returns the meta object for the reference '{@link san.InputArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see san.InputArc#getSource()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_Source();

	/**
	 * Returns the meta object for the reference '{@link san.InputArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see san.InputArc#getTarget()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_Target();

	/**
	 * Returns the meta object for class '{@link san.OutputArc <em>Output Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Arc</em>'.
	 * @see san.OutputArc
	 * @generated
	 */
	EClass getOutputArc();

	/**
	 * Returns the meta object for the reference '{@link san.OutputArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see san.OutputArc#getSource()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_Source();

	/**
	 * Returns the meta object for the reference '{@link san.OutputArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see san.OutputArc#getTarget()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_Target();

	/**
	 * Returns the meta object for class '{@link san.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see san.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the containment reference '{@link san.Gate#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see san.Gate#getFunction()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Function();

	/**
	 * Returns the meta object for the reference list '{@link san.Gate#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Places</em>'.
	 * @see san.Gate#getPlaces()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Places();

	/**
	 * Returns the meta object for class '{@link san.OutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate</em>'.
	 * @see san.OutputGate
	 * @generated
	 */
	EClass getOutputGate();

	/**
	 * Returns the meta object for the reference '{@link san.OutputGate#getActivityCase <em>Activity Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Case</em>'.
	 * @see san.OutputGate#getActivityCase()
	 * @see #getOutputGate()
	 * @generated
	 */
	EReference getOutputGate_ActivityCase();

	/**
	 * Returns the meta object for class '{@link san.InputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Gate</em>'.
	 * @see san.InputGate
	 * @generated
	 */
	EClass getInputGate();

	/**
	 * Returns the meta object for the containment reference '{@link san.InputGate#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see san.InputGate#getPredicate()
	 * @see #getInputGate()
	 * @generated
	 */
	EReference getInputGate_Predicate();

	/**
	 * Returns the meta object for the reference '{@link san.InputGate#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see san.InputGate#getActivity()
	 * @see #getInputGate()
	 * @generated
	 */
	EReference getInputGate_Activity();

	/**
	 * Returns the meta object for class '{@link san.InstantaneousActivity <em>Instantaneous Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantaneous Activity</em>'.
	 * @see san.InstantaneousActivity
	 * @generated
	 */
	EClass getInstantaneousActivity();

	/**
	 * Returns the meta object for class '{@link san.TimedActivity <em>Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Activity</em>'.
	 * @see san.TimedActivity
	 * @generated
	 */
	EClass getTimedActivity();

	/**
	 * Returns the meta object for the containment reference '{@link san.TimedActivity#getTimeDistribution <em>Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Distribution</em>'.
	 * @see san.TimedActivity#getTimeDistribution()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_TimeDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link san.TimedActivity#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see san.TimedActivity#getActivation()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link san.TimedActivity#getReactivation <em>Reactivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reactivation</em>'.
	 * @see san.TimedActivity#getReactivation()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_Reactivation();

	/**
	 * Returns the meta object for class '{@link san.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see san.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for class '{@link san.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see san.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link san.Expression#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see san.Expression#getSegments()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Segments();

	/**
	 * Returns the meta object for class '{@link san.ExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Text</em>'.
	 * @see san.ExpressionText
	 * @generated
	 */
	EClass getExpressionText();

	/**
	 * Returns the meta object for the attribute '{@link san.ExpressionText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see san.ExpressionText#getText()
	 * @see #getExpressionText()
	 * @generated
	 */
	EAttribute getExpressionText_Text();

	/**
	 * Returns the meta object for class '{@link san.ExpressionMarking <em>Expression Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Marking</em>'.
	 * @see san.ExpressionMarking
	 * @generated
	 */
	EClass getExpressionMarking();

	/**
	 * Returns the meta object for the reference '{@link san.ExpressionMarking#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see san.ExpressionMarking#getPlace()
	 * @see #getExpressionMarking()
	 * @generated
	 */
	EReference getExpressionMarking_Place();

	/**
	 * Returns the meta object for class '{@link san.ExpressionVariable <em>Expression Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Variable</em>'.
	 * @see san.ExpressionVariable
	 * @generated
	 */
	EClass getExpressionVariable();

	/**
	 * Returns the meta object for the reference '{@link san.ExpressionVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see san.ExpressionVariable#getVariable()
	 * @see #getExpressionVariable()
	 * @generated
	 */
	EReference getExpressionVariable_Variable();

	/**
	 * Returns the meta object for class '{@link san.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see san.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for class '{@link san.MarkingInteger <em>Marking Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Integer</em>'.
	 * @see san.MarkingInteger
	 * @generated
	 */
	EClass getMarkingInteger();

	/**
	 * Returns the meta object for the attribute '{@link san.MarkingInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see san.MarkingInteger#getValue()
	 * @see #getMarkingInteger()
	 * @generated
	 */
	EAttribute getMarkingInteger_Value();

	/**
	 * Returns the meta object for class '{@link san.MarkingExtended <em>Marking Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Extended</em>'.
	 * @see san.MarkingExtended
	 * @generated
	 */
	EClass getMarkingExtended();

	/**
	 * Returns the meta object for class '{@link san.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see san.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link san.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see san.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for class '{@link san.MarkingVariableSimple <em>Marking Variable Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Variable Simple</em>'.
	 * @see san.MarkingVariableSimple
	 * @generated
	 */
	EClass getMarkingVariableSimple();

	/**
	 * Returns the meta object for the reference '{@link san.MarkingVariableSimple#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see san.MarkingVariableSimple#getVariable()
	 * @see #getMarkingVariableSimple()
	 * @generated
	 */
	EReference getMarkingVariableSimple_Variable();

	/**
	 * Returns the meta object for class '{@link san.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential</em>'.
	 * @see san.Exponential
	 * @generated
	 */
	EClass getExponential();

	/**
	 * Returns the meta object for the containment reference '{@link san.Exponential#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate</em>'.
	 * @see san.Exponential#getRate()
	 * @see #getExponential()
	 * @generated
	 */
	EReference getExponential_Rate();

	/**
	 * Returns the meta object for class '{@link san.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see san.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for the containment reference '{@link san.Normal#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see san.Normal#getMean()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Mean();

	/**
	 * Returns the meta object for the containment reference '{@link san.Normal#getVariance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variance</em>'.
	 * @see san.Normal#getVariance()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Variance();

	/**
	 * Returns the meta object for class '{@link san.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamma</em>'.
	 * @see san.Gamma
	 * @generated
	 */
	EClass getGamma();

	/**
	 * Returns the meta object for the containment reference '{@link san.Gamma#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see san.Gamma#getAlpha()
	 * @see #getGamma()
	 * @generated
	 */
	EReference getGamma_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link san.Gamma#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see san.Gamma#getBeta()
	 * @see #getGamma()
	 * @generated
	 */
	EReference getGamma_Beta();

	/**
	 * Returns the meta object for class '{@link san.Binomial <em>Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binomial</em>'.
	 * @see san.Binomial
	 * @generated
	 */
	EClass getBinomial();

	/**
	 * Returns the meta object for the containment reference '{@link san.Binomial#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>T</em>'.
	 * @see san.Binomial#getT()
	 * @see #getBinomial()
	 * @generated
	 */
	EReference getBinomial_T();

	/**
	 * Returns the meta object for the containment reference '{@link san.Binomial#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see san.Binomial#getP()
	 * @see #getBinomial()
	 * @generated
	 */
	EReference getBinomial_P();

	/**
	 * Returns the meta object for class '{@link san.Deterministic <em>Deterministic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic</em>'.
	 * @see san.Deterministic
	 * @generated
	 */
	EClass getDeterministic();

	/**
	 * Returns the meta object for the containment reference '{@link san.Deterministic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see san.Deterministic#getValue()
	 * @see #getDeterministic()
	 * @generated
	 */
	EReference getDeterministic_Value();

	/**
	 * Returns the meta object for class '{@link san.Lognormal <em>Lognormal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lognormal</em>'.
	 * @see san.Lognormal
	 * @generated
	 */
	EClass getLognormal();

	/**
	 * Returns the meta object for the containment reference '{@link san.Lognormal#getMu <em>Mu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mu</em>'.
	 * @see san.Lognormal#getMu()
	 * @see #getLognormal()
	 * @generated
	 */
	EReference getLognormal_Mu();

	/**
	 * Returns the meta object for the containment reference '{@link san.Lognormal#getAlphaSquared <em>Alpha Squared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha Squared</em>'.
	 * @see san.Lognormal#getAlphaSquared()
	 * @see #getLognormal()
	 * @generated
	 */
	EReference getLognormal_AlphaSquared();

	/**
	 * Returns the meta object for class '{@link san.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beta</em>'.
	 * @see san.Beta
	 * @generated
	 */
	EClass getBeta();

	/**
	 * Returns the meta object for the containment reference '{@link san.Beta#getAlpha1 <em>Alpha1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha1</em>'.
	 * @see san.Beta#getAlpha1()
	 * @see #getBeta()
	 * @generated
	 */
	EReference getBeta_Alpha1();

	/**
	 * Returns the meta object for the containment reference '{@link san.Beta#getBeta1 <em>Beta1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta1</em>'.
	 * @see san.Beta#getBeta1()
	 * @see #getBeta()
	 * @generated
	 */
	EReference getBeta_Beta1();

	/**
	 * Returns the meta object for class '{@link san.NegativeBinomial <em>Negative Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Binomial</em>'.
	 * @see san.NegativeBinomial
	 * @generated
	 */
	EClass getNegativeBinomial();

	/**
	 * Returns the meta object for the containment reference '{@link san.NegativeBinomial#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see san.NegativeBinomial#getS()
	 * @see #getNegativeBinomial()
	 * @generated
	 */
	EReference getNegativeBinomial_S();

	/**
	 * Returns the meta object for the containment reference '{@link san.NegativeBinomial#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see san.NegativeBinomial#getP()
	 * @see #getNegativeBinomial()
	 * @generated
	 */
	EReference getNegativeBinomial_P();

	/**
	 * Returns the meta object for class '{@link san.Geometric <em>Geometric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometric</em>'.
	 * @see san.Geometric
	 * @generated
	 */
	EClass getGeometric();

	/**
	 * Returns the meta object for the containment reference '{@link san.Geometric#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see san.Geometric#getP()
	 * @see #getGeometric()
	 * @generated
	 */
	EReference getGeometric_P();

	/**
	 * Returns the meta object for class '{@link san.Erlang <em>Erlang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erlang</em>'.
	 * @see san.Erlang
	 * @generated
	 */
	EClass getErlang();

	/**
	 * Returns the meta object for the containment reference '{@link san.Erlang#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>M</em>'.
	 * @see san.Erlang#getM()
	 * @see #getErlang()
	 * @generated
	 */
	EReference getErlang_M();

	/**
	 * Returns the meta object for the containment reference '{@link san.Erlang#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see san.Erlang#getBeta()
	 * @see #getErlang()
	 * @generated
	 */
	EReference getErlang_Beta();

	/**
	 * Returns the meta object for class '{@link san.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform</em>'.
	 * @see san.Uniform
	 * @generated
	 */
	EClass getUniform();

	/**
	 * Returns the meta object for the containment reference '{@link san.Uniform#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see san.Uniform#getLowerBound()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link san.Uniform#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see san.Uniform#getUpperBound()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_UpperBound();

	/**
	 * Returns the meta object for class '{@link san.HyperExponential <em>Hyper Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Exponential</em>'.
	 * @see san.HyperExponential
	 * @generated
	 */
	EClass getHyperExponential();

	/**
	 * Returns the meta object for the containment reference '{@link san.HyperExponential#getRate0 <em>Rate0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate0</em>'.
	 * @see san.HyperExponential#getRate0()
	 * @see #getHyperExponential()
	 * @generated
	 */
	EReference getHyperExponential_Rate0();

	/**
	 * Returns the meta object for the containment reference '{@link san.HyperExponential#getP0 <em>P0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P0</em>'.
	 * @see san.HyperExponential#getP0()
	 * @see #getHyperExponential()
	 * @generated
	 */
	EReference getHyperExponential_P0();

	/**
	 * Returns the meta object for class '{@link san.Weibull <em>Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull</em>'.
	 * @see san.Weibull
	 * @generated
	 */
	EClass getWeibull();

	/**
	 * Returns the meta object for the containment reference '{@link san.Weibull#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see san.Weibull#getAlpha()
	 * @see #getWeibull()
	 * @generated
	 */
	EReference getWeibull_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link san.Weibull#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see san.Weibull#getBeta()
	 * @see #getWeibull()
	 * @generated
	 */
	EReference getWeibull_Beta();

	/**
	 * Returns the meta object for class '{@link san.Triangular <em>Triangular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular</em>'.
	 * @see san.Triangular
	 * @generated
	 */
	EClass getTriangular();

	/**
	 * Returns the meta object for the containment reference '{@link san.Triangular#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see san.Triangular#getMin()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Min();

	/**
	 * Returns the meta object for the containment reference '{@link san.Triangular#getMiddle <em>Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middle</em>'.
	 * @see san.Triangular#getMiddle()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Middle();

	/**
	 * Returns the meta object for the containment reference '{@link san.Triangular#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see san.Triangular#getMax()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Max();

	/**
	 * Returns the meta object for class '{@link san.ConditionalWeibull <em>Conditional Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Weibull</em>'.
	 * @see san.ConditionalWeibull
	 * @generated
	 */
	EClass getConditionalWeibull();

	/**
	 * Returns the meta object for the containment reference '{@link san.ConditionalWeibull#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see san.ConditionalWeibull#getAlpha()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link san.ConditionalWeibull#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see san.ConditionalWeibull#getBeta()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_Beta();

	/**
	 * Returns the meta object for the containment reference '{@link san.ConditionalWeibull#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>T</em>'.
	 * @see san.ConditionalWeibull#getT()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_T();

	/**
	 * Returns the meta object for class '{@link san.HypoExponential <em>Hypo Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypo Exponential</em>'.
	 * @see san.HypoExponential
	 * @generated
	 */
	EClass getHypoExponential();

	/**
	 * Returns the meta object for the containment reference '{@link san.HypoExponential#getRate0 <em>Rate0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate0</em>'.
	 * @see san.HypoExponential#getRate0()
	 * @see #getHypoExponential()
	 * @generated
	 */
	EReference getHypoExponential_Rate0();

	/**
	 * Returns the meta object for class '{@link san.Pareto <em>Pareto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pareto</em>'.
	 * @see san.Pareto
	 * @generated
	 */
	EClass getPareto();

	/**
	 * Returns the meta object for the containment reference '{@link san.Pareto#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see san.Pareto#getLowerBound()
	 * @see #getPareto()
	 * @generated
	 */
	EReference getPareto_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link san.Pareto#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see san.Pareto#getShape()
	 * @see #getPareto()
	 * @generated
	 */
	EReference getPareto_Shape();

	/**
	 * Returns the meta object for class '{@link san.ExpressionSegment <em>Expression Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Segment</em>'.
	 * @see san.ExpressionSegment
	 * @generated
	 */
	EClass getExpressionSegment();

	/**
	 * Returns the meta object for class '{@link san.MarkingSimple <em>Marking Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Simple</em>'.
	 * @see san.MarkingSimple
	 * @generated
	 */
	EClass getMarkingSimple();

	/**
	 * Returns the meta object for class '{@link san.NormalPlace <em>Normal Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Place</em>'.
	 * @see san.NormalPlace
	 * @generated
	 */
	EClass getNormalPlace();

	/**
	 * Returns the meta object for the containment reference '{@link san.NormalPlace#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see san.NormalPlace#getMarking()
	 * @see #getNormalPlace()
	 * @generated
	 */
	EReference getNormalPlace_Marking();

	/**
	 * Returns the meta object for class '{@link san.ExtendedPlace <em>Extended Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Place</em>'.
	 * @see san.ExtendedPlace
	 * @generated
	 */
	EClass getExtendedPlace();

	/**
	 * Returns the meta object for the containment reference '{@link san.ExtendedPlace#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see san.ExtendedPlace#getMarking()
	 * @see #getExtendedPlace()
	 * @generated
	 */
	EReference getExtendedPlace_Marking();

	/**
	 * Returns the meta object for the attribute '{@link san.ExtendedPlace#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see san.ExtendedPlace#getType()
	 * @see #getExtendedPlace()
	 * @generated
	 */
	EAttribute getExtendedPlace_Type();

	/**
	 * Returns the meta object for class '{@link san.MarkingString <em>Marking String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking String</em>'.
	 * @see san.MarkingString
	 * @generated
	 */
	EClass getMarkingString();

	/**
	 * Returns the meta object for the attribute '{@link san.MarkingString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see san.MarkingString#getValue()
	 * @see #getMarkingString()
	 * @generated
	 */
	EAttribute getMarkingString_Value();

	/**
	 * Returns the meta object for class '{@link san.MarkingVariableExtended <em>Marking Variable Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Variable Extended</em>'.
	 * @see san.MarkingVariableExtended
	 * @generated
	 */
	EClass getMarkingVariableExtended();

	/**
	 * Returns the meta object for the reference '{@link san.MarkingVariableExtended#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see san.MarkingVariableExtended#getVariable()
	 * @see #getMarkingVariableExtended()
	 * @generated
	 */
	EReference getMarkingVariableExtended_Variable();

	/**
	 * Returns the meta object for enum '{@link san.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see san.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link san.ExtendedPlaceType <em>Extended Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Extended Place Type</em>'.
	 * @see san.ExtendedPlaceType
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
	SANFactory getSANFactory();

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
		 * The meta object literal for the '{@link san.impl.SANImpl <em>SAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.SANImpl
		 * @see san.impl.SANPackageImpl#getSAN()
		 * @generated
		 */
		EClass SAN = eINSTANCE.getSAN();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAN__PLACES = eINSTANCE.getSAN_Places();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAN__NAME = eINSTANCE.getSAN_Name();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAN__ACTIVITIES = eINSTANCE.getSAN_Activities();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAN__GLOBAL_VARIABLES = eINSTANCE.getSAN_GlobalVariables();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAN__ARCS = eINSTANCE.getSAN_Arcs();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAN__GATES = eINSTANCE.getSAN_Gates();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAN__INITIALIZATION = eINSTANCE.getSAN_Initialization();

		/**
		 * The meta object literal for the '{@link san.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.PlaceImpl
		 * @see san.impl.SANPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '{@link san.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ActivityImpl
		 * @see san.impl.SANPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CASES = eINSTANCE.getActivity_Cases();

		/**
		 * The meta object literal for the '{@link san.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.NamedElementImpl
		 * @see san.impl.SANPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link san.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.CaseImpl
		 * @see san.impl.SANPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__ID = eINSTANCE.getCase_ID();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__P = eINSTANCE.getCase_P();

		/**
		 * The meta object literal for the '{@link san.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ArcImpl
		 * @see san.impl.SANPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '{@link san.impl.InputArcImpl <em>Input Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.InputArcImpl
		 * @see san.impl.SANPackageImpl#getInputArc()
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
		 * The meta object literal for the '{@link san.impl.OutputArcImpl <em>Output Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.OutputArcImpl
		 * @see san.impl.SANPackageImpl#getOutputArc()
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
		 * The meta object literal for the '{@link san.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.GateImpl
		 * @see san.impl.SANPackageImpl#getGate()
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
		 * The meta object literal for the '{@link san.impl.OutputGateImpl <em>Output Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.OutputGateImpl
		 * @see san.impl.SANPackageImpl#getOutputGate()
		 * @generated
		 */
		EClass OUTPUT_GATE = eINSTANCE.getOutputGate();

		/**
		 * The meta object literal for the '<em><b>Activity Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_GATE__ACTIVITY_CASE = eINSTANCE.getOutputGate_ActivityCase();

		/**
		 * The meta object literal for the '{@link san.impl.InputGateImpl <em>Input Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.InputGateImpl
		 * @see san.impl.SANPackageImpl#getInputGate()
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
		 * The meta object literal for the '{@link san.impl.InstantaneousActivityImpl <em>Instantaneous Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.InstantaneousActivityImpl
		 * @see san.impl.SANPackageImpl#getInstantaneousActivity()
		 * @generated
		 */
		EClass INSTANTANEOUS_ACTIVITY = eINSTANCE.getInstantaneousActivity();

		/**
		 * The meta object literal for the '{@link san.impl.TimedActivityImpl <em>Timed Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.TimedActivityImpl
		 * @see san.impl.SANPackageImpl#getTimedActivity()
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
		 * The meta object literal for the '{@link san.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.DistributionImpl
		 * @see san.impl.SANPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '{@link san.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ExpressionImpl
		 * @see san.impl.SANPackageImpl#getExpression()
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
		 * The meta object literal for the '{@link san.impl.ExpressionTextImpl <em>Expression Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ExpressionTextImpl
		 * @see san.impl.SANPackageImpl#getExpressionText()
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
		 * The meta object literal for the '{@link san.impl.ExpressionMarkingImpl <em>Expression Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ExpressionMarkingImpl
		 * @see san.impl.SANPackageImpl#getExpressionMarking()
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
		 * The meta object literal for the '{@link san.impl.ExpressionVariableImpl <em>Expression Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ExpressionVariableImpl
		 * @see san.impl.SANPackageImpl#getExpressionVariable()
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
		 * The meta object literal for the '{@link san.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.MarkingImpl
		 * @see san.impl.SANPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '{@link san.impl.MarkingIntegerImpl <em>Marking Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.MarkingIntegerImpl
		 * @see san.impl.SANPackageImpl#getMarkingInteger()
		 * @generated
		 */
		EClass MARKING_INTEGER = eINSTANCE.getMarkingInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING_INTEGER__VALUE = eINSTANCE.getMarkingInteger_Value();

		/**
		 * The meta object literal for the '{@link san.impl.MarkingExtendedImpl <em>Marking Extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.MarkingExtendedImpl
		 * @see san.impl.SANPackageImpl#getMarkingExtended()
		 * @generated
		 */
		EClass MARKING_EXTENDED = eINSTANCE.getMarkingExtended();

		/**
		 * The meta object literal for the '{@link san.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.GlobalVariableImpl
		 * @see san.impl.SANPackageImpl#getGlobalVariable()
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
		 * The meta object literal for the '{@link san.impl.MarkingVariableSimpleImpl <em>Marking Variable Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.MarkingVariableSimpleImpl
		 * @see san.impl.SANPackageImpl#getMarkingVariableSimple()
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
		 * The meta object literal for the '{@link san.impl.ExponentialImpl <em>Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ExponentialImpl
		 * @see san.impl.SANPackageImpl#getExponential()
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
		 * The meta object literal for the '{@link san.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.NormalImpl
		 * @see san.impl.SANPackageImpl#getNormal()
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
		 * The meta object literal for the '{@link san.impl.GammaImpl <em>Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.GammaImpl
		 * @see san.impl.SANPackageImpl#getGamma()
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
		 * The meta object literal for the '{@link san.impl.BinomialImpl <em>Binomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.BinomialImpl
		 * @see san.impl.SANPackageImpl#getBinomial()
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
		 * The meta object literal for the '{@link san.impl.DeterministicImpl <em>Deterministic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.DeterministicImpl
		 * @see san.impl.SANPackageImpl#getDeterministic()
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
		 * The meta object literal for the '{@link san.impl.LognormalImpl <em>Lognormal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.LognormalImpl
		 * @see san.impl.SANPackageImpl#getLognormal()
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
		 * The meta object literal for the '{@link san.impl.BetaImpl <em>Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.BetaImpl
		 * @see san.impl.SANPackageImpl#getBeta()
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
		 * The meta object literal for the '{@link san.impl.NegativeBinomialImpl <em>Negative Binomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.NegativeBinomialImpl
		 * @see san.impl.SANPackageImpl#getNegativeBinomial()
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
		 * The meta object literal for the '{@link san.impl.GeometricImpl <em>Geometric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.GeometricImpl
		 * @see san.impl.SANPackageImpl#getGeometric()
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
		 * The meta object literal for the '{@link san.impl.ErlangImpl <em>Erlang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ErlangImpl
		 * @see san.impl.SANPackageImpl#getErlang()
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
		 * The meta object literal for the '{@link san.impl.UniformImpl <em>Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.UniformImpl
		 * @see san.impl.SANPackageImpl#getUniform()
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
		 * The meta object literal for the '{@link san.impl.HyperExponentialImpl <em>Hyper Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.HyperExponentialImpl
		 * @see san.impl.SANPackageImpl#getHyperExponential()
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
		 * The meta object literal for the '{@link san.impl.WeibullImpl <em>Weibull</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.WeibullImpl
		 * @see san.impl.SANPackageImpl#getWeibull()
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
		 * The meta object literal for the '{@link san.impl.TriangularImpl <em>Triangular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.TriangularImpl
		 * @see san.impl.SANPackageImpl#getTriangular()
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
		 * The meta object literal for the '{@link san.impl.ConditionalWeibullImpl <em>Conditional Weibull</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ConditionalWeibullImpl
		 * @see san.impl.SANPackageImpl#getConditionalWeibull()
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
		 * The meta object literal for the '{@link san.impl.HypoExponentialImpl <em>Hypo Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.HypoExponentialImpl
		 * @see san.impl.SANPackageImpl#getHypoExponential()
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
		 * The meta object literal for the '{@link san.impl.ParetoImpl <em>Pareto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ParetoImpl
		 * @see san.impl.SANPackageImpl#getPareto()
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
		 * The meta object literal for the '{@link san.impl.ExpressionSegmentImpl <em>Expression Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ExpressionSegmentImpl
		 * @see san.impl.SANPackageImpl#getExpressionSegment()
		 * @generated
		 */
		EClass EXPRESSION_SEGMENT = eINSTANCE.getExpressionSegment();

		/**
		 * The meta object literal for the '{@link san.impl.MarkingSimpleImpl <em>Marking Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.MarkingSimpleImpl
		 * @see san.impl.SANPackageImpl#getMarkingSimple()
		 * @generated
		 */
		EClass MARKING_SIMPLE = eINSTANCE.getMarkingSimple();

		/**
		 * The meta object literal for the '{@link san.impl.NormalPlaceImpl <em>Normal Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.NormalPlaceImpl
		 * @see san.impl.SANPackageImpl#getNormalPlace()
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
		 * The meta object literal for the '{@link san.impl.ExtendedPlaceImpl <em>Extended Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.ExtendedPlaceImpl
		 * @see san.impl.SANPackageImpl#getExtendedPlace()
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
		 * The meta object literal for the '{@link san.impl.MarkingStringImpl <em>Marking String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.MarkingStringImpl
		 * @see san.impl.SANPackageImpl#getMarkingString()
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
		 * The meta object literal for the '{@link san.impl.MarkingVariableExtendedImpl <em>Marking Variable Extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.impl.MarkingVariableExtendedImpl
		 * @see san.impl.SANPackageImpl#getMarkingVariableExtended()
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
		 * The meta object literal for the '{@link san.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.VariableType
		 * @see san.impl.SANPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link san.ExtendedPlaceType <em>Extended Place Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see san.ExtendedPlaceType
		 * @see san.impl.SANPackageImpl#getExtendedPlaceType()
		 * @generated
		 */
		EEnum EXTENDED_PLACE_TYPE = eINSTANCE.getExtendedPlaceType();

		/**
		 * The meta object literal for the '<em>Code Fragment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see san.impl.SANPackageImpl#getCodeFragment()
		 * @generated
		 */
		EDataType CODE_FRAGMENT = eINSTANCE.getCodeFragment();

	}

} //SANPackage
