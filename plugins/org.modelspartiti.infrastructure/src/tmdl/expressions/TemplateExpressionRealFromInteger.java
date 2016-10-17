/**
 */
package tmdl.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real From Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealFromInteger#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealFromInteger()
 * @model
 * @generated
 */
public interface TemplateExpressionRealFromInteger extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(TemplateExpressionInteger)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealFromInteger_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getExp();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealFromInteger#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TemplateExpressionInteger value);

} // TemplateExpressionRealFromInteger
