/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.formalisms.san.san.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Gate Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.InputGateTemplate#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.InputGateTemplate#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getInputGateTemplate()
 * @model
 * @generated
 */
public interface InputGateTemplate extends GateTemplate {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Expression)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getInputGateTemplate_Predicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPredicate();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.InputGateTemplate#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Expression value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.sant.ActivityTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getInputGateTemplate_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<ActivityTemplate> getActivity();

} // InputGateTemplate
