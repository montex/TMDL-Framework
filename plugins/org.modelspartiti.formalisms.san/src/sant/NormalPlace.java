/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.NormalPlace#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getNormalPlace()
 * @model
 * @generated
 */
public interface NormalPlace extends Place {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(MarkingSimple)
	 * @see sant.SANTPackage#getNormalPlace_Marking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MarkingSimple getMarking();

	/**
	 * Sets the value of the '{@link sant.NormalPlace#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(MarkingSimple value);

} // NormalPlace
