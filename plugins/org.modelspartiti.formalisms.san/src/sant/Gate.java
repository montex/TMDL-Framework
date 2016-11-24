/**
 */
package sant;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.Gate#getFunction <em>Function</em>}</li>
 *   <li>{@link sant.Gate#getPlaces <em>Places</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getGate()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Gate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Expression)
	 * @see sant.SANTPackage#getGate_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFunction();

	/**
	 * Sets the value of the '{@link sant.Gate#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Expression value);

	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link sant.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see sant.SANTPackage#getGate_Places()
	 * @model
	 * @generated
	 */
	List<Place> getPlaces();

} // Gate
