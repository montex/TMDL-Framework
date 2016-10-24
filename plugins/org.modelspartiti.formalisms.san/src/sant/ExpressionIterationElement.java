/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Iteration Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.ExpressionIterationElement#getIterator <em>Iterator</em>}</li>
 *   <li>{@link sant.ExpressionIterationElement#getI <em>I</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExpressionIterationElement()
 * @model
 * @generated
 */
public interface ExpressionIterationElement extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference.
	 * @see #setIterator(VariabilityIterator)
	 * @see sant.SANTPackage#getExpressionIterationElement_Iterator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariabilityIterator getIterator();

	/**
	 * Sets the value of the '{@link sant.ExpressionIterationElement#getIterator <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' containment reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(VariabilityIterator value);

	/**
	 * Returns the value of the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' attribute.
	 * @see #setI(int)
	 * @see sant.SANTPackage#getExpressionIterationElement_I()
	 * @model required="true"
	 * @generated
	 */
	int getI();

	/**
	 * Sets the value of the '{@link sant.ExpressionIterationElement#getI <em>I</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I</em>' attribute.
	 * @see #getI()
	 * @generated
	 */
	void setI(int value);

} // ExpressionIterationElement
