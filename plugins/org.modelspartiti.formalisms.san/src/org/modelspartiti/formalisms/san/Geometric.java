/**
 */
package org.modelspartiti.formalisms.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.Geometric#getP <em>P</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.SANPackage#getGeometric()
 * @model
 * @generated
 */
public interface Geometric extends Distribution {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(Expression)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getGeometric_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getP();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.Geometric#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(Expression value);

} // Geometric
