/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealUnary()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TemplateExpressionRealUnary extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(TemplateExpressionReal)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealUnary_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getExp();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TemplateExpressionReal value);

} // TemplateExpressionRealUnary
