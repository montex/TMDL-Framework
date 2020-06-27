/**
 */
package tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real Multiply</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealMultiply()
 * @model
 * @generated
 */
public interface TemplateExpressionRealMultiply extends TemplateExpressionRealBinaryOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='exp1.evaluate(assignments) * exp2.evaluate(assignments)'"
	 * @generated
	 */
	double evaluate(EList<Assignment> assignments);

} // TemplateExpressionRealMultiply
