/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Node Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.LeafNodeStruct#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getLeafNodeStruct()
 * @model
 * @generated
 */
public interface LeafNodeStruct extends Node {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(CustomTypeStruct)
	 * @see san.SANPackage#getLeafNodeStruct_Definition()
	 * @model required="true"
	 * @generated
	 */
	CustomTypeStruct getDefinition();

	/**
	 * Sets the value of the '{@link san.LeafNodeStruct#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CustomTypeStruct value);

} // LeafNodeStruct
