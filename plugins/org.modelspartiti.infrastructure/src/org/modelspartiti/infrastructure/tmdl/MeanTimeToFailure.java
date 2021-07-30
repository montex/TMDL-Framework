/**
 */
package org.modelspartiti.infrastructure.tmdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mean Time To Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getMeanTimeToFailure()
 * @model
 * @generated
 */
public interface MeanTimeToFailure extends Metric {
	/**
	 * Returns the value of the '<em><b>Calculation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation</em>' attribute.
	 * @see org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc
	 * @see #setCalculation(MeanTimeToFailureCalc)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getMeanTimeToFailure_Calculation()
	 * @model required="true"
	 * @generated
	 */
	MeanTimeToFailureCalc getCalculation();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure#getCalculation <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation</em>' attribute.
	 * @see org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc
	 * @see #getCalculation()
	 * @generated
	 */
	void setCalculation(MeanTimeToFailureCalc value);

} // MeanTimeToFailure
