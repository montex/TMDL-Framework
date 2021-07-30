/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Library#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Library#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Library#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getLibrary_Templates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TemplateSpecification> getTemplates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getLibrary_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.ModelInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getLibrary_Interfaces()
	 * @model
	 * @generated
	 */
	EList<ModelInterface> getInterfaces();

} // Library
