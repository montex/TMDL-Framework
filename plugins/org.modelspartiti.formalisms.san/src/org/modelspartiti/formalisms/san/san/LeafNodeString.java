/**
 */
package org.modelspartiti.formalisms.san.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Node String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.LeafNodeString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getLeafNodeString()
 * @model
 * @generated
 */
public interface LeafNodeString extends LeafNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getLeafNodeString_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.LeafNodeString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LeafNodeString
