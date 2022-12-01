/**
 */
package org.modelspartiti.infrastructure.tmdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Parametric#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getParametric()
 * @model
 * @generated
 */
public interface Parametric extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Parameter)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getParametric_Ref()
	 * @model required="true"
	 * @generated
	 */
	Parameter getRef();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Parametric#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Parameter value);

} // Parametric
