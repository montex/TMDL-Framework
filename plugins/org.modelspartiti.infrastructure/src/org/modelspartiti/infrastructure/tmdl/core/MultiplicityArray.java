/**
 */
package org.modelspartiti.infrastructure.tmdl.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityArray#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getMultiplicityArray()
 * @model
 * @generated
 */
public interface MultiplicityArray extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getMultiplicityArray_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getValues();

} // MultiplicityArray
