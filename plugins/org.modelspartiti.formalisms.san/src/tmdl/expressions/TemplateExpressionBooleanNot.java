/**
 */
package tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Boolean Not</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanNot()
 * @model
 * @generated
 */
public interface TemplateExpressionBooleanNot extends TemplateExpressionBooleanUnaryOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not exp.evaluate(assignments)'"
	 * @generated
	 */
	boolean evaluate(EList<Assignment> assignments);

} // TemplateExpressionBooleanNot
