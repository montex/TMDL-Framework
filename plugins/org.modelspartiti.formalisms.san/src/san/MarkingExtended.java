/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Extended</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link san.MarkingExtended#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see san.SANPackage#getMarkingExtended()
 * @model
 * @generated
 */
public interface MarkingExtended extends Marking {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see san.SANPackage#getMarkingExtended_Value()
	 * @model default="0" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link san.MarkingExtended#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // MarkingExtended
