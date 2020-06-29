/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Exponential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.HyperExponential#getRate0 <em>Rate0</em>}</li>
 *   <li>{@link san.HyperExponential#getP0 <em>P0</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getHyperExponential()
 * @model
 * @generated
 */
public interface HyperExponential extends Distribution {
	/**
	 * Returns the value of the '<em><b>Rate0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate0</em>' containment reference.
	 * @see #setRate0(Expression)
	 * @see san.SANPackage#getHyperExponential_Rate0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRate0();

	/**
	 * Sets the value of the '{@link san.HyperExponential#getRate0 <em>Rate0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate0</em>' containment reference.
	 * @see #getRate0()
	 * @generated
	 */
	void setRate0(Expression value);

	/**
	 * Returns the value of the '<em><b>P0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P0</em>' containment reference.
	 * @see #setP0(Expression)
	 * @see san.SANPackage#getHyperExponential_P0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getP0();

	/**
	 * Sets the value of the '{@link san.HyperExponential#getP0 <em>P0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P0</em>' containment reference.
	 * @see #getP0()
	 * @generated
	 */
	void setP0(Expression value);

} // HyperExponential
