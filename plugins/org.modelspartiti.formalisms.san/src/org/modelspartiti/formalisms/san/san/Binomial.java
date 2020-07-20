/**
 */
package org.modelspartiti.formalisms.san.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binomial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Binomial#getT <em>T</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Binomial#getP <em>P</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getBinomial()
 * @model
 * @generated
 */
public interface Binomial extends Distribution {
	/**
	 * Returns the value of the '<em><b>T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' containment reference.
	 * @see #setT(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getBinomial_T()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getT();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Binomial#getT <em>T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' containment reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(Expression value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getBinomial_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getP();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Binomial#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(Expression value);

} // Binomial
