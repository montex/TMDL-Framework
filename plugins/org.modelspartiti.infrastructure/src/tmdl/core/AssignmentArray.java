/**
 */
package tmdl.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.core.AssignmentArray#getParameter <em>Parameter</em>}</li>
 *   <li>{@link tmdl.core.AssignmentArray#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.core.CorePackage#getAssignmentArray()
 * @model
 * @generated
 */
public interface AssignmentArray extends Assignment {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterArray)
	 * @see tmdl.core.CorePackage#getAssignmentArray_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getParameter();

	/**
	 * Sets the value of the '{@link tmdl.core.AssignmentArray#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterArray value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see tmdl.core.CorePackage#getAssignmentArray_Value()
	 * @model
	 * @generated
	 */
	EList<Double> getValue();

} // AssignmentArray
