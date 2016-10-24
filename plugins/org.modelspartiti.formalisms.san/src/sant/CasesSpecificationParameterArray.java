/**
 */
package sant;

import tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Parameter Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.CasesSpecificationParameterArray#getPValues <em>PValues</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getCasesSpecificationParameterArray()
 * @model
 * @generated
 */
public interface CasesSpecificationParameterArray extends CasesSpecification {
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
	 * @see sant.SANTPackage#getCasesSpecificationParameterArray_PValues()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getPValues();

	/**
	 * Sets the value of the '{@link sant.CasesSpecificationParameterArray#getPValues <em>PValues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PValues</em>' reference.
	 * @see #getPValues()
	 * @generated
	 */
	void setPValues(ParameterArray value);

} // CasesSpecificationParameterArray
