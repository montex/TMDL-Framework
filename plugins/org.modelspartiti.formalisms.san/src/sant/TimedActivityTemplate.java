/**
 */
package sant;

import san.Distribution;
import san.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Activity Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.TimedActivityTemplate#getTimeDistribution <em>Time Distribution</em>}</li>
 *   <li>{@link sant.TimedActivityTemplate#getActivation <em>Activation</em>}</li>
 *   <li>{@link sant.TimedActivityTemplate#getReactivation <em>Reactivation</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getTimedActivityTemplate()
 * @model
 * @generated
 */
public interface TimedActivityTemplate extends ActivityTemplate {
	/**
	 * Returns the value of the '<em><b>Time Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Distribution</em>' containment reference.
	 * @see #setTimeDistribution(Distribution)
	 * @see sant.SANTPackage#getTimedActivityTemplate_TimeDistribution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Distribution getTimeDistribution();

	/**
	 * Sets the value of the '{@link sant.TimedActivityTemplate#getTimeDistribution <em>Time Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Distribution</em>' containment reference.
	 * @see #getTimeDistribution()
	 * @generated
	 */
	void setTimeDistribution(Distribution value);

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' containment reference.
	 * @see #setActivation(Expression)
	 * @see sant.SANTPackage#getTimedActivityTemplate_Activation()
	 * @model containment="true"
	 * @generated
	 */
	Expression getActivation();

	/**
	 * Sets the value of the '{@link sant.TimedActivityTemplate#getActivation <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' containment reference.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Expression value);

	/**
	 * Returns the value of the '<em><b>Reactivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactivation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactivation</em>' containment reference.
	 * @see #setReactivation(Expression)
	 * @see sant.SANTPackage#getTimedActivityTemplate_Reactivation()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReactivation();

	/**
	 * Sets the value of the '{@link sant.TimedActivityTemplate#getReactivation <em>Reactivation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactivation</em>' containment reference.
	 * @see #getReactivation()
	 * @generated
	 */
	void setReactivation(Expression value);

} // TimedActivityTemplate
