/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Array Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.ValueArrayInt#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getValueArrayInt()
 * @model
 * @generated
 */
public interface ValueArrayInt extends ValueArray, Multiplicity {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.ValueInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getValueArrayInt_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueInt> getValues();

} // ValueArrayInt
