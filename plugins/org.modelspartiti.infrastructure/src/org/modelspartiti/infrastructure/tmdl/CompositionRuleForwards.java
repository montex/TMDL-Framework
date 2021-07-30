/**
 */
package org.modelspartiti.infrastructure.tmdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Rule Forwards</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompositionRuleForwards()
 * @model
 * @generated
 */
public interface CompositionRuleForwards extends CompositionRule {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(CompItem)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompositionRuleForwards_Ref()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompItem getRef();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(CompItem value);

} // CompositionRuleForwards
