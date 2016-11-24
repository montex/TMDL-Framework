/**
 */
package tmdl.expressions;

import java.util.List;
import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real Ceil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealCeil#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealCeil()
 * @model
 * @generated
 */
public interface TemplateExpressionRealCeil extends TemplateExpressionInteger {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(TemplateExpressionReal)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealCeil_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getExp();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealCeil#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(TemplateExpressionReal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet n = exp.evaluate(assignments) in\n\t\t\t\tif n.floor() = n.round() then n.floor()+1\n\t\t\t\telse n.round() endif'"
	 * @generated
	 */
	int evaluate(List<Assignment> assignments);

} // TemplateExpressionRealCeil
