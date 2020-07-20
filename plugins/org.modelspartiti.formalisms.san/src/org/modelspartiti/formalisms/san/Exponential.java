/**
 */
package org.modelspartiti.formalisms.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.Exponential#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.SANPackage#getExponential()
 * @model
 * @generated
 */
public interface Exponential extends Distribution {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' containment reference.
	 * @see #setRate(Expression)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getExponential_Rate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRate();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.Exponential#getRate <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' containment reference.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(Expression value);

} // Exponential
