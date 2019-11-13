/**
 */
package san;

import tmdl.expressions.TemplateExpressionBoolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.ExpressionIfThenElse#getCondition <em>Condition</em>}</li>
 *   <li>{@link san.ExpressionIfThenElse#getIfTrue <em>If True</em>}</li>
 *   <li>{@link san.ExpressionIfThenElse#getIfFalse <em>If False</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getExpressionIfThenElse()
 * @model
 * @generated
 */
public interface ExpressionIfThenElse extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(TemplateExpressionBoolean)
	 * @see san.SANPackage#getExpressionIfThenElse_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionBoolean getCondition();

	/**
	 * Sets the value of the '{@link san.ExpressionIfThenElse#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(TemplateExpressionBoolean value);

	/**
	 * Returns the value of the '<em><b>If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If True</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If True</em>' containment reference.
	 * @see #setIfTrue(ExpressionSegment)
	 * @see san.SANPackage#getExpressionIfThenElse_IfTrue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionSegment getIfTrue();

	/**
	 * Sets the value of the '{@link san.ExpressionIfThenElse#getIfTrue <em>If True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If True</em>' containment reference.
	 * @see #getIfTrue()
	 * @generated
	 */
	void setIfTrue(ExpressionSegment value);

	/**
	 * Returns the value of the '<em><b>If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If False</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If False</em>' containment reference.
	 * @see #setIfFalse(ExpressionSegment)
	 * @see san.SANPackage#getExpressionIfThenElse_IfFalse()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionSegment getIfFalse();

	/**
	 * Sets the value of the '{@link san.ExpressionIfThenElse#getIfFalse <em>If False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If False</em>' containment reference.
	 * @see #getIfFalse()
	 * @generated
	 */
	void setIfFalse(ExpressionSegment value);

} // ExpressionIfThenElse
