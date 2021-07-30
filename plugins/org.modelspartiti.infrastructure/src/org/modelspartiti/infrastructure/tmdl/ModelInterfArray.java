/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Interf Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.ModelInterfArray#getMult <em>Mult</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.ModelInterfArray#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getModelInterfArray()
 * @model
 * @generated
 */
public interface ModelInterfArray extends ModelInterface {
	/**
	 * Returns the value of the '<em><b>Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult</em>' containment reference.
	 * @see #setMult(Multiplicity)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getModelInterfArray_Mult()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Multiplicity getMult();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.ModelInterfArray#getMult <em>Mult</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult</em>' containment reference.
	 * @see #getMult()
	 * @generated
	 */
	void setMult(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getModelInterfArray_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

} // ModelInterfArray
