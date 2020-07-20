/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.infrastructure.tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real From Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealFromInteger()
 * @model
 * @generated
 */
public interface TemplateExpressionRealFromInteger extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(TemplateExpressionInteger)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealFromInteger_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getExp();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TemplateExpressionInteger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='exp.evaluate(assignments).oclAsType(Real)'"
	 * @generated
	 */
	double evaluate(EList<Assignment> assignments);

} // TemplateExpressionRealFromInteger
