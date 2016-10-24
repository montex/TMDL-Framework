/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.Activity#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference.
	 * @see #setCases(CasesSpecification)
	 * @see sant.SANTPackage#getActivity_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CasesSpecification getCases();

	/**
	 * Sets the value of the '{@link sant.Activity#getCases <em>Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cases</em>' containment reference.
	 * @see #getCases()
	 * @generated
	 */
	void setCases(CasesSpecification value);

} // Activity
