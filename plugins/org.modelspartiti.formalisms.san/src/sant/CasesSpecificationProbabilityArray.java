/**
 */
package sant;

import tmdl.core.Parameter;
import tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Probability Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.CasesSpecificationProbabilityArray#getCaseParameter <em>Case Parameter</em>}</li>
 *   <li>{@link sant.CasesSpecificationProbabilityArray#getPValues <em>PValues</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getCasesSpecificationProbabilityArray()
 * @model
 * @generated
 */
public interface CasesSpecificationProbabilityArray extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Case Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Parameter</em>' reference.
	 * @see #setCaseParameter(Parameter)
	 * @see sant.SANTPackage#getCasesSpecificationProbabilityArray_CaseParameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getCaseParameter();

	/**
	 * Sets the value of the '{@link sant.CasesSpecificationProbabilityArray#getCaseParameter <em>Case Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Parameter</em>' reference.
	 * @see #getCaseParameter()
	 * @generated
	 */
	void setCaseParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>PValues</b></em>' reference.
	 * <!-- begin-user-doc -->
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
