/**
 */
package sant;

import tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Probability Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.CasesSpecificationProbabilityArray#getPValues <em>PValues</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getCasesSpecificationProbabilityArray()
 * @model
 * @generated
 */
public interface CasesSpecificationProbabilityArray extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>PValues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PValues</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PValues</em>' reference.
	 * @see #setPValues(ParameterArray)
	 * @see sant.SANTPackage#getCasesSpecificationProbabilityArray_PValues()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getPValues();

	/**
	 * Sets the value of the '{@link sant.CasesSpecificationProbabilityArray#getPValues <em>PValues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PValues</em>' reference.
	 * @see #getPValues()
	 * @generated
	 */
	void setPValues(ParameterArray value);

} // CasesSpecificationProbabilityArray
