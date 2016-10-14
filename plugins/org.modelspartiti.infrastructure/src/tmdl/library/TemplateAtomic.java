/**
 */
package tmdl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.library.TemplateAtomic#getSource <em>Source</em>}</li>
 *   <li>{@link tmdl.library.TemplateAtomic#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.library.LibraryPackage#getTemplateAtomic()
 * @model
 * @generated
 */
public interface TemplateAtomic extends TemplateSpecification {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see tmdl.library.LibraryPackage#getTemplateAtomic_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link tmdl.library.TemplateAtomic#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see tmdl.library.LibraryPackage#getTemplateAtomic_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

} // TemplateAtomic
