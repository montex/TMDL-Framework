/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Array#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Array#getLeafnode <em>Leafnode</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Node {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(CustomTypeArray)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getArray_Definition()
	 * @model required="true"
	 * @generated
	 */
	CustomTypeArray getDefinition();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Array#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CustomTypeArray value);

	/**
	 * Returns the value of the '<em><b>Leafnode</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leafnode</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getArray_Leafnode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Node> getLeafnode();

} // Array
