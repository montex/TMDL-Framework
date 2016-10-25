/**
 */
package tmdl.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealBinary#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealBinary#getExp2 <em>Exp2</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealBinary()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TemplateExpressionRealBinary extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp1</em>' containment reference.
	 * @see #setExp1(TemplateExpressionReal)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealBinary_Exp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getExp1();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealBinary#getExp1 <em>Exp1</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Exp2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp2</em>' containment reference.
	 * @see #setExp2(TemplateExpressionReal)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealBinary_Exp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getExp2();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealBinary#getExp2 <em>Exp2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp2</em>' containment reference.
	 * @see #getExp2()
	 * @generated
	 */
	void setExp2(TemplateExpressionReal value);

} // TemplateExpressionRealBinary
