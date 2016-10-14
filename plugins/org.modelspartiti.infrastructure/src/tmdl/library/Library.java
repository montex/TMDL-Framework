/**
 */
package tmdl.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.library.Library#getName <em>Name</em>}</li>
 *   <li>{@link tmdl.library.Library#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link tmdl.library.Library#getTemplates <em>Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.library.LibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tmdl.library.LibraryPackage#getLibrary_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tmdl.library.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.library.ModelInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see tmdl.library.LibraryPackage#getLibrary_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModelInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.library.TemplateSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see tmdl.library.LibraryPackage#getLibrary_Templates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TemplateSpecification> getTemplates();

} // Library
