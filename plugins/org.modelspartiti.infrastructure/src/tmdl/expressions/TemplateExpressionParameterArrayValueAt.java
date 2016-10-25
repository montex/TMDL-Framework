/**
 */
package tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import tmdl.core.Assignment;
import tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Parameter Array Value At</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionParameterArrayValueAt#getParameter <em>Parameter</em>}</li>
 *   <li>{@link tmdl.expressions.TemplateExpressionParameterArrayValueAt#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterArrayValueAt()
 * @model
 * @generated
 */
public interface TemplateExpressionParameterArrayValueAt extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterArray)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterArrayValueAt_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getParameter();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionParameterArrayValueAt#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterArray value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(TemplateExpressionInteger)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterArrayValueAt_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getPosition();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionParameterArrayValueAt#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(TemplateExpressionInteger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='assignments->select(as | as.oclIsTypeOf(core::AssignmentArray))\n\t\t\t\t\t\t->select(a | a.oclAsType(core::AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t\t->asSequence()->first().oclAsType(core::AssignmentArray).values\n\t\t\t\t\t\t->at(position.evaluate(assignments))'"
	 * @generated
	 */
	double evaluate(EList<Assignment> assignments);

} // TemplateExpressionParameterArrayValueAt
