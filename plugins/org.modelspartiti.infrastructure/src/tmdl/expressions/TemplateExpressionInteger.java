/**
 */
package tmdl.expressions;

import java.util.List;
import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionInteger()
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
	int evaluate(List<Assignment> assignments);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='evaluate(core::Assignment.allInstances())'"
	 * @generated
	 */
	int evaluate();

} // TemplateExpressionInteger
