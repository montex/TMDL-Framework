/**
 */
package org.modelspartiti.formalisms.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.CustomTypeArray#getSize <em>Size</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.CustomTypeArray#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.CustomTypeArray#getTypeArray <em>Type Array</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.SANPackage#getCustomTypeArray()
 * @model
 * @generated
 */
public interface CustomTypeArray extends CustomTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getCustomTypeArray_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.CustomTypeArray#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getCustomTypeArray_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.CustomTypeArray#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Array</em>' containment reference.
	 * @see #setTypeArray(Type)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getCustomTypeArray_TypeArray()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getTypeArray();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.CustomTypeArray#getTypeArray <em>Type Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Array</em>' containment reference.
	 * @see #getTypeArray()
	 * @generated
	 */
	void setTypeArray(Type value);

} // CustomTypeArray
