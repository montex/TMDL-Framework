/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link san.OutputGate#getActivityCase <em>Activity Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see san.SANPackage#getOutputGate()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface OutputGate extends Gate {
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
	 * @see san.SANPackage#getOutputGate_ActivityCase()
	 * @model required="true"
	 * @generated
	 */
	Case getActivityCase();

	/**
	 * Sets the value of the '{@link san.OutputGate#getActivityCase <em>Activity Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Case</em>' reference.
	 * @see #getActivityCase()
	 * @generated
	 */
	void setActivityCase(Case value);

} // OutputGate
