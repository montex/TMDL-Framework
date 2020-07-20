/**
 */
package org.modelspartiti.infrastructure.tmdl.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentArray#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentArray#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getAssignmentArray()
 * @model
 * @generated
 */
public interface AssignmentArray extends Assignment {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterArray)
	 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getAssignmentArray_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getParameter();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentArray#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterArray value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getAssignmentArray_Values()
	 * @model
	 * @generated
	 */
	EList<Double> getValues();

} // AssignmentArray
