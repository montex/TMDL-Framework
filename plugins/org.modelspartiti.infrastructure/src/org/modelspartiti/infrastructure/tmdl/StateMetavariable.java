/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Metavariable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getMult <em>Mult</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getStateMetavariable()
 * @model
 * @generated
 */
public interface StateMetavariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getStateMetavariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getStateMetavariable_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult</em>' reference.
	 * @see #setMult(Parametric)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getStateMetavariable_Mult()
	 * @model
	 * @generated
	 */
	Parametric getMult();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable#getMult <em>Mult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult</em>' reference.
	 * @see #getMult()
	 * @generated
	 */
	void setMult(Parametric value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getStateMetavariable_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

} // StateMetavariable
