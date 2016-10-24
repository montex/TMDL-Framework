/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate Concrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.OutputGateConcrete#getActivityCase <em>Activity Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getOutputGateConcrete()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface OutputGateConcrete extends OutputGate {
	/**
	 * Returns the value of the '<em><b>Activity Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Case</em>' reference.
	 * @see #setActivityCase(Case)
	 * @see sant.SANTPackage#getOutputGateConcrete_ActivityCase()
	 * @model required="true"
	 * @generated
	 */
	Case getActivityCase();

	/**
	 * Sets the value of the '{@link sant.OutputGateConcrete#getActivityCase <em>Activity Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Case</em>' reference.
	 * @see #getActivityCase()
	 * @generated
	 */
	void setActivityCase(Case value);

} // OutputGateConcrete
