/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erlang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.Erlang#getM <em>M</em>}</li>
 *   <li>{@link san.Erlang#getBeta <em>Beta</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getErlang()
 * @model
 * @generated
 */
public interface Erlang extends Distribution {
	/**
	 * Returns the value of the '<em><b>M</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' containment reference.
	 * @see #setM(Expression)
	 * @see san.SANPackage#getErlang_M()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getM();

	/**
	 * Sets the value of the '{@link san.Erlang#getM <em>M</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' containment reference.
	 * @see #getM()
	 * @generated
	 */
	void setM(Expression value);

	/**
	 * Returns the value of the '<em><b>Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' containment reference.
	 * @see #setBeta(Expression)
	 * @see san.SANPackage#getErlang_Beta()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBeta();

	/**
	 * Sets the value of the '{@link san.Erlang#getBeta <em>Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta</em>' containment reference.
	 * @see #getBeta()
	 * @generated
	 */
	void setBeta(Expression value);

} // Erlang
