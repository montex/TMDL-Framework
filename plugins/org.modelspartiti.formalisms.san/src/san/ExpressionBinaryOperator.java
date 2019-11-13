/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.ExpressionBinaryOperator#getOp1 <em>Op1</em>}</li>
 *   <li>{@link san.ExpressionBinaryOperator#getOp2 <em>Op2</em>}</li>
 *   <li>{@link san.ExpressionBinaryOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getExpressionBinaryOperator()
 * @model
 * @generated
 */
public interface ExpressionBinaryOperator extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op1</em>' containment reference.
	 * @see #setOp1(ExpressionSegment)
	 * @see san.SANPackage#getExpressionBinaryOperator_Op1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionSegment getOp1();

	/**
	 * Sets the value of the '{@link san.ExpressionBinaryOperator#getOp1 <em>Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op1</em>' containment reference.
	 * @see #getOp1()
	 * @generated
	 */
	void setOp1(ExpressionSegment value);

	/**
	 * Returns the value of the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op2</em>' containment reference.
	 * @see #setOp2(ExpressionSegment)
	 * @see san.SANPackage#getExpressionBinaryOperator_Op2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionSegment getOp2();

	/**
	 * Sets the value of the '{@link san.ExpressionBinaryOperator#getOp2 <em>Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op2</em>' containment reference.
	 * @see #getOp2()
	 * @generated
	 */
	void setOp2(ExpressionSegment value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link san.BinaryOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see san.BinaryOperatorType
	 * @see #setOperator(BinaryOperatorType)
	 * @see san.SANPackage#getExpressionBinaryOperator_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperatorType getOperator();

	/**
	 * Sets the value of the '{@link san.ExpressionBinaryOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see san.BinaryOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperatorType value);

} // ExpressionBinaryOperator
