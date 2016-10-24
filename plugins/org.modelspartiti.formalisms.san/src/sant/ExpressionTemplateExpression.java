/**
 */
package sant;

import tmdl.expressions.TemplateExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Template Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.ExpressionTemplateExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExpressionTemplateExpression()
 * @model
 * @generated
 */
public interface ExpressionTemplateExpression extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(TemplateExpression)
	 * @see sant.SANTPackage#getExpressionTemplateExpression_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpression getExp();

	/**
	 * Sets the value of the '{@link sant.ExpressionTemplateExpression#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TemplateExpression value);

} // ExpressionTemplateExpression
