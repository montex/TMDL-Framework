/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.GlobalVariable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getGlobalVariable()
 * @model
 * @generated
 */
public interface GlobalVariable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"int"</code>.
	 * The literals are from the enumeration {@link sant.VariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sant.VariableType
	 * @see #setType(VariableType)
	 * @see sant.SANTPackage#getGlobalVariable_Type()
	 * @model default="int" required="true"
	 * @generated
	 */
	VariableType getType();

	/**
	 * Sets the value of the '{@link sant.GlobalVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sant.VariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableType value);

} // GlobalVariable
