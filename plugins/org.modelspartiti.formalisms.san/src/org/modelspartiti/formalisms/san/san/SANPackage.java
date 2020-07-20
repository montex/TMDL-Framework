/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.modelspartiti.infrastructure.tmdl.core.CorePackage;

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
 * @see org.modelspartiti.formalisms.san.san.SANFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	SANPackage eINSTANCE = org.modelspartiti.formalisms.san.san.impl.SANPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.SANImpl <em>SAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.SANImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getSAN()
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
	 * The feature id for the '<em><b>Customtype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN__CUSTOMTYPE = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>SAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_FEATURE_COUNT = CorePackage.CONCRETE_MODEL_FEATURE_COUNT + 8;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.NamedElementImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getNamedElement()
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
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.PlaceImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getPlace()
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
	 * The feature id for the '<em><b>Is Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IS_EXTENDED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__MARKING = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ActivityImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 3;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.InstantaneousActivityImpl <em>Instantaneous Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.InstantaneousActivityImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getInstantaneousActivity()
	 * @generated
	 */
	int INSTANTANEOUS_ACTIVITY = 4;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.TimedActivityImpl <em>Timed Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.TimedActivityImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getTimedActivity()
	 * @generated
	 */
	int TIMED_ACTIVITY = 5;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.CaseImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 6;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ArcImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 7;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.InputArcImpl <em>Input Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.InputArcImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getInputArc()
	 * @generated
	 */
	int INPUT_ARC = 8;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.OutputArcImpl <em>Output Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.OutputArcImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getOutputArc()
	 * @generated
	 */
	int OUTPUT_ARC = 9;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.GateImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 10;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.OutputGateImpl <em>Output Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.OutputGateImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getOutputGate()
	 * @generated
	 */
	int OUTPUT_GATE = 11;

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
	 * The feature id for the '<em><b>Activity Case</b></em>' reference list.
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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.InputGateImpl <em>Input Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.InputGateImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getInputGate()
	 * @generated
	 */
	int INPUT_GATE = 12;

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
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.DistributionImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 13;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ExpressionImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpression()
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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.ExpressionSegment <em>Expression Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.ExpressionSegment
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpressionSegment()
	 * @generated
	 */
	int EXPRESSION_SEGMENT = 37;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ExpressionTextImpl <em>Expression Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ExpressionTextImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpressionText()
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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ExpressionMarkingImpl <em>Expression Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ExpressionMarkingImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpressionMarking()
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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ExpressionVariableImpl <em>Expression Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ExpressionVariableImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpressionVariable()
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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.MarkingImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getMarking()
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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.GlobalVariableImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 19;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ExponentialImpl <em>Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ExponentialImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExponential()
	 * @generated
	 */
	int EXPONENTIAL = 20;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.NormalImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 21;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.GammaImpl <em>Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.GammaImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getGamma()
	 * @generated
	 */
	int GAMMA = 22;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.BinomialImpl <em>Binomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.BinomialImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getBinomial()
	 * @generated
	 */
	int BINOMIAL = 23;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIAL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.DeterministicImpl <em>Deterministic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.DeterministicImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getDeterministic()
	 * @generated
	 */
	int DETERMINISTIC = 24;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.LognormalImpl <em>Lognormal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.LognormalImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLognormal()
	 * @generated
	 */
	int LOGNORMAL = 25;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGNORMAL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.BetaImpl <em>Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.BetaImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getBeta()
	 * @generated
	 */
	int BETA = 26;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.NegativeBinomialImpl <em>Negative Binomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.NegativeBinomialImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getNegativeBinomial()
	 * @generated
	 */
	int NEGATIVE_BINOMIAL = 27;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_BINOMIAL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.GeometricImpl <em>Geometric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.GeometricImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getGeometric()
	 * @generated
	 */
	int GEOMETRIC = 28;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ErlangImpl <em>Erlang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ErlangImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getErlang()
	 * @generated
	 */
	int ERLANG = 29;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERLANG__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.UniformImpl <em>Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.UniformImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getUniform()
	 * @generated
	 */
	int UNIFORM = 30;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.HyperExponentialImpl <em>Hyper Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.HyperExponentialImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getHyperExponential()
	 * @generated
	 */
	int HYPER_EXPONENTIAL = 31;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_EXPONENTIAL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.WeibullImpl <em>Weibull</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.WeibullImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getWeibull()
	 * @generated
	 */
	int WEIBULL = 32;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.TriangularImpl <em>Triangular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.TriangularImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getTriangular()
	 * @generated
	 */
	int TRIANGULAR = 33;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ConditionalWeibullImpl <em>Conditional Weibull</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ConditionalWeibullImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getConditionalWeibull()
	 * @generated
	 */
	int CONDITIONAL_WEIBULL = 34;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_WEIBULL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.HypoExponentialImpl <em>Hypo Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.HypoExponentialImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getHypoExponential()
	 * @generated
	 */
	int HYPO_EXPONENTIAL = 35;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPO_EXPONENTIAL__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ParetoImpl <em>Pareto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ParetoImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getPareto()
	 * @generated
	 */
	int PARETO = 36;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARETO__PARAMETERS = DISTRIBUTION__PARAMETERS;

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
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.TypeImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 38;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.PrimitiveTypeImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ComplexTypeImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__DEFINITION = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.CustomTypeDefinitionImpl <em>Custom Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.CustomTypeDefinitionImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCustomTypeDefinition()
	 * @generated
	 */
	int CUSTOM_TYPE_DEFINITION = 41;

	/**
	 * The number of structural features of the '<em>Custom Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Custom Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.CustomTypeArrayImpl <em>Custom Type Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.CustomTypeArrayImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCustomTypeArray()
	 * @generated
	 */
	int CUSTOM_TYPE_ARRAY = 42;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_ARRAY__SIZE = CUSTOM_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_ARRAY__NAME = CUSTOM_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_ARRAY__TYPE_ARRAY = CUSTOM_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Type Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_ARRAY_FEATURE_COUNT = CUSTOM_TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Custom Type Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_ARRAY_OPERATION_COUNT = CUSTOM_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.CustomTypeStructImpl <em>Custom Type Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.CustomTypeStructImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCustomTypeStruct()
	 * @generated
	 */
	int CUSTOM_TYPE_STRUCT = 43;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_STRUCT__FIELD = CUSTOM_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_STRUCT__NAME = CUSTOM_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Type Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_STRUCT_FEATURE_COUNT = CUSTOM_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Custom Type Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_STRUCT_OPERATION_COUNT = CUSTOM_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.FieldImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE_STRUCT = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.MarkingSimpleImpl <em>Marking Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.MarkingSimpleImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getMarkingSimple()
	 * @generated
	 */
	int MARKING_SIMPLE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_SIMPLE__VALUE = MARKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_SIMPLE_FEATURE_COUNT = MARKING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_SIMPLE_OPERATION_COUNT = MARKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.MarkingGlobalVariableImpl <em>Marking Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.MarkingGlobalVariableImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getMarkingGlobalVariable()
	 * @generated
	 */
	int MARKING_GLOBAL_VARIABLE = 46;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_GLOBAL_VARIABLE__VARIABLE = MARKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_GLOBAL_VARIABLE_FEATURE_COUNT = MARKING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_GLOBAL_VARIABLE_OPERATION_COUNT = MARKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.MarkingExtendedImpl <em>Marking Extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.MarkingExtendedImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getMarkingExtended()
	 * @generated
	 */
	int MARKING_EXTENDED = 47;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_EXTENDED__NODE = MARKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_EXTENDED_FEATURE_COUNT = MARKING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Marking Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_EXTENDED_OPERATION_COUNT = MARKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.NodeImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 48;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.ArrayImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 49;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DEFINITION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leafnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__LEAFNODE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.LeafNodeImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLeafNode()
	 * @generated
	 */
	int LEAF_NODE = 50;

	/**
	 * The number of structural features of the '<em>Leaf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.LeafNodeStringImpl <em>Leaf Node String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.LeafNodeStringImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLeafNodeString()
	 * @generated
	 */
	int LEAF_NODE_STRING = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_STRING__VALUE = LEAF_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leaf Node String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_STRING_FEATURE_COUNT = LEAF_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leaf Node String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_STRING_OPERATION_COUNT = LEAF_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.LeafNodeStructImpl <em>Leaf Node Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.LeafNodeStructImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLeafNodeStruct()
	 * @generated
	 */
	int LEAF_NODE_STRUCT = 52;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_STRUCT__DEFINITION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leaf Node Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_STRUCT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leaf Node Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_STRUCT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.impl.LeafNodeGlobalVariableImpl <em>Leaf Node Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.impl.LeafNodeGlobalVariableImpl
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLeafNodeGlobalVariable()
	 * @generated
	 */
	int LEAF_NODE_GLOBAL_VARIABLE = 53;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_GLOBAL_VARIABLE__VARIABLE = LEAF_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leaf Node Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_GLOBAL_VARIABLE_FEATURE_COUNT = LEAF_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leaf Node Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_GLOBAL_VARIABLE_OPERATION_COUNT = LEAF_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.VariableType
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 54;

	/**
	 * The meta object id for the '{@link org.modelspartiti.formalisms.san.san.ExtendedPlaceType <em>Extended Place Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.formalisms.san.san.ExtendedPlaceType
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExtendedPlaceType()
	 * @generated
	 */
	int EXTENDED_PLACE_TYPE = 55;

	/**
	 * The meta object id for the '<em>Code Fragment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCodeFragment()
	 * @generated
	 */
	int CODE_FRAGMENT = 56;


	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.SAN <em>SAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAN</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN
	 * @generated
	 */
	EClass getSAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.SAN#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN#getPlaces()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Places();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.SAN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN#getName()
	 * @see #getSAN()
	 * @generated
	 */
	EAttribute getSAN_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.SAN#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN#getActivities()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.SAN#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variables</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN#getGlobalVariables()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_GlobalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.SAN#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN#getArcs()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.SAN#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN#getGates()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.SAN#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initialization</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN#getInitialization()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Initialization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.SAN#getCustomtype <em>Customtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customtype</em>'.
	 * @see org.modelspartiti.formalisms.san.san.SAN#getCustomtype()
	 * @see #getSAN()
	 * @generated
	 */
	EReference getSAN_Customtype();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.modelspartiti.formalisms.san.san.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.formalisms.san.san.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.Place#isIsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Extended</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Place#isIsExtended()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_IsExtended();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Place#getType()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Place#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marking</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Place#getMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Marking();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.Activity#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Activity#getCases()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Cases();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.InstantaneousActivity <em>Instantaneous Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantaneous Activity</em>'.
	 * @see org.modelspartiti.formalisms.san.san.InstantaneousActivity
	 * @generated
	 */
	EClass getInstantaneousActivity();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.TimedActivity <em>Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Activity</em>'.
	 * @see org.modelspartiti.formalisms.san.san.TimedActivity
	 * @generated
	 */
	EClass getTimedActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.TimedActivity#getTimeDistribution <em>Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Distribution</em>'.
	 * @see org.modelspartiti.formalisms.san.san.TimedActivity#getTimeDistribution()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_TimeDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.TimedActivity#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see org.modelspartiti.formalisms.san.san.TimedActivity#getActivation()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.TimedActivity#getReactivation <em>Reactivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reactivation</em>'.
	 * @see org.modelspartiti.formalisms.san.san.TimedActivity#getReactivation()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EReference getTimedActivity_Reactivation();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.Case#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Case#getID()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_ID();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Case#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Case#getP()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_P();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.InputArc <em>Input Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Arc</em>'.
	 * @see org.modelspartiti.formalisms.san.san.InputArc
	 * @generated
	 */
	EClass getInputArc();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.InputArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.modelspartiti.formalisms.san.san.InputArc#getSource()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_Source();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.InputArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.modelspartiti.formalisms.san.san.InputArc#getTarget()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_Target();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.OutputArc <em>Output Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Arc</em>'.
	 * @see org.modelspartiti.formalisms.san.san.OutputArc
	 * @generated
	 */
	EClass getOutputArc();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.OutputArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.modelspartiti.formalisms.san.san.OutputArc#getSource()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_Source();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.OutputArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.modelspartiti.formalisms.san.san.OutputArc#getTarget()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_Target();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Gate#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Gate#getFunction()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Function();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.formalisms.san.san.Gate#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Places</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Gate#getPlaces()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Places();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.OutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate</em>'.
	 * @see org.modelspartiti.formalisms.san.san.OutputGate
	 * @generated
	 */
	EClass getOutputGate();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.formalisms.san.san.OutputGate#getActivityCase <em>Activity Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Case</em>'.
	 * @see org.modelspartiti.formalisms.san.san.OutputGate#getActivityCase()
	 * @see #getOutputGate()
	 * @generated
	 */
	EReference getOutputGate_ActivityCase();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.InputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Gate</em>'.
	 * @see org.modelspartiti.formalisms.san.san.InputGate
	 * @generated
	 */
	EClass getInputGate();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.InputGate#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see org.modelspartiti.formalisms.san.san.InputGate#getPredicate()
	 * @see #getInputGate()
	 * @generated
	 */
	EReference getInputGate_Predicate();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.formalisms.san.san.InputGate#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see org.modelspartiti.formalisms.san.san.InputGate#getActivity()
	 * @see #getInputGate()
	 * @generated
	 */
	EReference getInputGate_Activity();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.Distribution#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Distribution#getParameters()
	 * @see #getDistribution()
	 * @generated
	 */
	EAttribute getDistribution_Parameters();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.Expression#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Expression#getSegments()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Segments();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.ExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Text</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ExpressionText
	 * @generated
	 */
	EClass getExpressionText();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.ExpressionText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ExpressionText#getText()
	 * @see #getExpressionText()
	 * @generated
	 */
	EAttribute getExpressionText_Text();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.ExpressionMarking <em>Expression Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Marking</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ExpressionMarking
	 * @generated
	 */
	EClass getExpressionMarking();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.ExpressionMarking#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ExpressionMarking#getPlace()
	 * @see #getExpressionMarking()
	 * @generated
	 */
	EReference getExpressionMarking_Place();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.ExpressionVariable <em>Expression Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Variable</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ExpressionVariable
	 * @generated
	 */
	EClass getExpressionVariable();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.ExpressionVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ExpressionVariable#getVariable()
	 * @see #getExpressionVariable()
	 * @generated
	 */
	EReference getExpressionVariable_Variable();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see org.modelspartiti.formalisms.san.san.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.modelspartiti.formalisms.san.san.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Exponential
	 * @generated
	 */
	EClass getExponential();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Exponential#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Exponential#getRate()
	 * @see #getExponential()
	 * @generated
	 */
	EReference getExponential_Rate();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Normal#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Normal#getMean()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Mean();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Normal#getVariance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variance</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Normal#getVariance()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Variance();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamma</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Gamma
	 * @generated
	 */
	EClass getGamma();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Gamma#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Gamma#getAlpha()
	 * @see #getGamma()
	 * @generated
	 */
	EReference getGamma_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Gamma#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Gamma#getBeta()
	 * @see #getGamma()
	 * @generated
	 */
	EReference getGamma_Beta();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Binomial <em>Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binomial</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Binomial
	 * @generated
	 */
	EClass getBinomial();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Binomial#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>T</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Binomial#getT()
	 * @see #getBinomial()
	 * @generated
	 */
	EReference getBinomial_T();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Binomial#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Binomial#getP()
	 * @see #getBinomial()
	 * @generated
	 */
	EReference getBinomial_P();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Deterministic <em>Deterministic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Deterministic
	 * @generated
	 */
	EClass getDeterministic();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Deterministic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Deterministic#getValue()
	 * @see #getDeterministic()
	 * @generated
	 */
	EReference getDeterministic_Value();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Lognormal <em>Lognormal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lognormal</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Lognormal
	 * @generated
	 */
	EClass getLognormal();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Lognormal#getMu <em>Mu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mu</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Lognormal#getMu()
	 * @see #getLognormal()
	 * @generated
	 */
	EReference getLognormal_Mu();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Lognormal#getAlphaSquared <em>Alpha Squared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha Squared</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Lognormal#getAlphaSquared()
	 * @see #getLognormal()
	 * @generated
	 */
	EReference getLognormal_AlphaSquared();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beta</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Beta
	 * @generated
	 */
	EClass getBeta();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Beta#getAlpha1 <em>Alpha1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha1</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Beta#getAlpha1()
	 * @see #getBeta()
	 * @generated
	 */
	EReference getBeta_Alpha1();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Beta#getBeta1 <em>Beta1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta1</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Beta#getBeta1()
	 * @see #getBeta()
	 * @generated
	 */
	EReference getBeta_Beta1();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.NegativeBinomial <em>Negative Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Binomial</em>'.
	 * @see org.modelspartiti.formalisms.san.san.NegativeBinomial
	 * @generated
	 */
	EClass getNegativeBinomial();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.NegativeBinomial#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see org.modelspartiti.formalisms.san.san.NegativeBinomial#getS()
	 * @see #getNegativeBinomial()
	 * @generated
	 */
	EReference getNegativeBinomial_S();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.NegativeBinomial#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.modelspartiti.formalisms.san.san.NegativeBinomial#getP()
	 * @see #getNegativeBinomial()
	 * @generated
	 */
	EReference getNegativeBinomial_P();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Geometric <em>Geometric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometric</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Geometric
	 * @generated
	 */
	EClass getGeometric();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Geometric#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Geometric#getP()
	 * @see #getGeometric()
	 * @generated
	 */
	EReference getGeometric_P();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Erlang <em>Erlang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erlang</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Erlang
	 * @generated
	 */
	EClass getErlang();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Erlang#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>M</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Erlang#getM()
	 * @see #getErlang()
	 * @generated
	 */
	EReference getErlang_M();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Erlang#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Erlang#getBeta()
	 * @see #getErlang()
	 * @generated
	 */
	EReference getErlang_Beta();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Uniform
	 * @generated
	 */
	EClass getUniform();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Uniform#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Uniform#getLowerBound()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Uniform#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Uniform#getUpperBound()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.HyperExponential <em>Hyper Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Exponential</em>'.
	 * @see org.modelspartiti.formalisms.san.san.HyperExponential
	 * @generated
	 */
	EClass getHyperExponential();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.HyperExponential#getRate0 <em>Rate0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate0</em>'.
	 * @see org.modelspartiti.formalisms.san.san.HyperExponential#getRate0()
	 * @see #getHyperExponential()
	 * @generated
	 */
	EReference getHyperExponential_Rate0();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.HyperExponential#getP0 <em>P0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P0</em>'.
	 * @see org.modelspartiti.formalisms.san.san.HyperExponential#getP0()
	 * @see #getHyperExponential()
	 * @generated
	 */
	EReference getHyperExponential_P0();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Weibull <em>Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Weibull
	 * @generated
	 */
	EClass getWeibull();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Weibull#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Weibull#getAlpha()
	 * @see #getWeibull()
	 * @generated
	 */
	EReference getWeibull_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Weibull#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Weibull#getBeta()
	 * @see #getWeibull()
	 * @generated
	 */
	EReference getWeibull_Beta();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Triangular <em>Triangular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Triangular
	 * @generated
	 */
	EClass getTriangular();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Triangular#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Triangular#getMin()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Min();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Triangular#getMiddle <em>Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middle</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Triangular#getMiddle()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Middle();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Triangular#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Triangular#getMax()
	 * @see #getTriangular()
	 * @generated
	 */
	EReference getTriangular_Max();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.ConditionalWeibull <em>Conditional Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Weibull</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ConditionalWeibull
	 * @generated
	 */
	EClass getConditionalWeibull();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.ConditionalWeibull#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alpha</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ConditionalWeibull#getAlpha()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.ConditionalWeibull#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beta</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ConditionalWeibull#getBeta()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_Beta();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.ConditionalWeibull#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>T</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ConditionalWeibull#getT()
	 * @see #getConditionalWeibull()
	 * @generated
	 */
	EReference getConditionalWeibull_T();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.HypoExponential <em>Hypo Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypo Exponential</em>'.
	 * @see org.modelspartiti.formalisms.san.san.HypoExponential
	 * @generated
	 */
	EClass getHypoExponential();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.HypoExponential#getRate0 <em>Rate0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate0</em>'.
	 * @see org.modelspartiti.formalisms.san.san.HypoExponential#getRate0()
	 * @see #getHypoExponential()
	 * @generated
	 */
	EReference getHypoExponential_Rate0();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Pareto <em>Pareto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pareto</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Pareto
	 * @generated
	 */
	EClass getPareto();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Pareto#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Pareto#getLowerBound()
	 * @see #getPareto()
	 * @generated
	 */
	EReference getPareto_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Pareto#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Pareto#getShape()
	 * @see #getPareto()
	 * @generated
	 */
	EReference getPareto_Shape();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.ExpressionSegment <em>Expression Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Segment</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ExpressionSegment
	 * @generated
	 */
	EClass getExpressionSegment();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.modelspartiti.formalisms.san.san.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.PrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.modelspartiti.formalisms.san.san.PrimitiveType#getType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Type();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.ComplexType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ComplexType#getDefinition()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Definition();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.CustomTypeDefinition <em>Custom Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Type Definition</em>'.
	 * @see org.modelspartiti.formalisms.san.san.CustomTypeDefinition
	 * @generated
	 */
	EClass getCustomTypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.CustomTypeArray <em>Custom Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Type Array</em>'.
	 * @see org.modelspartiti.formalisms.san.san.CustomTypeArray
	 * @generated
	 */
	EClass getCustomTypeArray();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.CustomTypeArray#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.modelspartiti.formalisms.san.san.CustomTypeArray#getSize()
	 * @see #getCustomTypeArray()
	 * @generated
	 */
	EAttribute getCustomTypeArray_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.CustomTypeArray#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.formalisms.san.san.CustomTypeArray#getName()
	 * @see #getCustomTypeArray()
	 * @generated
	 */
	EAttribute getCustomTypeArray_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.CustomTypeArray#getTypeArray <em>Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Array</em>'.
	 * @see org.modelspartiti.formalisms.san.san.CustomTypeArray#getTypeArray()
	 * @see #getCustomTypeArray()
	 * @generated
	 */
	EReference getCustomTypeArray_TypeArray();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.CustomTypeStruct <em>Custom Type Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Type Struct</em>'.
	 * @see org.modelspartiti.formalisms.san.san.CustomTypeStruct
	 * @generated
	 */
	EClass getCustomTypeStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.CustomTypeStruct#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.modelspartiti.formalisms.san.san.CustomTypeStruct#getField()
	 * @see #getCustomTypeStruct()
	 * @generated
	 */
	EReference getCustomTypeStruct_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.CustomTypeStruct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.formalisms.san.san.CustomTypeStruct#getName()
	 * @see #getCustomTypeStruct()
	 * @generated
	 */
	EAttribute getCustomTypeStruct_Name();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.Field#getTypeStruct <em>Type Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Struct</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Field#getTypeStruct()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_TypeStruct();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.MarkingSimple <em>Marking Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Simple</em>'.
	 * @see org.modelspartiti.formalisms.san.san.MarkingSimple
	 * @generated
	 */
	EClass getMarkingSimple();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.MarkingSimple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.formalisms.san.san.MarkingSimple#getValue()
	 * @see #getMarkingSimple()
	 * @generated
	 */
	EAttribute getMarkingSimple_Value();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.MarkingGlobalVariable <em>Marking Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Global Variable</em>'.
	 * @see org.modelspartiti.formalisms.san.san.MarkingGlobalVariable
	 * @generated
	 */
	EClass getMarkingGlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.MarkingGlobalVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.modelspartiti.formalisms.san.san.MarkingGlobalVariable#getVariable()
	 * @see #getMarkingGlobalVariable()
	 * @generated
	 */
	EReference getMarkingGlobalVariable_Variable();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.MarkingExtended <em>Marking Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking Extended</em>'.
	 * @see org.modelspartiti.formalisms.san.san.MarkingExtended
	 * @generated
	 */
	EClass getMarkingExtended();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.formalisms.san.san.MarkingExtended#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.modelspartiti.formalisms.san.san.MarkingExtended#getNode()
	 * @see #getMarkingExtended()
	 * @generated
	 */
	EReference getMarkingExtended_Node();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.Array#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Array#getDefinition()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.formalisms.san.san.Array#getLeafnode <em>Leafnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leafnode</em>'.
	 * @see org.modelspartiti.formalisms.san.san.Array#getLeafnode()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Leafnode();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.LeafNode <em>Leaf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Node</em>'.
	 * @see org.modelspartiti.formalisms.san.san.LeafNode
	 * @generated
	 */
	EClass getLeafNode();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.LeafNodeString <em>Leaf Node String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Node String</em>'.
	 * @see org.modelspartiti.formalisms.san.san.LeafNodeString
	 * @generated
	 */
	EClass getLeafNodeString();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.formalisms.san.san.LeafNodeString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.formalisms.san.san.LeafNodeString#getValue()
	 * @see #getLeafNodeString()
	 * @generated
	 */
	EAttribute getLeafNodeString_Value();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.LeafNodeStruct <em>Leaf Node Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Node Struct</em>'.
	 * @see org.modelspartiti.formalisms.san.san.LeafNodeStruct
	 * @generated
	 */
	EClass getLeafNodeStruct();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.LeafNodeStruct#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.modelspartiti.formalisms.san.san.LeafNodeStruct#getDefinition()
	 * @see #getLeafNodeStruct()
	 * @generated
	 */
	EReference getLeafNodeStruct_Definition();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.formalisms.san.san.LeafNodeGlobalVariable <em>Leaf Node Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Node Global Variable</em>'.
	 * @see org.modelspartiti.formalisms.san.san.LeafNodeGlobalVariable
	 * @generated
	 */
	EClass getLeafNodeGlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.formalisms.san.san.LeafNodeGlobalVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.modelspartiti.formalisms.san.san.LeafNodeGlobalVariable#getVariable()
	 * @see #getLeafNodeGlobalVariable()
	 * @generated
	 */
	EReference getLeafNodeGlobalVariable_Variable();

	/**
	 * Returns the meta object for enum '{@link org.modelspartiti.formalisms.san.san.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see org.modelspartiti.formalisms.san.san.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link org.modelspartiti.formalisms.san.san.ExtendedPlaceType <em>Extended Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Extended Place Type</em>'.
	 * @see org.modelspartiti.formalisms.san.san.ExtendedPlaceType
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.SANImpl <em>SAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.SANImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getSAN()
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
		 * The meta object literal for the '<em><b>Customtype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAN__CUSTOMTYPE = eINSTANCE.getSAN_Customtype();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.NamedElementImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.PlaceImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Is Extended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__IS_EXTENDED = eINSTANCE.getPlace_IsExtended();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TYPE = eINSTANCE.getPlace_Type();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__MARKING = eINSTANCE.getPlace_Marking();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ActivityImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getActivity()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.InstantaneousActivityImpl <em>Instantaneous Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.InstantaneousActivityImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getInstantaneousActivity()
		 * @generated
		 */
		EClass INSTANTANEOUS_ACTIVITY = eINSTANCE.getInstantaneousActivity();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.TimedActivityImpl <em>Timed Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.TimedActivityImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getTimedActivity()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.CaseImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCase()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ArcImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.InputArcImpl <em>Input Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.InputArcImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getInputArc()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.OutputArcImpl <em>Output Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.OutputArcImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getOutputArc()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.GateImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getGate()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.OutputGateImpl <em>Output Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.OutputGateImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getOutputGate()
		 * @generated
		 */
		EClass OUTPUT_GATE = eINSTANCE.getOutputGate();

		/**
		 * The meta object literal for the '<em><b>Activity Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_GATE__ACTIVITY_CASE = eINSTANCE.getOutputGate_ActivityCase();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.InputGateImpl <em>Input Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.InputGateImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getInputGate()
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
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_GATE__ACTIVITY = eINSTANCE.getInputGate_Activity();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.DistributionImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION__PARAMETERS = eINSTANCE.getDistribution_Parameters();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ExpressionImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpression()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ExpressionTextImpl <em>Expression Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ExpressionTextImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpressionText()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ExpressionMarkingImpl <em>Expression Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ExpressionMarkingImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpressionMarking()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ExpressionVariableImpl <em>Expression Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ExpressionVariableImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpressionVariable()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.MarkingImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.GlobalVariableImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getGlobalVariable()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ExponentialImpl <em>Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ExponentialImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExponential()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.NormalImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getNormal()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.GammaImpl <em>Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.GammaImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getGamma()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.BinomialImpl <em>Binomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.BinomialImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getBinomial()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.DeterministicImpl <em>Deterministic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.DeterministicImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getDeterministic()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.LognormalImpl <em>Lognormal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.LognormalImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLognormal()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.BetaImpl <em>Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.BetaImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getBeta()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.NegativeBinomialImpl <em>Negative Binomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.NegativeBinomialImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getNegativeBinomial()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.GeometricImpl <em>Geometric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.GeometricImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getGeometric()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ErlangImpl <em>Erlang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ErlangImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getErlang()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.UniformImpl <em>Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.UniformImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getUniform()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.HyperExponentialImpl <em>Hyper Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.HyperExponentialImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getHyperExponential()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.WeibullImpl <em>Weibull</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.WeibullImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getWeibull()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.TriangularImpl <em>Triangular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.TriangularImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getTriangular()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ConditionalWeibullImpl <em>Conditional Weibull</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ConditionalWeibullImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getConditionalWeibull()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.HypoExponentialImpl <em>Hypo Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.HypoExponentialImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getHypoExponential()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ParetoImpl <em>Pareto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ParetoImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getPareto()
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
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.ExpressionSegment <em>Expression Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.ExpressionSegment
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExpressionSegment()
		 * @generated
		 */
		EClass EXPRESSION_SEGMENT = eINSTANCE.getExpressionSegment();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.TypeImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.PrimitiveTypeImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE = eINSTANCE.getPrimitiveType_Type();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ComplexTypeImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__DEFINITION = eINSTANCE.getComplexType_Definition();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.CustomTypeDefinitionImpl <em>Custom Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.CustomTypeDefinitionImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCustomTypeDefinition()
		 * @generated
		 */
		EClass CUSTOM_TYPE_DEFINITION = eINSTANCE.getCustomTypeDefinition();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.CustomTypeArrayImpl <em>Custom Type Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.CustomTypeArrayImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCustomTypeArray()
		 * @generated
		 */
		EClass CUSTOM_TYPE_ARRAY = eINSTANCE.getCustomTypeArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TYPE_ARRAY__SIZE = eINSTANCE.getCustomTypeArray_Size();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TYPE_ARRAY__NAME = eINSTANCE.getCustomTypeArray_Name();

		/**
		 * The meta object literal for the '<em><b>Type Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_TYPE_ARRAY__TYPE_ARRAY = eINSTANCE.getCustomTypeArray_TypeArray();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.CustomTypeStructImpl <em>Custom Type Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.CustomTypeStructImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCustomTypeStruct()
		 * @generated
		 */
		EClass CUSTOM_TYPE_STRUCT = eINSTANCE.getCustomTypeStruct();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_TYPE_STRUCT__FIELD = eINSTANCE.getCustomTypeStruct_Field();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TYPE_STRUCT__NAME = eINSTANCE.getCustomTypeStruct_Name();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.FieldImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE_STRUCT = eINSTANCE.getField_TypeStruct();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.MarkingSimpleImpl <em>Marking Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.MarkingSimpleImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getMarkingSimple()
		 * @generated
		 */
		EClass MARKING_SIMPLE = eINSTANCE.getMarkingSimple();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING_SIMPLE__VALUE = eINSTANCE.getMarkingSimple_Value();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.MarkingGlobalVariableImpl <em>Marking Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.MarkingGlobalVariableImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getMarkingGlobalVariable()
		 * @generated
		 */
		EClass MARKING_GLOBAL_VARIABLE = eINSTANCE.getMarkingGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING_GLOBAL_VARIABLE__VARIABLE = eINSTANCE.getMarkingGlobalVariable_Variable();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.MarkingExtendedImpl <em>Marking Extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.MarkingExtendedImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getMarkingExtended()
		 * @generated
		 */
		EClass MARKING_EXTENDED = eINSTANCE.getMarkingExtended();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING_EXTENDED__NODE = eINSTANCE.getMarkingExtended_Node();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.NodeImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.ArrayImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__DEFINITION = eINSTANCE.getArray_Definition();

		/**
		 * The meta object literal for the '<em><b>Leafnode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__LEAFNODE = eINSTANCE.getArray_Leafnode();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.LeafNodeImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLeafNode()
		 * @generated
		 */
		EClass LEAF_NODE = eINSTANCE.getLeafNode();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.LeafNodeStringImpl <em>Leaf Node String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.LeafNodeStringImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLeafNodeString()
		 * @generated
		 */
		EClass LEAF_NODE_STRING = eINSTANCE.getLeafNodeString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_NODE_STRING__VALUE = eINSTANCE.getLeafNodeString_Value();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.LeafNodeStructImpl <em>Leaf Node Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.LeafNodeStructImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLeafNodeStruct()
		 * @generated
		 */
		EClass LEAF_NODE_STRUCT = eINSTANCE.getLeafNodeStruct();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_NODE_STRUCT__DEFINITION = eINSTANCE.getLeafNodeStruct_Definition();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.impl.LeafNodeGlobalVariableImpl <em>Leaf Node Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.impl.LeafNodeGlobalVariableImpl
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getLeafNodeGlobalVariable()
		 * @generated
		 */
		EClass LEAF_NODE_GLOBAL_VARIABLE = eINSTANCE.getLeafNodeGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_NODE_GLOBAL_VARIABLE__VARIABLE = eINSTANCE.getLeafNodeGlobalVariable_Variable();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.VariableType
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.formalisms.san.san.ExtendedPlaceType <em>Extended Place Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.formalisms.san.san.ExtendedPlaceType
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getExtendedPlaceType()
		 * @generated
		 */
		EEnum EXTENDED_PLACE_TYPE = eINSTANCE.getExtendedPlaceType();

		/**
		 * The meta object literal for the '<em>Code Fragment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.modelspartiti.formalisms.san.san.impl.SANPackageImpl#getCodeFragment()
		 * @generated
		 */
		EDataType CODE_FRAGMENT = eINSTANCE.getCodeFragment();

	}

} //SANPackage
