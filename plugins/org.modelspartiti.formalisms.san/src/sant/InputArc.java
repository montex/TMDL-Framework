/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.InputArc#getSource <em>Source</em>}</li>
 *   <li>{@link sant.InputArc#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getInputArc()
 * @model
 * @generated
 */
public interface InputArc extends Arc {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Place)
	 * @see sant.SANTPackage#getInputArc_Source()
	 * @model required="true"
	 * @generated
	 */
	Place getSource();

	/**
	 * Sets the value of the '{@link sant.InputArc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Place value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Activity)
	 * @see sant.SANTPackage#getInputArc_Target()
	 * @model required="true"
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link sant.InputArc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

} // InputArc