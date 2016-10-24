/**
 */
package sant;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sant.SANTPackage
 * @generated
 */
public interface SANTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANTFactory eINSTANCE = sant.impl.SANTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SANT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SANT</em>'.
	 * @generated
	 */
	SANT createSANT();

	/**
	 * Returns a new object of class '<em>Normal Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Place</em>'.
	 * @generated
	 */
	NormalPlace createNormalPlace();

	/**
	 * Returns a new object of class '<em>Extended Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Place</em>'.
	 * @generated
	 */
	ExtendedPlace createExtendedPlace();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

	/**
	 * Returns a new object of class '<em>Cases Specification Cases</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cases Specification Cases</em>'.
	 * @generated
	 */
	CasesSpecificationCases createCasesSpecificationCases();

	/**
	 * Returns a new object of class '<em>Cases Specification Probability Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cases Specification Probability Array</em>'.
	 * @generated
	 */
	CasesSpecificationProbabilityArray createCasesSpecificationProbabilityArray();

	/**
	 * Returns a new object of class '<em>Cases Specification Parametric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cases Specification Parametric</em>'.
	 * @generated
	 */
	CasesSpecificationParametric createCasesSpecificationParametric();

	/**
	 * Returns a new object of class '<em>Input Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Arc</em>'.
	 * @generated
	 */
	InputArc createInputArc();

	/**
	 * Returns a new object of class '<em>Output Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Arc</em>'.
	 * @generated
	 */
	OutputArc createOutputArc();

	/**
	 * Returns a new object of class '<em>Output Gate Concrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Gate Concrete</em>'.
	 * @generated
	 */
	OutputGateConcrete createOutputGateConcrete();

	/**
	 * Returns a new object of class '<em>Output Gate Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Gate Template</em>'.
	 * @generated
	 */
	OutputGateTemplate createOutputGateTemplate();

	/**
	 * Returns a new object of class '<em>Input Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Gate</em>'.
	 * @generated
	 */
	InputGate createInputGate();

	/**
	 * Returns a new object of class '<em>Instantaneous Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantaneous Activity</em>'.
	 * @generated
	 */
	InstantaneousActivity createInstantaneousActivity();

	/**
	 * Returns a new object of class '<em>Timed Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Activity</em>'.
	 * @generated
	 */
	TimedActivity createTimedActivity();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Expression Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Text</em>'.
	 * @generated
	 */
	ExpressionText createExpressionText();

	/**
	 * Returns a new object of class '<em>Expression Marking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Marking</em>'.
	 * @generated
	 */
	ExpressionMarking createExpressionMarking();

	/**
	 * Returns a new object of class '<em>Expression Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Variable</em>'.
	 * @generated
	 */
	ExpressionVariable createExpressionVariable();

	/**
	 * Returns a new object of class '<em>Expression Template Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Template Expression</em>'.
	 * @generated
	 */
	ExpressionTemplateExpression createExpressionTemplateExpression();

	/**
	 * Returns a new object of class '<em>Expression Iteration Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Iteration Element</em>'.
	 * @generated
	 */
	ExpressionIterationElement createExpressionIterationElement();

	/**
	 * Returns a new object of class '<em>Expression Activity Cases Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Activity Cases Number</em>'.
	 * @generated
	 */
	ExpressionActivityCasesNumber createExpressionActivityCasesNumber();

	/**
	 * Returns a new object of class '<em>Expression Place Template Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Place Template Size</em>'.
	 * @generated
	 */
	ExpressionPlaceTemplateSize createExpressionPlaceTemplateSize();

	/**
	 * Returns a new object of class '<em>Expression If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression If Then Else</em>'.
	 * @generated
	 */
	ExpressionIfThenElse createExpressionIfThenElse();

	/**
	 * Returns a new object of class '<em>Expression Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Loop</em>'.
	 * @generated
	 */
	ExpressionLoop createExpressionLoop();

	/**
	 * Returns a new object of class '<em>This Context Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>This Context Iterator</em>'.
	 * @generated
	 */
	ThisContextIterator createThisContextIterator();

	/**
	 * Returns a new object of class '<em>Loop Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Iterator</em>'.
	 * @generated
	 */
	LoopIterator createLoopIterator();

	/**
	 * Returns a new object of class '<em>Marking Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Integer</em>'.
	 * @generated
	 */
	MarkingInteger createMarkingInteger();

	/**
	 * Returns a new object of class '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable</em>'.
	 * @generated
	 */
	GlobalVariable createGlobalVariable();

	/**
	 * Returns a new object of class '<em>Marking Variable Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Variable Simple</em>'.
	 * @generated
	 */
	MarkingVariableSimple createMarkingVariableSimple();

	/**
	 * Returns a new object of class '<em>Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential</em>'.
	 * @generated
	 */
	Exponential createExponential();

	/**
	 * Returns a new object of class '<em>Normal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal</em>'.
	 * @generated
	 */
	Normal createNormal();

	/**
	 * Returns a new object of class '<em>Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamma</em>'.
	 * @generated
	 */
	Gamma createGamma();

	/**
	 * Returns a new object of class '<em>Binomial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binomial</em>'.
	 * @generated
	 */
	Binomial createBinomial();

	/**
	 * Returns a new object of class '<em>Deterministic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deterministic</em>'.
	 * @generated
	 */
	Deterministic createDeterministic();

	/**
	 * Returns a new object of class '<em>Lognormal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lognormal</em>'.
	 * @generated
	 */
	Lognormal createLognormal();

	/**
	 * Returns a new object of class '<em>Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beta</em>'.
	 * @generated
	 */
	Beta createBeta();

	/**
	 * Returns a new object of class '<em>Negative Binomial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Binomial</em>'.
	 * @generated
	 */
	NegativeBinomial createNegativeBinomial();

	/**
	 * Returns a new object of class '<em>Geometric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometric</em>'.
	 * @generated
	 */
	Geometric createGeometric();

	/**
	 * Returns a new object of class '<em>Erlang</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Erlang</em>'.
	 * @generated
	 */
	Erlang createErlang();

	/**
	 * Returns a new object of class '<em>Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniform</em>'.
	 * @generated
	 */
	Uniform createUniform();

	/**
	 * Returns a new object of class '<em>Hyper Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hyper Exponential</em>'.
	 * @generated
	 */
	HyperExponential createHyperExponential();

	/**
	 * Returns a new object of class '<em>Weibull</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weibull</em>'.
	 * @generated
	 */
	Weibull createWeibull();

	/**
	 * Returns a new object of class '<em>Triangular</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangular</em>'.
	 * @generated
	 */
	Triangular createTriangular();

	/**
	 * Returns a new object of class '<em>Conditional Weibull</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Weibull</em>'.
	 * @generated
	 */
	ConditionalWeibull createConditionalWeibull();

	/**
	 * Returns a new object of class '<em>Hypo Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypo Exponential</em>'.
	 * @generated
	 */
	HypoExponential createHypoExponential();

	/**
	 * Returns a new object of class '<em>Pareto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pareto</em>'.
	 * @generated
	 */
	Pareto createPareto();

	/**
	 * Returns a new object of class '<em>Marking String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking String</em>'.
	 * @generated
	 */
	MarkingString createMarkingString();

	/**
	 * Returns a new object of class '<em>Marking Variable Extended</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Variable Extended</em>'.
	 * @generated
	 */
	MarkingVariableExtended createMarkingVariableExtended();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SANTPackage getSANTPackage();

} //SANTFactory
