/**
 */
package sant_dev;

import org.eclipse.emf.common.util.EList;

import san.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Gate Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.InputGateTemplate#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link sant_dev.InputGateTemplate#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getInputGateTemplate()
 * @model
 * @generated
 */
public interface InputGateTemplate extends GateTemplate {
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
	 * @see sant_dev.SANT_DEVPackage#getInputGateTemplate_Predicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPredicate();

	/**
	 * Sets the value of the '{@link sant_dev.InputGateTemplate#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Expression value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link sant_dev.ActivityTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see sant_dev.SANT_DEVPackage#getInputGateTemplate_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<ActivityTemplate> getActivity();

} // InputGateTemplate
