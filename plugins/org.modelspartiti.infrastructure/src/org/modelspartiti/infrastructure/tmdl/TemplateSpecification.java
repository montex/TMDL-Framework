/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateSpecification()
 * @model abstract="true"
 * @generated
 */
public interface TemplateSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateSpecification_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateSpecification_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification#getName <em>Name</em>}' attribute.
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
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateSpecification_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateSpecification_Metrics()
	 * @model
	 * @generated
	 */
	EList<Metric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.ModelInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateSpecification_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModelInterface> getInterfaces();

} // TemplateSpecification
