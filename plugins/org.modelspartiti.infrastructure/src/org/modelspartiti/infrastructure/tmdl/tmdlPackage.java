/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.modelspartiti.infrastructure.tmdl.tmdlFactory
 * @model kind="package"
 * @generated
 */
public interface tmdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tmdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/infrastructure/tmdl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tmdl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tmdlPackage eINSTANCE = org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.TMDLSpecificationImpl <em>TMDL Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.TMDLSpecificationImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getTMDLSpecification()
	 * @generated
	 */
	int TMDL_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMDL_SPECIFICATION__LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMDL_SPECIFICATION__SCENARIO = 1;

	/**
	 * The number of structural features of the '<em>TMDL Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMDL_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMDL Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMDL_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.LibraryImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TEMPLATES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__INTERFACES = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ScenarioImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VARIANTS = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ROOT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl <em>Template Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getTemplateSpecification()
	 * @generated
	 */
	int TEMPLATE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION__LABELS = 2;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION__METRICS = 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION__INTERFACES = 4;

	/**
	 * The number of structural features of the '<em>Template Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Template Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateAtomicImpl <em>Template Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.TemplateAtomicImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getTemplateAtomic()
	 * @generated
	 */
	int TEMPLATE_ATOMIC = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__PARAMETERS = TEMPLATE_SPECIFICATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__NAME = TEMPLATE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__LABELS = TEMPLATE_SPECIFICATION__LABELS;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__METRICS = TEMPLATE_SPECIFICATION__METRICS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__INTERFACES = TEMPLATE_SPECIFICATION__INTERFACES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__SOURCE = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC_FEATURE_COUNT = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC_OPERATION_COUNT = TEMPLATE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateCompositeImpl <em>Template Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.TemplateCompositeImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getTemplateComposite()
	 * @generated
	 */
	int TEMPLATE_COMPOSITE = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__PARAMETERS = TEMPLATE_SPECIFICATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__NAME = TEMPLATE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__LABELS = TEMPLATE_SPECIFICATION__LABELS;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__METRICS = TEMPLATE_SPECIFICATION__METRICS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__INTERFACES = TEMPLATE_SPECIFICATION__INTERFACES;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__RULES = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__BIND = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Submodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__SUBMODULES = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE_FEATURE_COUNT = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Template Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE_OPERATION_COUNT = TEMPLATE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.BlockImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REF = 1;

	/**
	 * The feature id for the '<em><b>Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MULT = 2;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__LABELS = 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INTERFACES = 4;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.VariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.VariantImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 7;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__ASSIGNMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__REALIZATIONS = 3;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.BlockRealizationImpl <em>Block Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.BlockRealizationImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getBlockRealization()
	 * @generated
	 */
	int BLOCK_REALIZATION = 8;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION__REF = 0;

	/**
	 * The feature id for the '<em><b>Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION__MULT = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION__BLOCK = 2;

	/**
	 * The number of structural features of the '<em>Block Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ModelInterfaceImpl <em>Model Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ModelInterfaceImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getModelInterface()
	 * @generated
	 */
	int MODEL_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERFACE__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Model Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ModelInterfSimpleImpl <em>Model Interf Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ModelInterfSimpleImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getModelInterfSimple()
	 * @generated
	 */
	int MODEL_INTERF_SIMPLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_SIMPLE__NAME = MODEL_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_SIMPLE__VARIABLES = MODEL_INTERFACE__VARIABLES;

	/**
	 * The number of structural features of the '<em>Model Interf Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_SIMPLE_FEATURE_COUNT = MODEL_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Interf Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_SIMPLE_OPERATION_COUNT = MODEL_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ModelInterfArrayImpl <em>Model Interf Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ModelInterfArrayImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getModelInterfArray()
	 * @generated
	 */
	int MODEL_INTERF_ARRAY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_ARRAY__NAME = MODEL_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_ARRAY__VARIABLES = MODEL_INTERFACE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_ARRAY__MULT = MODEL_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_ARRAY__LABELS = MODEL_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Interf Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_ARRAY_FEATURE_COUNT = MODEL_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Interf Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERF_ARRAY_OPERATION_COUNT = MODEL_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleImpl <em>Composition Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompositionRule()
	 * @generated
	 */
	int COMPOSITION_RULE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Composition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Composition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleForwardsImpl <em>Composition Rule Forwards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleForwardsImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompositionRuleForwards()
	 * @generated
	 */
	int COMPOSITION_RULE_FORWARDS = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_FORWARDS__NAME = COMPOSITION_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_FORWARDS__VARIABLES = COMPOSITION_RULE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_FORWARDS__REF = COMPOSITION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition Rule Forwards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_FORWARDS_FEATURE_COUNT = COMPOSITION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition Rule Forwards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_FORWARDS_OPERATION_COUNT = COMPOSITION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleAllImpl <em>Composition Rule All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleAllImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompositionRuleAll()
	 * @generated
	 */
	int COMPOSITION_RULE_ALL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_ALL__NAME = COMPOSITION_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_ALL__VARIABLES = COMPOSITION_RULE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_ALL__REF = COMPOSITION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition Rule All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_ALL_FEATURE_COUNT = COMPOSITION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition Rule All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_ALL_OPERATION_COUNT = COMPOSITION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleMatchImpl <em>Composition Rule Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleMatchImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompositionRuleMatch()
	 * @generated
	 */
	int COMPOSITION_RULE_MATCH = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH__NAME = COMPOSITION_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH__VARIABLES = COMPOSITION_RULE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH__REF = COMPOSITION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH__LABELS = COMPOSITION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composition Rule Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH_FEATURE_COUNT = COMPOSITION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composition Rule Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH_OPERATION_COUNT = COMPOSITION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompItemImpl <em>Comp Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.CompItemImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompItem()
	 * @generated
	 */
	int COMP_ITEM = 16;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITEM__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITEM__BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITEM__IDS = 2;

	/**
	 * The number of structural features of the '<em>Comp Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Comp Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 17;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueIntImpl <em>Value Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueIntImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueInt()
	 * @generated
	 */
	int VALUE_INT = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueDoubleImpl <em>Value Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueDoubleImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueDouble()
	 * @generated
	 */
	int VALUE_DOUBLE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueArrayImpl <em>Value Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueArrayImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueArray()
	 * @generated
	 */
	int VALUE_ARRAY = 20;

	/**
	 * The number of structural features of the '<em>Value Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ARRAY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ARRAY_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueArrayIntImpl <em>Value Array Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueArrayIntImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueArrayInt()
	 * @generated
	 */
	int VALUE_ARRAY_INT = 21;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ARRAY_INT__VALUES = VALUE_ARRAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Array Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ARRAY_INT_FEATURE_COUNT = VALUE_ARRAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Array Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ARRAY_INT_OPERATION_COUNT = VALUE_ARRAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueArrayDoubleImpl <em>Value Array Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueArrayDoubleImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueArrayDouble()
	 * @generated
	 */
	int VALUE_ARRAY_DOUBLE = 22;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ARRAY_DOUBLE__VALUES = VALUE_ARRAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Array Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ARRAY_DOUBLE_FEATURE_COUNT = VALUE_ARRAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Array Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ARRAY_DOUBLE_OPERATION_COUNT = VALUE_ARRAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.MultiplicityImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 23;

	/**
	 * The number of structural features of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ParameterImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ParametricImpl <em>Parametric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ParametricImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getParametric()
	 * @generated
	 */
	int PARAMETRIC = 25;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC__REF = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parametric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parametric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ParambindingImpl <em>Parambinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ParambindingImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getParambinding()
	 * @generated
	 */
	int PARAMBINDING = 26;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMBINDING__REF = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMBINDING__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Parambinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMBINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parambinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMBINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.AssignmentImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 27;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.MetricImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 28;

	/**
	 * The feature id for the '<em><b>Min Working Obs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__MIN_WORKING_OBS = 0;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESCR = 1;

	/**
	 * The feature id for the '<em><b>Obs Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__OBS_POINTS = 2;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.AvailabilityImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 29;

	/**
	 * The feature id for the '<em><b>Min Working Obs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__MIN_WORKING_OBS = METRIC__MIN_WORKING_OBS;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__DESCR = METRIC__DESCR;

	/**
	 * The feature id for the '<em><b>Obs Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__OBS_POINTS = METRIC__OBS_POINTS;

	/**
	 * The feature id for the '<em><b>Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__CALCULATION = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ReliabilityImpl <em>Reliability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.ReliabilityImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getReliability()
	 * @generated
	 */
	int RELIABILITY = 30;

	/**
	 * The feature id for the '<em><b>Min Working Obs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__MIN_WORKING_OBS = METRIC__MIN_WORKING_OBS;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__DESCR = METRIC__DESCR;

	/**
	 * The feature id for the '<em><b>Obs Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__OBS_POINTS = METRIC__OBS_POINTS;

	/**
	 * The feature id for the '<em><b>Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__CALCULATION = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.MeanTimeToFailureImpl <em>Mean Time To Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.MeanTimeToFailureImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getMeanTimeToFailure()
	 * @generated
	 */
	int MEAN_TIME_TO_FAILURE = 31;

	/**
	 * The feature id for the '<em><b>Min Working Obs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_TIME_TO_FAILURE__MIN_WORKING_OBS = METRIC__MIN_WORKING_OBS;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_TIME_TO_FAILURE__DESCR = METRIC__DESCR;

	/**
	 * The feature id for the '<em><b>Obs Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_TIME_TO_FAILURE__OBS_POINTS = METRIC__OBS_POINTS;

	/**
	 * The feature id for the '<em><b>Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_TIME_TO_FAILURE__CALCULATION = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mean Time To Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_TIME_TO_FAILURE_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mean Time To Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAN_TIME_TO_FAILURE_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.impl.StateMetavariableImpl <em>State Metavariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.impl.StateMetavariableImpl
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getStateMetavariable()
	 * @generated
	 */
	int STATE_METAVARIABLE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_METAVARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_METAVARIABLE__LABELS = 1;

	/**
	 * The feature id for the '<em><b>Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_METAVARIABLE__MULT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_METAVARIABLE__PARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>State Metavariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_METAVARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State Metavariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_METAVARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.AvailabilityCalc <em>Availability Calc</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.AvailabilityCalc
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getAvailabilityCalc()
	 * @generated
	 */
	int AVAILABILITY_CALC = 33;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.ReliabilityCalc <em>Reliability Calc</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.ReliabilityCalc
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getReliabilityCalc()
	 * @generated
	 */
	int RELIABILITY_CALC = 34;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc <em>Mean Time To Failure Calc</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc
	 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getMeanTimeToFailureCalc()
	 * @generated
	 */
	int MEAN_TIME_TO_FAILURE_CALC = 35;


	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.TMDLSpecification <em>TMDL Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMDL Specification</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TMDLSpecification
	 * @generated
	 */
	EClass getTMDLSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.TMDLSpecification#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TMDLSpecification#getLibrary()
	 * @see #getTMDLSpecification()
	 * @generated
	 */
	EReference getTMDLSpecification_Library();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.TMDLSpecification#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TMDLSpecification#getScenario()
	 * @see #getTMDLSpecification()
	 * @generated
	 */
	EReference getTMDLSpecification_Scenario();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.Library#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Library#getTemplates()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Templates();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.Library#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Library#getInterfaces()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Interfaces();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.Scenario#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Scenario#getVariants()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Variants();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.Scenario#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Scenario#getRoot()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Root();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification <em>Template Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Specification</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateSpecification
	 * @generated
	 */
	EClass getTemplateSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getParameters()
	 * @see #getTemplateSpecification()
	 * @generated
	 */
	EReference getTemplateSpecification_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getName()
	 * @see #getTemplateSpecification()
	 * @generated
	 */
	EAttribute getTemplateSpecification_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getLabels()
	 * @see #getTemplateSpecification()
	 * @generated
	 */
	EAttribute getTemplateSpecification_Labels();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metrics</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getMetrics()
	 * @see #getTemplateSpecification()
	 * @generated
	 */
	EReference getTemplateSpecification_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getInterfaces()
	 * @see #getTemplateSpecification()
	 * @generated
	 */
	EReference getTemplateSpecification_Interfaces();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.TemplateAtomic <em>Template Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Atomic</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateAtomic
	 * @generated
	 */
	EClass getTemplateAtomic();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.TemplateAtomic#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateAtomic#getSource()
	 * @see #getTemplateAtomic()
	 * @generated
	 */
	EAttribute getTemplateAtomic_Source();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.TemplateComposite <em>Template Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Composite</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateComposite
	 * @generated
	 */
	EClass getTemplateComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.TemplateComposite#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateComposite#getRules()
	 * @see #getTemplateComposite()
	 * @generated
	 */
	EReference getTemplateComposite_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.TemplateComposite#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bind</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateComposite#getBind()
	 * @see #getTemplateComposite()
	 * @generated
	 */
	EReference getTemplateComposite_Bind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.TemplateComposite#getSubmodules <em>Submodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodules</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateComposite#getSubmodules()
	 * @see #getTemplateComposite()
	 * @generated
	 */
	EReference getTemplateComposite_Submodules();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Block#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Block#getName()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Name();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.Block#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Block#getRef()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.Block#getMult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mult</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Block#getMult()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Mult();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.Block#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Block#getLabels()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Labels();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.Block#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Block#getInterfaces()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Interfaces();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Variant
	 * @generated
	 */
	EClass getVariant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.Variant#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Variant#getAssignments()
	 * @see #getVariant()
	 * @generated
	 */
	EReference getVariant_Assignments();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Variant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Variant#getName()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_Name();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.Variant#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Variant#getTemplate()
	 * @see #getVariant()
	 * @generated
	 */
	EReference getVariant_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.Variant#getRealizations <em>Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizations</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Variant#getRealizations()
	 * @see #getVariant()
	 * @generated
	 */
	EReference getVariant_Realizations();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.BlockRealization <em>Block Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Realization</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.BlockRealization
	 * @generated
	 */
	EClass getBlockRealization();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.BlockRealization#getRef()
	 * @see #getBlockRealization()
	 * @generated
	 */
	EReference getBlockRealization_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getMult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mult</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.BlockRealization#getMult()
	 * @see #getBlockRealization()
	 * @generated
	 */
	EReference getBlockRealization_Mult();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.BlockRealization#getBlock()
	 * @see #getBlockRealization()
	 * @generated
	 */
	EReference getBlockRealization_Block();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.ModelInterface <em>Model Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Interface</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterface
	 * @generated
	 */
	EClass getModelInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.ModelInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterface#getName()
	 * @see #getModelInterface()
	 * @generated
	 */
	EAttribute getModelInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.ModelInterface#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterface#getVariables()
	 * @see #getModelInterface()
	 * @generated
	 */
	EReference getModelInterface_Variables();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.ModelInterfSimple <em>Model Interf Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Interf Simple</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterfSimple
	 * @generated
	 */
	EClass getModelInterfSimple();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.ModelInterfArray <em>Model Interf Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Interf Array</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterfArray
	 * @generated
	 */
	EClass getModelInterfArray();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.ModelInterfArray#getMult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mult</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterfArray#getMult()
	 * @see #getModelInterfArray()
	 * @generated
	 */
	EReference getModelInterfArray_Mult();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.ModelInterfArray#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterfArray#getLabels()
	 * @see #getModelInterfArray()
	 * @generated
	 */
	EAttribute getModelInterfArray_Labels();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.CompositionRule <em>Composition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Rule</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRule
	 * @generated
	 */
	EClass getCompositionRule();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.CompositionRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRule#getName()
	 * @see #getCompositionRule()
	 * @generated
	 */
	EAttribute getCompositionRule_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.CompositionRule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRule#getVariables()
	 * @see #getCompositionRule()
	 * @generated
	 */
	EReference getCompositionRule_Variables();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards <em>Composition Rule Forwards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Rule Forwards</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards
	 * @generated
	 */
	EClass getCompositionRuleForwards();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards#getRef()
	 * @see #getCompositionRuleForwards()
	 * @generated
	 */
	EReference getCompositionRuleForwards_Ref();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleAll <em>Composition Rule All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Rule All</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleAll
	 * @generated
	 */
	EClass getCompositionRuleAll();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleAll#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleAll#getRef()
	 * @see #getCompositionRuleAll()
	 * @generated
	 */
	EReference getCompositionRuleAll_Ref();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch <em>Composition Rule Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Rule Match</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch
	 * @generated
	 */
	EClass getCompositionRuleMatch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch#getRef()
	 * @see #getCompositionRuleMatch()
	 * @generated
	 */
	EReference getCompositionRuleMatch_Ref();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch#getLabels()
	 * @see #getCompositionRuleMatch()
	 * @generated
	 */
	EAttribute getCompositionRuleMatch_Labels();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.CompItem <em>Comp Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Item</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompItem
	 * @generated
	 */
	EClass getCompItem();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.CompItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompItem#getItem()
	 * @see #getCompItem()
	 * @generated
	 */
	EReference getCompItem_Item();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.CompItem#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompItem#getBlock()
	 * @see #getCompItem()
	 * @generated
	 */
	EReference getCompItem_Block();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.CompItem#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ids</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.CompItem#getIds()
	 * @see #getCompItem()
	 * @generated
	 */
	EReference getCompItem_Ids();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.ValueInt <em>Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Int</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueInt
	 * @generated
	 */
	EClass getValueInt();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.ValueInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueInt#getValue()
	 * @see #getValueInt()
	 * @generated
	 */
	EAttribute getValueInt_Value();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.ValueDouble <em>Value Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Double</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueDouble
	 * @generated
	 */
	EClass getValueDouble();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.ValueDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueDouble#getValue()
	 * @see #getValueDouble()
	 * @generated
	 */
	EAttribute getValueDouble_Value();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.ValueArray <em>Value Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Array</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueArray
	 * @generated
	 */
	EClass getValueArray();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.ValueArrayInt <em>Value Array Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Array Int</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueArrayInt
	 * @generated
	 */
	EClass getValueArrayInt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.ValueArrayInt#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueArrayInt#getValues()
	 * @see #getValueArrayInt()
	 * @generated
	 */
	EReference getValueArrayInt_Values();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.ValueArrayDouble <em>Value Array Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Array Double</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueArrayDouble
	 * @generated
	 */
	EClass getValueArrayDouble();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.ValueArrayDouble#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueArrayDouble#getValues()
	 * @see #getValueArrayDouble()
	 * @generated
	 */
	EReference getValueArrayDouble_Values();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Default();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Parametric <em>Parametric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametric</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Parametric
	 * @generated
	 */
	EClass getParametric();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.Parametric#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Parametric#getRef()
	 * @see #getParametric()
	 * @generated
	 */
	EReference getParametric_Ref();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Parambinding <em>Parambinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parambinding</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Parambinding
	 * @generated
	 */
	EClass getParambinding();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.Parambinding#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Parambinding#getRef()
	 * @see #getParambinding()
	 * @generated
	 */
	EReference getParambinding_Ref();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.Parambinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Parambinding#getSource()
	 * @see #getParambinding()
	 * @generated
	 */
	EReference getParambinding_Source();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.Assignment#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Assignment#getRef()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Metric#getMinWorkingObs <em>Min Working Obs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Working Obs</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Metric#getMinWorkingObs()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_MinWorkingObs();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Metric#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descr</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Metric#getDescr()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Descr();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.Metric#getObsPoints <em>Obs Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Obs Points</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Metric#getObsPoints()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_ObsPoints();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Availability#getCalculation <em>Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculation</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Availability#getCalculation()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Calculation();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Reliability
	 * @generated
	 */
	EClass getReliability();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.Reliability#getCalculation <em>Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculation</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.Reliability#getCalculation()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Calculation();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure <em>Mean Time To Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mean Time To Failure</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure
	 * @generated
	 */
	EClass getMeanTimeToFailure();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure#getCalculation <em>Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculation</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure#getCalculation()
	 * @see #getMeanTimeToFailure()
	 * @generated
	 */
	EAttribute getMeanTimeToFailure_Calculation();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable <em>State Metavariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Metavariable</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.StateMetavariable
	 * @generated
	 */
	EClass getStateMetavariable();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.StateMetavariable#getName()
	 * @see #getStateMetavariable()
	 * @generated
	 */
	EAttribute getStateMetavariable_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.StateMetavariable#getLabels()
	 * @see #getStateMetavariable()
	 * @generated
	 */
	EAttribute getStateMetavariable_Labels();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getMult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mult</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.StateMetavariable#getMult()
	 * @see #getStateMetavariable()
	 * @generated
	 */
	EReference getStateMetavariable_Mult();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.StateMetavariable#getParameters()
	 * @see #getStateMetavariable()
	 * @generated
	 */
	EReference getStateMetavariable_Parameters();

	/**
	 * Returns the meta object for enum '{@link org.modelspartiti.infrastructure.tmdl.AvailabilityCalc <em>Availability Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Availability Calc</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.AvailabilityCalc
	 * @generated
	 */
	EEnum getAvailabilityCalc();

	/**
	 * Returns the meta object for enum '{@link org.modelspartiti.infrastructure.tmdl.ReliabilityCalc <em>Reliability Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Calc</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.ReliabilityCalc
	 * @generated
	 */
	EEnum getReliabilityCalc();

	/**
	 * Returns the meta object for enum '{@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc <em>Mean Time To Failure Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mean Time To Failure Calc</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc
	 * @generated
	 */
	EEnum getMeanTimeToFailureCalc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tmdlFactory gettmdlFactory();

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
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.TMDLSpecificationImpl <em>TMDL Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.TMDLSpecificationImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getTMDLSpecification()
		 * @generated
		 */
		EClass TMDL_SPECIFICATION = eINSTANCE.getTMDLSpecification();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMDL_SPECIFICATION__LIBRARY = eINSTANCE.getTMDLSpecification_Library();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMDL_SPECIFICATION__SCENARIO = eINSTANCE.getTMDLSpecification_Scenario();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.LibraryImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__TEMPLATES = eINSTANCE.getLibrary_Templates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__INTERFACES = eINSTANCE.getLibrary_Interfaces();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ScenarioImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__VARIANTS = eINSTANCE.getScenario_Variants();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ROOT = eINSTANCE.getScenario_Root();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl <em>Template Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getTemplateSpecification()
		 * @generated
		 */
		EClass TEMPLATE_SPECIFICATION = eINSTANCE.getTemplateSpecification();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SPECIFICATION__PARAMETERS = eINSTANCE.getTemplateSpecification_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_SPECIFICATION__NAME = eINSTANCE.getTemplateSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_SPECIFICATION__LABELS = eINSTANCE.getTemplateSpecification_Labels();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SPECIFICATION__METRICS = eINSTANCE.getTemplateSpecification_Metrics();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SPECIFICATION__INTERFACES = eINSTANCE.getTemplateSpecification_Interfaces();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateAtomicImpl <em>Template Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.TemplateAtomicImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getTemplateAtomic()
		 * @generated
		 */
		EClass TEMPLATE_ATOMIC = eINSTANCE.getTemplateAtomic();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_ATOMIC__SOURCE = eINSTANCE.getTemplateAtomic_Source();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateCompositeImpl <em>Template Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.TemplateCompositeImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getTemplateComposite()
		 * @generated
		 */
		EClass TEMPLATE_COMPOSITE = eINSTANCE.getTemplateComposite();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_COMPOSITE__RULES = eINSTANCE.getTemplateComposite_Rules();

		/**
		 * The meta object literal for the '<em><b>Bind</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_COMPOSITE__BIND = eINSTANCE.getTemplateComposite_Bind();

		/**
		 * The meta object literal for the '<em><b>Submodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_COMPOSITE__SUBMODULES = eINSTANCE.getTemplateComposite_Submodules();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.BlockImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__REF = eINSTANCE.getBlock_Ref();

		/**
		 * The meta object literal for the '<em><b>Mult</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__MULT = eINSTANCE.getBlock_Mult();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__LABELS = eINSTANCE.getBlock_Labels();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INTERFACES = eINSTANCE.getBlock_Interfaces();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.VariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.VariantImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getVariant()
		 * @generated
		 */
		EClass VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT__ASSIGNMENTS = eINSTANCE.getVariant_Assignments();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__NAME = eINSTANCE.getVariant_Name();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT__TEMPLATE = eINSTANCE.getVariant_Template();

		/**
		 * The meta object literal for the '<em><b>Realizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT__REALIZATIONS = eINSTANCE.getVariant_Realizations();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.BlockRealizationImpl <em>Block Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.BlockRealizationImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getBlockRealization()
		 * @generated
		 */
		EClass BLOCK_REALIZATION = eINSTANCE.getBlockRealization();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_REALIZATION__REF = eINSTANCE.getBlockRealization_Ref();

		/**
		 * The meta object literal for the '<em><b>Mult</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_REALIZATION__MULT = eINSTANCE.getBlockRealization_Mult();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_REALIZATION__BLOCK = eINSTANCE.getBlockRealization_Block();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ModelInterfaceImpl <em>Model Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ModelInterfaceImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getModelInterface()
		 * @generated
		 */
		EClass MODEL_INTERFACE = eINSTANCE.getModelInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_INTERFACE__NAME = eINSTANCE.getModelInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_INTERFACE__VARIABLES = eINSTANCE.getModelInterface_Variables();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ModelInterfSimpleImpl <em>Model Interf Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ModelInterfSimpleImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getModelInterfSimple()
		 * @generated
		 */
		EClass MODEL_INTERF_SIMPLE = eINSTANCE.getModelInterfSimple();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ModelInterfArrayImpl <em>Model Interf Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ModelInterfArrayImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getModelInterfArray()
		 * @generated
		 */
		EClass MODEL_INTERF_ARRAY = eINSTANCE.getModelInterfArray();

		/**
		 * The meta object literal for the '<em><b>Mult</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_INTERF_ARRAY__MULT = eINSTANCE.getModelInterfArray_Mult();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_INTERF_ARRAY__LABELS = eINSTANCE.getModelInterfArray_Labels();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleImpl <em>Composition Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompositionRule()
		 * @generated
		 */
		EClass COMPOSITION_RULE = eINSTANCE.getCompositionRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION_RULE__NAME = eINSTANCE.getCompositionRule_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_RULE__VARIABLES = eINSTANCE.getCompositionRule_Variables();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleForwardsImpl <em>Composition Rule Forwards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleForwardsImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompositionRuleForwards()
		 * @generated
		 */
		EClass COMPOSITION_RULE_FORWARDS = eINSTANCE.getCompositionRuleForwards();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_RULE_FORWARDS__REF = eINSTANCE.getCompositionRuleForwards_Ref();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleAllImpl <em>Composition Rule All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleAllImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompositionRuleAll()
		 * @generated
		 */
		EClass COMPOSITION_RULE_ALL = eINSTANCE.getCompositionRuleAll();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_RULE_ALL__REF = eINSTANCE.getCompositionRuleAll_Ref();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleMatchImpl <em>Composition Rule Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.CompositionRuleMatchImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompositionRuleMatch()
		 * @generated
		 */
		EClass COMPOSITION_RULE_MATCH = eINSTANCE.getCompositionRuleMatch();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_RULE_MATCH__REF = eINSTANCE.getCompositionRuleMatch_Ref();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION_RULE_MATCH__LABELS = eINSTANCE.getCompositionRuleMatch_Labels();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.CompItemImpl <em>Comp Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.CompItemImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getCompItem()
		 * @generated
		 */
		EClass COMP_ITEM = eINSTANCE.getCompItem();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_ITEM__ITEM = eINSTANCE.getCompItem_Item();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_ITEM__BLOCK = eINSTANCE.getCompItem_Block();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_ITEM__IDS = eINSTANCE.getCompItem_Ids();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueIntImpl <em>Value Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueIntImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueInt()
		 * @generated
		 */
		EClass VALUE_INT = eINSTANCE.getValueInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_INT__VALUE = eINSTANCE.getValueInt_Value();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueDoubleImpl <em>Value Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueDoubleImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueDouble()
		 * @generated
		 */
		EClass VALUE_DOUBLE = eINSTANCE.getValueDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_DOUBLE__VALUE = eINSTANCE.getValueDouble_Value();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueArrayImpl <em>Value Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueArrayImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueArray()
		 * @generated
		 */
		EClass VALUE_ARRAY = eINSTANCE.getValueArray();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueArrayIntImpl <em>Value Array Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueArrayIntImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueArrayInt()
		 * @generated
		 */
		EClass VALUE_ARRAY_INT = eINSTANCE.getValueArrayInt();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ARRAY_INT__VALUES = eINSTANCE.getValueArrayInt_Values();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ValueArrayDoubleImpl <em>Value Array Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ValueArrayDoubleImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getValueArrayDouble()
		 * @generated
		 */
		EClass VALUE_ARRAY_DOUBLE = eINSTANCE.getValueArrayDouble();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ARRAY_DOUBLE__VALUES = eINSTANCE.getValueArrayDouble_Values();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.MultiplicityImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ParameterImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ParametricImpl <em>Parametric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ParametricImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getParametric()
		 * @generated
		 */
		EClass PARAMETRIC = eINSTANCE.getParametric();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC__REF = eINSTANCE.getParametric_Ref();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ParambindingImpl <em>Parambinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ParambindingImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getParambinding()
		 * @generated
		 */
		EClass PARAMBINDING = eINSTANCE.getParambinding();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMBINDING__REF = eINSTANCE.getParambinding_Ref();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMBINDING__SOURCE = eINSTANCE.getParambinding_Source();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.AssignmentImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__REF = eINSTANCE.getAssignment_Ref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.MetricImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Min Working Obs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__MIN_WORKING_OBS = eINSTANCE.getMetric_MinWorkingObs();

		/**
		 * The meta object literal for the '<em><b>Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESCR = eINSTANCE.getMetric_Descr();

		/**
		 * The meta object literal for the '<em><b>Obs Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__OBS_POINTS = eINSTANCE.getMetric_ObsPoints();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.AvailabilityImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getAvailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getAvailability();

		/**
		 * The meta object literal for the '<em><b>Calculation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__CALCULATION = eINSTANCE.getAvailability_Calculation();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.ReliabilityImpl <em>Reliability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.ReliabilityImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getReliability()
		 * @generated
		 */
		EClass RELIABILITY = eINSTANCE.getReliability();

		/**
		 * The meta object literal for the '<em><b>Calculation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__CALCULATION = eINSTANCE.getReliability_Calculation();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.MeanTimeToFailureImpl <em>Mean Time To Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.MeanTimeToFailureImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getMeanTimeToFailure()
		 * @generated
		 */
		EClass MEAN_TIME_TO_FAILURE = eINSTANCE.getMeanTimeToFailure();

		/**
		 * The meta object literal for the '<em><b>Calculation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAN_TIME_TO_FAILURE__CALCULATION = eINSTANCE.getMeanTimeToFailure_Calculation();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.impl.StateMetavariableImpl <em>State Metavariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.impl.StateMetavariableImpl
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getStateMetavariable()
		 * @generated
		 */
		EClass STATE_METAVARIABLE = eINSTANCE.getStateMetavariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_METAVARIABLE__NAME = eINSTANCE.getStateMetavariable_Name();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_METAVARIABLE__LABELS = eINSTANCE.getStateMetavariable_Labels();

		/**
		 * The meta object literal for the '<em><b>Mult</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_METAVARIABLE__MULT = eINSTANCE.getStateMetavariable_Mult();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_METAVARIABLE__PARAMETERS = eINSTANCE.getStateMetavariable_Parameters();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.AvailabilityCalc <em>Availability Calc</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.AvailabilityCalc
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getAvailabilityCalc()
		 * @generated
		 */
		EEnum AVAILABILITY_CALC = eINSTANCE.getAvailabilityCalc();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.ReliabilityCalc <em>Reliability Calc</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.ReliabilityCalc
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getReliabilityCalc()
		 * @generated
		 */
		EEnum RELIABILITY_CALC = eINSTANCE.getReliabilityCalc();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc <em>Mean Time To Failure Calc</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc
		 * @see org.modelspartiti.infrastructure.tmdl.impl.tmdlPackageImpl#getMeanTimeToFailureCalc()
		 * @generated
		 */
		EEnum MEAN_TIME_TO_FAILURE_CALC = eINSTANCE.getMeanTimeToFailureCalc();

	}

} //tmdlPackage
