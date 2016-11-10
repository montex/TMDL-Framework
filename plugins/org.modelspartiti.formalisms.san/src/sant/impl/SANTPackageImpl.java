/**
 */
package sant.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sant.Activity;
import sant.Arc;
import sant.Beta;
import sant.Binomial;
import sant.Case;
import sant.CasesSpecification;
import sant.CasesSpecificationCases;
import sant.CasesSpecificationParametric;
import sant.CasesSpecificationProbabilityArray;
import sant.ConditionalWeibull;
import sant.Deterministic;
import sant.Distribution;
import sant.Erlang;
import sant.Exponential;
import sant.Expression;
import sant.ExpressionActivityCasesNumber;
import sant.ExpressionIfThenElse;
import sant.ExpressionIterationElement;
import sant.ExpressionLoop;
import sant.ExpressionMarking;
import sant.ExpressionPlaceTemplateSize;
import sant.ExpressionSegment;
import sant.ExpressionTemplateExpression;
import sant.ExpressionText;
import sant.ExpressionVariable;
import sant.ExtendedPlace;
import sant.ExtendedPlaceType;
import sant.Gamma;
import sant.Gate;
import sant.Geometric;
import sant.GlobalVariable;
import sant.HyperExponential;
import sant.HypoExponential;
import sant.InputArc;
import sant.InputGate;
import sant.InstantaneousActivity;
import sant.Lognormal;
import sant.LoopIterator;
import sant.Marking;
import sant.MarkingExtended;
import sant.MarkingInteger;
import sant.MarkingSimple;
import sant.MarkingString;
import sant.MarkingVariableExtended;
import sant.MarkingVariableSimple;
import sant.NamedElement;
import sant.NegativeBinomial;
import sant.Normal;
import sant.NormalPlace;
import sant.OutputArc;
import sant.OutputGate;
import sant.OutputGateConcrete;
import sant.OutputGateTemplate;
import sant.Pareto;
import sant.Place;
import sant.SANTFactory;
import sant.SANTPackage;
import sant.ThisContextIterator;
import sant.TimedActivity;
import sant.Triangular;
import sant.Uniform;
import sant.VariabilityIterator;
import sant.VariableType;
import sant.Weibull;

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
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

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
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casesSpecificationCasesEClass = null;

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
	private EClass casesSpecificationParametricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

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
	private EClass inputGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantaneousActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionMarkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionTemplateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionIterationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionActivityCasesNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionPlaceTemplateSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionIfThenElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabilityIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisContextIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingExtendedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingVariableSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binomialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deterministicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lognormalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeBinomialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erlangEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperExponentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weibullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalWeibullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypoExponentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paretoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingVariableExtendedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum extendedPlaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codeFragmentEDataType = null;

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
		SANTPackageImpl theSANTPackage = (SANTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SANTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SANTPackageImpl());

		isInited = true;

		// Initialize simple dependencies
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
	public EClass getSANT() {
		return santEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSANT_Name() {
		return (EAttribute)santEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_Parameters() {
		return (EReference)santEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_Places() {
		return (EReference)santEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_Activities() {
		return (EReference)santEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_GlobalVariables() {
		return (EReference)santEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_Arcs() {
		return (EReference)santEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_Gates() {
		return (EReference)santEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_Initialization() {
		return (EReference)santEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__HasVariability() {
		return namedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Multiplicity() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalPlace() {
		return normalPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalPlace_Marking() {
		return (EReference)normalPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedPlace() {
		return extendedPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedPlace_Marking() {
		return (EReference)extendedPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedPlace_Type() {
		return (EAttribute)extendedPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Cases() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasesSpecification() {
		return casesSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_ID() {
		return (EReference)caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_P() {
		return (EReference)caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasesSpecificationCases() {
		return casesSpecificationCasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasesSpecificationCases_Cases() {
		return (EReference)casesSpecificationCasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasesSpecificationProbabilityArray() {
		return casesSpecificationProbabilityArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasesSpecificationProbabilityArray_PValues() {
		return (EReference)casesSpecificationProbabilityArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasesSpecificationParametric() {
		return casesSpecificationParametricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasesSpecificationParametric_NumCases() {
		return (EReference)casesSpecificationParametricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCasesSpecificationParametric_PExpression() {
		return (EReference)casesSpecificationParametricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputArc() {
		return inputArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputArc_Source() {
		return (EReference)inputArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputArc_Target() {
		return (EReference)inputArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputArc() {
		return outputArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputArc_Source() {
		return (EReference)outputArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputArc_Target() {
		return (EReference)outputArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_Function() {
		return (EReference)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_Places() {
		return (EReference)gateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputGate() {
		return outputGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputGateConcrete() {
		return outputGateConcreteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputGateConcrete_ActivityCase() {
		return (EReference)outputGateConcreteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputGateTemplate() {
		return outputGateTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputGateTemplate_Activity() {
		return (EReference)outputGateTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputGate() {
		return inputGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputGate_Predicate() {
		return (EReference)inputGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputGate_Activity() {
		return (EReference)inputGateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantaneousActivity() {
		return instantaneousActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedActivity() {
		return timedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedActivity_TimeDistribution() {
		return (EReference)timedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedActivity_Activation() {
		return (EReference)timedActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedActivity_Reactivation() {
		return (EReference)timedActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Segments() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionSegment() {
		return expressionSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionText() {
		return expressionTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionText_Text() {
		return (EAttribute)expressionTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionMarking() {
		return expressionMarkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionMarking_Place() {
		return (EReference)expressionMarkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionMarking_Index() {
		return (EReference)expressionMarkingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionVariable() {
		return expressionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionVariable_Variable() {
		return (EReference)expressionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionTemplateExpression() {
		return expressionTemplateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionTemplateExpression_Exp() {
		return (EReference)expressionTemplateExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionIterationElement() {
		return expressionIterationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionIterationElement_Iterator() {
		return (EReference)expressionIterationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionIterationElement_I() {
		return (EAttribute)expressionIterationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionActivityCasesNumber() {
		return expressionActivityCasesNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionActivityCasesNumber_Activity() {
		return (EReference)expressionActivityCasesNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionActivityCasesNumber__Evaluate__EList() {
		return expressionActivityCasesNumberEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionPlaceTemplateSize() {
		return expressionPlaceTemplateSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionPlaceTemplateSize_Place() {
		return (EReference)expressionPlaceTemplateSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionPlaceTemplateSize__Evaluate__EList() {
		return expressionPlaceTemplateSizeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionIfThenElse() {
		return expressionIfThenElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionIfThenElse_Condition() {
		return (EReference)expressionIfThenElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionIfThenElse_IfTrue() {
		return (EReference)expressionIfThenElseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionIfThenElse_IfFalse() {
		return (EReference)expressionIfThenElseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionLoop() {
		return expressionLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionLoop_Begin() {
		return (EReference)expressionLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionLoop_End() {
		return (EReference)expressionLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionLoop_Do() {
		return (EReference)expressionLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariabilityIterator() {
		return variabilityIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThisContextIterator() {
		return thisContextIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopIterator() {
		return loopIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopIterator_Loop() {
		return (EReference)loopIteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarking() {
		return markingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkingInteger() {
		return markingIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkingInteger_Value() {
		return (EReference)markingIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkingExtended() {
		return markingExtendedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable() {
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Type() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkingVariableSimple() {
		return markingVariableSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkingVariableSimple_Variable() {
		return (EReference)markingVariableSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponential() {
		return exponentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExponential_Rate() {
		return (EReference)exponentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormal() {
		return normalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormal_Mean() {
		return (EReference)normalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormal_Variance() {
		return (EReference)normalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamma() {
		return gammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamma_Alpha() {
		return (EReference)gammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamma_Beta() {
		return (EReference)gammaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinomial() {
		return binomialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinomial_T() {
		return (EReference)binomialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinomial_P() {
		return (EReference)binomialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeterministic() {
		return deterministicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeterministic_Value() {
		return (EReference)deterministicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLognormal() {
		return lognormalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLognormal_Mu() {
		return (EReference)lognormalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLognormal_AlphaSquared() {
		return (EReference)lognormalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeta() {
		return betaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeta_Alpha1() {
		return (EReference)betaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeta_Beta1() {
		return (EReference)betaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeBinomial() {
		return negativeBinomialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeBinomial_S() {
		return (EReference)negativeBinomialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeBinomial_P() {
		return (EReference)negativeBinomialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometric() {
		return geometricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometric_P() {
		return (EReference)geometricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErlang() {
		return erlangEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErlang_M() {
		return (EReference)erlangEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErlang_Beta() {
		return (EReference)erlangEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniform() {
		return uniformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniform_LowerBound() {
		return (EReference)uniformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniform_UpperBound() {
		return (EReference)uniformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperExponential() {
		return hyperExponentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHyperExponential_Rate0() {
		return (EReference)hyperExponentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHyperExponential_P0() {
		return (EReference)hyperExponentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeibull() {
		return weibullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeibull_Alpha() {
		return (EReference)weibullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeibull_Beta() {
		return (EReference)weibullEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangular() {
		return triangularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriangular_Min() {
		return (EReference)triangularEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriangular_Middle() {
		return (EReference)triangularEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriangular_Max() {
		return (EReference)triangularEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalWeibull() {
		return conditionalWeibullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalWeibull_Alpha() {
		return (EReference)conditionalWeibullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalWeibull_Beta() {
		return (EReference)conditionalWeibullEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalWeibull_T() {
		return (EReference)conditionalWeibullEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypoExponential() {
		return hypoExponentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypoExponential_Rate0() {
		return (EReference)hypoExponentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPareto() {
		return paretoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPareto_LowerBound() {
		return (EReference)paretoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPareto_Shape() {
		return (EReference)paretoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkingSimple() {
		return markingSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkingString() {
		return markingStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkingString_Value() {
		return (EAttribute)markingStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkingVariableExtended() {
		return markingVariableExtendedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkingVariableExtended_Variable() {
		return (EReference)markingVariableExtendedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableType() {
		return variableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExtendedPlaceType() {
		return extendedPlaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCodeFragment() {
		return codeFragmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		createEReference(santEClass, SANT__PARAMETERS);
		createEReference(santEClass, SANT__PLACES);
		createEReference(santEClass, SANT__ACTIVITIES);
		createEReference(santEClass, SANT__GLOBAL_VARIABLES);
		createEReference(santEClass, SANT__ARCS);
		createEReference(santEClass, SANT__GATES);
		createEReference(santEClass, SANT__INITIALIZATION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEOperation(namedElementEClass, NAMED_ELEMENT___HAS_VARIABILITY);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__MULTIPLICITY);

		normalPlaceEClass = createEClass(NORMAL_PLACE);
		createEReference(normalPlaceEClass, NORMAL_PLACE__MARKING);

		extendedPlaceEClass = createEClass(EXTENDED_PLACE);
		createEReference(extendedPlaceEClass, EXTENDED_PLACE__MARKING);
		createEAttribute(extendedPlaceEClass, EXTENDED_PLACE__TYPE);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__CASES);

		casesSpecificationEClass = createEClass(CASES_SPECIFICATION);

		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__ID);
		createEReference(caseEClass, CASE__P);

		casesSpecificationCasesEClass = createEClass(CASES_SPECIFICATION_CASES);
		createEReference(casesSpecificationCasesEClass, CASES_SPECIFICATION_CASES__CASES);

		casesSpecificationProbabilityArrayEClass = createEClass(CASES_SPECIFICATION_PROBABILITY_ARRAY);
		createEReference(casesSpecificationProbabilityArrayEClass, CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES);

		casesSpecificationParametricEClass = createEClass(CASES_SPECIFICATION_PARAMETRIC);
		createEReference(casesSpecificationParametricEClass, CASES_SPECIFICATION_PARAMETRIC__NUM_CASES);
		createEReference(casesSpecificationParametricEClass, CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION);

		arcEClass = createEClass(ARC);

		inputArcEClass = createEClass(INPUT_ARC);
		createEReference(inputArcEClass, INPUT_ARC__SOURCE);
		createEReference(inputArcEClass, INPUT_ARC__TARGET);

		outputArcEClass = createEClass(OUTPUT_ARC);
		createEReference(outputArcEClass, OUTPUT_ARC__SOURCE);
		createEReference(outputArcEClass, OUTPUT_ARC__TARGET);

		gateEClass = createEClass(GATE);
		createEReference(gateEClass, GATE__FUNCTION);
		createEReference(gateEClass, GATE__PLACES);

		outputGateEClass = createEClass(OUTPUT_GATE);

		outputGateConcreteEClass = createEClass(OUTPUT_GATE_CONCRETE);
		createEReference(outputGateConcreteEClass, OUTPUT_GATE_CONCRETE__ACTIVITY_CASE);

		outputGateTemplateEClass = createEClass(OUTPUT_GATE_TEMPLATE);
		createEReference(outputGateTemplateEClass, OUTPUT_GATE_TEMPLATE__ACTIVITY);

		inputGateEClass = createEClass(INPUT_GATE);
		createEReference(inputGateEClass, INPUT_GATE__PREDICATE);
		createEReference(inputGateEClass, INPUT_GATE__ACTIVITY);

		instantaneousActivityEClass = createEClass(INSTANTANEOUS_ACTIVITY);

		timedActivityEClass = createEClass(TIMED_ACTIVITY);
		createEReference(timedActivityEClass, TIMED_ACTIVITY__TIME_DISTRIBUTION);
		createEReference(timedActivityEClass, TIMED_ACTIVITY__ACTIVATION);
		createEReference(timedActivityEClass, TIMED_ACTIVITY__REACTIVATION);

		distributionEClass = createEClass(DISTRIBUTION);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__SEGMENTS);

		expressionSegmentEClass = createEClass(EXPRESSION_SEGMENT);

		expressionTextEClass = createEClass(EXPRESSION_TEXT);
		createEAttribute(expressionTextEClass, EXPRESSION_TEXT__TEXT);

		expressionMarkingEClass = createEClass(EXPRESSION_MARKING);
		createEReference(expressionMarkingEClass, EXPRESSION_MARKING__PLACE);
		createEReference(expressionMarkingEClass, EXPRESSION_MARKING__INDEX);

		expressionVariableEClass = createEClass(EXPRESSION_VARIABLE);
		createEReference(expressionVariableEClass, EXPRESSION_VARIABLE__VARIABLE);

		expressionTemplateExpressionEClass = createEClass(EXPRESSION_TEMPLATE_EXPRESSION);
		createEReference(expressionTemplateExpressionEClass, EXPRESSION_TEMPLATE_EXPRESSION__EXP);

		expressionIterationElementEClass = createEClass(EXPRESSION_ITERATION_ELEMENT);
		createEReference(expressionIterationElementEClass, EXPRESSION_ITERATION_ELEMENT__ITERATOR);
		createEAttribute(expressionIterationElementEClass, EXPRESSION_ITERATION_ELEMENT__I);

		expressionActivityCasesNumberEClass = createEClass(EXPRESSION_ACTIVITY_CASES_NUMBER);
		createEReference(expressionActivityCasesNumberEClass, EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY);
		createEOperation(expressionActivityCasesNumberEClass, EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE__ELIST);

		expressionPlaceTemplateSizeEClass = createEClass(EXPRESSION_PLACE_TEMPLATE_SIZE);
		createEReference(expressionPlaceTemplateSizeEClass, EXPRESSION_PLACE_TEMPLATE_SIZE__PLACE);
		createEOperation(expressionPlaceTemplateSizeEClass, EXPRESSION_PLACE_TEMPLATE_SIZE___EVALUATE__ELIST);

		expressionIfThenElseEClass = createEClass(EXPRESSION_IF_THEN_ELSE);
		createEReference(expressionIfThenElseEClass, EXPRESSION_IF_THEN_ELSE__CONDITION);
		createEReference(expressionIfThenElseEClass, EXPRESSION_IF_THEN_ELSE__IF_TRUE);
		createEReference(expressionIfThenElseEClass, EXPRESSION_IF_THEN_ELSE__IF_FALSE);

		expressionLoopEClass = createEClass(EXPRESSION_LOOP);
		createEReference(expressionLoopEClass, EXPRESSION_LOOP__BEGIN);
		createEReference(expressionLoopEClass, EXPRESSION_LOOP__END);
		createEReference(expressionLoopEClass, EXPRESSION_LOOP__DO);

		variabilityIteratorEClass = createEClass(VARIABILITY_ITERATOR);

		thisContextIteratorEClass = createEClass(THIS_CONTEXT_ITERATOR);

		loopIteratorEClass = createEClass(LOOP_ITERATOR);
		createEReference(loopIteratorEClass, LOOP_ITERATOR__LOOP);

		markingEClass = createEClass(MARKING);

		markingIntegerEClass = createEClass(MARKING_INTEGER);
		createEReference(markingIntegerEClass, MARKING_INTEGER__VALUE);

		markingExtendedEClass = createEClass(MARKING_EXTENDED);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__TYPE);

		markingVariableSimpleEClass = createEClass(MARKING_VARIABLE_SIMPLE);
		createEReference(markingVariableSimpleEClass, MARKING_VARIABLE_SIMPLE__VARIABLE);

		exponentialEClass = createEClass(EXPONENTIAL);
		createEReference(exponentialEClass, EXPONENTIAL__RATE);

		normalEClass = createEClass(NORMAL);
		createEReference(normalEClass, NORMAL__MEAN);
		createEReference(normalEClass, NORMAL__VARIANCE);

		gammaEClass = createEClass(GAMMA);
		createEReference(gammaEClass, GAMMA__ALPHA);
		createEReference(gammaEClass, GAMMA__BETA);

		binomialEClass = createEClass(BINOMIAL);
		createEReference(binomialEClass, BINOMIAL__T);
		createEReference(binomialEClass, BINOMIAL__P);

		deterministicEClass = createEClass(DETERMINISTIC);
		createEReference(deterministicEClass, DETERMINISTIC__VALUE);

		lognormalEClass = createEClass(LOGNORMAL);
		createEReference(lognormalEClass, LOGNORMAL__MU);
		createEReference(lognormalEClass, LOGNORMAL__ALPHA_SQUARED);

		betaEClass = createEClass(BETA);
		createEReference(betaEClass, BETA__ALPHA1);
		createEReference(betaEClass, BETA__BETA1);

		negativeBinomialEClass = createEClass(NEGATIVE_BINOMIAL);
		createEReference(negativeBinomialEClass, NEGATIVE_BINOMIAL__S);
		createEReference(negativeBinomialEClass, NEGATIVE_BINOMIAL__P);

		geometricEClass = createEClass(GEOMETRIC);
		createEReference(geometricEClass, GEOMETRIC__P);

		erlangEClass = createEClass(ERLANG);
		createEReference(erlangEClass, ERLANG__M);
		createEReference(erlangEClass, ERLANG__BETA);

		uniformEClass = createEClass(UNIFORM);
		createEReference(uniformEClass, UNIFORM__LOWER_BOUND);
		createEReference(uniformEClass, UNIFORM__UPPER_BOUND);

		hyperExponentialEClass = createEClass(HYPER_EXPONENTIAL);
		createEReference(hyperExponentialEClass, HYPER_EXPONENTIAL__RATE0);
		createEReference(hyperExponentialEClass, HYPER_EXPONENTIAL__P0);

		weibullEClass = createEClass(WEIBULL);
		createEReference(weibullEClass, WEIBULL__ALPHA);
		createEReference(weibullEClass, WEIBULL__BETA);

		triangularEClass = createEClass(TRIANGULAR);
		createEReference(triangularEClass, TRIANGULAR__MIN);
		createEReference(triangularEClass, TRIANGULAR__MIDDLE);
		createEReference(triangularEClass, TRIANGULAR__MAX);

		conditionalWeibullEClass = createEClass(CONDITIONAL_WEIBULL);
		createEReference(conditionalWeibullEClass, CONDITIONAL_WEIBULL__ALPHA);
		createEReference(conditionalWeibullEClass, CONDITIONAL_WEIBULL__BETA);
		createEReference(conditionalWeibullEClass, CONDITIONAL_WEIBULL__T);

		hypoExponentialEClass = createEClass(HYPO_EXPONENTIAL);
		createEReference(hypoExponentialEClass, HYPO_EXPONENTIAL__RATE0);

		paretoEClass = createEClass(PARETO);
		createEReference(paretoEClass, PARETO__LOWER_BOUND);
		createEReference(paretoEClass, PARETO__SHAPE);

		markingSimpleEClass = createEClass(MARKING_SIMPLE);

		markingStringEClass = createEClass(MARKING_STRING);
		createEAttribute(markingStringEClass, MARKING_STRING__VALUE);

		markingVariableExtendedEClass = createEClass(MARKING_VARIABLE_EXTENDED);
		createEReference(markingVariableExtendedEClass, MARKING_VARIABLE_EXTENDED__VARIABLE);

		// Create enums
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);
		extendedPlaceTypeEEnum = createEEnum(EXTENDED_PLACE_TYPE);

		// Create data types
		codeFragmentEDataType = createEDataType(CODE_FRAGMENT);
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
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		santEClass.getESuperTypes().add(theCorePackage.getTemplateModel());
		placeEClass.getESuperTypes().add(this.getNamedElement());
		normalPlaceEClass.getESuperTypes().add(this.getPlace());
		extendedPlaceEClass.getESuperTypes().add(this.getPlace());
		activityEClass.getESuperTypes().add(this.getNamedElement());
		casesSpecificationCasesEClass.getESuperTypes().add(this.getCasesSpecification());
		casesSpecificationProbabilityArrayEClass.getESuperTypes().add(this.getCasesSpecification());
		casesSpecificationParametricEClass.getESuperTypes().add(this.getCasesSpecification());
		inputArcEClass.getESuperTypes().add(this.getArc());
		outputArcEClass.getESuperTypes().add(this.getArc());
		gateEClass.getESuperTypes().add(this.getNamedElement());
		outputGateEClass.getESuperTypes().add(this.getGate());
		outputGateConcreteEClass.getESuperTypes().add(this.getOutputGate());
		outputGateTemplateEClass.getESuperTypes().add(this.getOutputGate());
		inputGateEClass.getESuperTypes().add(this.getGate());
		instantaneousActivityEClass.getESuperTypes().add(this.getActivity());
		timedActivityEClass.getESuperTypes().add(this.getActivity());
		expressionTextEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionMarkingEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionVariableEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionTemplateExpressionEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionIterationElementEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionActivityCasesNumberEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionActivityCasesNumberEClass.getESuperTypes().add(theExpressionsPackage.getTemplateExpressionInteger());
		expressionPlaceTemplateSizeEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionPlaceTemplateSizeEClass.getESuperTypes().add(theExpressionsPackage.getTemplateExpressionInteger());
		expressionIfThenElseEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionLoopEClass.getESuperTypes().add(this.getExpressionSegment());
		thisContextIteratorEClass.getESuperTypes().add(this.getVariabilityIterator());
		loopIteratorEClass.getESuperTypes().add(this.getVariabilityIterator());
		markingIntegerEClass.getESuperTypes().add(this.getMarkingSimple());
		markingExtendedEClass.getESuperTypes().add(this.getMarking());
		globalVariableEClass.getESuperTypes().add(this.getNamedElement());
		markingVariableSimpleEClass.getESuperTypes().add(this.getMarkingSimple());
		exponentialEClass.getESuperTypes().add(this.getDistribution());
		normalEClass.getESuperTypes().add(this.getDistribution());
		gammaEClass.getESuperTypes().add(this.getDistribution());
		binomialEClass.getESuperTypes().add(this.getDistribution());
		deterministicEClass.getESuperTypes().add(this.getDistribution());
		lognormalEClass.getESuperTypes().add(this.getDistribution());
		betaEClass.getESuperTypes().add(this.getDistribution());
		negativeBinomialEClass.getESuperTypes().add(this.getDistribution());
		geometricEClass.getESuperTypes().add(this.getDistribution());
		erlangEClass.getESuperTypes().add(this.getDistribution());
		uniformEClass.getESuperTypes().add(this.getDistribution());
		hyperExponentialEClass.getESuperTypes().add(this.getDistribution());
		weibullEClass.getESuperTypes().add(this.getDistribution());
		triangularEClass.getESuperTypes().add(this.getDistribution());
		conditionalWeibullEClass.getESuperTypes().add(this.getDistribution());
		hypoExponentialEClass.getESuperTypes().add(this.getDistribution());
		paretoEClass.getESuperTypes().add(this.getDistribution());
		markingSimpleEClass.getESuperTypes().add(this.getMarking());
		markingStringEClass.getESuperTypes().add(this.getMarkingExtended());
		markingVariableExtendedEClass.getESuperTypes().add(this.getMarkingExtended());

		// Initialize classes, features, and operations; add parameters
		initEClass(santEClass, sant.SANT.class, "SANT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSANT_Name(), ecorePackage.getEString(), "name", null, 1, 1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Parameters(), theCorePackage.getParameter(), null, "parameters", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Places(), this.getPlace(), null, "places", null, 1, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Activities(), this.getActivity(), null, "activities", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_GlobalVariables(), this.getGlobalVariable(), null, "globalVariables", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Arcs(), this.getArc(), null, "arcs", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Gates(), this.getGate(), null, "gates", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Initialization(), this.getExpression(), null, "initialization", null, 0, -1, sant.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNamedElement__HasVariability(), ecorePackage.getEBoolean(), "hasVariability", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_Multiplicity(), theCorePackage.getMultiplicity(), null, "multiplicity", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalPlaceEClass, NormalPlace.class, "NormalPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalPlace_Marking(), this.getMarkingSimple(), null, "marking", null, 1, 1, NormalPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedPlaceEClass, ExtendedPlace.class, "ExtendedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedPlace_Marking(), this.getMarkingExtended(), null, "marking", null, 1, 1, ExtendedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedPlace_Type(), this.getExtendedPlaceType(), "type", "double", 1, 1, ExtendedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Cases(), this.getCasesSpecification(), null, "cases", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casesSpecificationEClass, CasesSpecification.class, "CasesSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_ID(), theExpressionsPackage.getTemplateExpressionInteger(), null, "ID", null, 1, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_P(), this.getExpression(), null, "p", null, 1, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casesSpecificationCasesEClass, CasesSpecificationCases.class, "CasesSpecificationCases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCasesSpecificationCases_Cases(), this.getCase(), null, "cases", null, 1, -1, CasesSpecificationCases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casesSpecificationProbabilityArrayEClass, CasesSpecificationProbabilityArray.class, "CasesSpecificationProbabilityArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCasesSpecificationProbabilityArray_PValues(), theCorePackage.getParameterArray(), null, "pValues", null, 1, 1, CasesSpecificationProbabilityArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casesSpecificationParametricEClass, CasesSpecificationParametric.class, "CasesSpecificationParametric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCasesSpecificationParametric_NumCases(), theExpressionsPackage.getTemplateExpressionInteger(), null, "numCases", null, 1, 1, CasesSpecificationParametric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCasesSpecificationParametric_PExpression(), theExpressionsPackage.getTemplateExpressionReal(), null, "pExpression", null, 1, 1, CasesSpecificationParametric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputArcEClass, InputArc.class, "InputArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputArc_Source(), this.getPlace(), null, "source", null, 1, 1, InputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputArc_Target(), this.getActivity(), null, "target", null, 1, 1, InputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputArcEClass, OutputArc.class, "OutputArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputArc_Source(), this.getCase(), null, "source", null, 1, 1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputArc_Target(), this.getPlace(), null, "target", null, 1, 1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGate_Function(), this.getExpression(), null, "function", null, 1, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGate_Places(), this.getPlace(), null, "places", null, 0, -1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputGateEClass, OutputGate.class, "OutputGate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputGateConcreteEClass, OutputGateConcrete.class, "OutputGateConcrete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputGateConcrete_ActivityCase(), this.getCase(), null, "activityCase", null, 1, 1, OutputGateConcrete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputGateTemplateEClass, OutputGateTemplate.class, "OutputGateTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputGateTemplate_Activity(), this.getActivity(), null, "activity", null, 1, 1, OutputGateTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputGateEClass, InputGate.class, "InputGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputGate_Predicate(), this.getExpression(), null, "predicate", null, 1, 1, InputGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputGate_Activity(), this.getActivity(), null, "activity", null, 1, 1, InputGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantaneousActivityEClass, InstantaneousActivity.class, "InstantaneousActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedActivityEClass, TimedActivity.class, "TimedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedActivity_TimeDistribution(), this.getDistribution(), null, "timeDistribution", null, 1, 1, TimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedActivity_Activation(), this.getExpression(), null, "activation", null, 0, 1, TimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedActivity_Reactivation(), this.getExpression(), null, "reactivation", null, 0, 1, TimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributionEClass, Distribution.class, "Distribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Segments(), this.getExpressionSegment(), null, "segments", null, 1, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionSegmentEClass, ExpressionSegment.class, "ExpressionSegment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionTextEClass, ExpressionText.class, "ExpressionText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionText_Text(), this.getCodeFragment(), "text", null, 1, 1, ExpressionText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionMarkingEClass, ExpressionMarking.class, "ExpressionMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionMarking_Place(), this.getPlace(), null, "place", null, 1, 1, ExpressionMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionMarking_Index(), theExpressionsPackage.getTemplateExpressionInteger(), null, "index", null, 1, 1, ExpressionMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionVariableEClass, ExpressionVariable.class, "ExpressionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionVariable_Variable(), this.getGlobalVariable(), null, "variable", null, 1, 1, ExpressionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionTemplateExpressionEClass, ExpressionTemplateExpression.class, "ExpressionTemplateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionTemplateExpression_Exp(), theExpressionsPackage.getTemplateExpression(), null, "exp", null, 1, 1, ExpressionTemplateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionIterationElementEClass, ExpressionIterationElement.class, "ExpressionIterationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionIterationElement_Iterator(), this.getVariabilityIterator(), null, "iterator", null, 1, 1, ExpressionIterationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionIterationElement_I(), ecorePackage.getEInt(), "i", null, 1, 1, ExpressionIterationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionActivityCasesNumberEClass, ExpressionActivityCasesNumber.class, "ExpressionActivityCasesNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionActivityCasesNumber_Activity(), this.getActivity(), null, "activity", null, 1, 1, ExpressionActivityCasesNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getExpressionActivityCasesNumber__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(expressionPlaceTemplateSizeEClass, ExpressionPlaceTemplateSize.class, "ExpressionPlaceTemplateSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionPlaceTemplateSize_Place(), this.getPlace(), null, "place", null, 1, 1, ExpressionPlaceTemplateSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExpressionPlaceTemplateSize__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(expressionIfThenElseEClass, ExpressionIfThenElse.class, "ExpressionIfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionIfThenElse_Condition(), theExpressionsPackage.getTemplateExpressionBoolean(), null, "condition", null, 1, 1, ExpressionIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionIfThenElse_IfTrue(), this.getExpressionSegment(), null, "ifTrue", null, 1, 1, ExpressionIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionIfThenElse_IfFalse(), this.getExpressionSegment(), null, "ifFalse", null, 0, 1, ExpressionIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionLoopEClass, ExpressionLoop.class, "ExpressionLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionLoop_Begin(), theExpressionsPackage.getTemplateExpressionInteger(), null, "begin", null, 1, 1, ExpressionLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionLoop_End(), theExpressionsPackage.getTemplateExpressionInteger(), null, "end", null, 1, 1, ExpressionLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionLoop_Do(), this.getExpressionSegment(), null, "do", null, 1, -1, ExpressionLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variabilityIteratorEClass, VariabilityIterator.class, "VariabilityIterator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thisContextIteratorEClass, ThisContextIterator.class, "ThisContextIterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopIteratorEClass, LoopIterator.class, "LoopIterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopIterator_Loop(), this.getExpressionLoop(), null, "loop", null, 1, 1, LoopIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(markingIntegerEClass, MarkingInteger.class, "MarkingInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkingInteger_Value(), theExpressionsPackage.getTemplateExpressionInteger(), null, "value", null, 1, 1, MarkingInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingExtendedEClass, MarkingExtended.class, "MarkingExtended", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalVariable_Type(), this.getVariableType(), "type", "int", 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingVariableSimpleEClass, MarkingVariableSimple.class, "MarkingVariableSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkingVariableSimple_Variable(), this.getGlobalVariable(), null, "variable", null, 1, 1, MarkingVariableSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialEClass, Exponential.class, "Exponential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExponential_Rate(), this.getExpression(), null, "rate", null, 1, 1, Exponential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalEClass, Normal.class, "Normal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormal_Mean(), this.getExpression(), null, "mean", null, 1, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormal_Variance(), this.getExpression(), null, "variance", null, 1, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gammaEClass, Gamma.class, "Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamma_Alpha(), this.getExpression(), null, "alpha", null, 1, 1, Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamma_Beta(), this.getExpression(), null, "beta", null, 1, 1, Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binomialEClass, Binomial.class, "Binomial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinomial_T(), this.getExpression(), null, "t", null, 1, 1, Binomial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinomial_P(), this.getExpression(), null, "p", null, 1, 1, Binomial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deterministicEClass, Deterministic.class, "Deterministic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeterministic_Value(), this.getExpression(), null, "value", null, 1, 1, Deterministic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lognormalEClass, Lognormal.class, "Lognormal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLognormal_Mu(), this.getExpression(), null, "mu", null, 1, 1, Lognormal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLognormal_AlphaSquared(), this.getExpression(), null, "alphaSquared", null, 1, 1, Lognormal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betaEClass, Beta.class, "Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeta_Alpha1(), this.getExpression(), null, "alpha1", null, 1, 1, Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeta_Beta1(), this.getExpression(), null, "beta1", null, 1, 1, Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negativeBinomialEClass, NegativeBinomial.class, "NegativeBinomial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativeBinomial_S(), this.getExpression(), null, "s", null, 1, 1, NegativeBinomial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegativeBinomial_P(), this.getExpression(), null, "p", null, 1, 1, NegativeBinomial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometricEClass, Geometric.class, "Geometric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometric_P(), this.getExpression(), null, "p", null, 1, 1, Geometric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erlangEClass, Erlang.class, "Erlang", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErlang_M(), this.getExpression(), null, "m", null, 1, 1, Erlang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErlang_Beta(), this.getExpression(), null, "beta", null, 1, 1, Erlang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniformEClass, Uniform.class, "Uniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniform_LowerBound(), this.getExpression(), null, "lowerBound", null, 1, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniform_UpperBound(), this.getExpression(), null, "upperBound", null, 1, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hyperExponentialEClass, HyperExponential.class, "HyperExponential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHyperExponential_Rate0(), this.getExpression(), null, "rate0", null, 1, 1, HyperExponential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHyperExponential_P0(), this.getExpression(), null, "p0", null, 1, 1, HyperExponential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weibullEClass, Weibull.class, "Weibull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeibull_Alpha(), this.getExpression(), null, "alpha", null, 1, 1, Weibull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeibull_Beta(), this.getExpression(), null, "beta", null, 1, 1, Weibull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triangularEClass, Triangular.class, "Triangular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriangular_Min(), this.getExpression(), null, "min", null, 1, 1, Triangular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriangular_Middle(), this.getExpression(), null, "middle", null, 1, 1, Triangular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriangular_Max(), this.getExpression(), null, "max", null, 1, 1, Triangular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalWeibullEClass, ConditionalWeibull.class, "ConditionalWeibull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalWeibull_Alpha(), this.getExpression(), null, "alpha", null, 1, 1, ConditionalWeibull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalWeibull_Beta(), this.getExpression(), null, "beta", null, 1, 1, ConditionalWeibull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalWeibull_T(), this.getExpression(), null, "t", null, 1, 1, ConditionalWeibull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypoExponentialEClass, HypoExponential.class, "HypoExponential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHypoExponential_Rate0(), this.getExpression(), null, "rate0", null, 1, 1, HypoExponential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paretoEClass, Pareto.class, "Pareto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPareto_LowerBound(), this.getExpression(), null, "lowerBound", null, 1, 1, Pareto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPareto_Shape(), this.getExpression(), null, "shape", null, 1, 1, Pareto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingSimpleEClass, MarkingSimple.class, "MarkingSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(markingStringEClass, MarkingString.class, "MarkingString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkingString_Value(), ecorePackage.getEString(), "value", "0", 1, 1, MarkingString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingVariableExtendedEClass, MarkingVariableExtended.class, "MarkingVariableExtended", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkingVariableExtended_Variable(), this.getGlobalVariable(), null, "variable", null, 1, 1, MarkingVariableExtended.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.SHORT);
		addEEnumLiteral(variableTypeEEnum, VariableType.INT);
		addEEnumLiteral(variableTypeEEnum, VariableType.LONG);
		addEEnumLiteral(variableTypeEEnum, VariableType.FLOAT);
		addEEnumLiteral(variableTypeEEnum, VariableType.DOUBLE);
		addEEnumLiteral(variableTypeEEnum, VariableType.BOOL);
		addEEnumLiteral(variableTypeEEnum, VariableType.CHAR);

		initEEnum(extendedPlaceTypeEEnum, ExtendedPlaceType.class, "ExtendedPlaceType");
		addEEnumLiteral(extendedPlaceTypeEEnum, ExtendedPlaceType.INT);
		addEEnumLiteral(extendedPlaceTypeEEnum, ExtendedPlaceType.SHORT);
		addEEnumLiteral(extendedPlaceTypeEEnum, ExtendedPlaceType.FLOAT);
		addEEnumLiteral(extendedPlaceTypeEEnum, ExtendedPlaceType.DOUBLE);
		addEEnumLiteral(extendedPlaceTypeEEnum, ExtendedPlaceType.CHAR);

		// Initialize data types
		initEDataType(codeFragmentEDataType, String.class, "CodeFragment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (outputGateConcreteEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (outputGateTemplateEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (inputGateEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (expressionTextEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExpressionText_Text(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (getExpressionActivityCasesNumber__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\tlet c = activity.cases\n\t\t\tin\n\t\t\t\tif c.oclIsTypeOf(CasesSpecificationCases) then\n\t\t\t\t\tc.oclAsType(CasesSpecificationCases).cases->size()\n\t\t\t\telse\n\t\t\t\t\tif c.oclIsTypeOf(CasesSpecificationProbabilityArray) then\n\t\t\t\t\t\tc.oclAsType(CasesSpecificationProbabilityArray).pValues->size()\n\t\t\t\t\telse\n\t\t\t\t\t\tc.oclAsType(CasesSpecificationParametric).pExpression.evaluate(assignments)\n\t\t\t\t\tendif\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getExpressionPlaceTemplateSize__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\tlet mult = place.multiplicity \n\t\t\tin\n\t\t\t\tif mult.oclIsTypeOf(tmdl::core::MultiplicityValue) then\n\t\t\t\t\tmult.oclAsType(tmdl::core::MultiplicityValue).value.floor()\n\t\t\t\telse\n\t\t\t\t\tif mult.oclIsTypeOf(tmdl::core::MultiplicityArray) then\n\t\t\t\t\t\tmult.oclAsType(tmdl::core::MultiplicityArray).values->size()\n\t\t\t\t\telse\n\t\t\t\t\t\tlet par = mult.oclAsType(tmdl::core::MultiplicityParametric).parameter\n\t\t\t\t\t\tin\n\t\t\t\t\t\t\tif par.oclIsTypeOf(tmdl::core::ParameterSimple) then\n\t\t\t\t\t\t\t\tassignments->select(a | a.oclIsTypeOf(tmdl::core::AssignmentSimple))\n\t\t\t\t\t\t\t\t\t->collect(as | as.oclAsType(tmdl::core::AssignmentSimple))\n\t\t\t\t\t\t\t\t\t->select(i | i.parameter = par)\n\t\t\t\t\t\t\t\t\t->asSequence()->first().value\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tassignments->select(a | a.oclIsTypeOf(tmdl::core::AssignmentArray))\n\t\t\t\t\t\t\t\t\t->collect(as | as.oclAsType(tmdl::core::AssignmentArray))\n\t\t\t\t\t\t\t\t\t->select(i | i.parameter = par)\n\t\t\t\t\t\t\t\t\t->asSequence()->first().values->size()\n\t\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif"
		   });
	}

} //SANTPackageImpl
