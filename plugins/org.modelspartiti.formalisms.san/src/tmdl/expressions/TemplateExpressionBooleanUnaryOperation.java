/**
 */
package tmdl.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Boolean Unary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionBooleanUnaryOperation#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanUnaryOperation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TemplateExpressionBooleanUnaryOperation extends TemplateExpressionBoolean {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(TemplateExpressionBoolean)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanUnaryOperation_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionBoolean getExp();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionBooleanUnaryOperation#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TemplateExpressionBoolean value);

} // TemplateExpressionBooleanUnaryOperation
