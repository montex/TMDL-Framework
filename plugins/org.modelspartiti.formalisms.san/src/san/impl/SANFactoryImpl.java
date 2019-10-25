/**
 */
package san.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import san.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANFactoryImpl extends EFactoryImpl implements SANFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SANFactory init() {
		try {
			SANFactory theSANFactory = (SANFactory)EPackage.Registry.INSTANCE.getEFactory(SANPackage.eNS_URI);
			if (theSANFactory != null) {
				return theSANFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SANFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANFactoryImpl() {
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
			case SANPackage.SAN: return createSAN();
			case SANPackage.PLACE: return createPlace();
			case SANPackage.CASE: return createCase();
			case SANPackage.INPUT_ARC: return createInputArc();
			case SANPackage.OUTPUT_ARC: return createOutputArc();
			case SANPackage.OUTPUT_GATE: return createOutputGate();
			case SANPackage.INPUT_GATE: return createInputGate();
			case SANPackage.INSTANTANEOUS_ACTIVITY: return createInstantaneousActivity();
			case SANPackage.TIMED_ACTIVITY: return createTimedActivity();
			case SANPackage.EXPRESSION: return createExpression();
			case SANPackage.EXPRESSION_TEXT: return createExpressionText();
			case SANPackage.EXPRESSION_MARKING: return createExpressionMarking();
			case SANPackage.EXPRESSION_VARIABLE: return createExpressionVariable();
			case SANPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case SANPackage.EXPONENTIAL: return createExponential();
			case SANPackage.NORMAL: return createNormal();
			case SANPackage.GAMMA: return createGamma();
			case SANPackage.BINOMIAL: return createBinomial();
			case SANPackage.DETERMINISTIC: return createDeterministic();
			case SANPackage.LOGNORMAL: return createLognormal();
			case SANPackage.BETA: return createBeta();
			case SANPackage.NEGATIVE_BINOMIAL: return createNegativeBinomial();
			case SANPackage.GEOMETRIC: return createGeometric();
			case SANPackage.ERLANG: return createErlang();
			case SANPackage.UNIFORM: return createUniform();
			case SANPackage.HYPER_EXPONENTIAL: return createHyperExponential();
			case SANPackage.WEIBULL: return createWeibull();
			case SANPackage.TRIANGULAR: return createTriangular();
			case SANPackage.CONDITIONAL_WEIBULL: return createConditionalWeibull();
			case SANPackage.HYPO_EXPONENTIAL: return createHypoExponential();
			case SANPackage.PARETO: return createPareto();
			case SANPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case SANPackage.COMPLEX_TYPE: return createComplexType();
			case SANPackage.CUSTOM_TYPE_ARRAY: return createCustomTypeArray();
			case SANPackage.CUSTOM_TYPE_STRUCT: return createCustomTypeStruct();
			case SANPackage.FIELD: return createField();
			case SANPackage.MARKING_INTERMEDIATE_NODE: return createMarkingIntermediateNode();
			case SANPackage.MARKING_LEAF_NODE: return createMarkingLeafNode();
			case SANPackage.MARKING_SIMPLE: return createMarkingSimple();
			case SANPackage.MARKING_GLOBAL_VARIABLE: return createMarkingGlobalVariable();
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
			case SANPackage.VARIABLE_TYPE:
				return createVariableTypeFromString(eDataType, initialValue);
			case SANPackage.EXTENDED_PLACE_TYPE:
				return createExtendedPlaceTypeFromString(eDataType, initialValue);
			case SANPackage.CODE_FRAGMENT:
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
			case SANPackage.VARIABLE_TYPE:
				return convertVariableTypeToString(eDataType, instanceValue);
			case SANPackage.EXTENDED_PLACE_TYPE:
				return convertExtendedPlaceTypeToString(eDataType, instanceValue);
			case SANPackage.CODE_FRAGMENT:
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
	public SAN createSAN() {
		SANImpl san = new SANImpl();
		return san;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
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
	public OutputGate createOutputGate() {
		OutputGateImpl outputGate = new OutputGateImpl();
		return outputGate;
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
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
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
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTypeArray createCustomTypeArray() {
		CustomTypeArrayImpl customTypeArray = new CustomTypeArrayImpl();
		return customTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTypeStruct createCustomTypeStruct() {
		CustomTypeStructImpl customTypeStruct = new CustomTypeStructImpl();
		return customTypeStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingIntermediateNode createMarkingIntermediateNode() {
		MarkingIntermediateNodeImpl markingIntermediateNode = new MarkingIntermediateNodeImpl();
		return markingIntermediateNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingLeafNode createMarkingLeafNode() {
		MarkingLeafNodeImpl markingLeafNode = new MarkingLeafNodeImpl();
		return markingLeafNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingSimple createMarkingSimple() {
		MarkingSimpleImpl markingSimple = new MarkingSimpleImpl();
		return markingSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingGlobalVariable createMarkingGlobalVariable() {
		MarkingGlobalVariableImpl markingGlobalVariable = new MarkingGlobalVariableImpl();
		return markingGlobalVariable;
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
	public SANPackage getSANPackage() {
		return (SANPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SANPackage getPackage() {
		return SANPackage.eINSTANCE;
	}

} //SANFactoryImpl
