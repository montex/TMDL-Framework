/**
 */
package tmdl.expressions;

import org.eclipse.emf.common.util.EList;

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
	 * @model required="true" assignmentsMany="true"
	 * @generated
	 */
	int evaluate(EList<Assignment> assignments);

} // TemplateExpressionInteger
