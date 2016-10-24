/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.ExtendedPlace#getMarking <em>Marking</em>}</li>
 *   <li>{@link sant.ExtendedPlace#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExtendedPlace()
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
	 * @see #setMarking(MarkingExtended)
	 * @see sant.SANTPackage#getExtendedPlace_Marking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MarkingExtended getMarking();

	/**
	 * Sets the value of the '{@link sant.ExtendedPlace#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(MarkingExtended value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"double"</code>.
	 * The literals are from the enumeration {@link sant.ExtendedPlaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sant.ExtendedPlaceType
	 * @see #setType(ExtendedPlaceType)
	 * @see sant.SANTPackage#getExtendedPlace_Type()
	 * @model default="double" required="true"
	 * @generated
	 */
	ExtendedPlaceType getType();

	/**
	 * Sets the value of the '{@link sant.ExtendedPlace#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sant.ExtendedPlaceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExtendedPlaceType value);

} // ExtendedPlace
