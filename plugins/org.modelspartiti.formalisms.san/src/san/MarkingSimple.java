/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.MarkingSimple#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getMarkingSimple()
 * @model
 * @generated
 */
public interface MarkingSimple extends Marking {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(short)
	 * @see san.SANPackage#getMarkingSimple_Value()
	 * @model required="true"
	 * @generated
	 */
	short getValue();

	/**
	 * Sets the value of the '{@link san.MarkingSimple#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(short value);

} // MarkingSimple
