/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Node String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.LeafNodeString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getLeafNodeString()
 * @model
 * @generated
 */
public interface LeafNodeString extends LeafNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see san.SANPackage#getLeafNodeString_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link san.LeafNodeString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LeafNodeString
