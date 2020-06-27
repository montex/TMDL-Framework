/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Node Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.LeafNodeGlobalVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getLeafNodeGlobalVariable()
 * @model
 * @generated
 */
public interface LeafNodeGlobalVariable extends LeafNode {
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
	 * @see san.SANPackage#getLeafNodeGlobalVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getVariable();

	/**
	 * Sets the value of the '{@link san.LeafNodeGlobalVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(GlobalVariable value);

} // LeafNodeGlobalVariable
