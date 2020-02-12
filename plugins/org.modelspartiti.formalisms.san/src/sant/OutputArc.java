/**
 */
package sant;

import san.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.OutputArc#getSource <em>Source</em>}</li>
 *   <li>{@link sant.OutputArc#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getOutputArc()
 * @model
 * @generated
 */
public interface OutputArc extends ArcTemplate {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityTemplate)
	 * @see sant.SANTPackage#getOutputArc_Source()
	 * @model required="true"
	 * @generated
	 */
	ActivityTemplate getSource();

	/**
	 * Sets the value of the '{@link sant.OutputArc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityTemplate value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Place)
	 * @see sant.SANTPackage#getOutputArc_Target()
	 * @model required="true"
	 * @generated
	 */
	Place getTarget();

	/**
	 * Sets the value of the '{@link sant.OutputArc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Place value);

} // OutputArc
