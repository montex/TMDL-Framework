/**
 */
package tmdl.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tmdl.expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsFactory eINSTANCE = tmdl.expressions.impl.ExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Template Expression Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Integer Literal</em>'.
	 * @generated
	 */
	TemplateExpressionIntegerLiteral createTemplateExpressionIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Template Expression Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Literal</em>'.
	 * @generated
	 */
	TemplateExpressionRealLiteral createTemplateExpressionRealLiteral();

	/**
	 * Returns a new object of class '<em>Template Expression Boolaen Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Boolaen Literal</em>'.
	 * @generated
	 */
	TemplateExpressionBoolaenLiteral createTemplateExpressionBoolaenLiteral();

	/**
	 * Returns a new object of class '<em>Template Expression Integer From Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Integer From Real</em>'.
	 * @generated
	 */
	TemplateExpressionIntegerFromReal createTemplateExpressionIntegerFromReal();

	/**
	 * Returns a new object of class '<em>Template Expression Real From Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real From Integer</em>'.
	 * @generated
	 */
	TemplateExpressionRealFromInteger createTemplateExpressionRealFromInteger();

	/**
	 * Returns a new object of class '<em>Template Expression Parameter Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Parameter Simple</em>'.
	 * @generated
	 */
	TemplateExpressionParameterSimple createTemplateExpressionParameterSimple();

	/**
	 * Returns a new object of class '<em>Template Expression Parameter Array Value At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Parameter Array Value At</em>'.
	 * @generated
	 */
	TemplateExpressionParameterArrayValueAt createTemplateExpressionParameterArrayValueAt();

	/**
	 * Returns a new object of class '<em>Template Expression Parameter Array Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Parameter Array Size</em>'.
	 * @generated
	 */
	TemplateExpressionParameterArraySize createTemplateExpressionParameterArraySize();

	/**
	 * Returns a new object of class '<em>Template Expression Array Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Array Aggregate</em>'.
	 * @generated
	 */
	TemplateExpressionArrayAggregate createTemplateExpressionArrayAggregate();

	/**
	 * Returns a new object of class '<em>Template Expression Real Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Sum</em>'.
	 * @generated
	 */
	TemplateExpressionRealSum createTemplateExpressionRealSum();

	/**
	 * Returns a new object of class '<em>Template Expression Real Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Subtract</em>'.
	 * @generated
	 */
	TemplateExpressionRealSubtract createTemplateExpressionRealSubtract();

	/**
	 * Returns a new object of class '<em>Template Expression Real Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Multiply</em>'.
	 * @generated
	 */
	TemplateExpressionRealMultiply createTemplateExpressionRealMultiply();

	/**
	 * Returns a new object of class '<em>Template Expression Real Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Divide</em>'.
	 * @generated
	 */
	TemplateExpressionRealDivide createTemplateExpressionRealDivide();

	/**
	 * Returns a new object of class '<em>Template Expression Real Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Modulo</em>'.
	 * @generated
	 */
	TemplateExpressionRealModulo createTemplateExpressionRealModulo();

	/**
	 * Returns a new object of class '<em>Template Expression Real Floor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Floor</em>'.
	 * @generated
	 */
	TemplateExpressionRealFloor createTemplateExpressionRealFloor();

	/**
	 * Returns a new object of class '<em>Template Expression Real Ceil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Ceil</em>'.
	 * @generated
	 */
	TemplateExpressionRealCeil createTemplateExpressionRealCeil();

	/**
	 * Returns a new object of class '<em>Template Expression Real Round</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real Round</em>'.
	 * @generated
	 */
	TemplateExpressionRealRound createTemplateExpressionRealRound();

	/**
	 * Returns a new object of class '<em>Template Expression Real If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Real If Then Else</em>'.
	 * @generated
	 */
	TemplateExpressionRealIfThenElse createTemplateExpressionRealIfThenElse();

	/**
	 * Returns a new object of class '<em>Template Expression Boolean Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Boolean Not</em>'.
	 * @generated
	 */
	TemplateExpressionBooleanNot createTemplateExpressionBooleanNot();

	/**
	 * Returns a new object of class '<em>Template Expression Boolean To Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Boolean To Integer</em>'.
	 * @generated
	 */
	TemplateExpressionBooleanToInteger createTemplateExpressionBooleanToInteger();

	/**
	 * Returns a new object of class '<em>Template Expression Boolean And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Boolean And</em>'.
	 * @generated
	 */
	TemplateExpressionBooleanAnd createTemplateExpressionBooleanAnd();

	/**
	 * Returns a new object of class '<em>Template Expression Boolean Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Expression Boolean Or</em>'.
	 * @generated
	 */
	TemplateExpressionBooleanOr createTemplateExpressionBooleanOr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionsPackage getExpressionsPackage();

} //ExpressionsFactory
