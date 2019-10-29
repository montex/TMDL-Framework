/**
 */
package san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.IntermediateNode#getIndex <em>Index</em>}</li>
 *   <li>{@link san.IntermediateNode#getDefinition <em>Definition</em>}</li>
 *   <li>{@link san.IntermediateNode#getLeafnode <em>Leafnode</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getIntermediateNode()
 * @model
 * @generated
 */
public interface IntermediateNode extends Node {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see san.SANPackage#getIntermediateNode_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link san.IntermediateNode#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(CustomTypeDefinition)
	 * @see san.SANPackage#getIntermediateNode_Definition()
	 * @model required="true"
	 * @generated
	 */
	CustomTypeDefinition getDefinition();

	/**
	 * Sets the value of the '{@link san.IntermediateNode#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CustomTypeDefinition value);

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
	 * @see san.SANPackage#getIntermediateNode_Leafnode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Node> getLeafnode();

} // IntermediateNode
