/**
 */
package org.modelspartiti.infrastructure.tmdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Availability#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getAvailability()
 * @model
 * @generated
 */
public interface Availability extends Metric {
	/**
	 * Returns the value of the '<em><b>Calculation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelspartiti.infrastructure.tmdl.AvailabilityCalc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation</em>' attribute.
	 * @see org.modelspartiti.infrastructure.tmdl.AvailabilityCalc
	 * @see #setCalculation(AvailabilityCalc)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getAvailability_Calculation()
	 * @model required="true"
	 * @generated
	 */
	AvailabilityCalc getCalculation();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Availability#getCalculation <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation</em>' attribute.
	 * @see org.modelspartiti.infrastructure.tmdl.AvailabilityCalc
	 * @see #getCalculation()
	 * @generated
	 */
	void setCalculation(AvailabilityCalc value);

} // Availability
