/**
 */
package tmdl.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tmdl.expressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionsFactory init() {
		try {
			ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionsPackage.eNS_URI);
			if (theExpressionsFactory != null) {
				return theExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactoryImpl() {
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER_LITERAL: return createTemplateExpressionIntegerLiteral();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_LITERAL: return createTemplateExpressionRealLiteral();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLAEN_LITERAL: return createTemplateExpressionBoolaenLiteral();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER_FROM_REAL: return createTemplateExpressionIntegerFromReal();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_FROM_INTEGER: return createTemplateExpressionRealFromInteger();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_SIMPLE: return createTemplateExpressionParameterSimple();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT: return createTemplateExpressionParameterArrayValueAt();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE: return createTemplateExpressionParameterArraySize();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_ARRAY_AGGREGATE: return createTemplateExpressionArrayAggregate();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_SUM: return createTemplateExpressionRealSum();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_SUBTRACT: return createTemplateExpressionRealSubtract();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_MULTIPLY: return createTemplateExpressionRealMultiply();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_DIVIDE: return createTemplateExpressionRealDivide();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_MODULO: return createTemplateExpressionRealModulo();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_FLOOR: return createTemplateExpressionRealFloor();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_CEIL: return createTemplateExpressionRealCeil();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_ROUND: return createTemplateExpressionRealRound();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE: return createTemplateExpressionRealIfThenElse();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_NOT: return createTemplateExpressionBooleanNot();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER: return createTemplateExpressionBooleanToInteger();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND: return createTemplateExpressionBooleanAnd();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_OR: return createTemplateExpressionBooleanOr();
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
			case ExpressionsPackage.ARRAY_AGGREGATE_KIND:
				return createArrayAggregateKindFromString(eDataType, initialValue);
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
			case ExpressionsPackage.ARRAY_AGGREGATE_KIND:
				return convertArrayAggregateKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionIntegerLiteral createTemplateExpressionIntegerLiteral() {
		TemplateExpressionIntegerLiteralImpl templateExpressionIntegerLiteral = new TemplateExpressionIntegerLiteralImpl();
		return templateExpressionIntegerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealLiteral createTemplateExpressionRealLiteral() {
		TemplateExpressionRealLiteralImpl templateExpressionRealLiteral = new TemplateExpressionRealLiteralImpl();
		return templateExpressionRealLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionBoolaenLiteral createTemplateExpressionBoolaenLiteral() {
		TemplateExpressionBoolaenLiteralImpl templateExpressionBoolaenLiteral = new TemplateExpressionBoolaenLiteralImpl();
		return templateExpressionBoolaenLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionIntegerFromReal createTemplateExpressionIntegerFromReal() {
		TemplateExpressionIntegerFromRealImpl templateExpressionIntegerFromReal = new TemplateExpressionIntegerFromRealImpl();
		return templateExpressionIntegerFromReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealFromInteger createTemplateExpressionRealFromInteger() {
		TemplateExpressionRealFromIntegerImpl templateExpressionRealFromInteger = new TemplateExpressionRealFromIntegerImpl();
		return templateExpressionRealFromInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionParameterSimple createTemplateExpressionParameterSimple() {
		TemplateExpressionParameterSimpleImpl templateExpressionParameterSimple = new TemplateExpressionParameterSimpleImpl();
		return templateExpressionParameterSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionParameterArrayValueAt createTemplateExpressionParameterArrayValueAt() {
		TemplateExpressionParameterArrayValueAtImpl templateExpressionParameterArrayValueAt = new TemplateExpressionParameterArrayValueAtImpl();
		return templateExpressionParameterArrayValueAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionParameterArraySize createTemplateExpressionParameterArraySize() {
		TemplateExpressionParameterArraySizeImpl templateExpressionParameterArraySize = new TemplateExpressionParameterArraySizeImpl();
		return templateExpressionParameterArraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionArrayAggregate createTemplateExpressionArrayAggregate() {
		TemplateExpressionArrayAggregateImpl templateExpressionArrayAggregate = new TemplateExpressionArrayAggregateImpl();
		return templateExpressionArrayAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealSum createTemplateExpressionRealSum() {
		TemplateExpressionRealSumImpl templateExpressionRealSum = new TemplateExpressionRealSumImpl();
		return templateExpressionRealSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealSubtract createTemplateExpressionRealSubtract() {
		TemplateExpressionRealSubtractImpl templateExpressionRealSubtract = new TemplateExpressionRealSubtractImpl();
		return templateExpressionRealSubtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealMultiply createTemplateExpressionRealMultiply() {
		TemplateExpressionRealMultiplyImpl templateExpressionRealMultiply = new TemplateExpressionRealMultiplyImpl();
		return templateExpressionRealMultiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealDivide createTemplateExpressionRealDivide() {
		TemplateExpressionRealDivideImpl templateExpressionRealDivide = new TemplateExpressionRealDivideImpl();
		return templateExpressionRealDivide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealModulo createTemplateExpressionRealModulo() {
		TemplateExpressionRealModuloImpl templateExpressionRealModulo = new TemplateExpressionRealModuloImpl();
		return templateExpressionRealModulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealFloor createTemplateExpressionRealFloor() {
		TemplateExpressionRealFloorImpl templateExpressionRealFloor = new TemplateExpressionRealFloorImpl();
		return templateExpressionRealFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealCeil createTemplateExpressionRealCeil() {
		TemplateExpressionRealCeilImpl templateExpressionRealCeil = new TemplateExpressionRealCeilImpl();
		return templateExpressionRealCeil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealRound createTemplateExpressionRealRound() {
		TemplateExpressionRealRoundImpl templateExpressionRealRound = new TemplateExpressionRealRoundImpl();
		return templateExpressionRealRound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionRealIfThenElse createTemplateExpressionRealIfThenElse() {
		TemplateExpressionRealIfThenElseImpl templateExpressionRealIfThenElse = new TemplateExpressionRealIfThenElseImpl();
		return templateExpressionRealIfThenElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionBooleanNot createTemplateExpressionBooleanNot() {
		TemplateExpressionBooleanNotImpl templateExpressionBooleanNot = new TemplateExpressionBooleanNotImpl();
		return templateExpressionBooleanNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionBooleanToInteger createTemplateExpressionBooleanToInteger() {
		TemplateExpressionBooleanToIntegerImpl templateExpressionBooleanToInteger = new TemplateExpressionBooleanToIntegerImpl();
		return templateExpressionBooleanToInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionBooleanAnd createTemplateExpressionBooleanAnd() {
		TemplateExpressionBooleanAndImpl templateExpressionBooleanAnd = new TemplateExpressionBooleanAndImpl();
		return templateExpressionBooleanAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionBooleanOr createTemplateExpressionBooleanOr() {
		TemplateExpressionBooleanOrImpl templateExpressionBooleanOr = new TemplateExpressionBooleanOrImpl();
		return templateExpressionBooleanOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAggregateKind createArrayAggregateKindFromString(EDataType eDataType, String initialValue) {
		ArrayAggregateKind result = ArrayAggregateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayAggregateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsPackage getExpressionsPackage() {
		return (ExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionsPackage getPackage() {
		return ExpressionsPackage.eINSTANCE;
	}

} //ExpressionsFactoryImpl
