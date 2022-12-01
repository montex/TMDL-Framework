/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Scenario#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Scenario#getRoot <em>Root</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Scenario#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getScenario_Variants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Variant> getVariants();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Variant)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getScenario_Root()
	 * @model required="true"
	 * @generated
	 */
	Variant getRoot();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Scenario#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Variant value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getScenario_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Scenario
