/**
 */
package san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Intermediate Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.MarkingIntermediateNode#getIntermediatenode <em>Intermediatenode</em>}</li>
 *   <li>{@link san.MarkingIntermediateNode#getIndex <em>Index</em>}</li>
 *   <li>{@link san.MarkingIntermediateNode#getDefinition <em>Definition</em>}</li>
 *   <li>{@link san.MarkingIntermediateNode#getLeafnode <em>Leafnode</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getMarkingIntermediateNode()
 * @model
 * @generated
 */
public interface MarkingIntermediateNode extends MarkingExtended {
	/**
	 * Returns the value of the '<em><b>Intermediatenode</b></em>' containment reference list.
	 * The list contents are of type {@link san.MarkingIntermediateNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediatenode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediatenode</em>' containment reference list.
	 * @see san.SANPackage#getMarkingIntermediateNode_Intermediatenode()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkingIntermediateNode> getIntermediatenode();

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
	 * @see san.SANPackage#getMarkingIntermediateNode_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link san.MarkingIntermediateNode#getIndex <em>Index</em>}' attribute.
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
	 * @see san.SANPackage#getMarkingIntermediateNode_Definition()
	 * @model required="true"
	 * @generated
	 */
	CustomTypeDefinition getDefinition();

	/**
	 * Sets the value of the '{@link san.MarkingIntermediateNode#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CustomTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Leafnode</b></em>' containment reference list.
	 * The list contents are of type {@link san.MarkingLeafNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leafnode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leafnode</em>' containment reference list.
	 * @see san.SANPackage#getMarkingIntermediateNode_Leafnode()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkingLeafNode> getLeafnode();

} // MarkingIntermediateNode
