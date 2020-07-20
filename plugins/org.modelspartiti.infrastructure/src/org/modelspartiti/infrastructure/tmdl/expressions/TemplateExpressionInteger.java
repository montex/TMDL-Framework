/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.infrastructure.tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionInteger()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TemplateExpressionInteger extends TemplateExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 * @generated
	 */
	int evaluate(EList<Assignment> assignments);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='evaluate(core::Assignment.allInstances())'"
	 * @generated
	 */
	int evaluate();

} // TemplateExpressionInteger
