/**
 */
package tmdl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmdl.core.MultiplicityValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tmdl.core.CorePackage#getMultiplicityValue()
 * @model
 * @generated
 */
public interface MultiplicityValue extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see tmdl.core.CorePackage#getMultiplicityValue_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link tmdl.core.MultiplicityValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // MultiplicityValue
