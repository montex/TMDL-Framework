/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.ExtendedPlace#getMarking <em>Marking</em>}</li>
 *   <li>{@link san.ExtendedPlace#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getExtendedPlace()
 * @model
 * @generated
 */
public interface ExtendedPlace<T extends ExtendedTypeDefinition> extends Place {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(MarkingExtended)
	 * @see san.SANPackage#getExtendedPlace_Marking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MarkingExtended getMarking();

	/**
	 * Sets the value of the '{@link san.ExtendedPlace#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(MarkingExtended value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ExtendedTypeDefinition)
	 * @see san.SANPackage#getExtendedPlace_Type()
	 * @model required="true"
	 * @generated
	 */
	T getType();

	/**
	 * Sets the value of the '{@link san.ExtendedPlace#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(T value);

} // ExtendedPlace
