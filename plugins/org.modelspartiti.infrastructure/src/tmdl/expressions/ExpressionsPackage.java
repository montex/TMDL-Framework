/**
 */
package tmdl.expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see tmdl.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/infrastructure/tmdl/expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = tmdl.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionImpl <em>Template Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpression()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Template Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Template Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionIntegerImpl <em>Template Expression Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionIntegerImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionInteger()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_INTEGER = 1;

	/**
	 * The number of structural features of the '<em>Template Expression Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT = TEMPLATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT = TEMPLATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealImpl <em>Template Expression Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionReal()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL = 2;

	/**
	 * The number of structural features of the '<em>Template Expression Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT = TEMPLATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanImpl <em>Template Expression Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionBooleanImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBoolean()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN = 3;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT = TEMPLATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT = TEMPLATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionIntegerLiteralImpl <em>Template Expression Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionIntegerLiteralImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionIntegerLiteral()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_INTEGER_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_LITERAL__VALUE = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_LITERAL_FEATURE_COUNT = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_LITERAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealLiteralImpl <em>Template Expression Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealLiteralImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealLiteral()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_LITERAL__VALUE = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_LITERAL_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_LITERAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionBoolaenLiteralImpl <em>Template Expression Boolaen Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionBoolaenLiteralImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBoolaenLiteral()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLAEN_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLAEN_LITERAL__VALUE = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Boolaen Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLAEN_LITERAL_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Boolaen Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLAEN_LITERAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionIntegerFromRealImpl <em>Template Expression Integer From Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionIntegerFromRealImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionIntegerFromReal()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_INTEGER_FROM_REAL = 7;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_FROM_REAL__EXP = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Integer From Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_FROM_REAL_FEATURE_COUNT = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Integer From Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_FROM_REAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealFromIntegerImpl <em>Template Expression Real From Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealFromIntegerImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealFromInteger()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_FROM_INTEGER = 8;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FROM_INTEGER__EXP = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Real From Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FROM_INTEGER_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Real From Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FROM_INTEGER_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionParameterSimpleImpl <em>Template Expression Parameter Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionParameterSimpleImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterSimple()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_SIMPLE = 9;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_SIMPLE__PARAMETER = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Parameter Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_SIMPLE_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Parameter Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_SIMPLE_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionParameterArrayValueAtImpl <em>Template Expression Parameter Array Value At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionParameterArrayValueAtImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterArrayValueAt()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT = 10;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT__PARAMETER = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT__POSITION = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Expression Parameter Array Value At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Expression Parameter Array Value At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl <em>Template Expression Parameter Array Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterArraySize()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE = 11;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Parameter Array Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE_FEATURE_COUNT = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Parameter Array Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionArrayAggregateImpl <em>Template Expression Array Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionArrayAggregateImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionArrayAggregate()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_ARRAY_AGGREGATE = 12;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_ARRAY_AGGREGATE__PARAMETER = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_ARRAY_AGGREGATE__FUNCTION = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Expression Array Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_ARRAY_AGGREGATE_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Expression Array Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_ARRAY_AGGREGATE_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealBinaryImpl <em>Template Expression Real Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealBinaryImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealBinary()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY = 13;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY__EXP1 = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY__EXP2 = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Expression Real Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Expression Real Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealSumImpl <em>Template Expression Real Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealSumImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealSum()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM = 14;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealSubtractImpl <em>Template Expression Real Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealSubtractImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealSubtract()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT = 15;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealMultiplyImpl <em>Template Expression Real Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealMultiplyImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealMultiply()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY = 16;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealDivideImpl <em>Template Expression Real Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealDivideImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealDivide()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE = 17;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealModuloImpl <em>Template Expression Real Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealModuloImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealModulo()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO = 18;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealUnaryImpl <em>Template Expression Real Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealUnaryImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealUnary()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_UNARY = 19;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_UNARY__EXP = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Real Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_UNARY_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Real Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_UNARY_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealFloorImpl <em>Template Expression Real Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealFloorImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealFloor()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_FLOOR = 20;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FLOOR__EXP = TEMPLATE_EXPRESSION_REAL_UNARY__EXP;

	/**
	 * The number of structural features of the '<em>Template Expression Real Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FLOOR_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FLOOR_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealCeilImpl <em>Template Expression Real Ceil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealCeilImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealCeil()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_CEIL = 21;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_CEIL__EXP = TEMPLATE_EXPRESSION_REAL_UNARY__EXP;

	/**
	 * The number of structural features of the '<em>Template Expression Real Ceil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_CEIL_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Ceil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_CEIL_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealRoundImpl <em>Template Expression Real Round</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealRoundImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealRound()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_ROUND = 22;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_ROUND__EXP = TEMPLATE_EXPRESSION_REAL_UNARY__EXP;

	/**
	 * The number of structural features of the '<em>Template Expression Real Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_ROUND_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_ROUND_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl <em>Template Expression Real If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealIfThenElse()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE = 23;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template Expression Real If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Template Expression Real If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanUnaryImpl <em>Template Expression Boolean Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionBooleanUnaryImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanUnary()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY = 24;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY__EXP = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Boolean Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanNotImpl <em>Template Expression Boolean Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionBooleanNotImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanNot()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT = 25;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT__EXP = TEMPLATE_EXPRESSION_BOOLEAN_UNARY__EXP;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanToIntegerImpl <em>Template Expression Boolean To Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionBooleanToIntegerImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanToInteger()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER = 26;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER__EXP = TEMPLATE_EXPRESSION_BOOLEAN_UNARY__EXP;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean To Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean To Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanBinaryImpl <em>Template Expression Boolean Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionBooleanBinaryImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanBinary()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY = 27;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP1 = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP2 = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Expression Boolean Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanAndImpl <em>Template Expression Boolean And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionBooleanAndImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanAnd()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND = 28;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1 = TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2 = TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanOrImpl <em>Template Expression Boolean Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.impl.TemplateExpressionBooleanOrImpl
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanOr()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR = 29;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR__EXP1 = TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR__EXP2 = TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.expressions.ArrayAggregateKind <em>Array Aggregate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.expressions.ArrayAggregateKind
	 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getArrayAggregateKind()
	 * @generated
	 */
	int ARRAY_AGGREGATE_KIND = 30;


	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpression <em>Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression</em>'.
	 * @see tmdl.expressions.TemplateExpression
	 * @generated
	 */
	EClass getTemplateExpression();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionInteger <em>Template Expression Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Integer</em>'.
	 * @see tmdl.expressions.TemplateExpressionInteger
	 * @generated
	 */
	EClass getTemplateExpressionInteger();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionReal <em>Template Expression Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real</em>'.
	 * @see tmdl.expressions.TemplateExpressionReal
	 * @generated
	 */
	EClass getTemplateExpressionReal();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionBoolean <em>Template Expression Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean</em>'.
	 * @see tmdl.expressions.TemplateExpressionBoolean
	 * @generated
	 */
	EClass getTemplateExpressionBoolean();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionIntegerLiteral <em>Template Expression Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Integer Literal</em>'.
	 * @see tmdl.expressions.TemplateExpressionIntegerLiteral
	 * @generated
	 */
	EClass getTemplateExpressionIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link tmdl.expressions.TemplateExpressionIntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tmdl.expressions.TemplateExpressionIntegerLiteral#getValue()
	 * @see #getTemplateExpressionIntegerLiteral()
	 * @generated
	 */
	EAttribute getTemplateExpressionIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealLiteral <em>Template Expression Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Literal</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealLiteral
	 * @generated
	 */
	EClass getTemplateExpressionRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link tmdl.expressions.TemplateExpressionRealLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealLiteral#getValue()
	 * @see #getTemplateExpressionRealLiteral()
	 * @generated
	 */
	EAttribute getTemplateExpressionRealLiteral_Value();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionBoolaenLiteral <em>Template Expression Boolaen Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolaen Literal</em>'.
	 * @see tmdl.expressions.TemplateExpressionBoolaenLiteral
	 * @generated
	 */
	EClass getTemplateExpressionBoolaenLiteral();

	/**
	 * Returns the meta object for the attribute '{@link tmdl.expressions.TemplateExpressionBoolaenLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tmdl.expressions.TemplateExpressionBoolaenLiteral#isValue()
	 * @see #getTemplateExpressionBoolaenLiteral()
	 * @generated
	 */
	EAttribute getTemplateExpressionBoolaenLiteral_Value();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionIntegerFromReal <em>Template Expression Integer From Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Integer From Real</em>'.
	 * @see tmdl.expressions.TemplateExpressionIntegerFromReal
	 * @generated
	 */
	EClass getTemplateExpressionIntegerFromReal();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionIntegerFromReal#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see tmdl.expressions.TemplateExpressionIntegerFromReal#getExp()
	 * @see #getTemplateExpressionIntegerFromReal()
	 * @generated
	 */
	EReference getTemplateExpressionIntegerFromReal_Exp();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealFromInteger <em>Template Expression Real From Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real From Integer</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealFromInteger
	 * @generated
	 */
	EClass getTemplateExpressionRealFromInteger();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionRealFromInteger#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealFromInteger#getExp()
	 * @see #getTemplateExpressionRealFromInteger()
	 * @generated
	 */
	EReference getTemplateExpressionRealFromInteger_Exp();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionParameterSimple <em>Template Expression Parameter Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Parameter Simple</em>'.
	 * @see tmdl.expressions.TemplateExpressionParameterSimple
	 * @generated
	 */
	EClass getTemplateExpressionParameterSimple();

	/**
	 * Returns the meta object for the reference '{@link tmdl.expressions.TemplateExpressionParameterSimple#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see tmdl.expressions.TemplateExpressionParameterSimple#getParameter()
	 * @see #getTemplateExpressionParameterSimple()
	 * @generated
	 */
	EReference getTemplateExpressionParameterSimple_Parameter();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionParameterArrayValueAt <em>Template Expression Parameter Array Value At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Parameter Array Value At</em>'.
	 * @see tmdl.expressions.TemplateExpressionParameterArrayValueAt
	 * @generated
	 */
	EClass getTemplateExpressionParameterArrayValueAt();

	/**
	 * Returns the meta object for the reference '{@link tmdl.expressions.TemplateExpressionParameterArrayValueAt#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see tmdl.expressions.TemplateExpressionParameterArrayValueAt#getParameter()
	 * @see #getTemplateExpressionParameterArrayValueAt()
	 * @generated
	 */
	EReference getTemplateExpressionParameterArrayValueAt_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionParameterArrayValueAt#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see tmdl.expressions.TemplateExpressionParameterArrayValueAt#getPosition()
	 * @see #getTemplateExpressionParameterArrayValueAt()
	 * @generated
	 */
	EReference getTemplateExpressionParameterArrayValueAt_Position();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionParameterArraySize <em>Template Expression Parameter Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Parameter Array Size</em>'.
	 * @see tmdl.expressions.TemplateExpressionParameterArraySize
	 * @generated
	 */
	EClass getTemplateExpressionParameterArraySize();

	/**
	 * Returns the meta object for the reference '{@link tmdl.expressions.TemplateExpressionParameterArraySize#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see tmdl.expressions.TemplateExpressionParameterArraySize#getParameter()
	 * @see #getTemplateExpressionParameterArraySize()
	 * @generated
	 */
	EReference getTemplateExpressionParameterArraySize_Parameter();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionArrayAggregate <em>Template Expression Array Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Array Aggregate</em>'.
	 * @see tmdl.expressions.TemplateExpressionArrayAggregate
	 * @generated
	 */
	EClass getTemplateExpressionArrayAggregate();

	/**
	 * Returns the meta object for the reference '{@link tmdl.expressions.TemplateExpressionArrayAggregate#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see tmdl.expressions.TemplateExpressionArrayAggregate#getParameter()
	 * @see #getTemplateExpressionArrayAggregate()
	 * @generated
	 */
	EReference getTemplateExpressionArrayAggregate_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link tmdl.expressions.TemplateExpressionArrayAggregate#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see tmdl.expressions.TemplateExpressionArrayAggregate#getFunction()
	 * @see #getTemplateExpressionArrayAggregate()
	 * @generated
	 */
	EAttribute getTemplateExpressionArrayAggregate_Function();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealBinary <em>Template Expression Real Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Binary</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealBinary
	 * @generated
	 */
	EClass getTemplateExpressionRealBinary();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionRealBinary#getExp1 <em>Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp1</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealBinary#getExp1()
	 * @see #getTemplateExpressionRealBinary()
	 * @generated
	 */
	EReference getTemplateExpressionRealBinary_Exp1();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionRealBinary#getExp2 <em>Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp2</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealBinary#getExp2()
	 * @see #getTemplateExpressionRealBinary()
	 * @generated
	 */
	EReference getTemplateExpressionRealBinary_Exp2();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealSum <em>Template Expression Real Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Sum</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealSum
	 * @generated
	 */
	EClass getTemplateExpressionRealSum();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealSubtract <em>Template Expression Real Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Subtract</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealSubtract
	 * @generated
	 */
	EClass getTemplateExpressionRealSubtract();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealMultiply <em>Template Expression Real Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Multiply</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealMultiply
	 * @generated
	 */
	EClass getTemplateExpressionRealMultiply();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealDivide <em>Template Expression Real Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Divide</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealDivide
	 * @generated
	 */
	EClass getTemplateExpressionRealDivide();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealModulo <em>Template Expression Real Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Modulo</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealModulo
	 * @generated
	 */
	EClass getTemplateExpressionRealModulo();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealUnary <em>Template Expression Real Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Unary</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealUnary
	 * @generated
	 */
	EClass getTemplateExpressionRealUnary();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionRealUnary#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealUnary#getExp()
	 * @see #getTemplateExpressionRealUnary()
	 * @generated
	 */
	EReference getTemplateExpressionRealUnary_Exp();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealFloor <em>Template Expression Real Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Floor</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealFloor
	 * @generated
	 */
	EClass getTemplateExpressionRealFloor();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealCeil <em>Template Expression Real Ceil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Ceil</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealCeil
	 * @generated
	 */
	EClass getTemplateExpressionRealCeil();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealRound <em>Template Expression Real Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Round</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealRound
	 * @generated
	 */
	EClass getTemplateExpressionRealRound();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionRealIfThenElse <em>Template Expression Real If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real If Then Else</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealIfThenElse
	 * @generated
	 */
	EClass getTemplateExpressionRealIfThenElse();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealIfThenElse#getCondition()
	 * @see #getTemplateExpressionRealIfThenElse()
	 * @generated
	 */
	EReference getTemplateExpressionRealIfThenElse_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getIfTrue <em>If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If True</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealIfThenElse#getIfTrue()
	 * @see #getTemplateExpressionRealIfThenElse()
	 * @generated
	 */
	EReference getTemplateExpressionRealIfThenElse_IfTrue();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getIfFalse <em>If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If False</em>'.
	 * @see tmdl.expressions.TemplateExpressionRealIfThenElse#getIfFalse()
	 * @see #getTemplateExpressionRealIfThenElse()
	 * @generated
	 */
	EReference getTemplateExpressionRealIfThenElse_IfFalse();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionBooleanUnary <em>Template Expression Boolean Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean Unary</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanUnary
	 * @generated
	 */
	EClass getTemplateExpressionBooleanUnary();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionBooleanUnary#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanUnary#getExp()
	 * @see #getTemplateExpressionBooleanUnary()
	 * @generated
	 */
	EReference getTemplateExpressionBooleanUnary_Exp();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionBooleanNot <em>Template Expression Boolean Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean Not</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanNot
	 * @generated
	 */
	EClass getTemplateExpressionBooleanNot();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionBooleanToInteger <em>Template Expression Boolean To Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean To Integer</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanToInteger
	 * @generated
	 */
	EClass getTemplateExpressionBooleanToInteger();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionBooleanBinary <em>Template Expression Boolean Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean Binary</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanBinary
	 * @generated
	 */
	EClass getTemplateExpressionBooleanBinary();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionBooleanBinary#getExp1 <em>Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp1</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanBinary#getExp1()
	 * @see #getTemplateExpressionBooleanBinary()
	 * @generated
	 */
	EReference getTemplateExpressionBooleanBinary_Exp1();

	/**
	 * Returns the meta object for the containment reference '{@link tmdl.expressions.TemplateExpressionBooleanBinary#getExp2 <em>Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp2</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanBinary#getExp2()
	 * @see #getTemplateExpressionBooleanBinary()
	 * @generated
	 */
	EReference getTemplateExpressionBooleanBinary_Exp2();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionBooleanAnd <em>Template Expression Boolean And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean And</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanAnd
	 * @generated
	 */
	EClass getTemplateExpressionBooleanAnd();

	/**
	 * Returns the meta object for class '{@link tmdl.expressions.TemplateExpressionBooleanOr <em>Template Expression Boolean Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean Or</em>'.
	 * @see tmdl.expressions.TemplateExpressionBooleanOr
	 * @generated
	 */
	EClass getTemplateExpressionBooleanOr();

	/**
	 * Returns the meta object for enum '{@link tmdl.expressions.ArrayAggregateKind <em>Array Aggregate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Array Aggregate Kind</em>'.
	 * @see tmdl.expressions.ArrayAggregateKind
	 * @generated
	 */
	EEnum getArrayAggregateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

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
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionImpl <em>Template Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpression()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION = eINSTANCE.getTemplateExpression();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionIntegerImpl <em>Template Expression Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionIntegerImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionInteger()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_INTEGER = eINSTANCE.getTemplateExpressionInteger();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealImpl <em>Template Expression Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionReal()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL = eINSTANCE.getTemplateExpressionReal();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanImpl <em>Template Expression Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionBooleanImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBoolean()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN = eINSTANCE.getTemplateExpressionBoolean();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionIntegerLiteralImpl <em>Template Expression Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionIntegerLiteralImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionIntegerLiteral()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_INTEGER_LITERAL = eINSTANCE.getTemplateExpressionIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_EXPRESSION_INTEGER_LITERAL__VALUE = eINSTANCE.getTemplateExpressionIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealLiteralImpl <em>Template Expression Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealLiteralImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealLiteral()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_LITERAL = eINSTANCE.getTemplateExpressionRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_EXPRESSION_REAL_LITERAL__VALUE = eINSTANCE.getTemplateExpressionRealLiteral_Value();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionBoolaenLiteralImpl <em>Template Expression Boolaen Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionBoolaenLiteralImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBoolaenLiteral()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLAEN_LITERAL = eINSTANCE.getTemplateExpressionBoolaenLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_EXPRESSION_BOOLAEN_LITERAL__VALUE = eINSTANCE.getTemplateExpressionBoolaenLiteral_Value();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionIntegerFromRealImpl <em>Template Expression Integer From Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionIntegerFromRealImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionIntegerFromReal()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_INTEGER_FROM_REAL = eINSTANCE.getTemplateExpressionIntegerFromReal();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_INTEGER_FROM_REAL__EXP = eINSTANCE.getTemplateExpressionIntegerFromReal_Exp();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealFromIntegerImpl <em>Template Expression Real From Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealFromIntegerImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealFromInteger()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_FROM_INTEGER = eINSTANCE.getTemplateExpressionRealFromInteger();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_FROM_INTEGER__EXP = eINSTANCE.getTemplateExpressionRealFromInteger_Exp();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionParameterSimpleImpl <em>Template Expression Parameter Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionParameterSimpleImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterSimple()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_PARAMETER_SIMPLE = eINSTANCE.getTemplateExpressionParameterSimple();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_PARAMETER_SIMPLE__PARAMETER = eINSTANCE.getTemplateExpressionParameterSimple_Parameter();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionParameterArrayValueAtImpl <em>Template Expression Parameter Array Value At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionParameterArrayValueAtImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterArrayValueAt()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT = eINSTANCE.getTemplateExpressionParameterArrayValueAt();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT__PARAMETER = eINSTANCE.getTemplateExpressionParameterArrayValueAt_Parameter();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT__POSITION = eINSTANCE.getTemplateExpressionParameterArrayValueAt_Position();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl <em>Template Expression Parameter Array Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterArraySize()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE = eINSTANCE.getTemplateExpressionParameterArraySize();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER = eINSTANCE.getTemplateExpressionParameterArraySize_Parameter();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionArrayAggregateImpl <em>Template Expression Array Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionArrayAggregateImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionArrayAggregate()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_ARRAY_AGGREGATE = eINSTANCE.getTemplateExpressionArrayAggregate();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_ARRAY_AGGREGATE__PARAMETER = eINSTANCE.getTemplateExpressionArrayAggregate_Parameter();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_EXPRESSION_ARRAY_AGGREGATE__FUNCTION = eINSTANCE.getTemplateExpressionArrayAggregate_Function();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealBinaryImpl <em>Template Expression Real Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealBinaryImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealBinary()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_BINARY = eINSTANCE.getTemplateExpressionRealBinary();

		/**
		 * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_BINARY__EXP1 = eINSTANCE.getTemplateExpressionRealBinary_Exp1();

		/**
		 * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_BINARY__EXP2 = eINSTANCE.getTemplateExpressionRealBinary_Exp2();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealSumImpl <em>Template Expression Real Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealSumImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealSum()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_SUM = eINSTANCE.getTemplateExpressionRealSum();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealSubtractImpl <em>Template Expression Real Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealSubtractImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealSubtract()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_SUBTRACT = eINSTANCE.getTemplateExpressionRealSubtract();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealMultiplyImpl <em>Template Expression Real Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealMultiplyImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealMultiply()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_MULTIPLY = eINSTANCE.getTemplateExpressionRealMultiply();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealDivideImpl <em>Template Expression Real Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealDivideImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealDivide()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_DIVIDE = eINSTANCE.getTemplateExpressionRealDivide();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealModuloImpl <em>Template Expression Real Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealModuloImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealModulo()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_MODULO = eINSTANCE.getTemplateExpressionRealModulo();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealUnaryImpl <em>Template Expression Real Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealUnaryImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealUnary()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_UNARY = eINSTANCE.getTemplateExpressionRealUnary();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_UNARY__EXP = eINSTANCE.getTemplateExpressionRealUnary_Exp();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealFloorImpl <em>Template Expression Real Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealFloorImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealFloor()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_FLOOR = eINSTANCE.getTemplateExpressionRealFloor();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealCeilImpl <em>Template Expression Real Ceil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealCeilImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealCeil()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_CEIL = eINSTANCE.getTemplateExpressionRealCeil();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealRoundImpl <em>Template Expression Real Round</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealRoundImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealRound()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_ROUND = eINSTANCE.getTemplateExpressionRealRound();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl <em>Template Expression Real If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealIfThenElse()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE = eINSTANCE.getTemplateExpressionRealIfThenElse();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION = eINSTANCE.getTemplateExpressionRealIfThenElse_Condition();

		/**
		 * The meta object literal for the '<em><b>If True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE = eINSTANCE.getTemplateExpressionRealIfThenElse_IfTrue();

		/**
		 * The meta object literal for the '<em><b>If False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE = eINSTANCE.getTemplateExpressionRealIfThenElse_IfFalse();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanUnaryImpl <em>Template Expression Boolean Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionBooleanUnaryImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanUnary()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_UNARY = eINSTANCE.getTemplateExpressionBooleanUnary();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_BOOLEAN_UNARY__EXP = eINSTANCE.getTemplateExpressionBooleanUnary_Exp();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanNotImpl <em>Template Expression Boolean Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionBooleanNotImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanNot()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_NOT = eINSTANCE.getTemplateExpressionBooleanNot();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanToIntegerImpl <em>Template Expression Boolean To Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionBooleanToIntegerImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanToInteger()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER = eINSTANCE.getTemplateExpressionBooleanToInteger();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanBinaryImpl <em>Template Expression Boolean Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionBooleanBinaryImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanBinary()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_BINARY = eINSTANCE.getTemplateExpressionBooleanBinary();

		/**
		 * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP1 = eINSTANCE.getTemplateExpressionBooleanBinary_Exp1();

		/**
		 * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP2 = eINSTANCE.getTemplateExpressionBooleanBinary_Exp2();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanAndImpl <em>Template Expression Boolean And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionBooleanAndImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanAnd()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_AND = eINSTANCE.getTemplateExpressionBooleanAnd();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.impl.TemplateExpressionBooleanOrImpl <em>Template Expression Boolean Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.impl.TemplateExpressionBooleanOrImpl
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanOr()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_OR = eINSTANCE.getTemplateExpressionBooleanOr();

		/**
		 * The meta object literal for the '{@link tmdl.expressions.ArrayAggregateKind <em>Array Aggregate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.expressions.ArrayAggregateKind
		 * @see tmdl.expressions.impl.ExpressionsPackageImpl#getArrayAggregateKind()
		 * @generated
		 */
		EEnum ARRAY_AGGREGATE_KIND = eINSTANCE.getArrayAggregateKind();

	}

} //ExpressionsPackage
