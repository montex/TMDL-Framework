/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.TimedActivity#getTimeDistribution <em>Time Distribution</em>}</li>
 *   <li>{@link san.TimedActivity#getActivation <em>Activation</em>}</li>
 *   <li>{@link san.TimedActivity#getReactivation <em>Reactivation</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getTimedActivity()
 * @model
 * @generated
 */
public interface TimedActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Time Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Distribution</em>' containment reference.
	 * @see #setTimeDistribution(Distribution)
	 * @see san.SANPackage#getTimedActivity_TimeDistribution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Distribution getTimeDistribution();

	/**
	 * Sets the value of the '{@link san.TimedActivity#getTimeDistribution <em>Time Distribution</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' containment reference.
	 * @see #setActivation(Expression)
	 * @see san.SANPackage#getTimedActivity_Activation()
	 * @model containment="true"
	 * @generated
	 */
	Expression getActivation();

	/**
	 * Sets the value of the '{@link san.TimedActivity#getActivation <em>Activation</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactivation</em>' containment reference.
	 * @see #setReactivation(Expression)
	 * @see san.SANPackage#getTimedActivity_Reactivation()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReactivation();

	/**
	 * Sets the value of the '{@link san.TimedActivity#getReactivation <em>Reactivation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactivation</em>' containment reference.
	 * @see #getReactivation()
	 * @generated
	 */
	void setReactivation(Expression value);

} // TimedActivity
