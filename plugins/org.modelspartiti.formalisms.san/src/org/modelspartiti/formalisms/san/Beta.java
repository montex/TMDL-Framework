/**
 */
package org.modelspartiti.formalisms.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.Beta#getAlpha1 <em>Alpha1</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.Beta#getBeta1 <em>Beta1</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.SANPackage#getBeta()
 * @model
 * @generated
 */
public interface Beta extends Distribution {
	/**
	 * Returns the value of the '<em><b>Alpha1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha1</em>' containment reference.
	 * @see #setAlpha1(Expression)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getBeta_Alpha1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAlpha1();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.Beta#getAlpha1 <em>Alpha1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha1</em>' containment reference.
	 * @see #getAlpha1()
	 * @generated
	 */
	void setAlpha1(Expression value);

	/**
	 * Returns the value of the '<em><b>Beta1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta1</em>' containment reference.
	 * @see #setBeta1(Expression)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getBeta_Beta1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBeta1();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.Beta#getBeta1 <em>Beta1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta1</em>' containment reference.
	 * @see #getBeta1()
	 * @generated
	 */
	void setBeta1(Expression value);

} // Beta
