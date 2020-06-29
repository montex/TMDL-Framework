/**
 */
package sant.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import san.SANPackage;

import sant.ActivityTemplate;
import sant.ArcTemplate;
import sant.CasesSpecification;
import sant.CasesSpecificationArray;
import sant.CasesSpecificationConcrete;
import sant.CasesSpecificationParametric;
import sant.CasesSpecificationProbabilityArray;
import sant.GateTemplate;
import sant.InputArc;
import sant.InputGateTemplate;
import sant.InstantaneousActivityTemplate;
import sant.MarkingTemplate;
import sant.MarkingTemplateGlobalVariable;
import sant.MarkingTemplateSimple;
import sant.MultiplicityRangeOperator;
import sant.OutputArc;
import sant.OutputGate;
import sant.OutputGateConcrete;
import sant.OutputGateTemplate;
import sant.PlaceTemplate;
import sant.SANTFactory;
import sant.SANTPackage;
import sant.TimedActivityTemplate;

import tmdl.core.CorePackage;

import tmdl.expressions.ExpressionsPackage;

import tmdl.library.LibraryPackage;

import tmdl.scenario.ScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANTPackageImpl extends EPackageImpl implements SANTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass santEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityRangeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casesSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casesSpecificationConcreteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casesSpecificationArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casesSpecificationParametricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casesSpecificationProbabilityArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedActivityTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantaneousActivityTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingTemplateSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingTemplateGlobalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputGateConcreteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputGateTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputGateTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputArcEClass = null;

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
	 * @see sant.SANTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SANTPackageImpl() {
		super(eNS_URI, SANTFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SANTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SANTPackage init() {
		if (isInited) return (SANTPackage)EPackage.Registry.INSTANCE.getEPackage(SANTPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSANTPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SANTPackageImpl theSANTPackage = registeredSANTPackage instanceof SANTPackageImpl ? (SANTPackageImpl)registeredSANTPackage : new SANTPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SANPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		LibraryPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSANTPackage.createPackageContents();

		// Initialize created meta-data
		theSANTPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSANTPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SANTPackage.eNS_URI, theSANTPackage);
		return theSANTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSANT() {
		return santEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSANT_Name() {
		return (EAttribute)santEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSANT_TemplatePlaces() {
		return (EReference)santEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSANT_Places() {
		return (EReference)santEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSANT_ActivityTemplates() {
		return (EReference)santEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSANT_Parameters() {
		return (EReference)santEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSANT_GlobalVariables() {
		return (EReference)santEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSANT_CustomType() {
		return (EReference)santEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSANT_Gates() {
		return (EReference)santEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSANT_Arcs() {
		return (EReference)santEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaceTemplate() {
		return placeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaceTemplate_Multiplicity() {
		return (EReference)placeTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaceTemplate_Marking() {
		return (EReference)placeTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicityRangeOperator() {
		return multiplicityRangeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangeOperator_Min() {
		return (EAttribute)multiplicityRangeOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangeOperator_Max() {
		return (EAttribute)multiplicityRangeOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplicityRangeOperator_Step() {
		return (EAttribute)multiplicityRangeOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityTemplate() {
		return activityTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityTemplate_CasesTemplate() {
		return (EReference)activityTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCasesSpecification() {
		return casesSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCasesSpecificationConcrete() {
		return casesSpecificationConcreteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCasesSpecificationConcrete_Cases() {
		return (EReference)casesSpecificationConcreteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCasesSpecificationArray() {
		return casesSpecificationArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCasesSpecificationArray_NumCases() {
		return (EAttribute)casesSpecificationArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCasesSpecificationArray_P() {
		return (EReference)casesSpecificationArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCasesSpecificationParametric() {
		return casesSpecificationParametricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCasesSpecificationParametric_Parameter() {
		return (EReference)casesSpecificationParametricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCasesSpecificationParametric_P() {
		return (EReference)casesSpecificationParametricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCasesSpecificationProbabilityArray() {
		return casesSpecificationProbabilityArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCasesSpecificationProbabilityArray_CaseParameter() {
		return (EReference)casesSpecificationProbabilityArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCasesSpecificationProbabilityArray_PValues() {
		return (EReference)casesSpecificationProbabilityArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimedActivityTemplate() {
		return timedActivityTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimedActivityTemplate_TimeDistribution() {
		return (EReference)timedActivityTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimedActivityTemplate_Activation() {
		return (EReference)timedActivityTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimedActivityTemplate_Reactivation() {
		return (EReference)timedActivityTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstantaneousActivityTemplate() {
		return instantaneousActivityTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkingTemplate() {
		return markingTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkingTemplate_IdPlace() {
		return (EAttribute)markingTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkingTemplateSimple() {
		return markingTemplateSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkingTemplateSimple_Value() {
		return (EAttribute)markingTemplateSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkingTemplateGlobalVariable() {
		return markingTemplateGlobalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkingTemplateGlobalVariable_Variable() {
		return (EReference)markingTemplateGlobalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateTemplate() {
		return gateTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGateTemplate_PlaceTemplate() {
		return (EReference)gateTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputGate() {
		return outputGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputGateConcrete() {
		return outputGateConcreteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputGateConcrete_Case() {
		return (EReference)outputGateConcreteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputGateTemplate() {
		return outputGateTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputGateTemplate_Activity() {
		return (EReference)outputGateTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputGateTemplate() {
		return inputGateTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputGateTemplate_Predicate() {
		return (EReference)inputGateTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputGateTemplate_Activity() {
		return (EReference)inputGateTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcTemplate() {
		return arcTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputArc() {
		return inputArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputArc_Source() {
		return (EReference)inputArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputArc_Target() {
		return (EReference)inputArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputArc_TemplateSource() {
		return (EReference)inputArcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputArc() {
		return outputArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputArc_SourceCaseConcrete() {
		return (EReference)outputArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputArc_Source() {
		return (EReference)outputArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputArc_Target() {
		return (EReference)outputArcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputArc_TemplateTarget() {
		return (EReference)outputArcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SANTFactory getSANTFactory() {
		return (SANTFactory)getEFactoryInstance();
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
		santEClass = createEClass(SANT);
		createEAttribute(santEClass, SANT__NAME);
		createEReference(santEClass, SANT__TEMPLATE_PLACES);
		createEReference(santEClass, SANT__PLACES);
		createEReference(santEClass, SANT__ACTIVITY_TEMPLATES);
		createEReference(santEClass, SANT__PARAMETERS);
		createEReference(santEClass, SANT__GLOBAL_VARIABLES);
		createEReference(santEClass, SANT__CUSTOM_TYPE);
		createEReference(santEClass, SANT__GATES);
		createEReference(santEClass, SANT__ARCS);

		placeTemplateEClass = createEClass(PLACE_TEMPLATE);
		createEReference(placeTemplateEClass, PLACE_TEMPLATE__MULTIPLICITY);
		createEReference(placeTemplateEClass, PLACE_TEMPLATE__MARKING);

		multiplicityRangeOperatorEClass = createEClass(MULTIPLICITY_RANGE_OPERATOR);
		createEAttribute(multiplicityRangeOperatorEClass, MULTIPLICITY_RANGE_OPERATOR__MIN);
		createEAttribute(multiplicityRangeOperatorEClass, MULTIPLICITY_RANGE_OPERATOR__MAX);
		createEAttribute(multiplicityRangeOperatorEClass, MULTIPLICITY_RANGE_OPERATOR__STEP);

		activityTemplateEClass = createEClass(ACTIVITY_TEMPLATE);
		createEReference(activityTemplateEClass, ACTIVITY_TEMPLATE__CASES_TEMPLATE);

		casesSpecificationEClass = createEClass(CASES_SPECIFICATION);

		casesSpecificationConcreteEClass = createEClass(CASES_SPECIFICATION_CONCRETE);
		createEReference(casesSpecificationConcreteEClass, CASES_SPECIFICATION_CONCRETE__CASES);

		casesSpecificationArrayEClass = createEClass(CASES_SPECIFICATION_ARRAY);
		createEAttribute(casesSpecificationArrayEClass, CASES_SPECIFICATION_ARRAY__NUM_CASES);
		createEReference(casesSpecificationArrayEClass, CASES_SPECIFICATION_ARRAY__P);

		casesSpecificationParametricEClass = createEClass(CASES_SPECIFICATION_PARAMETRIC);
		createEReference(casesSpecificationParametricEClass, CASES_SPECIFICATION_PARAMETRIC__PARAMETER);
		createEReference(casesSpecificationParametricEClass, CASES_SPECIFICATION_PARAMETRIC__P);

		casesSpecificationProbabilityArrayEClass = createEClass(CASES_SPECIFICATION_PROBABILITY_ARRAY);
		createEReference(casesSpecificationProbabilityArrayEClass, CASES_SPECIFICATION_PROBABILITY_ARRAY__CASE_PARAMETER);
		createEReference(casesSpecificationProbabilityArrayEClass, CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES);

		timedActivityTemplateEClass = createEClass(TIMED_ACTIVITY_TEMPLATE);
		createEReference(timedActivityTemplateEClass, TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION);
		createEReference(timedActivityTemplateEClass, TIMED_ACTIVITY_TEMPLATE__ACTIVATION);
		createEReference(timedActivityTemplateEClass, TIMED_ACTIVITY_TEMPLATE__REACTIVATION);

		instantaneousActivityTemplateEClass = createEClass(INSTANTANEOUS_ACTIVITY_TEMPLATE);

		markingTemplateEClass = createEClass(MARKING_TEMPLATE);
		createEAttribute(markingTemplateEClass, MARKING_TEMPLATE__ID_PLACE);

		markingTemplateSimpleEClass = createEClass(MARKING_TEMPLATE_SIMPLE);
		createEAttribute(markingTemplateSimpleEClass, MARKING_TEMPLATE_SIMPLE__VALUE);

		markingTemplateGlobalVariableEClass = createEClass(MARKING_TEMPLATE_GLOBAL_VARIABLE);
		createEReference(markingTemplateGlobalVariableEClass, MARKING_TEMPLATE_GLOBAL_VARIABLE__VARIABLE);

		gateTemplateEClass = createEClass(GATE_TEMPLATE);
		createEReference(gateTemplateEClass, GATE_TEMPLATE__PLACE_TEMPLATE);

		outputGateEClass = createEClass(OUTPUT_GATE);

		outputGateConcreteEClass = createEClass(OUTPUT_GATE_CONCRETE);
		createEReference(outputGateConcreteEClass, OUTPUT_GATE_CONCRETE__CASE);

		outputGateTemplateEClass = createEClass(OUTPUT_GATE_TEMPLATE);
		createEReference(outputGateTemplateEClass, OUTPUT_GATE_TEMPLATE__ACTIVITY);

		inputGateTemplateEClass = createEClass(INPUT_GATE_TEMPLATE);
		createEReference(inputGateTemplateEClass, INPUT_GATE_TEMPLATE__PREDICATE);
		createEReference(inputGateTemplateEClass, INPUT_GATE_TEMPLATE__ACTIVITY);

		arcTemplateEClass = createEClass(ARC_TEMPLATE);

		inputArcEClass = createEClass(INPUT_ARC);
		createEReference(inputArcEClass, INPUT_ARC__SOURCE);
		createEReference(inputArcEClass, INPUT_ARC__TARGET);
		createEReference(inputArcEClass, INPUT_ARC__TEMPLATE_SOURCE);

		outputArcEClass = createEClass(OUTPUT_ARC);
		createEReference(outputArcEClass, OUTPUT_ARC__SOURCE_CASE_CONCRETE);
		createEReference(outputArcEClass, OUTPUT_ARC__SOURCE);
		createEReference(outputArcEClass, OUTPUT_ARC__TARGET);
		createEReference(outputArcEClass, OUTPUT_ARC__TEMPLATE_TARGET);
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

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		SANPackage theSANPackage = (SANPackage)EPackage.Registry.INSTANCE.getEPackage(SANPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		santEClass.getESuperTypes().add(theCorePackage.getTemplateModel());
		placeTemplateEClass.getESuperTypes().add(theSANPackage.getNamedElement());
		multiplicityRangeOperatorEClass.getESuperTypes().add(theCorePackage.getMultiplicity());
		activityTemplateEClass.getESuperTypes().add(theSANPackage.getNamedElement());
		casesSpecificationConcreteEClass.getESuperTypes().add(this.getCasesSpecification());
		casesSpecificationArrayEClass.getESuperTypes().add(this.getCasesSpecification());
		casesSpecificationParametricEClass.getESuperTypes().add(this.getCasesSpecification());
		casesSpecificationProbabilityArrayEClass.getESuperTypes().add(this.getCasesSpecification());
		timedActivityTemplateEClass.getESuperTypes().add(this.getActivityTemplate());
		instantaneousActivityTemplateEClass.getESuperTypes().add(this.getActivityTemplate());
		markingTemplateSimpleEClass.getESuperTypes().add(this.getMarkingTemplate());
		markingTemplateGlobalVariableEClass.getESuperTypes().add(this.getMarkingTemplate());
		gateTemplateEClass.getESuperTypes().add(theSANPackage.getGate());
		outputGateEClass.getESuperTypes().add(this.getGateTemplate());
		outputGateConcreteEClass.getESuperTypes().add(this.getOutputGate());
		outputGateTemplateEClass.getESuperTypes().add(this.getOutputGate());
		inputGateTemplateEClass.getESuperTypes().add(this.getGateTemplate());
		inputArcEClass.getESuperTypes().add(this.getArcTemplate());
		outputArcEClass.getESuperTypes().add(this.getArcTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(santEClass, sant.SANT.class, "SANT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSANT_Name(), ecorePackage.getEString(), "name", null, 1, 1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_TemplatePlaces(), this.getPlaceTemplate(), null, "templatePlaces", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSANT_TemplatePlaces().getEKeys().add(theSANPackage.getNamedElement_Name());
		initEReference(getSANT_Places(), theSANPackage.getPlace(), null, "places", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_ActivityTemplates(), this.getActivityTemplate(), null, "activityTemplates", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSANT_ActivityTemplates().getEKeys().add(theSANPackage.getNamedElement_Name());
		initEReference(getSANT_Parameters(), theCorePackage.getParameter(), null, "parameters", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSANT_Parameters().getEKeys().add(theCorePackage.getParameter_Name());
		initEReference(getSANT_GlobalVariables(), theSANPackage.getGlobalVariable(), null, "globalVariables", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSANT_GlobalVariables().getEKeys().add(theSANPackage.getNamedElement_Name());
		initEReference(getSANT_CustomType(), theSANPackage.getCustomTypeDefinition(), null, "customType", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Gates(), this.getGateTemplate(), null, "gates", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Arcs(), this.getArcTemplate(), null, "arcs", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeTemplateEClass, PlaceTemplate.class, "PlaceTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceTemplate_Multiplicity(), theCorePackage.getMultiplicity(), null, "multiplicity", null, 1, 1, PlaceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceTemplate_Marking(), this.getMarkingTemplate(), null, "marking", null, 0, -1, PlaceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityRangeOperatorEClass, MultiplicityRangeOperator.class, "MultiplicityRangeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityRangeOperator_Min(), ecorePackage.getEInt(), "min", null, 1, 1, MultiplicityRangeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangeOperator_Max(), ecorePackage.getEInt(), "max", null, 1, 1, MultiplicityRangeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRangeOperator_Step(), ecorePackage.getEInt(), "step", null, 0, 1, MultiplicityRangeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityTemplateEClass, ActivityTemplate.class, "ActivityTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityTemplate_CasesTemplate(), this.getCasesSpecification(), null, "casesTemplate", null, 1, 1, ActivityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casesSpecificationEClass, CasesSpecification.class, "CasesSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(casesSpecificationConcreteEClass, CasesSpecificationConcrete.class, "CasesSpecificationConcrete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCasesSpecificationConcrete_Cases(), theSANPackage.getCase(), null, "cases", null, 1, -1, CasesSpecificationConcrete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casesSpecificationArrayEClass, CasesSpecificationArray.class, "CasesSpecificationArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCasesSpecificationArray_NumCases(), ecorePackage.getEInt(), "numCases", null, 1, 1, CasesSpecificationArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCasesSpecificationArray_P(), theSANPackage.getExpression(), null, "p", null, 1, -1, CasesSpecificationArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casesSpecificationParametricEClass, CasesSpecificationParametric.class, "CasesSpecificationParametric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCasesSpecificationParametric_Parameter(), theCorePackage.getParameter(), null, "parameter", null, 1, 1, CasesSpecificationParametric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCasesSpecificationParametric_P(), theSANPackage.getExpression(), null, "p", null, 1, -1, CasesSpecificationParametric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casesSpecificationProbabilityArrayEClass, CasesSpecificationProbabilityArray.class, "CasesSpecificationProbabilityArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCasesSpecificationProbabilityArray_CaseParameter(), theCorePackage.getParameter(), null, "caseParameter", null, 1, 1, CasesSpecificationProbabilityArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCasesSpecificationProbabilityArray_PValues(), theCorePackage.getParameterArray(), null, "pValues", null, 1, 1, CasesSpecificationProbabilityArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedActivityTemplateEClass, TimedActivityTemplate.class, "TimedActivityTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedActivityTemplate_TimeDistribution(), theSANPackage.getDistribution(), null, "timeDistribution", null, 1, 1, TimedActivityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedActivityTemplate_Activation(), theSANPackage.getExpression(), null, "activation", null, 0, 1, TimedActivityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedActivityTemplate_Reactivation(), theSANPackage.getExpression(), null, "reactivation", null, 0, 1, TimedActivityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantaneousActivityTemplateEClass, InstantaneousActivityTemplate.class, "InstantaneousActivityTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(markingTemplateEClass, MarkingTemplate.class, "MarkingTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkingTemplate_IdPlace(), ecorePackage.getEInt(), "idPlace", null, 1, 1, MarkingTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingTemplateSimpleEClass, MarkingTemplateSimple.class, "MarkingTemplateSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkingTemplateSimple_Value(), ecorePackage.getEShort(), "value", null, 1, 1, MarkingTemplateSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingTemplateGlobalVariableEClass, MarkingTemplateGlobalVariable.class, "MarkingTemplateGlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkingTemplateGlobalVariable_Variable(), theSANPackage.getGlobalVariable(), null, "variable", null, 1, 1, MarkingTemplateGlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateTemplateEClass, GateTemplate.class, "GateTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGateTemplate_PlaceTemplate(), this.getPlaceTemplate(), null, "placeTemplate", null, 1, -1, GateTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputGateEClass, OutputGate.class, "OutputGate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputGateConcreteEClass, OutputGateConcrete.class, "OutputGateConcrete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputGateConcrete_Case(), theSANPackage.getCase(), null, "case", null, 1, -1, OutputGateConcrete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputGateTemplateEClass, OutputGateTemplate.class, "OutputGateTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputGateTemplate_Activity(), this.getActivityTemplate(), null, "activity", null, 1, -1, OutputGateTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputGateTemplateEClass, InputGateTemplate.class, "InputGateTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputGateTemplate_Predicate(), theSANPackage.getExpression(), null, "predicate", null, 1, 1, InputGateTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputGateTemplate_Activity(), this.getActivityTemplate(), null, "activity", null, 1, -1, InputGateTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcTemplateEClass, ArcTemplate.class, "ArcTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputArcEClass, InputArc.class, "InputArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputArc_Source(), theSANPackage.getPlace(), null, "source", null, 0, 1, InputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputArc_Target(), this.getActivityTemplate(), null, "target", null, 0, 1, InputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputArc_TemplateSource(), this.getPlaceTemplate(), null, "templateSource", null, 0, 1, InputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputArcEClass, OutputArc.class, "OutputArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputArc_SourceCaseConcrete(), theSANPackage.getCase(), null, "sourceCaseConcrete", null, 0, 1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputArc_Source(), this.getActivityTemplate(), null, "source", null, 0, 1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputArc_Target(), theSANPackage.getPlace(), null, "target", null, 0, 1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputArc_TemplateTarget(), this.getPlaceTemplate(), null, "templateTarget", null, 0, 1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SANTPackageImpl
