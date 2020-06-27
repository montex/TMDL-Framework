/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypo Exponential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.HypoExponential#getRate0 <em>Rate0</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getHypoExponential()
 * @model
 * @generated
 */
public interface HypoExponential extends Distribution {
	/**
	 * Returns the value of the '<em><b>Rate0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate0</em>' containment reference.
	 * @see #setRate0(Expression)
	 * @see san.SANPackage#getHypoExponential_Rate0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRate0();

	/**
	 * Sets the value of the '{@link san.HypoExponential#getRate0 <em>Rate0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate0</em>' containment reference.
	 * @see #getRate0()
	 * @generated
	 */
	void setRate0(Expression value);

} // HypoExponential
