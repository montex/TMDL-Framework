/**
 */
package san;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.InputGate#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link san.InputGate#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getInputGate()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface InputGate extends Gate {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Expression)
	 * @see san.SANPackage#getInputGate_Predicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPredicate();

	/**
	 * Sets the value of the '{@link san.InputGate#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Expression value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link san.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see san.SANPackage#getInputGate_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

} // InputGate
