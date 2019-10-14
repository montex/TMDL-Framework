/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weibull</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.Weibull#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link san.Weibull#getBeta <em>Beta</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getWeibull()
 * @model
 * @generated
 */
public interface Weibull extends Distribution {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' containment reference.
	 * @see #setAlpha(Expression)
	 * @see san.SANPackage#getWeibull_Alpha()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAlpha();

	/**
	 * Sets the value of the '{@link san.Weibull#getAlpha <em>Alpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' containment reference.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Expression value);

	/**
	 * Returns the value of the '<em><b>Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' containment reference.
	 * @see #setBeta(Expression)
	 * @see san.SANPackage#getWeibull_Beta()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBeta();

	/**
	 * Sets the value of the '{@link san.Weibull#getBeta <em>Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta</em>' containment reference.
	 * @see #getBeta()
	 * @generated
	 */
	void setBeta(Expression value);

} // Weibull
