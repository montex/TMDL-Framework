/**
 */
package org.modelspartiti.formalisms.san;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.Field#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.Field#getTypeStruct <em>Type Struct</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.SANPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Struct</em>' containment reference.
	 * @see #setTypeStruct(Type)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getField_TypeStruct()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getTypeStruct();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.Field#getTypeStruct <em>Type Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Struct</em>' containment reference.
	 * @see #getTypeStruct()
	 * @generated
	 */
	void setTypeStruct(Type value);

} // Field
