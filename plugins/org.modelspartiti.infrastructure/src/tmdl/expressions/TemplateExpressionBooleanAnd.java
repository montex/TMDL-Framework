/**
 */
package tmdl.expressions;

import java.util.List;
import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Boolean And</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanAnd()
 * @model
 * @generated
 */
public interface TemplateExpressionBooleanAnd extends TemplateExpressionBooleanBinaryOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='exp1.evaluate(assignments) and exp2.evaluate(assignments)'"
	 * @generated
	 */
	boolean evaluate(List<Assignment> assignments);

} // TemplateExpressionBooleanAnd
