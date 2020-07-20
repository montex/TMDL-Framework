/**
 */
package org.modelspartiti.formalisms.san.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Gamma#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Gamma#getBeta <em>Beta</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getGamma()
 * @model
 * @generated
 */
public interface Gamma extends Distribution {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' containment reference.
	 * @see #setAlpha(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getGamma_Alpha()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAlpha();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Gamma#getAlpha <em>Alpha</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' containment reference.
	 * @see #setBeta(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getGamma_Beta()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBeta();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Gamma#getBeta <em>Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta</em>' containment reference.
	 * @see #getBeta()
	 * @generated
	 */
	void setBeta(Expression value);

} // Gamma
