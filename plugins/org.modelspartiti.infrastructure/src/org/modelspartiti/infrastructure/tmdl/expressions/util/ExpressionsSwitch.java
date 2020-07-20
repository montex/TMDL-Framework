/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.modelspartiti.infrastructure.tmdl.expressions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExpressionsPackage.TEMPLATE_EXPRESSION: {
				TemplateExpression templateExpression = (TemplateExpression)theEObject;
				T result = caseTemplateExpression(templateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER: {
				TemplateExpressionInteger templateExpressionInteger = (TemplateExpressionInteger)theEObject;
				T result = caseTemplateExpressionInteger(templateExpressionInteger);
				if (result == null) result = caseTemplateExpression(templateExpressionInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL: {
				TemplateExpressionReal templateExpressionReal = (TemplateExpressionReal)theEObject;
				T result = caseTemplateExpressionReal(templateExpressionReal);
				if (result == null) result = caseTemplateExpression(templateExpressionReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN: {
				TemplateExpressionBoolean templateExpressionBoolean = (TemplateExpressionBoolean)theEObject;
				T result = caseTemplateExpressionBoolean(templateExpressionBoolean);
				if (result == null) result = caseTemplateExpression(templateExpressionBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER_LITERAL: {
				TemplateExpressionIntegerLiteral templateExpressionIntegerLiteral = (TemplateExpressionIntegerLiteral)theEObject;
				T result = caseTemplateExpressionIntegerLiteral(templateExpressionIntegerLiteral);
				if (result == null) result = caseTemplateExpressionInteger(templateExpressionIntegerLiteral);
				if (result == null) result = caseTemplateExpression(templateExpressionIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_LITERAL: {
				TemplateExpressionRealLiteral templateExpressionRealLiteral = (TemplateExpressionRealLiteral)theEObject;
				T result = caseTemplateExpressionRealLiteral(templateExpressionRealLiteral);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealLiteral);
				if (result == null) result = caseTemplateExpression(templateExpressionRealLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLAEN_LITERAL: {
				TemplateExpressionBoolaenLiteral templateExpressionBoolaenLiteral = (TemplateExpressionBoolaenLiteral)theEObject;
				T result = caseTemplateExpressionBoolaenLiteral(templateExpressionBoolaenLiteral);
				if (result == null) result = caseTemplateExpressionBoolean(templateExpressionBoolaenLiteral);
				if (result == null) result = caseTemplateExpression(templateExpressionBoolaenLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER_FROM_REAL: {
				TemplateExpressionIntegerFromReal templateExpressionIntegerFromReal = (TemplateExpressionIntegerFromReal)theEObject;
				T result = caseTemplateExpressionIntegerFromReal(templateExpressionIntegerFromReal);
				if (result == null) result = caseTemplateExpressionInteger(templateExpressionIntegerFromReal);
				if (result == null) result = caseTemplateExpression(templateExpressionIntegerFromReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_FROM_INTEGER: {
				TemplateExpressionRealFromInteger templateExpressionRealFromInteger = (TemplateExpressionRealFromInteger)theEObject;
				T result = caseTemplateExpressionRealFromInteger(templateExpressionRealFromInteger);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealFromInteger);
				if (result == null) result = caseTemplateExpression(templateExpressionRealFromInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_SIMPLE: {
				TemplateExpressionParameterSimple templateExpressionParameterSimple = (TemplateExpressionParameterSimple)theEObject;
				T result = caseTemplateExpressionParameterSimple(templateExpressionParameterSimple);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionParameterSimple);
				if (result == null) result = caseTemplateExpression(templateExpressionParameterSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT: {
				TemplateExpressionParameterArrayValueAt templateExpressionParameterArrayValueAt = (TemplateExpressionParameterArrayValueAt)theEObject;
				T result = caseTemplateExpressionParameterArrayValueAt(templateExpressionParameterArrayValueAt);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionParameterArrayValueAt);
				if (result == null) result = caseTemplateExpression(templateExpressionParameterArrayValueAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE: {
				TemplateExpressionParameterArraySize templateExpressionParameterArraySize = (TemplateExpressionParameterArraySize)theEObject;
				T result = caseTemplateExpressionParameterArraySize(templateExpressionParameterArraySize);
				if (result == null) result = caseTemplateExpressionInteger(templateExpressionParameterArraySize);
				if (result == null) result = caseTemplateExpression(templateExpressionParameterArraySize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_ARRAY_AGGREGATE: {
				TemplateExpressionArrayAggregate templateExpressionArrayAggregate = (TemplateExpressionArrayAggregate)theEObject;
				T result = caseTemplateExpressionArrayAggregate(templateExpressionArrayAggregate);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionArrayAggregate);
				if (result == null) result = caseTemplateExpression(templateExpressionArrayAggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION: {
				TemplateExpressionRealBinaryOperation templateExpressionRealBinaryOperation = (TemplateExpressionRealBinaryOperation)theEObject;
				T result = caseTemplateExpressionRealBinaryOperation(templateExpressionRealBinaryOperation);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealBinaryOperation);
				if (result == null) result = caseTemplateExpression(templateExpressionRealBinaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_SUM: {
				TemplateExpressionRealSum templateExpressionRealSum = (TemplateExpressionRealSum)theEObject;
				T result = caseTemplateExpressionRealSum(templateExpressionRealSum);
				if (result == null) result = caseTemplateExpressionRealBinaryOperation(templateExpressionRealSum);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealSum);
				if (result == null) result = caseTemplateExpression(templateExpressionRealSum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_SUBTRACT: {
				TemplateExpressionRealSubtract templateExpressionRealSubtract = (TemplateExpressionRealSubtract)theEObject;
				T result = caseTemplateExpressionRealSubtract(templateExpressionRealSubtract);
				if (result == null) result = caseTemplateExpressionRealBinaryOperation(templateExpressionRealSubtract);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealSubtract);
				if (result == null) result = caseTemplateExpression(templateExpressionRealSubtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_MULTIPLY: {
				TemplateExpressionRealMultiply templateExpressionRealMultiply = (TemplateExpressionRealMultiply)theEObject;
				T result = caseTemplateExpressionRealMultiply(templateExpressionRealMultiply);
				if (result == null) result = caseTemplateExpressionRealBinaryOperation(templateExpressionRealMultiply);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealMultiply);
				if (result == null) result = caseTemplateExpression(templateExpressionRealMultiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_DIVIDE: {
				TemplateExpressionRealDivide templateExpressionRealDivide = (TemplateExpressionRealDivide)theEObject;
				T result = caseTemplateExpressionRealDivide(templateExpressionRealDivide);
				if (result == null) result = caseTemplateExpressionRealBinaryOperation(templateExpressionRealDivide);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealDivide);
				if (result == null) result = caseTemplateExpression(templateExpressionRealDivide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_MODULO: {
				TemplateExpressionRealModulo templateExpressionRealModulo = (TemplateExpressionRealModulo)theEObject;
				T result = caseTemplateExpressionRealModulo(templateExpressionRealModulo);
				if (result == null) result = caseTemplateExpressionInteger(templateExpressionRealModulo);
				if (result == null) result = caseTemplateExpression(templateExpressionRealModulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_UNARY: {
				TemplateExpressionRealUnary templateExpressionRealUnary = (TemplateExpressionRealUnary)theEObject;
				T result = caseTemplateExpressionRealUnary(templateExpressionRealUnary);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealUnary);
				if (result == null) result = caseTemplateExpression(templateExpressionRealUnary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_FLOOR: {
				TemplateExpressionRealFloor templateExpressionRealFloor = (TemplateExpressionRealFloor)theEObject;
				T result = caseTemplateExpressionRealFloor(templateExpressionRealFloor);
				if (result == null) result = caseTemplateExpressionInteger(templateExpressionRealFloor);
				if (result == null) result = caseTemplateExpression(templateExpressionRealFloor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_CEIL: {
				TemplateExpressionRealCeil templateExpressionRealCeil = (TemplateExpressionRealCeil)theEObject;
				T result = caseTemplateExpressionRealCeil(templateExpressionRealCeil);
				if (result == null) result = caseTemplateExpressionInteger(templateExpressionRealCeil);
				if (result == null) result = caseTemplateExpression(templateExpressionRealCeil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_ROUND: {
				TemplateExpressionRealRound templateExpressionRealRound = (TemplateExpressionRealRound)theEObject;
				T result = caseTemplateExpressionRealRound(templateExpressionRealRound);
				if (result == null) result = caseTemplateExpressionInteger(templateExpressionRealRound);
				if (result == null) result = caseTemplateExpression(templateExpressionRealRound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE: {
				TemplateExpressionRealIfThenElse templateExpressionRealIfThenElse = (TemplateExpressionRealIfThenElse)theEObject;
				T result = caseTemplateExpressionRealIfThenElse(templateExpressionRealIfThenElse);
				if (result == null) result = caseTemplateExpressionReal(templateExpressionRealIfThenElse);
				if (result == null) result = caseTemplateExpression(templateExpressionRealIfThenElse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION: {
				TemplateExpressionBooleanUnaryOperation templateExpressionBooleanUnaryOperation = (TemplateExpressionBooleanUnaryOperation)theEObject;
				T result = caseTemplateExpressionBooleanUnaryOperation(templateExpressionBooleanUnaryOperation);
				if (result == null) result = caseTemplateExpressionBoolean(templateExpressionBooleanUnaryOperation);
				if (result == null) result = caseTemplateExpression(templateExpressionBooleanUnaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_NOT: {
				TemplateExpressionBooleanNot templateExpressionBooleanNot = (TemplateExpressionBooleanNot)theEObject;
				T result = caseTemplateExpressionBooleanNot(templateExpressionBooleanNot);
				if (result == null) result = caseTemplateExpressionBooleanUnaryOperation(templateExpressionBooleanNot);
				if (result == null) result = caseTemplateExpressionBoolean(templateExpressionBooleanNot);
				if (result == null) result = caseTemplateExpression(templateExpressionBooleanNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER: {
				TemplateExpressionBooleanToInteger templateExpressionBooleanToInteger = (TemplateExpressionBooleanToInteger)theEObject;
				T result = caseTemplateExpressionBooleanToInteger(templateExpressionBooleanToInteger);
				if (result == null) result = caseTemplateExpressionInteger(templateExpressionBooleanToInteger);
				if (result == null) result = caseTemplateExpression(templateExpressionBooleanToInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION: {
				TemplateExpressionBooleanBinaryOperation templateExpressionBooleanBinaryOperation = (TemplateExpressionBooleanBinaryOperation)theEObject;
				T result = caseTemplateExpressionBooleanBinaryOperation(templateExpressionBooleanBinaryOperation);
				if (result == null) result = caseTemplateExpressionBoolean(templateExpressionBooleanBinaryOperation);
				if (result == null) result = caseTemplateExpression(templateExpressionBooleanBinaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND: {
				TemplateExpressionBooleanAnd templateExpressionBooleanAnd = (TemplateExpressionBooleanAnd)theEObject;
				T result = caseTemplateExpressionBooleanAnd(templateExpressionBooleanAnd);
				if (result == null) result = caseTemplateExpressionBooleanBinaryOperation(templateExpressionBooleanAnd);
				if (result == null) result = caseTemplateExpressionBoolean(templateExpressionBooleanAnd);
				if (result == null) result = caseTemplateExpression(templateExpressionBooleanAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_OR: {
				TemplateExpressionBooleanOr templateExpressionBooleanOr = (TemplateExpressionBooleanOr)theEObject;
				T result = caseTemplateExpressionBooleanOr(templateExpressionBooleanOr);
				if (result == null) result = caseTemplateExpressionBooleanBinaryOperation(templateExpressionBooleanOr);
				if (result == null) result = caseTemplateExpressionBoolean(templateExpressionBooleanOr);
				if (result == null) result = caseTemplateExpression(templateExpressionBooleanOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpression(TemplateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionInteger(TemplateExpressionInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionReal(TemplateExpressionReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionBoolean(TemplateExpressionBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionIntegerLiteral(TemplateExpressionIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealLiteral(TemplateExpressionRealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Boolaen Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Boolaen Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionBoolaenLiteral(TemplateExpressionBoolaenLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Integer From Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Integer From Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionIntegerFromReal(TemplateExpressionIntegerFromReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real From Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real From Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealFromInteger(TemplateExpressionRealFromInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Parameter Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Parameter Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionParameterSimple(TemplateExpressionParameterSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Parameter Array Value At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Parameter Array Value At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionParameterArrayValueAt(TemplateExpressionParameterArrayValueAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Parameter Array Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Parameter Array Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionParameterArraySize(TemplateExpressionParameterArraySize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Array Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Array Aggregate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionArrayAggregate(TemplateExpressionArrayAggregate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealBinaryOperation(TemplateExpressionRealBinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealSum(TemplateExpressionRealSum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealSubtract(TemplateExpressionRealSubtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealMultiply(TemplateExpressionRealMultiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealDivide(TemplateExpressionRealDivide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealModulo(TemplateExpressionRealModulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Unary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Unary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealUnary(TemplateExpressionRealUnary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Floor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Floor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealFloor(TemplateExpressionRealFloor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Ceil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Ceil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealCeil(TemplateExpressionRealCeil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real Round</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real Round</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealRound(TemplateExpressionRealRound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Real If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Real If Then Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionRealIfThenElse(TemplateExpressionRealIfThenElse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Boolean Unary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Boolean Unary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionBooleanUnaryOperation(TemplateExpressionBooleanUnaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Boolean Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Boolean Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionBooleanNot(TemplateExpressionBooleanNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Boolean To Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Boolean To Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionBooleanToInteger(TemplateExpressionBooleanToInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Boolean Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Boolean Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionBooleanBinaryOperation(TemplateExpressionBooleanBinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Boolean And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Boolean And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionBooleanAnd(TemplateExpressionBooleanAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Expression Boolean Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Expression Boolean Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateExpressionBooleanOr(TemplateExpressionBooleanOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExpressionsSwitch
