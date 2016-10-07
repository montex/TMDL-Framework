/**
 */
package san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link san.Gate#getFunction <em>Function</em>}</li>
 *   <li>{@link san.Gate#getPlaces <em>Places</em>}</li>
 *   <li>{@link san.Gate#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see san.SANPackage#getGate()
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
	 * @see san.SANPackage#getGate_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFunction();

	/**
	 * Sets the value of the '{@link san.Gate#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Expression value);

	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link san.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see san.SANPackage#getGate_Places()
	 * @model
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see san.SANPackage#getGate_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link san.Gate#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // Gate
