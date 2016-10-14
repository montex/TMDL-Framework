/**
 */
package tmdl.scenario;

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
 * @see tmdl.scenario.ScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface ScenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/infrastructure/tmdl/scenario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioPackage eINSTANCE = tmdl.scenario.impl.ScenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link tmdl.scenario.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.scenario.impl.ScenarioImpl
	 * @see tmdl.scenario.impl.ScenarioPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VARIANTS = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ROOT = 2;

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
	 * The meta object id for the '{@link tmdl.scenario.impl.VariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.scenario.impl.VariantImpl
	 * @see tmdl.scenario.impl.ScenarioPackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tmdl.scenario.impl.VariantAtomicImpl <em>Variant Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.scenario.impl.VariantAtomicImpl
	 * @see tmdl.scenario.impl.ScenarioPackageImpl#getVariantAtomic()
	 * @generated
	 */
	int VARIANT_ATOMIC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ATOMIC__NAME = VARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ATOMIC__ASSIGNMENTS = VARIANT__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ATOMIC__TEMPLATE = VARIANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ATOMIC__LABELS = VARIANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variant Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ATOMIC_FEATURE_COUNT = VARIANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variant Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ATOMIC_OPERATION_COUNT = VARIANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.scenario.impl.VariantCompositeImpl <em>Variant Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.scenario.impl.VariantCompositeImpl
	 * @see tmdl.scenario.impl.ScenarioPackageImpl#getVariantComposite()
	 * @generated
	 */
	int VARIANT_COMPOSITE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COMPOSITE__NAME = VARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COMPOSITE__ASSIGNMENTS = VARIANT__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COMPOSITE__TEMPLATE = VARIANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COMPOSITE__REALIZATIONS = VARIANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variant Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COMPOSITE_FEATURE_COUNT = VARIANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variant Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COMPOSITE_OPERATION_COUNT = VARIANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.scenario.impl.BlockRealizationImpl <em>Block Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.scenario.impl.BlockRealizationImpl
	 * @see tmdl.scenario.impl.ScenarioPackageImpl#getBlockRealization()
	 * @generated
	 */
	int BLOCK_REALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION__VARIANT = 1;

	/**
	 * The number of structural features of the '<em>Block Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Block Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REALIZATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tmdl.scenario.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see tmdl.scenario.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link tmdl.scenario.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tmdl.scenario.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tmdl.scenario.Scenario#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see tmdl.scenario.Scenario#getVariants()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Variants();

	/**
	 * Returns the meta object for the reference '{@link tmdl.scenario.Scenario#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see tmdl.scenario.Scenario#getRoot()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Root();

	/**
	 * Returns the meta object for class '{@link tmdl.scenario.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see tmdl.scenario.Variant
	 * @generated
	 */
	EClass getVariant();

	/**
	 * Returns the meta object for the attribute '{@link tmdl.scenario.Variant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tmdl.scenario.Variant#getName()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tmdl.scenario.Variant#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see tmdl.scenario.Variant#getAssignments()
	 * @see #getVariant()
	 * @generated
	 */
	EReference getVariant_Assignments();

	/**
	 * Returns the meta object for class '{@link tmdl.scenario.VariantAtomic <em>Variant Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Atomic</em>'.
	 * @see tmdl.scenario.VariantAtomic
	 * @generated
	 */
	EClass getVariantAtomic();

	/**
	 * Returns the meta object for the reference '{@link tmdl.scenario.VariantAtomic#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see tmdl.scenario.VariantAtomic#getTemplate()
	 * @see #getVariantAtomic()
	 * @generated
	 */
	EReference getVariantAtomic_Template();

	/**
	 * Returns the meta object for the attribute list '{@link tmdl.scenario.VariantAtomic#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see tmdl.scenario.VariantAtomic#getLabels()
	 * @see #getVariantAtomic()
	 * @generated
	 */
	EAttribute getVariantAtomic_Labels();

	/**
	 * Returns the meta object for class '{@link tmdl.scenario.VariantComposite <em>Variant Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Composite</em>'.
	 * @see tmdl.scenario.VariantComposite
	 * @generated
	 */
	EClass getVariantComposite();

	/**
	 * Returns the meta object for the reference '{@link tmdl.scenario.VariantComposite#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see tmdl.scenario.VariantComposite#getTemplate()
	 * @see #getVariantComposite()
	 * @generated
	 */
	EReference getVariantComposite_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link tmdl.scenario.VariantComposite#getRealizations <em>Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizations</em>'.
	 * @see tmdl.scenario.VariantComposite#getRealizations()
	 * @see #getVariantComposite()
	 * @generated
	 */
	EReference getVariantComposite_Realizations();

	/**
	 * Returns the meta object for class '{@link tmdl.scenario.BlockRealization <em>Block Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Realization</em>'.
	 * @see tmdl.scenario.BlockRealization
	 * @generated
	 */
	EClass getBlockRealization();

	/**
	 * Returns the meta object for the reference '{@link tmdl.scenario.BlockRealization#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see tmdl.scenario.BlockRealization#getBlock()
	 * @see #getBlockRealization()
	 * @generated
	 */
	EReference getBlockRealization_Block();

	/**
	 * Returns the meta object for the reference '{@link tmdl.scenario.BlockRealization#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variant</em>'.
	 * @see tmdl.scenario.BlockRealization#getVariant()
	 * @see #getBlockRealization()
	 * @generated
	 */
	EReference getBlockRealization_Variant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScenarioFactory getScenarioFactory();

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
		 * The meta object literal for the '{@link tmdl.scenario.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.scenario.impl.ScenarioImpl
		 * @see tmdl.scenario.impl.ScenarioPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

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
		 * The meta object literal for the '{@link tmdl.scenario.impl.VariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.scenario.impl.VariantImpl
		 * @see tmdl.scenario.impl.ScenarioPackageImpl#getVariant()
		 * @generated
		 */
		EClass VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__NAME = eINSTANCE.getVariant_Name();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT__ASSIGNMENTS = eINSTANCE.getVariant_Assignments();

		/**
		 * The meta object literal for the '{@link tmdl.scenario.impl.VariantAtomicImpl <em>Variant Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.scenario.impl.VariantAtomicImpl
		 * @see tmdl.scenario.impl.ScenarioPackageImpl#getVariantAtomic()
		 * @generated
		 */
		EClass VARIANT_ATOMIC = eINSTANCE.getVariantAtomic();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ATOMIC__TEMPLATE = eINSTANCE.getVariantAtomic_Template();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_ATOMIC__LABELS = eINSTANCE.getVariantAtomic_Labels();

		/**
		 * The meta object literal for the '{@link tmdl.scenario.impl.VariantCompositeImpl <em>Variant Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.scenario.impl.VariantCompositeImpl
		 * @see tmdl.scenario.impl.ScenarioPackageImpl#getVariantComposite()
		 * @generated
		 */
		EClass VARIANT_COMPOSITE = eINSTANCE.getVariantComposite();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_COMPOSITE__TEMPLATE = eINSTANCE.getVariantComposite_Template();

		/**
		 * The meta object literal for the '<em><b>Realizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_COMPOSITE__REALIZATIONS = eINSTANCE.getVariantComposite_Realizations();

		/**
		 * The meta object literal for the '{@link tmdl.scenario.impl.BlockRealizationImpl <em>Block Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.scenario.impl.BlockRealizationImpl
		 * @see tmdl.scenario.impl.ScenarioPackageImpl#getBlockRealization()
		 * @generated
		 */
		EClass BLOCK_REALIZATION = eINSTANCE.getBlockRealization();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_REALIZATION__BLOCK = eINSTANCE.getBlockRealization_Block();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_REALIZATION__VARIANT = eINSTANCE.getBlockRealization_Variant();

	}

} //ScenarioPackage
