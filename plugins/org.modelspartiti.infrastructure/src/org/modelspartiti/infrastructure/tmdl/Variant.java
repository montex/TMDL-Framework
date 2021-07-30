/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Variant#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Variant#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Variant#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Variant#getRealizations <em>Realizations</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getVariant()
 * @model
 * @generated
 */
public interface Variant extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getVariant_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignments();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getVariant_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Variant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(TemplateSpecification)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getVariant_Template()
	 * @model required="true"
	 * @generated
	 */
	TemplateSpecification getTemplate();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Variant#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateSpecification value);

	/**
	 * Returns the value of the '<em><b>Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.BlockRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizations</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getVariant_Realizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockRealization> getRealizations();

} // Variant
