/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parambinding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Parambinding#getRef <em>Ref</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Parambinding#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getParambinding()
 * @model
 * @generated
 */
public interface Parambinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Parameter)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getParambinding_Ref()
	 * @model required="true"
	 * @generated
	 */
	Parameter getRef();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Parambinding#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Parameter value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Parameter)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getParambinding_Source()
	 * @model required="true"
	 * @generated
	 */
	Parameter getSource();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Parambinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Parameter value);

} // Parambinding
