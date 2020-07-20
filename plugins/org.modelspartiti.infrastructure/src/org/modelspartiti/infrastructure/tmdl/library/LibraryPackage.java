/**
 */
package org.modelspartiti.infrastructure.tmdl.library;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/infrastructure/tmdl/library";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryPackage eINSTANCE = org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TEMPLATES = 2;

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
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.ModelInterfaceImpl <em>Model Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.ModelInterfaceImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getModelInterface()
	 * @generated
	 */
	int MODEL_INTERFACE = 1;

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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERFACE__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Model Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.TemplateSpecificationImpl <em>Template Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.TemplateSpecificationImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getTemplateSpecification()
	 * @generated
	 */
	int TEMPLATE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION__INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Template Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Template Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.TemplateAtomicImpl <em>Template Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.TemplateAtomicImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getTemplateAtomic()
	 * @generated
	 */
	int TEMPLATE_ATOMIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__NAME = TEMPLATE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__INTERFACES = TEMPLATE_SPECIFICATION__INTERFACES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__PARAMETERS = TEMPLATE_SPECIFICATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__SOURCE = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC__LABELS = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC_FEATURE_COUNT = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ATOMIC_OPERATION_COUNT = TEMPLATE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.TemplateCompositeImpl <em>Template Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.TemplateCompositeImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getTemplateComposite()
	 * @generated
	 */
	int TEMPLATE_COMPOSITE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__NAME = TEMPLATE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__INTERFACES = TEMPLATE_SPECIFICATION__INTERFACES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__PARAMETERS = TEMPLATE_SPECIFICATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__RULES = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE__BLOCKS = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE_FEATURE_COUNT = TEMPLATE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_COMPOSITE_OPERATION_COUNT = TEMPLATE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.BlockImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__LABELS = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MULTIPLICITY = 1;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REQUIRED_INTERFACES = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.InterfaceVariableImpl <em>Interface Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.InterfaceVariableImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getInterfaceVariable()
	 * @generated
	 */
	int INTERFACE_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VARIABLE__LABELS = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VARIABLE__MULTIPLICITY = 2;

	/**
	 * The number of structural features of the '<em>Interface Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleImpl <em>Composition Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getCompositionRule()
	 * @generated
	 */
	int COMPOSITION_RULE = 7;

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
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleAllImpl <em>Composition Rule All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleAllImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getCompositionRuleAll()
	 * @generated
	 */
	int COMPOSITION_RULE_ALL = 8;

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
	 * The number of structural features of the '<em>Composition Rule All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_ALL_FEATURE_COUNT = COMPOSITION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition Rule All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_ALL_OPERATION_COUNT = COMPOSITION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleMatchImpl <em>Composition Rule Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleMatchImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getCompositionRuleMatch()
	 * @generated
	 */
	int COMPOSITION_RULE_MATCH = 9;

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
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH__LABELS = COMPOSITION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition Rule Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH_FEATURE_COUNT = COMPOSITION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition Rule Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_MATCH_OPERATION_COUNT = COMPOSITION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleForwardsImpl <em>Composition Rule Forwards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleForwardsImpl
	 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getCompositionRuleForwards()
	 * @generated
	 */
	int COMPOSITION_RULE_FORWARDS = 10;

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
	 * The number of structural features of the '<em>Composition Rule Forwards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_FORWARDS_FEATURE_COUNT = COMPOSITION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition Rule Forwards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RULE_FORWARDS_OPERATION_COUNT = COMPOSITION_RULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.library.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.library.Library#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.Library#getInterfaces()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.library.Library#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.Library#getTemplates()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Templates();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.ModelInterface <em>Model Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Interface</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.ModelInterface
	 * @generated
	 */
	EClass getModelInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.library.ModelInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.ModelInterface#getName()
	 * @see #getModelInterface()
	 * @generated
	 */
	EAttribute getModelInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.library.ModelInterface#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.ModelInterface#getVariables()
	 * @see #getModelInterface()
	 * @generated
	 */
	EReference getModelInterface_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.library.ModelInterface#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.ModelInterface#getParameters()
	 * @see #getModelInterface()
	 * @generated
	 */
	EReference getModelInterface_Parameters();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification <em>Template Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Specification</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification
	 * @generated
	 */
	EClass getTemplateSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getName()
	 * @see #getTemplateSpecification()
	 * @generated
	 */
	EAttribute getTemplateSpecification_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getInterfaces()
	 * @see #getTemplateSpecification()
	 * @generated
	 */
	EReference getTemplateSpecification_Interfaces();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameters</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getParameters()
	 * @see #getTemplateSpecification()
	 * @generated
	 */
	EReference getTemplateSpecification_Parameters();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateAtomic <em>Template Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Atomic</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateAtomic
	 * @generated
	 */
	EClass getTemplateAtomic();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateAtomic#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateAtomic#getSource()
	 * @see #getTemplateAtomic()
	 * @generated
	 */
	EAttribute getTemplateAtomic_Source();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateAtomic#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateAtomic#getLabels()
	 * @see #getTemplateAtomic()
	 * @generated
	 */
	EAttribute getTemplateAtomic_Labels();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateComposite <em>Template Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Composite</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateComposite
	 * @generated
	 */
	EClass getTemplateComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateComposite#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateComposite#getRules()
	 * @see #getTemplateComposite()
	 * @generated
	 */
	EReference getTemplateComposite_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateComposite#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.TemplateComposite#getBlocks()
	 * @see #getTemplateComposite()
	 * @generated
	 */
	EReference getTemplateComposite_Blocks();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.library.Block#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.Block#getLabels()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Labels();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.library.Block#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.Block#getMultiplicity()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Multiplicity();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.library.Block#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Interfaces</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.Block#getRequiredInterfaces()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_RequiredInterfaces();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.InterfaceVariable <em>Interface Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Variable</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.InterfaceVariable
	 * @generated
	 */
	EClass getInterfaceVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.library.InterfaceVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.InterfaceVariable#getName()
	 * @see #getInterfaceVariable()
	 * @generated
	 */
	EAttribute getInterfaceVariable_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.library.InterfaceVariable#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.InterfaceVariable#getLabels()
	 * @see #getInterfaceVariable()
	 * @generated
	 */
	EAttribute getInterfaceVariable_Labels();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.library.InterfaceVariable#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.InterfaceVariable#getMultiplicity()
	 * @see #getInterfaceVariable()
	 * @generated
	 */
	EReference getInterfaceVariable_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.CompositionRule <em>Composition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Rule</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.CompositionRule
	 * @generated
	 */
	EClass getCompositionRule();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.library.CompositionRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.CompositionRule#getName()
	 * @see #getCompositionRule()
	 * @generated
	 */
	EAttribute getCompositionRule_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.modelspartiti.infrastructure.tmdl.library.CompositionRule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.CompositionRule#getVariables()
	 * @see #getCompositionRule()
	 * @generated
	 */
	EReference getCompositionRule_Variables();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.CompositionRuleAll <em>Composition Rule All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Rule All</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.CompositionRuleAll
	 * @generated
	 */
	EClass getCompositionRuleAll();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.CompositionRuleMatch <em>Composition Rule Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Rule Match</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.CompositionRuleMatch
	 * @generated
	 */
	EClass getCompositionRuleMatch();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelspartiti.infrastructure.tmdl.library.CompositionRuleMatch#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.CompositionRuleMatch#getLabels()
	 * @see #getCompositionRuleMatch()
	 * @generated
	 */
	EAttribute getCompositionRuleMatch_Labels();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.library.CompositionRuleForwards <em>Composition Rule Forwards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Rule Forwards</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.library.CompositionRuleForwards
	 * @generated
	 */
	EClass getCompositionRuleForwards();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryFactory getLibraryFactory();

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
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__INTERFACES = eINSTANCE.getLibrary_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__TEMPLATES = eINSTANCE.getLibrary_Templates();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.ModelInterfaceImpl <em>Model Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.ModelInterfaceImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getModelInterface()
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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_INTERFACE__PARAMETERS = eINSTANCE.getModelInterface_Parameters();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.TemplateSpecificationImpl <em>Template Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.TemplateSpecificationImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getTemplateSpecification()
		 * @generated
		 */
		EClass TEMPLATE_SPECIFICATION = eINSTANCE.getTemplateSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_SPECIFICATION__NAME = eINSTANCE.getTemplateSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SPECIFICATION__INTERFACES = eINSTANCE.getTemplateSpecification_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SPECIFICATION__PARAMETERS = eINSTANCE.getTemplateSpecification_Parameters();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.TemplateAtomicImpl <em>Template Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.TemplateAtomicImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getTemplateAtomic()
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
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_ATOMIC__LABELS = eINSTANCE.getTemplateAtomic_Labels();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.TemplateCompositeImpl <em>Template Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.TemplateCompositeImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getTemplateComposite()
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
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_COMPOSITE__BLOCKS = eINSTANCE.getTemplateComposite_Blocks();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.BlockImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__LABELS = eINSTANCE.getBlock_Labels();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__MULTIPLICITY = eINSTANCE.getBlock_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__REQUIRED_INTERFACES = eINSTANCE.getBlock_RequiredInterfaces();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.InterfaceVariableImpl <em>Interface Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.InterfaceVariableImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getInterfaceVariable()
		 * @generated
		 */
		EClass INTERFACE_VARIABLE = eINSTANCE.getInterfaceVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VARIABLE__NAME = eINSTANCE.getInterfaceVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VARIABLE__LABELS = eINSTANCE.getInterfaceVariable_Labels();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_VARIABLE__MULTIPLICITY = eINSTANCE.getInterfaceVariable_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleImpl <em>Composition Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getCompositionRule()
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
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleAllImpl <em>Composition Rule All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleAllImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getCompositionRuleAll()
		 * @generated
		 */
		EClass COMPOSITION_RULE_ALL = eINSTANCE.getCompositionRuleAll();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleMatchImpl <em>Composition Rule Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleMatchImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getCompositionRuleMatch()
		 * @generated
		 */
		EClass COMPOSITION_RULE_MATCH = eINSTANCE.getCompositionRuleMatch();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION_RULE_MATCH__LABELS = eINSTANCE.getCompositionRuleMatch_Labels();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleForwardsImpl <em>Composition Rule Forwards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.CompositionRuleForwardsImpl
		 * @see org.modelspartiti.infrastructure.tmdl.library.impl.LibraryPackageImpl#getCompositionRuleForwards()
		 * @generated
		 */
		EClass COMPOSITION_RULE_FORWARDS = eINSTANCE.getCompositionRuleForwards();

	}

} //LibraryPackage
