/**
 */
package sant_dev;

import tmdl.core.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Range Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.MultiplicityRangeOperator#getMin <em>Min</em>}</li>
 *   <li>{@link sant_dev.MultiplicityRangeOperator#getMax <em>Max</em>}</li>
 *   <li>{@link sant_dev.MultiplicityRangeOperator#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getMultiplicityRangeOperator()
 * @model
 * @generated
 */
public interface MultiplicityRangeOperator extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see sant_dev.SANT_DEVPackage#getMultiplicityRangeOperator_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link sant_dev.MultiplicityRangeOperator#getMin <em>Min</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see sant_dev.SANT_DEVPackage#getMultiplicityRangeOperator_Max()
	 * @model required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link sant_dev.MultiplicityRangeOperator#getMax <em>Max</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see sant_dev.SANT_DEVPackage#getMultiplicityRangeOperator_Step()
	 * @model
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link sant_dev.MultiplicityRangeOperator#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

} // MultiplicityRangeOperator
