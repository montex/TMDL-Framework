/**
 */
package tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Boolean To Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionBooleanToInteger#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanToInteger()
 * @model
 * @generated
 */
public interface TemplateExpressionBooleanToInteger extends TemplateExpressionInteger {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(TemplateExpressionBoolean)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanToInteger_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionBoolean getExp();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionBooleanToInteger#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TemplateExpressionBoolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='exp.evaluate(assignments)'"
	 * @generated
	 */
	int evaluate(EList<Assignment> assignments);

} // TemplateExpressionBooleanToInteger
