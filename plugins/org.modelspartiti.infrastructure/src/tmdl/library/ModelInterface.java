/**
 */
package tmdl.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tmdl.core.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmdl.library.ModelInterface#getName <em>Name</em>}</li>
 *   <li>{@link tmdl.library.ModelInterface#getVariables <em>Variables</em>}</li>
 *   <li>{@link tmdl.library.ModelInterface#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see tmdl.library.LibraryPackage#getModelInterface()
 * @model
 * @generated
 */
public interface ModelInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tmdl.library.LibraryPackage#getModelInterface_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tmdl.library.ModelInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.library.InterfaceVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see tmdl.library.LibraryPackage#getModelInterface_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterfaceVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see tmdl.library.LibraryPackage#getModelInterface_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // ModelInterface
