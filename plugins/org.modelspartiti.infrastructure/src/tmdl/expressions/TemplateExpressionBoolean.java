/**
 */
package tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBoolean()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TemplateExpressionBoolean extends TemplateExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true"
	 * @generated
	 */
	boolean evaluate(EList<Assignment> assignments);

} // TemplateExpressionBoolean
