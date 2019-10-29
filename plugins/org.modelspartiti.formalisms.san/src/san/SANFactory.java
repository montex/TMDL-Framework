/**
 */
package san;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see san.SANPackage
 * @generated
 */
public interface SANFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANFactory eINSTANCE = san.impl.SANFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAN</em>'.
	 * @generated
	 */
	SAN createSAN();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

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
	 * Returns a new object of class '<em>Output Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Gate</em>'.
	 * @generated
	 */
	OutputGate createOutputGate();

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
	 * Returns a new object of class '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable</em>'.
	 * @generated
	 */
	GlobalVariable createGlobalVariable();

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
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type</em>'.
	 * @generated
	 */
	ComplexType createComplexType();

	/**
	 * Returns a new object of class '<em>Custom Type Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Type Array</em>'.
	 * @generated
	 */
	CustomTypeArray createCustomTypeArray();

	/**
	 * Returns a new object of class '<em>Custom Type Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Type Struct</em>'.
	 * @generated
	 */
	CustomTypeStruct createCustomTypeStruct();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Marking Extended</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Extended</em>'.
	 * @generated
	 */
	MarkingExtended createMarkingExtended();

	/**
	 * Returns a new object of class '<em>Intermediate Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Node</em>'.
	 * @generated
	 */
	IntermediateNode createIntermediateNode();

	/**
	 * Returns a new object of class '<em>Marking Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Simple</em>'.
	 * @generated
	 */
	MarkingSimple createMarkingSimple();

	/**
	 * Returns a new object of class '<em>Marking Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Global Variable</em>'.
	 * @generated
	 */
	MarkingGlobalVariable createMarkingGlobalVariable();

	/**
	 * Returns a new object of class '<em>Leaf Node Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Node Array</em>'.
	 * @generated
	 */
	LeafNodeArray createLeafNodeArray();

	/**
	 * Returns a new object of class '<em>Leaf Node Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Node Struct</em>'.
	 * @generated
	 */
	LeafNodeStruct createLeafNodeStruct();

	/**
	 * Returns a new object of class '<em>Leaf Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Node</em>'.
	 * @generated
	 */
	LeafNode createLeafNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SANPackage getSANPackage();

} //SANFactory
