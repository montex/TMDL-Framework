/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.ModelInterface#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.ModelInterface#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getModelInterface()
 * @model abstract="true"
 * @generated
 */
public interface ModelInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getModelInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.ModelInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.StateMetavariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getModelInterface_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StateMetavariable> getVariables();

} // ModelInterface
