/**
 */
package org.modelspartiti.infrastructure.tmdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reliability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Reliability#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getReliability()
 * @model
 * @generated
 */
public interface Reliability extends Metric {
	/**
	 * Returns the value of the '<em><b>Calculation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelspartiti.infrastructure.tmdl.ReliabilityCalc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation</em>' attribute.
	 * @see org.modelspartiti.infrastructure.tmdl.ReliabilityCalc
	 * @see #setCalculation(ReliabilityCalc)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getReliability_Calculation()
	 * @model required="true"
	 * @generated
	 */
	ReliabilityCalc getCalculation();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Reliability#getCalculation <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation</em>' attribute.
	 * @see org.modelspartiti.infrastructure.tmdl.ReliabilityCalc
	 * @see #getCalculation()
	 * @generated
	 */
	void setCalculation(ReliabilityCalc value);

} // Reliability
