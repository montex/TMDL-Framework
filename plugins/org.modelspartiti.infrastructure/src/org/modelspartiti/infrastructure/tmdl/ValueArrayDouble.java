/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Array Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.ValueArrayDouble#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getValueArrayDouble()
 * @model
 * @generated
 */
public interface ValueArrayDouble extends ValueArray {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.ValueDouble}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getValueArrayDouble_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValueDouble> getValues();

} // ValueArrayDouble
