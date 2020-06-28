/**
 */
package tmdl.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealBinaryOperation#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealBinaryOperation#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealBinaryOperation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TemplateExpressionRealBinaryOperation extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp1</em>' containment reference.
	 * @see #setExp1(TemplateExpressionReal)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealBinaryOperation_Exp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getExp1();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealBinaryOperation#getExp1 <em>Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp1</em>' containment reference.
	 * @see #getExp1()
	 * @generated
	 */
	void setExp1(TemplateExpressionReal value);

	/**
	 * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp2</em>' containment reference.
	 * @see #setExp2(TemplateExpressionReal)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealBinaryOperation_Exp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getExp2();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealBinaryOperation#getExp2 <em>Exp2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp2</em>' containment reference.
	 * @see #getExp2()
	 * @generated
	 */
	void setExp2(TemplateExpressionReal value);

} // TemplateExpressionRealBinaryOperation
