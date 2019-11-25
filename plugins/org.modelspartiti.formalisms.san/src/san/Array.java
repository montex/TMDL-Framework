/**
 */
package san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.Array#getDefinition <em>Definition</em>}</li>
 *   <li>{@link san.Array#getLeafnode <em>Leafnode</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Node {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(CustomTypeArray)
	 * @see san.SANPackage#getArray_Definition()
	 * @model required="true"
	 * @generated
	 */
	CustomTypeArray getDefinition();

	/**
	 * Sets the value of the '{@link san.Array#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CustomTypeArray value);

	/**
	 * Returns the value of the '<em><b>Leafnode</b></em>' containment reference list.
	 * The list contents are of type {@link san.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leafnode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leafnode</em>' containment reference list.
	 * @see san.SANPackage#getArray_Leafnode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Node> getLeafnode();

} // Array
