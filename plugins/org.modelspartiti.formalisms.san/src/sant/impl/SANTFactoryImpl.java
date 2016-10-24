/**
 */
package sant.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sant.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANTFactoryImpl extends EFactoryImpl implements SANTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SANTFactory init() {
		try {
			SANTFactory theSANTFactory = (SANTFactory)EPackage.Registry.INSTANCE.getEFactory(SANTPackage.eNS_URI);
			if (theSANTFactory != null) {
				return theSANTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SANTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SANTPackage.SANT: return createSANT();
			case SANTPackage.NORMAL_PLACE: return createNormalPlace();
			case SANTPackage.EXTENDED_PLACE: return createExtendedPlace();
			case SANTPackage.CASE: return createCase();
			case SANTPackage.CASES_SPECIFICATION_CASES: return createCasesSpecificationCases();
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY: return createCasesSpecificationProbabilityArray();
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC: return createCasesSpecificationParametric();
			case SANTPackage.INPUT_ARC: return createInputArc();
			case SANTPackage.OUTPUT_ARC: return createOutputArc();
			case SANTPackage.OUTPUT_GATE_CONCRETE: return createOutputGateConcrete();
			case SANTPackage.OUTPUT_GATE_TEMPLATE: return createOutputGateTemplate();
			case SANTPackage.INPUT_GATE: return createInputGate();
			case SANTPackage.INSTANTANEOUS_ACTIVITY: return createInstantaneousActivity();
			case SANTPackage.TIMED_ACTIVITY: return createTimedActivity();
			case SANTPackage.EXPRESSION: return createExpression();
			case SANTPackage.EXPRESSION_TEXT: return createExpressionText();
			case SANTPackage.EXPRESSION_MARKING: return createExpressionMarking();
			case SANTPackage.EXPRESSION_VARIABLE: return createExpressionVariable();
			case SANTPackage.EXPRESSION_TEMPLATE_EXPRESSION: return createExpressionTemplateExpression();
			case SANTPackage.EXPRESSION_ITERATION_ELEMENT: return createExpressionIterationElement();
			case SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER: return createExpressionActivityCasesNumber();
			case SANTPackage.EXPRESSION_PLACE_TEMPLATE_SIZE: return createExpressionPlaceTemplateSize();
			case SANTPackage.EXPRESSION_IF_THEN_ELSE: return createExpressionIfThenElse();
			case SANTPackage.EXPRESSION_LOOP: return createExpressionLoop();
			case SANTPackage.THIS_CONTEXT_ITERATOR: return createThisContextIterator();
			case SANTPackage.LOOP_ITERATOR: return createLoopIterator();
			case SANTPackage.MARKING_INTEGER: return createMarkingInteger();
			case SANTPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case SANTPackage.MARKING_VARIABLE_SIMPLE: return createMarkingVariableSimple();
			case SANTPackage.EXPONENTIAL: return createExponential();
			case SANTPackage.NORMAL: return createNormal();
			case SANTPackage.GAMMA: return createGamma();
			case SANTPackage.BINOMIAL: return createBinomial();
			case SANTPackage.DETERMINISTIC: return createDeterministic();
			case SANTPackage.LOGNORMAL: return createLognormal();
			case SANTPackage.BETA: return createBeta();
			case SANTPackage.NEGATIVE_BINOMIAL: return createNegativeBinomial();
			case SANTPackage.GEOMETRIC: return createGeometric();
			case SANTPackage.ERLANG: return createErlang();
			case SANTPackage.UNIFORM: return createUniform();
			case SANTPackage.HYPER_EXPONENTIAL: return createHyperExponential();
			case SANTPackage.WEIBULL: return createWeibull();
			case SANTPackage.TRIANGULAR: return createTriangular();
			case SANTPackage.CONDITIONAL_WEIBULL: return createConditionalWeibull();
			case SANTPackage.HYPO_EXPONENTIAL: return createHypoExponential();
			case SANTPackage.PARETO: return createPareto();
			case SANTPackage.MARKING_STRING: return createMarkingString();
			case SANTPackage.MARKING_VARIABLE_EXTENDED: return createMarkingVariableExtended();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SANTPackage.VARIABLE_TYPE:
				return createVariableTypeFromString(eDataType, initialValue);
			case SANTPackage.EXTENDED_PLACE_TYPE:
				return createExtendedPlaceTypeFromString(eDataType, initialValue);
			case SANTPackage.CODE_FRAGMENT:
				return createCodeFragmentFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SANTPackage.VARIABLE_TYPE:
				return convertVariableTypeToString(eDataType, instanceValue);
			case SANTPackage.EXTENDED_PLACE_TYPE:
				return convertExtendedPlaceTypeToString(eDataType, instanceValue);
			case SANTPackage.CODE_FRAGMENT:
				return convertCodeFragmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT createSANT() {
		SANTImpl sant = new SANTImpl();
		return sant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalPlace createNormalPlace() {
		NormalPlaceImpl normalPlace = new NormalPlaceImpl();
		return normalPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPlace createExtendedPlace() {
		ExtendedPlaceImpl extendedPlace = new ExtendedPlaceImpl();
		return extendedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasesSpecificationCases createCasesSpecificationCases() {
		CasesSpecificationCasesImpl casesSpecificationCases = new CasesSpecificationCasesImpl();
		return casesSpecificationCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasesSpecificationProbabilityArray createCasesSpecificationProbabilityArray() {
		CasesSpecificationProbabilityArrayImpl casesSpecificationProbabilityArray = new CasesSpecificationProbabilityArrayImpl();
		return casesSpecificationProbabilityArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasesSpecificationParametric createCasesSpecificationParametric() {
		CasesSpecificationParametricImpl casesSpecificationParametric = new CasesSpecificationParametricImpl();
		return casesSpecificationParametric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputArc createInputArc() {
		InputArcImpl inputArc = new InputArcImpl();
		return inputArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputArc createOutputArc() {
		OutputArcImpl outputArc = new OutputArcImpl();
		return outputArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputGateConcrete createOutputGateConcrete() {
		OutputGateConcreteImpl outputGateConcrete = new OutputGateConcreteImpl();
		return outputGateConcrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputGateTemplate createOutputGateTemplate() {
		OutputGateTemplateImpl outputGateTemplate = new OutputGateTemplateImpl();
		return outputGateTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputGate createInputGate() {
		InputGateImpl inputGate = new InputGateImpl();
		return inputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantaneousActivity createInstantaneousActivity() {
		InstantaneousActivityImpl instantaneousActivity = new InstantaneousActivityImpl();
		return instantaneousActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedActivity createTimedActivity() {
		TimedActivityImpl timedActivity = new TimedActivityImpl();
		return timedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionText createExpressionText() {
		ExpressionTextImpl expressionText = new ExpressionTextImpl();
		return expressionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionMarking createExpressionMarking() {
		ExpressionMarkingImpl expressionMarking = new ExpressionMarkingImpl();
		return expressionMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionVariable createExpressionVariable() {
		ExpressionVariableImpl expressionVariable = new ExpressionVariableImpl();
		return expressionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionTemplateExpression createExpressionTemplateExpression() {
		ExpressionTemplateExpressionImpl expressionTemplateExpression = new ExpressionTemplateExpressionImpl();
		return expressionTemplateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionIterationElement createExpressionIterationElement() {
		ExpressionIterationElementImpl expressionIterationElement = new ExpressionIterationElementImpl();
		return expressionIterationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionActivityCasesNumber createExpressionActivityCasesNumber() {
		ExpressionActivityCasesNumberImpl expressionActivityCasesNumber = new ExpressionActivityCasesNumberImpl();
		return expressionActivityCasesNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionPlaceTemplateSize createExpressionPlaceTemplateSize() {
		ExpressionPlaceTemplateSizeImpl expressionPlaceTemplateSize = new ExpressionPlaceTemplateSizeImpl();
		return expressionPlaceTemplateSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionIfThenElse createExpressionIfThenElse() {
		ExpressionIfThenElseImpl expressionIfThenElse = new ExpressionIfThenElseImpl();
		return expressionIfThenElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLoop createExpressionLoop() {
		ExpressionLoopImpl expressionLoop = new ExpressionLoopImpl();
		return expressionLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThisContextIterator createThisContextIterator() {
		ThisContextIteratorImpl thisContextIterator = new ThisContextIteratorImpl();
		return thisContextIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopIterator createLoopIterator() {
		LoopIteratorImpl loopIterator = new LoopIteratorImpl();
		return loopIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingInteger createMarkingInteger() {
		MarkingIntegerImpl markingInteger = new MarkingIntegerImpl();
		return markingInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingVariableSimple createMarkingVariableSimple() {
		MarkingVariableSimpleImpl markingVariableSimple = new MarkingVariableSimpleImpl();
		return markingVariableSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exponential createExponential() {
		ExponentialImpl exponential = new ExponentialImpl();
		return exponential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Normal createNormal() {
		NormalImpl normal = new NormalImpl();
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gamma createGamma() {
		GammaImpl gamma = new GammaImpl();
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binomial createBinomial() {
		BinomialImpl binomial = new BinomialImpl();
		return binomial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deterministic createDeterministic() {
		DeterministicImpl deterministic = new DeterministicImpl();
		return deterministic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lognormal createLognormal() {
		LognormalImpl lognormal = new LognormalImpl();
		return lognormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beta createBeta() {
		BetaImpl beta = new BetaImpl();
		return beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeBinomial createNegativeBinomial() {
		NegativeBinomialImpl negativeBinomial = new NegativeBinomialImpl();
		return negativeBinomial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometric createGeometric() {
		GeometricImpl geometric = new GeometricImpl();
		return geometric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Erlang createErlang() {
		ErlangImpl erlang = new ErlangImpl();
		return erlang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uniform createUniform() {
		UniformImpl uniform = new UniformImpl();
		return uniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperExponential createHyperExponential() {
		HyperExponentialImpl hyperExponential = new HyperExponentialImpl();
		return hyperExponential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weibull createWeibull() {
		WeibullImpl weibull = new WeibullImpl();
		return weibull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triangular createTriangular() {
		TriangularImpl triangular = new TriangularImpl();
		return triangular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalWeibull createConditionalWeibull() {
		ConditionalWeibullImpl conditionalWeibull = new ConditionalWeibullImpl();
		return conditionalWeibull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypoExponential createHypoExponential() {
		HypoExponentialImpl hypoExponential = new HypoExponentialImpl();
		return hypoExponential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pareto createPareto() {
		ParetoImpl pareto = new ParetoImpl();
		return pareto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingString createMarkingString() {
		MarkingStringImpl markingString = new MarkingStringImpl();
		return markingString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingVariableExtended createMarkingVariableExtended() {
		MarkingVariableExtendedImpl markingVariableExtended = new MarkingVariableExtendedImpl();
		return markingVariableExtended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue) {
		VariableType result = VariableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPlaceType createExtendedPlaceTypeFromString(EDataType eDataType, String initialValue) {
		ExtendedPlaceType result = ExtendedPlaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtendedPlaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodeFragmentFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeFragmentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANTPackage getSANTPackage() {
		return (SANTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SANTPackage getPackage() {
		return SANTPackage.eINSTANCE;
	}

} //SANTFactoryImpl
