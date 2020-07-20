/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	ExpressionsPackage eINSTANCE = org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpression <em>Template Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpression
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpression()
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
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger <em>Template Expression Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionInteger()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER___EVALUATE__ELIST = TEMPLATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER___EVALUATE = TEMPLATE_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT = TEMPLATE_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal <em>Template Expression Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionReal()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL___EVALUATE__ELIST = TEMPLATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL___EVALUATE = TEMPLATE_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean <em>Template Expression Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBoolean()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE__ELIST = TEMPLATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE = TEMPLATE_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Expression Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT = TEMPLATE_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionIntegerLiteralImpl <em>Template Expression Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionIntegerLiteralImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionIntegerLiteral()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_LITERAL___EVALUATE = TEMPLATE_EXPRESSION_INTEGER___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_LITERAL___EVALUATE__ELIST = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_LITERAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealLiteralImpl <em>Template Expression Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealLiteralImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealLiteral()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_LITERAL___EVALUATE = TEMPLATE_EXPRESSION_REAL___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_LITERAL___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_LITERAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBoolaenLiteralImpl <em>Template Expression Boolaen Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBoolaenLiteralImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBoolaenLiteral()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLAEN_LITERAL___EVALUATE = TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLAEN_LITERAL___EVALUATE__ELIST = TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolaen Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLAEN_LITERAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionIntegerFromRealImpl <em>Template Expression Integer From Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionIntegerFromRealImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionIntegerFromReal()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_FROM_REAL___EVALUATE = TEMPLATE_EXPRESSION_INTEGER___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_FROM_REAL___EVALUATE__ELIST = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Integer From Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_INTEGER_FROM_REAL_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealFromIntegerImpl <em>Template Expression Real From Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealFromIntegerImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealFromInteger()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FROM_INTEGER___EVALUATE = TEMPLATE_EXPRESSION_REAL___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FROM_INTEGER___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real From Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FROM_INTEGER_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterSimpleImpl <em>Template Expression Parameter Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterSimpleImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterSimple()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_SIMPLE___EVALUATE = TEMPLATE_EXPRESSION_REAL___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_SIMPLE___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Parameter Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_SIMPLE_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterArrayValueAtImpl <em>Template Expression Parameter Array Value At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterArrayValueAtImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterArrayValueAt()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT___EVALUATE = TEMPLATE_EXPRESSION_REAL___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Parameter Array Value At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl <em>Template Expression Parameter Array Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterArraySize()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE___EVALUATE = TEMPLATE_EXPRESSION_INTEGER___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE___EVALUATE__ELIST = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Parameter Array Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionArrayAggregateImpl <em>Template Expression Array Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionArrayAggregateImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionArrayAggregate()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_ARRAY_AGGREGATE___EVALUATE = TEMPLATE_EXPRESSION_REAL___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_ARRAY_AGGREGATE___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Array Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_ARRAY_AGGREGATE_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation <em>Template Expression Real Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealBinaryOperation()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP1 = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP2 = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Expression Real Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL___EVALUATE__ELIST;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION___EVALUATE = TEMPLATE_EXPRESSION_REAL___EVALUATE;

	/**
	 * The number of operations of the '<em>Template Expression Real Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealSumImpl <em>Template Expression Real Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealSumImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealSum()
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
	int TEMPLATE_EXPRESSION_REAL_SUM__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM___EVALUATE = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUM_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealSubtractImpl <em>Template Expression Real Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealSubtractImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealSubtract()
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
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT___EVALUATE = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_SUBTRACT_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealMultiplyImpl <em>Template Expression Real Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealMultiplyImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealMultiply()
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
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY___EVALUATE = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MULTIPLY_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealDivideImpl <em>Template Expression Real Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealDivideImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealDivide()
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
	int TEMPLATE_EXPRESSION_REAL_DIVIDE__EXP1 = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE__EXP2 = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Real Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE_FEATURE_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE___EVALUATE = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_DIVIDE_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealModuloImpl <em>Template Expression Real Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealModuloImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealModulo()
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
	int TEMPLATE_EXPRESSION_REAL_MODULO__EXP1 = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO__EXP2 = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Expression Real Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO_FEATURE_COUNT = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO___EVALUATE = TEMPLATE_EXPRESSION_INTEGER___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO___EVALUATE__ELIST = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_MODULO_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary <em>Template Expression Real Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealUnary()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_UNARY___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL___EVALUATE__ELIST;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_UNARY___EVALUATE = TEMPLATE_EXPRESSION_REAL___EVALUATE;

	/**
	 * The number of operations of the '<em>Template Expression Real Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_UNARY_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealFloorImpl <em>Template Expression Real Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealFloorImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealFloor()
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
	int TEMPLATE_EXPRESSION_REAL_FLOOR__EXP = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Real Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FLOOR_FEATURE_COUNT = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FLOOR___EVALUATE = TEMPLATE_EXPRESSION_INTEGER___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FLOOR___EVALUATE__ELIST = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_FLOOR_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealCeilImpl <em>Template Expression Real Ceil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealCeilImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealCeil()
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
	int TEMPLATE_EXPRESSION_REAL_CEIL__EXP = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Real Ceil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_CEIL_FEATURE_COUNT = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_CEIL___EVALUATE = TEMPLATE_EXPRESSION_INTEGER___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_CEIL___EVALUATE__ELIST = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Ceil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_CEIL_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealRoundImpl <em>Template Expression Real Round</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealRoundImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealRound()
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
	int TEMPLATE_EXPRESSION_REAL_ROUND__EXP = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Real Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_ROUND_FEATURE_COUNT = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_ROUND___EVALUATE = TEMPLATE_EXPRESSION_INTEGER___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_ROUND___EVALUATE__ELIST = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_ROUND_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl <em>Template Expression Real If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealIfThenElse()
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
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE___EVALUATE = TEMPLATE_EXPRESSION_REAL___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE___EVALUATE__ELIST = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Real If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE_OPERATION_COUNT = TEMPLATE_EXPRESSION_REAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation <em>Template Expression Boolean Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanUnaryOperation()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION = 24;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION__EXP = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION___EVALUATE__ELIST = TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE__ELIST;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION___EVALUATE = TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE;

	/**
	 * The number of operations of the '<em>Template Expression Boolean Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanNotImpl <em>Template Expression Boolean Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanNotImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanNot()
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
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT__EXP = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION__EXP;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT___EVALUATE = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT___EVALUATE__ELIST = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_NOT_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanToIntegerImpl <em>Template Expression Boolean To Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanToIntegerImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanToInteger()
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
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER__EXP = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean To Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER_FEATURE_COUNT = TEMPLATE_EXPRESSION_INTEGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER___EVALUATE = TEMPLATE_EXPRESSION_INTEGER___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER___EVALUATE__ELIST = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean To Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER_OPERATION_COUNT = TEMPLATE_EXPRESSION_INTEGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation <em>Template Expression Boolean Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanBinaryOperation()
	 * @generated
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION = 27;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP1 = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP2 = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION___EVALUATE__ELIST = TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE__ELIST;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION___EVALUATE = TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE;

	/**
	 * The number of operations of the '<em>Template Expression Boolean Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanAndImpl <em>Template Expression Boolean And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanAndImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanAnd()
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
	int TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1 = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2 = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND___EVALUATE = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND___EVALUATE__ELIST = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_AND_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanOrImpl <em>Template Expression Boolean Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanOrImpl
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanOr()
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
	int TEMPLATE_EXPRESSION_BOOLEAN_OR__EXP1 = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR__EXP2 = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP2;

	/**
	 * The number of structural features of the '<em>Template Expression Boolean Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR_FEATURE_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR___EVALUATE = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR___EVALUATE__ELIST = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Template Expression Boolean Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXPRESSION_BOOLEAN_OR_OPERATION_COUNT = TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind <em>Array Aggregate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getArrayAggregateKind()
	 * @generated
	 */
	int ARRAY_AGGREGATE_KIND = 30;


	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpression <em>Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpression
	 * @generated
	 */
	EClass getTemplateExpression();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger <em>Template Expression Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Integer</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger
	 * @generated
	 */
	EClass getTemplateExpressionInteger();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionInteger__Evaluate__EList();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger#evaluate()
	 * @generated
	 */
	EOperation getTemplateExpressionInteger__Evaluate();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal <em>Template Expression Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal
	 * @generated
	 */
	EClass getTemplateExpressionReal();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionReal__Evaluate__EList();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal#evaluate()
	 * @generated
	 */
	EOperation getTemplateExpressionReal__Evaluate();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean <em>Template Expression Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean
	 * @generated
	 */
	EClass getTemplateExpressionBoolean();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionBoolean__Evaluate__EList();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean#evaluate()
	 * @generated
	 */
	EOperation getTemplateExpressionBoolean__Evaluate();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerLiteral <em>Template Expression Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Integer Literal</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerLiteral
	 * @generated
	 */
	EClass getTemplateExpressionIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerLiteral#getValue()
	 * @see #getTemplateExpressionIntegerLiteral()
	 * @generated
	 */
	EAttribute getTemplateExpressionIntegerLiteral_Value();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerLiteral#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerLiteral#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionIntegerLiteral__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealLiteral <em>Template Expression Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Literal</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealLiteral
	 * @generated
	 */
	EClass getTemplateExpressionRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealLiteral#getValue()
	 * @see #getTemplateExpressionRealLiteral()
	 * @generated
	 */
	EAttribute getTemplateExpressionRealLiteral_Value();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealLiteral#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealLiteral#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealLiteral__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolaenLiteral <em>Template Expression Boolaen Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolaen Literal</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolaenLiteral
	 * @generated
	 */
	EClass getTemplateExpressionBoolaenLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolaenLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolaenLiteral#isValue()
	 * @see #getTemplateExpressionBoolaenLiteral()
	 * @generated
	 */
	EAttribute getTemplateExpressionBoolaenLiteral_Value();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolaenLiteral#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolaenLiteral#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionBoolaenLiteral__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerFromReal <em>Template Expression Integer From Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Integer From Real</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerFromReal
	 * @generated
	 */
	EClass getTemplateExpressionIntegerFromReal();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerFromReal#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerFromReal#getExp()
	 * @see #getTemplateExpressionIntegerFromReal()
	 * @generated
	 */
	EReference getTemplateExpressionIntegerFromReal_Exp();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerFromReal#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerFromReal#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionIntegerFromReal__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger <em>Template Expression Real From Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real From Integer</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger
	 * @generated
	 */
	EClass getTemplateExpressionRealFromInteger();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger#getExp()
	 * @see #getTemplateExpressionRealFromInteger()
	 * @generated
	 */
	EReference getTemplateExpressionRealFromInteger_Exp();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealFromInteger__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterSimple <em>Template Expression Parameter Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Parameter Simple</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterSimple
	 * @generated
	 */
	EClass getTemplateExpressionParameterSimple();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterSimple#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterSimple#getParameter()
	 * @see #getTemplateExpressionParameterSimple()
	 * @generated
	 */
	EReference getTemplateExpressionParameterSimple_Parameter();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterSimple#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterSimple#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionParameterSimple__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt <em>Template Expression Parameter Array Value At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Parameter Array Value At</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt
	 * @generated
	 */
	EClass getTemplateExpressionParameterArrayValueAt();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#getParameter()
	 * @see #getTemplateExpressionParameterArrayValueAt()
	 * @generated
	 */
	EReference getTemplateExpressionParameterArrayValueAt_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#getPosition()
	 * @see #getTemplateExpressionParameterArrayValueAt()
	 * @generated
	 */
	EReference getTemplateExpressionParameterArrayValueAt_Position();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionParameterArrayValueAt__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize <em>Template Expression Parameter Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Parameter Array Size</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize
	 * @generated
	 */
	EClass getTemplateExpressionParameterArraySize();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize#getParameter()
	 * @see #getTemplateExpressionParameterArraySize()
	 * @generated
	 */
	EReference getTemplateExpressionParameterArraySize_Parameter();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionParameterArraySize__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate <em>Template Expression Array Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Array Aggregate</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate
	 * @generated
	 */
	EClass getTemplateExpressionArrayAggregate();

	/**
	 * Returns the meta object for the reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#getParameter()
	 * @see #getTemplateExpressionArrayAggregate()
	 * @generated
	 */
	EReference getTemplateExpressionArrayAggregate_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#getFunction()
	 * @see #getTemplateExpressionArrayAggregate()
	 * @generated
	 */
	EAttribute getTemplateExpressionArrayAggregate_Function();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionArrayAggregate__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation <em>Template Expression Real Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Binary Operation</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation
	 * @generated
	 */
	EClass getTemplateExpressionRealBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation#getExp1 <em>Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp1</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation#getExp1()
	 * @see #getTemplateExpressionRealBinaryOperation()
	 * @generated
	 */
	EReference getTemplateExpressionRealBinaryOperation_Exp1();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation#getExp2 <em>Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp2</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation#getExp2()
	 * @see #getTemplateExpressionRealBinaryOperation()
	 * @generated
	 */
	EReference getTemplateExpressionRealBinaryOperation_Exp2();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSum <em>Template Expression Real Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Sum</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSum
	 * @generated
	 */
	EClass getTemplateExpressionRealSum();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSum#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSum#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealSum__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSubtract <em>Template Expression Real Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Subtract</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSubtract
	 * @generated
	 */
	EClass getTemplateExpressionRealSubtract();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSubtract#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSubtract#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealSubtract__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealMultiply <em>Template Expression Real Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Multiply</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealMultiply
	 * @generated
	 */
	EClass getTemplateExpressionRealMultiply();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealMultiply#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealMultiply#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealMultiply__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealDivide <em>Template Expression Real Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Divide</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealDivide
	 * @generated
	 */
	EClass getTemplateExpressionRealDivide();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealDivide#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealDivide#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealDivide__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo <em>Template Expression Real Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Modulo</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo
	 * @generated
	 */
	EClass getTemplateExpressionRealModulo();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#getExp1 <em>Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp1</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#getExp1()
	 * @see #getTemplateExpressionRealModulo()
	 * @generated
	 */
	EReference getTemplateExpressionRealModulo_Exp1();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#getExp2 <em>Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp2</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#getExp2()
	 * @see #getTemplateExpressionRealModulo()
	 * @generated
	 */
	EReference getTemplateExpressionRealModulo_Exp2();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealModulo__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary <em>Template Expression Real Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Unary</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary
	 * @generated
	 */
	EClass getTemplateExpressionRealUnary();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary#getExp()
	 * @see #getTemplateExpressionRealUnary()
	 * @generated
	 */
	EReference getTemplateExpressionRealUnary_Exp();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFloor <em>Template Expression Real Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Floor</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFloor
	 * @generated
	 */
	EClass getTemplateExpressionRealFloor();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFloor#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFloor#getExp()
	 * @see #getTemplateExpressionRealFloor()
	 * @generated
	 */
	EReference getTemplateExpressionRealFloor_Exp();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFloor#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFloor#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealFloor__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealCeil <em>Template Expression Real Ceil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Ceil</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealCeil
	 * @generated
	 */
	EClass getTemplateExpressionRealCeil();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealCeil#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealCeil#getExp()
	 * @see #getTemplateExpressionRealCeil()
	 * @generated
	 */
	EReference getTemplateExpressionRealCeil_Exp();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealCeil#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealCeil#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealCeil__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealRound <em>Template Expression Real Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real Round</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealRound
	 * @generated
	 */
	EClass getTemplateExpressionRealRound();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealRound#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealRound#getExp()
	 * @see #getTemplateExpressionRealRound()
	 * @generated
	 */
	EReference getTemplateExpressionRealRound_Exp();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealRound#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealRound#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealRound__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse <em>Template Expression Real If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Real If Then Else</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse
	 * @generated
	 */
	EClass getTemplateExpressionRealIfThenElse();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse#getCondition()
	 * @see #getTemplateExpressionRealIfThenElse()
	 * @generated
	 */
	EReference getTemplateExpressionRealIfThenElse_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse#getIfTrue <em>If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If True</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse#getIfTrue()
	 * @see #getTemplateExpressionRealIfThenElse()
	 * @generated
	 */
	EReference getTemplateExpressionRealIfThenElse_IfTrue();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse#getIfFalse <em>If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If False</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse#getIfFalse()
	 * @see #getTemplateExpressionRealIfThenElse()
	 * @generated
	 */
	EReference getTemplateExpressionRealIfThenElse_IfFalse();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionRealIfThenElse__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation <em>Template Expression Boolean Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean Unary Operation</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation
	 * @generated
	 */
	EClass getTemplateExpressionBooleanUnaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation#getExp()
	 * @see #getTemplateExpressionBooleanUnaryOperation()
	 * @generated
	 */
	EReference getTemplateExpressionBooleanUnaryOperation_Exp();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanNot <em>Template Expression Boolean Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean Not</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanNot
	 * @generated
	 */
	EClass getTemplateExpressionBooleanNot();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanNot#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanNot#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionBooleanNot__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanToInteger <em>Template Expression Boolean To Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean To Integer</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanToInteger
	 * @generated
	 */
	EClass getTemplateExpressionBooleanToInteger();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanToInteger#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanToInteger#getExp()
	 * @see #getTemplateExpressionBooleanToInteger()
	 * @generated
	 */
	EReference getTemplateExpressionBooleanToInteger_Exp();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanToInteger#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanToInteger#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionBooleanToInteger__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation <em>Template Expression Boolean Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean Binary Operation</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation
	 * @generated
	 */
	EClass getTemplateExpressionBooleanBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation#getExp1 <em>Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp1</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation#getExp1()
	 * @see #getTemplateExpressionBooleanBinaryOperation()
	 * @generated
	 */
	EReference getTemplateExpressionBooleanBinaryOperation_Exp1();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation#getExp2 <em>Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp2</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation#getExp2()
	 * @see #getTemplateExpressionBooleanBinaryOperation()
	 * @generated
	 */
	EReference getTemplateExpressionBooleanBinaryOperation_Exp2();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanAnd <em>Template Expression Boolean And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean And</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanAnd
	 * @generated
	 */
	EClass getTemplateExpressionBooleanAnd();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanAnd#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanAnd#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionBooleanAnd__Evaluate__EList();

	/**
	 * Returns the meta object for class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanOr <em>Template Expression Boolean Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Expression Boolean Or</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanOr
	 * @generated
	 */
	EClass getTemplateExpressionBooleanOr();

	/**
	 * Returns the meta object for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanOr#evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanOr#evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateExpressionBooleanOr__Evaluate__EList();

	/**
	 * Returns the meta object for enum '{@link org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind <em>Array Aggregate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Array Aggregate Kind</em>'.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind
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
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpression <em>Template Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpression
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpression()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION = eINSTANCE.getTemplateExpression();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger <em>Template Expression Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionInteger()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_INTEGER = eINSTANCE.getTemplateExpressionInteger();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_INTEGER___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionInteger__Evaluate__EList();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_INTEGER___EVALUATE = eINSTANCE.getTemplateExpressionInteger__Evaluate();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal <em>Template Expression Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionReal()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL = eINSTANCE.getTemplateExpressionReal();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionReal__Evaluate__EList();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL___EVALUATE = eINSTANCE.getTemplateExpressionReal__Evaluate();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean <em>Template Expression Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBoolean()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN = eINSTANCE.getTemplateExpressionBoolean();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionBoolean__Evaluate__EList();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE = eINSTANCE.getTemplateExpressionBoolean__Evaluate();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionIntegerLiteralImpl <em>Template Expression Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionIntegerLiteralImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionIntegerLiteral()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_INTEGER_LITERAL___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionIntegerLiteral__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealLiteralImpl <em>Template Expression Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealLiteralImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealLiteral()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_LITERAL___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealLiteral__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBoolaenLiteralImpl <em>Template Expression Boolaen Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBoolaenLiteralImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBoolaenLiteral()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_BOOLAEN_LITERAL___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionBoolaenLiteral__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionIntegerFromRealImpl <em>Template Expression Integer From Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionIntegerFromRealImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionIntegerFromReal()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_INTEGER_FROM_REAL___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionIntegerFromReal__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealFromIntegerImpl <em>Template Expression Real From Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealFromIntegerImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealFromInteger()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_FROM_INTEGER___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealFromInteger__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterSimpleImpl <em>Template Expression Parameter Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterSimpleImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterSimple()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_PARAMETER_SIMPLE___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionParameterSimple__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterArrayValueAtImpl <em>Template Expression Parameter Array Value At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterArrayValueAtImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterArrayValueAt()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionParameterArrayValueAt__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl <em>Template Expression Parameter Array Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionParameterArraySize()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionParameterArraySize__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionArrayAggregateImpl <em>Template Expression Array Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionArrayAggregateImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionArrayAggregate()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_ARRAY_AGGREGATE___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionArrayAggregate__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation <em>Template Expression Real Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealBinaryOperation()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION = eINSTANCE.getTemplateExpressionRealBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP1 = eINSTANCE.getTemplateExpressionRealBinaryOperation_Exp1();

		/**
		 * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP2 = eINSTANCE.getTemplateExpressionRealBinaryOperation_Exp2();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealSumImpl <em>Template Expression Real Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealSumImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealSum()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_SUM = eINSTANCE.getTemplateExpressionRealSum();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_SUM___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealSum__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealSubtractImpl <em>Template Expression Real Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealSubtractImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealSubtract()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_SUBTRACT = eINSTANCE.getTemplateExpressionRealSubtract();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_SUBTRACT___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealSubtract__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealMultiplyImpl <em>Template Expression Real Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealMultiplyImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealMultiply()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_MULTIPLY = eINSTANCE.getTemplateExpressionRealMultiply();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_MULTIPLY___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealMultiply__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealDivideImpl <em>Template Expression Real Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealDivideImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealDivide()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_DIVIDE = eINSTANCE.getTemplateExpressionRealDivide();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_DIVIDE___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealDivide__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealModuloImpl <em>Template Expression Real Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealModuloImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealModulo()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_MODULO = eINSTANCE.getTemplateExpressionRealModulo();

		/**
		 * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_MODULO__EXP1 = eINSTANCE.getTemplateExpressionRealModulo_Exp1();

		/**
		 * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_MODULO__EXP2 = eINSTANCE.getTemplateExpressionRealModulo_Exp2();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_MODULO___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealModulo__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary <em>Template Expression Real Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealUnary()
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
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealFloorImpl <em>Template Expression Real Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealFloorImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealFloor()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_FLOOR = eINSTANCE.getTemplateExpressionRealFloor();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_FLOOR__EXP = eINSTANCE.getTemplateExpressionRealFloor_Exp();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_FLOOR___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealFloor__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealCeilImpl <em>Template Expression Real Ceil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealCeilImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealCeil()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_CEIL = eINSTANCE.getTemplateExpressionRealCeil();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_CEIL__EXP = eINSTANCE.getTemplateExpressionRealCeil_Exp();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_CEIL___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealCeil__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealRoundImpl <em>Template Expression Real Round</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealRoundImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealRound()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_REAL_ROUND = eINSTANCE.getTemplateExpressionRealRound();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_REAL_ROUND__EXP = eINSTANCE.getTemplateExpressionRealRound_Exp();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_ROUND___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealRound__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl <em>Template Expression Real If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionRealIfThenElse()
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
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionRealIfThenElse__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation <em>Template Expression Boolean Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanUnaryOperation()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION = eINSTANCE.getTemplateExpressionBooleanUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION__EXP = eINSTANCE.getTemplateExpressionBooleanUnaryOperation_Exp();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanNotImpl <em>Template Expression Boolean Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanNotImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanNot()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_NOT = eINSTANCE.getTemplateExpressionBooleanNot();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_BOOLEAN_NOT___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionBooleanNot__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanToIntegerImpl <em>Template Expression Boolean To Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanToIntegerImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanToInteger()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER = eINSTANCE.getTemplateExpressionBooleanToInteger();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER__EXP = eINSTANCE.getTemplateExpressionBooleanToInteger_Exp();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionBooleanToInteger__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation <em>Template Expression Boolean Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanBinaryOperation()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION = eINSTANCE.getTemplateExpressionBooleanBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP1 = eINSTANCE.getTemplateExpressionBooleanBinaryOperation_Exp1();

		/**
		 * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP2 = eINSTANCE.getTemplateExpressionBooleanBinaryOperation_Exp2();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanAndImpl <em>Template Expression Boolean And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanAndImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanAnd()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_AND = eINSTANCE.getTemplateExpressionBooleanAnd();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_BOOLEAN_AND___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionBooleanAnd__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanOrImpl <em>Template Expression Boolean Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanOrImpl
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getTemplateExpressionBooleanOr()
		 * @generated
		 */
		EClass TEMPLATE_EXPRESSION_BOOLEAN_OR = eINSTANCE.getTemplateExpressionBooleanOr();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_EXPRESSION_BOOLEAN_OR___EVALUATE__ELIST = eINSTANCE.getTemplateExpressionBooleanOr__Evaluate__EList();

		/**
		 * The meta object literal for the '{@link org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind <em>Array Aggregate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind
		 * @see org.modelspartiti.infrastructure.tmdl.expressions.impl.ExpressionsPackageImpl#getArrayAggregateKind()
		 * @generated
		 */
		EEnum ARRAY_AGGREGATE_KIND = eINSTANCE.getArrayAggregateKind();

	}

} //ExpressionsPackage
