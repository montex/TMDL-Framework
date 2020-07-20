/**
 */
package org.modelspartiti.formalisms.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.Normal#getMean <em>Mean</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.Normal#getVariance <em>Variance</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.SANPackage#getNormal()
 * @model
 * @generated
 */
public interface Normal extends Distribution {
	/**
	 * Returns the value of the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' containment reference.
	 * @see #setMean(Expression)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getNormal_Mean()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMean();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.Normal#getMean <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' containment reference.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(Expression value);

	/**
	 * Returns the value of the '<em><b>Variance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variance</em>' containment reference.
	 * @see #setVariance(Expression)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getNormal_Variance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getVariance();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.Normal#getVariance <em>Variance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variance</em>' containment reference.
	 * @see #getVariance()
	 * @generated
	 */
	void setVariance(Expression value);

} // Normal
