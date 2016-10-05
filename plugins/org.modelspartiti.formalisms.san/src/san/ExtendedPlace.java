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
 * <ul>
 *   <li>{@link san.ExtendedPlace#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @see san.SANPackage#getExtendedPlace()
 * @model
 * @generated
 */
public interface ExtendedPlace extends Place {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(Marking)
	 * @see san.SANPackage#getExtendedPlace_Marking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getMarking();

	/**
	 * Sets the value of the '{@link san.ExtendedPlace#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(Marking value);

} // ExtendedPlace
