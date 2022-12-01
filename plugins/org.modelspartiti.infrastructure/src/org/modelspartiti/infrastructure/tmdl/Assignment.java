/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Assignment#getRef <em>Ref</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Parameter)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getAssignment_Ref()
	 * @model required="true"
	 * @generated
	 */
	Parameter getRef();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Assignment#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getAssignment_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Assignment
