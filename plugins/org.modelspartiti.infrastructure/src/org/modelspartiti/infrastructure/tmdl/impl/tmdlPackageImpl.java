/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelspartiti.infrastructure.tmdl.Assignment;
import org.modelspartiti.infrastructure.tmdl.Availability;
import org.modelspartiti.infrastructure.tmdl.AvailabilityCalc;
import org.modelspartiti.infrastructure.tmdl.Block;
import org.modelspartiti.infrastructure.tmdl.BlockRealization;
import org.modelspartiti.infrastructure.tmdl.CompItem;
import org.modelspartiti.infrastructure.tmdl.CompositionRule;
import org.modelspartiti.infrastructure.tmdl.CompositionRuleAll;
import org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards;
import org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch;
import org.modelspartiti.infrastructure.tmdl.Library;
import org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure;
import org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc;
import org.modelspartiti.infrastructure.tmdl.Metric;
import org.modelspartiti.infrastructure.tmdl.ModelInterfArray;
import org.modelspartiti.infrastructure.tmdl.ModelInterfSimple;
import org.modelspartiti.infrastructure.tmdl.ModelInterface;
import org.modelspartiti.infrastructure.tmdl.Multiplicity;
import org.modelspartiti.infrastructure.tmdl.Parambinding;
import org.modelspartiti.infrastructure.tmdl.Parameter;
import org.modelspartiti.infrastructure.tmdl.Parametric;
import org.modelspartiti.infrastructure.tmdl.Reliability;
import org.modelspartiti.infrastructure.tmdl.ReliabilityCalc;
import org.modelspartiti.infrastructure.tmdl.Scenario;
import org.modelspartiti.infrastructure.tmdl.StateMetavariable;
import org.modelspartiti.infrastructure.tmdl.TMDLSpecification;
import org.modelspartiti.infrastructure.tmdl.TemplateAtomic;
import org.modelspartiti.infrastructure.tmdl.TemplateComposite;
import org.modelspartiti.infrastructure.tmdl.TemplateSpecification;
import org.modelspartiti.infrastructure.tmdl.Value;
import org.modelspartiti.infrastructure.tmdl.ValueArray;
import org.modelspartiti.infrastructure.tmdl.ValueArrayDouble;
import org.modelspartiti.infrastructure.tmdl.ValueArrayInt;
import org.modelspartiti.infrastructure.tmdl.ValueDouble;
import org.modelspartiti.infrastructure.tmdl.ValueInt;
import org.modelspartiti.infrastructure.tmdl.Variant;
import org.modelspartiti.infrastructure.tmdl.tmdlFactory;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tmdlPackageImpl extends EPackageImpl implements tmdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmdlSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateCompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelInterfSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelInterfArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionRuleForwardsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionRuleAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionRuleMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueArrayIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueArrayDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parambindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meanTimeToFailureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMetavariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum availabilityCalcEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliabilityCalcEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum meanTimeToFailureCalcEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tmdlPackageImpl() {
		super(eNS_URI, tmdlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link tmdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tmdlPackage init() {
		if (isInited) return (tmdlPackage)EPackage.Registry.INSTANCE.getEPackage(tmdlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredtmdlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		tmdlPackageImpl thetmdlPackage = registeredtmdlPackage instanceof tmdlPackageImpl ? (tmdlPackageImpl)registeredtmdlPackage : new tmdlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thetmdlPackage.createPackageContents();

		// Initialize created meta-data
		thetmdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetmdlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tmdlPackage.eNS_URI, thetmdlPackage);
		return thetmdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMDLSpecification() {
		return tmdlSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMDLSpecification_Library() {
		return (EReference)tmdlSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMDLSpecification_Scenario() {
		return (EReference)tmdlSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLibrary_Templates() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_Name() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLibrary_Interfaces() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Variants() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Root() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_Name() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateSpecification() {
		return templateSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateSpecification_Parameters() {
		return (EReference)templateSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemplateSpecification_Name() {
		return (EAttribute)templateSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemplateSpecification_Labels() {
		return (EAttribute)templateSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateSpecification_Metrics() {
		return (EReference)templateSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateSpecification_Interfaces() {
		return (EReference)templateSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateAtomic() {
		return templateAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemplateAtomic_Source() {
		return (EAttribute)templateAtomicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateComposite() {
		return templateCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateComposite_Rules() {
		return (EReference)templateCompositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateComposite_Bind() {
		return (EReference)templateCompositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateComposite_Submodules() {
		return (EReference)templateCompositeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlock_Name() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Ref() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Mult() {
		return (EReference)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlock_Labels() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Interfaces() {
		return (EReference)blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariant() {
		return variantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariant_Assignments() {
		return (EReference)variantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariant_Name() {
		return (EAttribute)variantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariant_Template() {
		return (EReference)variantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariant_Realizations() {
		return (EReference)variantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockRealization() {
		return blockRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockRealization_Ref() {
		return (EReference)blockRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockRealization_Mult() {
		return (EReference)blockRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockRealization_Block() {
		return (EReference)blockRealizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelInterface() {
		return modelInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelInterface_Name() {
		return (EAttribute)modelInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelInterface_Variables() {
		return (EReference)modelInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelInterfSimple() {
		return modelInterfSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelInterfArray() {
		return modelInterfArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelInterfArray_Mult() {
		return (EReference)modelInterfArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelInterfArray_Labels() {
		return (EAttribute)modelInterfArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositionRule() {
		return compositionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositionRule_Name() {
		return (EAttribute)compositionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionRule_Variables() {
		return (EReference)compositionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositionRuleForwards() {
		return compositionRuleForwardsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionRuleForwards_Ref() {
		return (EReference)compositionRuleForwardsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositionRuleAll() {
		return compositionRuleAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionRuleAll_Ref() {
		return (EReference)compositionRuleAllEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositionRuleMatch() {
		return compositionRuleMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionRuleMatch_Ref() {
		return (EReference)compositionRuleMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositionRuleMatch_Labels() {
		return (EAttribute)compositionRuleMatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompItem() {
		return compItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompItem_Item() {
		return (EReference)compItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompItem_Block() {
		return (EReference)compItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompItem_Ids() {
		return (EReference)compItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueInt() {
		return valueIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueInt_Value() {
		return (EAttribute)valueIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueDouble() {
		return valueDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueDouble_Value() {
		return (EAttribute)valueDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueArray() {
		return valueArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueArrayInt() {
		return valueArrayIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueArrayInt_Values() {
		return (EReference)valueArrayIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueArrayDouble() {
		return valueArrayDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueArrayDouble_Values() {
		return (EReference)valueArrayDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicity() {
		return multiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Default() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParametric() {
		return parametricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParametric_Ref() {
		return (EReference)parametricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParambinding() {
		return parambindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParambinding_Ref() {
		return (EReference)parambindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParambinding_Source() {
		return (EReference)parambindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_Ref() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_Value() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetric_MinWorkingObs() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetric_Descr() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetric_ObsPoints() {
		return (EReference)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvailability() {
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAvailability_Calculation() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReliability() {
		return reliabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReliability_Calculation() {
		return (EAttribute)reliabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeanTimeToFailure() {
		return meanTimeToFailureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeanTimeToFailure_Calculation() {
		return (EAttribute)meanTimeToFailureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateMetavariable() {
		return stateMetavariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateMetavariable_Name() {
		return (EAttribute)stateMetavariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateMetavariable_Labels() {
		return (EAttribute)stateMetavariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateMetavariable_Mult() {
		return (EReference)stateMetavariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateMetavariable_Parameters() {
		return (EReference)stateMetavariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAvailabilityCalc() {
		return availabilityCalcEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReliabilityCalc() {
		return reliabilityCalcEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeanTimeToFailureCalc() {
		return meanTimeToFailureCalcEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tmdlFactory gettmdlFactory() {
		return (tmdlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tmdlSpecificationEClass = createEClass(TMDL_SPECIFICATION);
		createEReference(tmdlSpecificationEClass, TMDL_SPECIFICATION__LIBRARY);
		createEReference(tmdlSpecificationEClass, TMDL_SPECIFICATION__SCENARIO);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__TEMPLATES);
		createEAttribute(libraryEClass, LIBRARY__NAME);
		createEReference(libraryEClass, LIBRARY__INTERFACES);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__VARIANTS);
		createEReference(scenarioEClass, SCENARIO__ROOT);
		createEAttribute(scenarioEClass, SCENARIO__NAME);

		templateSpecificationEClass = createEClass(TEMPLATE_SPECIFICATION);
		createEReference(templateSpecificationEClass, TEMPLATE_SPECIFICATION__PARAMETERS);
		createEAttribute(templateSpecificationEClass, TEMPLATE_SPECIFICATION__NAME);
		createEAttribute(templateSpecificationEClass, TEMPLATE_SPECIFICATION__LABELS);
		createEReference(templateSpecificationEClass, TEMPLATE_SPECIFICATION__METRICS);
		createEReference(templateSpecificationEClass, TEMPLATE_SPECIFICATION__INTERFACES);

		templateAtomicEClass = createEClass(TEMPLATE_ATOMIC);
		createEAttribute(templateAtomicEClass, TEMPLATE_ATOMIC__SOURCE);

		templateCompositeEClass = createEClass(TEMPLATE_COMPOSITE);
		createEReference(templateCompositeEClass, TEMPLATE_COMPOSITE__RULES);
		createEReference(templateCompositeEClass, TEMPLATE_COMPOSITE__BIND);
		createEReference(templateCompositeEClass, TEMPLATE_COMPOSITE__SUBMODULES);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__NAME);
		createEReference(blockEClass, BLOCK__REF);
		createEReference(blockEClass, BLOCK__MULT);
		createEAttribute(blockEClass, BLOCK__LABELS);
		createEReference(blockEClass, BLOCK__INTERFACES);

		variantEClass = createEClass(VARIANT);
		createEReference(variantEClass, VARIANT__ASSIGNMENTS);
		createEAttribute(variantEClass, VARIANT__NAME);
		createEReference(variantEClass, VARIANT__TEMPLATE);
		createEReference(variantEClass, VARIANT__REALIZATIONS);

		blockRealizationEClass = createEClass(BLOCK_REALIZATION);
		createEReference(blockRealizationEClass, BLOCK_REALIZATION__REF);
		createEReference(blockRealizationEClass, BLOCK_REALIZATION__MULT);
		createEReference(blockRealizationEClass, BLOCK_REALIZATION__BLOCK);

		modelInterfaceEClass = createEClass(MODEL_INTERFACE);
		createEAttribute(modelInterfaceEClass, MODEL_INTERFACE__NAME);
		createEReference(modelInterfaceEClass, MODEL_INTERFACE__VARIABLES);

		modelInterfSimpleEClass = createEClass(MODEL_INTERF_SIMPLE);

		modelInterfArrayEClass = createEClass(MODEL_INTERF_ARRAY);
		createEReference(modelInterfArrayEClass, MODEL_INTERF_ARRAY__MULT);
		createEAttribute(modelInterfArrayEClass, MODEL_INTERF_ARRAY__LABELS);

		compositionRuleEClass = createEClass(COMPOSITION_RULE);
		createEAttribute(compositionRuleEClass, COMPOSITION_RULE__NAME);
		createEReference(compositionRuleEClass, COMPOSITION_RULE__VARIABLES);

		compositionRuleForwardsEClass = createEClass(COMPOSITION_RULE_FORWARDS);
		createEReference(compositionRuleForwardsEClass, COMPOSITION_RULE_FORWARDS__REF);

		compositionRuleAllEClass = createEClass(COMPOSITION_RULE_ALL);
		createEReference(compositionRuleAllEClass, COMPOSITION_RULE_ALL__REF);

		compositionRuleMatchEClass = createEClass(COMPOSITION_RULE_MATCH);
		createEReference(compositionRuleMatchEClass, COMPOSITION_RULE_MATCH__REF);
		createEAttribute(compositionRuleMatchEClass, COMPOSITION_RULE_MATCH__LABELS);

		compItemEClass = createEClass(COMP_ITEM);
		createEReference(compItemEClass, COMP_ITEM__ITEM);
		createEReference(compItemEClass, COMP_ITEM__BLOCK);
		createEReference(compItemEClass, COMP_ITEM__IDS);

		valueEClass = createEClass(VALUE);

		valueIntEClass = createEClass(VALUE_INT);
		createEAttribute(valueIntEClass, VALUE_INT__VALUE);

		valueDoubleEClass = createEClass(VALUE_DOUBLE);
		createEAttribute(valueDoubleEClass, VALUE_DOUBLE__VALUE);

		valueArrayEClass = createEClass(VALUE_ARRAY);

		valueArrayIntEClass = createEClass(VALUE_ARRAY_INT);
		createEReference(valueArrayIntEClass, VALUE_ARRAY_INT__VALUES);

		valueArrayDoubleEClass = createEClass(VALUE_ARRAY_DOUBLE);
		createEReference(valueArrayDoubleEClass, VALUE_ARRAY_DOUBLE__VALUES);

		multiplicityEClass = createEClass(MULTIPLICITY);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__DEFAULT);

		parametricEClass = createEClass(PARAMETRIC);
		createEReference(parametricEClass, PARAMETRIC__REF);

		parambindingEClass = createEClass(PARAMBINDING);
		createEReference(parambindingEClass, PARAMBINDING__REF);
		createEReference(parambindingEClass, PARAMBINDING__SOURCE);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__REF);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__MIN_WORKING_OBS);
		createEAttribute(metricEClass, METRIC__DESCR);
		createEReference(metricEClass, METRIC__OBS_POINTS);

		availabilityEClass = createEClass(AVAILABILITY);
		createEAttribute(availabilityEClass, AVAILABILITY__CALCULATION);

		reliabilityEClass = createEClass(RELIABILITY);
		createEAttribute(reliabilityEClass, RELIABILITY__CALCULATION);

		meanTimeToFailureEClass = createEClass(MEAN_TIME_TO_FAILURE);
		createEAttribute(meanTimeToFailureEClass, MEAN_TIME_TO_FAILURE__CALCULATION);

		stateMetavariableEClass = createEClass(STATE_METAVARIABLE);
		createEAttribute(stateMetavariableEClass, STATE_METAVARIABLE__NAME);
		createEAttribute(stateMetavariableEClass, STATE_METAVARIABLE__LABELS);
		createEReference(stateMetavariableEClass, STATE_METAVARIABLE__MULT);
		createEReference(stateMetavariableEClass, STATE_METAVARIABLE__PARAMETERS);

		// Create enums
		availabilityCalcEEnum = createEEnum(AVAILABILITY_CALC);
		reliabilityCalcEEnum = createEEnum(RELIABILITY_CALC);
		meanTimeToFailureCalcEEnum = createEEnum(MEAN_TIME_TO_FAILURE_CALC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		templateAtomicEClass.getESuperTypes().add(this.getTemplateSpecification());
		templateCompositeEClass.getESuperTypes().add(this.getTemplateSpecification());
		modelInterfSimpleEClass.getESuperTypes().add(this.getModelInterface());
		modelInterfArrayEClass.getESuperTypes().add(this.getModelInterface());
		compositionRuleForwardsEClass.getESuperTypes().add(this.getCompositionRule());
		compositionRuleAllEClass.getESuperTypes().add(this.getCompositionRule());
		compositionRuleMatchEClass.getESuperTypes().add(this.getCompositionRule());
		valueIntEClass.getESuperTypes().add(this.getValue());
		valueIntEClass.getESuperTypes().add(this.getMultiplicity());
		valueDoubleEClass.getESuperTypes().add(this.getValue());
		valueArrayEClass.getESuperTypes().add(this.getValue());
		valueArrayIntEClass.getESuperTypes().add(this.getValueArray());
		valueArrayIntEClass.getESuperTypes().add(this.getMultiplicity());
		valueArrayDoubleEClass.getESuperTypes().add(this.getValueArray());
		parametricEClass.getESuperTypes().add(this.getMultiplicity());
		availabilityEClass.getESuperTypes().add(this.getMetric());
		reliabilityEClass.getESuperTypes().add(this.getMetric());
		meanTimeToFailureEClass.getESuperTypes().add(this.getMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(tmdlSpecificationEClass, TMDLSpecification.class, "TMDLSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMDLSpecification_Library(), this.getLibrary(), null, "library", null, 1, 1, TMDLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMDLSpecification_Scenario(), this.getScenario(), null, "scenario", null, 0, 1, TMDLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_Templates(), this.getTemplateSpecification(), null, "templates", null, 1, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_Name(), ecorePackage.getEString(), "name", null, 1, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Interfaces(), this.getModelInterface(), null, "interfaces", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Variants(), this.getVariant(), null, "variants", null, 1, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Root(), this.getVariant(), null, "root", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "name", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateSpecificationEClass, TemplateSpecification.class, "TemplateSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateSpecification_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, TemplateSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateSpecification_Name(), ecorePackage.getEString(), "name", null, 1, 1, TemplateSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateSpecification_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, TemplateSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateSpecification_Metrics(), this.getMetric(), null, "metrics", null, 0, -1, TemplateSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateSpecification_Interfaces(), this.getModelInterface(), null, "interfaces", null, 1, -1, TemplateSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateAtomicEClass, TemplateAtomic.class, "TemplateAtomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateAtomic_Source(), ecorePackage.getEString(), "source", null, 1, 1, TemplateAtomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateCompositeEClass, TemplateComposite.class, "TemplateComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateComposite_Rules(), this.getCompositionRule(), null, "rules", null, 0, -1, TemplateComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateComposite_Bind(), this.getParambinding(), null, "bind", null, 0, -1, TemplateComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateComposite_Submodules(), this.getBlock(), null, "submodules", null, 1, -1, TemplateComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Name(), ecorePackage.getEString(), "name", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Ref(), this.getTemplateSpecification(), null, "ref", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Mult(), this.getMultiplicity(), null, "mult", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Interfaces(), this.getModelInterface(), null, "interfaces", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariant_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariant_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariant_Template(), this.getTemplateSpecification(), null, "template", null, 1, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariant_Realizations(), this.getBlockRealization(), null, "realizations", null, 0, -1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockRealizationEClass, BlockRealization.class, "BlockRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockRealization_Ref(), this.getVariant(), null, "ref", null, 1, 1, BlockRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockRealization_Mult(), this.getMultiplicity(), null, "mult", null, 0, 1, BlockRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockRealization_Block(), this.getBlock(), null, "block", null, 1, 1, BlockRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelInterfaceEClass, ModelInterface.class, "ModelInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelInterface_Variables(), this.getStateMetavariable(), null, "variables", null, 1, -1, ModelInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelInterfSimpleEClass, ModelInterfSimple.class, "ModelInterfSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelInterfArrayEClass, ModelInterfArray.class, "ModelInterfArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelInterfArray_Mult(), this.getMultiplicity(), null, "mult", null, 1, 1, ModelInterfArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelInterfArray_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, ModelInterfArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionRuleEClass, CompositionRule.class, "CompositionRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositionRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, CompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositionRule_Variables(), this.getStateMetavariable(), null, "variables", null, 0, -1, CompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionRuleForwardsEClass, CompositionRuleForwards.class, "CompositionRuleForwards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionRuleForwards_Ref(), this.getCompItem(), null, "ref", null, 1, 1, CompositionRuleForwards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionRuleAllEClass, CompositionRuleAll.class, "CompositionRuleAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionRuleAll_Ref(), this.getCompItem(), null, "ref", null, 1, -1, CompositionRuleAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionRuleMatchEClass, CompositionRuleMatch.class, "CompositionRuleMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionRuleMatch_Ref(), this.getCompItem(), null, "ref", null, 1, -1, CompositionRuleMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositionRuleMatch_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, CompositionRuleMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compItemEClass, CompItem.class, "CompItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompItem_Item(), this.getModelInterface(), null, "item", null, 1, 1, CompItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompItem_Block(), this.getBlock(), null, "block", null, 0, 1, CompItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompItem_Ids(), this.getMultiplicity(), null, "ids", null, 0, 1, CompItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueIntEClass, ValueInt.class, "ValueInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueInt_Value(), ecorePackage.getEInt(), "value", null, 1, 1, ValueInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueDoubleEClass, ValueDouble.class, "ValueDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueDouble_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, ValueDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueArrayEClass, ValueArray.class, "ValueArray", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueArrayIntEClass, ValueArrayInt.class, "ValueArrayInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueArrayInt_Values(), this.getValueInt(), null, "values", null, 0, -1, ValueArrayInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueArrayDoubleEClass, ValueArrayDouble.class, "ValueArrayDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueArrayDouble_Values(), this.getValueDouble(), null, "values", null, 1, -1, ValueArrayDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Default(), this.getValue(), null, "default", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametricEClass, Parametric.class, "Parametric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametric_Ref(), this.getParameter(), null, "ref", null, 1, 1, Parametric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parambindingEClass, Parambinding.class, "Parambinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParambinding_Ref(), this.getParameter(), null, "ref", null, 1, 1, Parambinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParambinding_Source(), this.getParameter(), null, "source", null, 1, 1, Parambinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Ref(), this.getParameter(), null, "ref", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Value(), this.getValue(), null, "value", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_MinWorkingObs(), ecorePackage.getEInt(), "minWorkingObs", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Descr(), ecorePackage.getEString(), "descr", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_ObsPoints(), this.getStateMetavariable(), null, "obsPoints", null, 1, -1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAvailability_Calculation(), this.getAvailabilityCalc(), "calculation", null, 1, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reliabilityEClass, Reliability.class, "Reliability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReliability_Calculation(), this.getReliabilityCalc(), "calculation", null, 1, 1, Reliability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meanTimeToFailureEClass, MeanTimeToFailure.class, "MeanTimeToFailure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeanTimeToFailure_Calculation(), this.getMeanTimeToFailureCalc(), "calculation", null, 1, 1, MeanTimeToFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMetavariableEClass, StateMetavariable.class, "StateMetavariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateMetavariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMetavariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMetavariable_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, StateMetavariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMetavariable_Mult(), this.getParametric(), null, "mult", null, 0, 1, StateMetavariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMetavariable_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, StateMetavariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(availabilityCalcEEnum, AvailabilityCalc.class, "AvailabilityCalc");
		addEEnumLiteral(availabilityCalcEEnum, AvailabilityCalc.INSTANT_OF_TIME);
		addEEnumLiteral(availabilityCalcEEnum, AvailabilityCalc.TIME_AVERAGED);
		addEEnumLiteral(availabilityCalcEEnum, AvailabilityCalc.STEADY_STATE);

		initEEnum(reliabilityCalcEEnum, ReliabilityCalc.class, "ReliabilityCalc");
		addEEnumLiteral(reliabilityCalcEEnum, ReliabilityCalc.INSTANT_OF_TIME);

		initEEnum(meanTimeToFailureCalcEEnum, MeanTimeToFailureCalc.class, "MeanTimeToFailureCalc");
		addEEnumLiteral(meanTimeToFailureCalcEEnum, MeanTimeToFailureCalc.INTERVAL_OF_TIME);

		// Create resource
		createResource(eNS_URI);
	}

} //tmdlPackageImpl
