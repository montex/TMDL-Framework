/**
 */
package tmdl.expressions;

import java.util.List;
import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real Divide</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealDivide()
 * @model
 * @generated
 */
public interface TemplateExpressionRealDivide extends TemplateExpressionRealBinaryOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='exp1.evaluate(assignments) / exp2.evaluate(assignments)'"
	 * @generated
	 */
	double evaluate(List<Assignment> assignments);

} // TemplateExpressionRealDivide
