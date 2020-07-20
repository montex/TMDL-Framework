/**
 */
package org.modelspartiti.infrastructure.tmdl.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.modelspartiti.infrastructure.tmdl.core.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.library.Block#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.library.Block#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.library.Block#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryPackage#getBlock_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryPackage#getBlock_Multiplicity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.library.Block#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.library.ModelInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryPackage#getBlock_RequiredInterfaces()
	 * @model
	 * @generated
	 */
	EList<ModelInterface> getRequiredInterfaces();

} // Block
