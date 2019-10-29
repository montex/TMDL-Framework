/**
 */
package san;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Extended</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.MarkingExtended#getNode <em>Node</em>}</li>
 *   <li>{@link san.MarkingExtended#getLeafnode <em>Leafnode</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getMarkingExtended()
 * @model
 * @generated
 */
public interface MarkingExtended extends Marking {

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link san.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see san.SANPackage#getMarkingExtended_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Leafnode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leafnode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leafnode</em>' containment reference.
	 * @see #setLeafnode(LeafNode)
	 * @see san.SANPackage#getMarkingExtended_Leafnode()
	 * @model containment="true"
	 * @generated
	 */
	LeafNode getLeafnode();

	/**
	 * Sets the value of the '{@link san.MarkingExtended#getLeafnode <em>Leafnode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leafnode</em>' containment reference.
	 * @see #getLeafnode()
	 * @generated
	 */
	void setLeafnode(LeafNode value);
} // MarkingExtended
