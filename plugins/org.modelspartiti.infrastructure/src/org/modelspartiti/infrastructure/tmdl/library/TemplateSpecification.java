/**
 */
package org.modelspartiti.infrastructure.tmdl.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.modelspartiti.infrastructure.tmdl.core.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryPackage#getTemplateSpecification()
 * @model abstract="true"
 * @generated
 */
public interface TemplateSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryPackage#getTemplateSpecification_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.library.ModelInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryPackage#getTemplateSpecification_Interfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<ModelInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference.
	 * @see #setParameters(Parameter)
	 * @see org.modelspartiti.infrastructure.tmdl.library.LibraryPackage#getTemplateSpecification_Parameters()
	 * @model
	 * @generated
	 */
	Parameter getParameters();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.library.TemplateSpecification#getParameters <em>Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Parameter value);

} // TemplateSpecification
