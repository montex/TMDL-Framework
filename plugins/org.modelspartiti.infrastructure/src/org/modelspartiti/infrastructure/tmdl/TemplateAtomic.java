/**
 */
package org.modelspartiti.infrastructure.tmdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateAtomic#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateAtomic()
 * @model
 * @generated
 */
public interface TemplateAtomic extends TemplateSpecification {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateAtomic_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.TemplateAtomic#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // TemplateAtomic
