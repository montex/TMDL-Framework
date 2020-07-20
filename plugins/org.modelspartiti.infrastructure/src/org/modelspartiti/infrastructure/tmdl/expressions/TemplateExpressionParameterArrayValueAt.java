/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.infrastructure.tmdl.core.Assignment;
import org.modelspartiti.infrastructure.tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Parameter Array Value At</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterArrayValueAt()
 * @model
 * @generated
 */
public interface TemplateExpressionParameterArrayValueAt extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterArray)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterArrayValueAt_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getParameter();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#getParameter <em>Parameter</em>}' reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(TemplateExpressionInteger)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterArrayValueAt_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getPosition();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt#getPosition <em>Position</em>}' containment reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='assignments-&gt;select(as | as.oclIsTypeOf(core::AssignmentArray))\n\t\t\t\t\t\t-&gt;select(a | a.oclAsType(core::AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t\t-&gt;asSequence()-&gt;first().oclAsType(core::AssignmentArray).values\n\t\t\t\t\t\t-&gt;at(position.evaluate(assignments))'"
	 * @generated
	 */
	double evaluate(EList<Assignment> assignments);

} // TemplateExpressionParameterArrayValueAt
