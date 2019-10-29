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
 *   <li>{@link san.LeafNodeStruct#getDefinitionField <em>Definition Field</em>}</li>
 *   <li>{@link san.LeafNodeStruct#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getLeafNodeStruct()
 * @model
 * @generated
 */
public interface LeafNodeStruct extends Node {
	/**
	 * Returns the value of the '<em><b>Definition Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Field</em>' reference.
	 * @see #setDefinitionField(Field)
	 * @see san.SANPackage#getLeafNodeStruct_DefinitionField()
	 * @model required="true"
	 * @generated
	 */
	Field getDefinitionField();

	/**
	 * Sets the value of the '{@link san.LeafNodeStruct#getDefinitionField <em>Definition Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Field</em>' reference.
	 * @see #getDefinitionField()
	 * @generated
	 */
	void setDefinitionField(Field value);

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
	 * @see san.SANPackage#getLeafNodeStruct_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link san.LeafNodeStruct#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LeafNodeStruct
