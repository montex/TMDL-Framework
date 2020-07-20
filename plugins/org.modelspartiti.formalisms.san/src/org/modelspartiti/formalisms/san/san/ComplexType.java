/**
 */
package org.modelspartiti.formalisms.san.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.ComplexType#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends Type {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(CustomTypeDefinition)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getComplexType_Definition()
	 * @model required="true"
	 * @generated
	 */
	CustomTypeDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.ComplexType#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CustomTypeDefinition value);

} // ComplexType
