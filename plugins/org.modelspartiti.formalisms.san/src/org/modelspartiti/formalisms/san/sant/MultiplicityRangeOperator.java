/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.modelspartiti.infrastructure.tmdl.core.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Range Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.MultiplicityRangeOperator#getMin <em>Min</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.MultiplicityRangeOperator#getMax <em>Max</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.MultiplicityRangeOperator#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getMultiplicityRangeOperator()
 * @model
 * @generated
 */
public interface MultiplicityRangeOperator extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getMultiplicityRangeOperator_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.MultiplicityRangeOperator#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getMultiplicityRangeOperator_Max()
	 * @model required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.MultiplicityRangeOperator#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getMultiplicityRangeOperator_Step()
	 * @model
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.MultiplicityRangeOperator#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

} // MultiplicityRangeOperator
