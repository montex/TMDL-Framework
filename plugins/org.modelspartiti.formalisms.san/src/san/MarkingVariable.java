/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link san.MarkingVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see san.SANPackage#getMarkingVariable()
 * @model
 * @generated
 */
public interface MarkingVariable extends MarkingSimple {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(GlobalVariable)
	 * @see san.SANPackage#getMarkingVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getVariable();

	/**
	 * Sets the value of the '{@link san.MarkingVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(GlobalVariable value);

} // MarkingVariable
