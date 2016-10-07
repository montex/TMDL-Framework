/**
 */
package san.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import san.Activity;
import san.Arc;
import san.Beta;
import san.Binomial;
import san.Case;
import san.ConditionalWeibull;
import san.Deterministic;
import san.Distribution;
import san.Erlang;
import san.Exponential;
import san.Expression;
import san.ExpressionMarking;
import san.ExpressionSegment;
import san.ExpressionText;
import san.ExpressionVariable;
import san.ExtendedPlace;
import san.Gamma;
import san.Gate;
import san.Geometric;
import san.GlobalVariable;
import san.HyperExponential;
import san.HypoExponential;
import san.InputArc;
import san.InputGate;
import san.InstantaneousActivity;
import san.Lognormal;
import san.Marking;
import san.MarkingExtended;
import san.MarkingInteger;
import san.MarkingSimple;
import san.MarkingVariable;
import san.NamedElement;
import san.NegativeBinomial;
import san.Normal;
import san.NormalPlace;
import san.OutputArc;
import san.OutputGate;
import san.Pareto;
import san.Place;
import san.SANFactory;
import san.SANPackage;
import san.TimedActivity;
import san.Triangular;
import san.Uniform;
import san.VariableType;
import san.Weibull;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANPackageImpl extends EPackageImpl implements SANPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sanEClass = null;

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
	private EClass activityEClass = null;

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
	private EClass caseEClass = null;

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
	private EClass markingVariableEClass = null;

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
	private EClass expressionSegmentEClass = null;

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
	private EEnum variableTypeEEnum = null;

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
	 * @see san.SANPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SANPackageImpl() {
		super(eNS_URI, SANFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SANPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SANPackage init() {
		if (isInited) return (SANPackage)EPackage.Registry.INSTANCE.getEPackage(SANPackage.eNS_URI);

		// Obtain or create and register package
		SANPackageImpl theSANPackage = (SANPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SANPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SANPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSANPackage.createPackageContents();

		// Initialize created meta-data
		theSANPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSANPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SANPackage.eNS_URI, theSANPackage);
		return theSANPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAN() {
		return sanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAN_Places() {
		return (EReference)sanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAN_Name() {
		return (EAttribute)sanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAN_Activities() {
		return (EReference)sanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAN_GlobalVariables() {
		return (EReference)sanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAN_Arcs() {
		return (EReference)sanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAN_Gates() {
		return (EReference)sanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAN_Initialization() {
		return (EReference)sanEClass.getEStructuralFeatures().get(6);
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
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase_ID() {
		return (EAttribute)caseEClass.getEStructuralFeatures().get(0);
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
	public EReference getGate_Activity() {
		return (EReference)gateEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMarkingInteger_Value() {
		return (EAttribute)markingIntegerEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMarkingExtended_Value() {
		return (EAttribute)markingExtendedEClass.getEStructuralFeatures().get(0);
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
	public EClass getMarkingVariable() {
		return markingVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkingVariable_Variable() {
		return (EReference)markingVariableEClass.getEStructuralFeatures().get(0);
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
	public EClass getExpressionSegment() {
		return expressionSegmentEClass;
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
	public EEnum getVariableType() {
		return variableTypeEEnum;
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
	public SANFactory getSANFactory() {
		return (SANFactory)getEFactoryInstance();
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
		sanEClass = createEClass(SAN);
		createEReference(sanEClass, SAN__PLACES);
		createEAttribute(sanEClass, SAN__NAME);
		createEReference(sanEClass, SAN__ACTIVITIES);
		createEReference(sanEClass, SAN__GLOBAL_VARIABLES);
		createEReference(sanEClass, SAN__ARCS);
		createEReference(sanEClass, SAN__GATES);
		createEReference(sanEClass, SAN__INITIALIZATION);

		placeEClass = createEClass(PLACE);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__CASES);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		caseEClass = createEClass(CASE);
		createEAttribute(caseEClass, CASE__ID);
		createEReference(caseEClass, CASE__P);

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
		createEReference(gateEClass, GATE__ACTIVITY);

		outputGateEClass = createEClass(OUTPUT_GATE);

		inputGateEClass = createEClass(INPUT_GATE);
		createEReference(inputGateEClass, INPUT_GATE__PREDICATE);

		instantaneousActivityEClass = createEClass(INSTANTANEOUS_ACTIVITY);

		timedActivityEClass = createEClass(TIMED_ACTIVITY);
		createEReference(timedActivityEClass, TIMED_ACTIVITY__TIME_DISTRIBUTION);
		createEReference(timedActivityEClass, TIMED_ACTIVITY__ACTIVATION);
		createEReference(timedActivityEClass, TIMED_ACTIVITY__REACTIVATION);

		distributionEClass = createEClass(DISTRIBUTION);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__SEGMENTS);

		expressionTextEClass = createEClass(EXPRESSION_TEXT);
		createEAttribute(expressionTextEClass, EXPRESSION_TEXT__TEXT);

		expressionMarkingEClass = createEClass(EXPRESSION_MARKING);
		createEReference(expressionMarkingEClass, EXPRESSION_MARKING__PLACE);

		expressionVariableEClass = createEClass(EXPRESSION_VARIABLE);
		createEReference(expressionVariableEClass, EXPRESSION_VARIABLE__VARIABLE);

		markingEClass = createEClass(MARKING);

		markingIntegerEClass = createEClass(MARKING_INTEGER);
		createEAttribute(markingIntegerEClass, MARKING_INTEGER__VALUE);

		markingExtendedEClass = createEClass(MARKING_EXTENDED);
		createEAttribute(markingExtendedEClass, MARKING_EXTENDED__VALUE);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__TYPE);

		markingVariableEClass = createEClass(MARKING_VARIABLE);
		createEReference(markingVariableEClass, MARKING_VARIABLE__VARIABLE);

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

		expressionSegmentEClass = createEClass(EXPRESSION_SEGMENT);

		markingSimpleEClass = createEClass(MARKING_SIMPLE);

		normalPlaceEClass = createEClass(NORMAL_PLACE);
		createEReference(normalPlaceEClass, NORMAL_PLACE__MARKING);

		extendedPlaceEClass = createEClass(EXTENDED_PLACE);
		createEReference(extendedPlaceEClass, EXTENDED_PLACE__MARKING);

		// Create enums
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(this.getNamedElement());
		activityEClass.getESuperTypes().add(this.getNamedElement());
		inputArcEClass.getESuperTypes().add(this.getArc());
		outputArcEClass.getESuperTypes().add(this.getArc());
		gateEClass.getESuperTypes().add(this.getNamedElement());
		outputGateEClass.getESuperTypes().add(this.getGate());
		inputGateEClass.getESuperTypes().add(this.getGate());
		instantaneousActivityEClass.getESuperTypes().add(this.getActivity());
		timedActivityEClass.getESuperTypes().add(this.getActivity());
		expressionTextEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionMarkingEClass.getESuperTypes().add(this.getExpressionSegment());
		expressionVariableEClass.getESuperTypes().add(this.getExpressionSegment());
		markingIntegerEClass.getESuperTypes().add(this.getMarkingSimple());
		markingExtendedEClass.getESuperTypes().add(this.getMarking());
		globalVariableEClass.getESuperTypes().add(this.getNamedElement());
		markingVariableEClass.getESuperTypes().add(this.getMarkingSimple());
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
		normalPlaceEClass.getESuperTypes().add(this.getPlace());
		extendedPlaceEClass.getESuperTypes().add(this.getPlace());

		// Initialize classes, features, and operations; add parameters
		initEClass(sanEClass, san.SAN.class, "SAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSAN_Places(), this.getPlace(), null, "places", null, 1, -1, san.SAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSAN_Places().getEKeys().add(this.getNamedElement_Name());
		initEAttribute(getSAN_Name(), ecorePackage.getEString(), "name", null, 1, 1, san.SAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAN_Activities(), this.getActivity(), null, "activities", null, 0, -1, san.SAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSAN_Activities().getEKeys().add(this.getNamedElement_Name());
		initEReference(getSAN_GlobalVariables(), this.getGlobalVariable(), null, "globalVariables", null, 0, -1, san.SAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSAN_GlobalVariables().getEKeys().add(this.getNamedElement_Name());
		initEReference(getSAN_Arcs(), this.getArc(), null, "arcs", null, 0, -1, san.SAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAN_Gates(), this.getGate(), null, "gates", null, 0, -1, san.SAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAN_Initialization(), this.getExpression(), null, "initialization", null, 0, -1, san.SAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Cases(), this.getCase(), null, "cases", null, 1, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getActivity_Cases().getEKeys().add(this.getCase_ID());

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCase_ID(), ecorePackage.getEInt(), "ID", "0", 1, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_P(), this.getExpression(), null, "p", null, 1, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getGate_Activity(), this.getActivity(), null, "activity", null, 1, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputGateEClass, OutputGate.class, "OutputGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputGateEClass, InputGate.class, "InputGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputGate_Predicate(), this.getExpression(), null, "predicate", null, 1, 1, InputGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantaneousActivityEClass, InstantaneousActivity.class, "InstantaneousActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedActivityEClass, TimedActivity.class, "TimedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedActivity_TimeDistribution(), this.getDistribution(), null, "timeDistribution", null, 1, 1, TimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedActivity_Activation(), this.getExpression(), null, "activation", null, 0, 1, TimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedActivity_Reactivation(), this.getExpression(), null, "reactivation", null, 0, 1, TimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributionEClass, Distribution.class, "Distribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Segments(), this.getExpressionSegment(), null, "segments", null, 1, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionTextEClass, ExpressionText.class, "ExpressionText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionText_Text(), this.getCodeFragment(), "text", null, 1, 1, ExpressionText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionMarkingEClass, ExpressionMarking.class, "ExpressionMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionMarking_Place(), this.getPlace(), null, "place", null, 1, 1, ExpressionMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionVariableEClass, ExpressionVariable.class, "ExpressionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionVariable_Variable(), this.getGlobalVariable(), null, "variable", null, 1, 1, ExpressionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(markingIntegerEClass, MarkingInteger.class, "MarkingInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkingInteger_Value(), ecorePackage.getEInt(), "value", null, 1, 1, MarkingInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingExtendedEClass, MarkingExtended.class, "MarkingExtended", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkingExtended_Value(), ecorePackage.getEString(), "value", "0", 1, 1, MarkingExtended.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalVariable_Type(), this.getVariableType(), "type", "int", 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingVariableEClass, MarkingVariable.class, "MarkingVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkingVariable_Variable(), this.getGlobalVariable(), null, "variable", null, 1, 1, MarkingVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(expressionSegmentEClass, ExpressionSegment.class, "ExpressionSegment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(markingSimpleEClass, MarkingSimple.class, "MarkingSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalPlaceEClass, NormalPlace.class, "NormalPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalPlace_Marking(), this.getMarkingSimple(), null, "marking", null, 1, 1, NormalPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedPlaceEClass, ExtendedPlace.class, "ExtendedPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedPlace_Marking(), this.getMarking(), null, "marking", null, 1, 1, ExtendedPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.SHORT);
		addEEnumLiteral(variableTypeEEnum, VariableType.INT);
		addEEnumLiteral(variableTypeEEnum, VariableType.LONG);
		addEEnumLiteral(variableTypeEEnum, VariableType.FLOAT);
		addEEnumLiteral(variableTypeEEnum, VariableType.DOUBLE);
		addEEnumLiteral(variableTypeEEnum, VariableType.BOOL);
		addEEnumLiteral(variableTypeEEnum, VariableType.CHAR);

		// Initialize data types
		initEDataType(codeFragmentEDataType, String.class, "CodeFragment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (outputGateEClass, 
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

} //SANPackageImpl
