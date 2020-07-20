/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.infrastructure.tmdl.core.Assignment;
import org.modelspartiti.infrastructure.tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Parameter Array Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterArraySize()
 * @model
 * @generated
 */
public interface TemplateExpressionParameterArraySize extends TemplateExpressionInteger {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterArray)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterArraySize_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getParameter();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterArray value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='assignments-&gt;select(as | as.oclIsTypeOf(core::AssignmentArray))\n\t\t\t\t\t\t-&gt;select(a | a.oclAsType(core::AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t\t-&gt;asSequence()-&gt;first().oclAsType(core::AssignmentArray).values\n\t\t\t\t\t\t-&gt;size()'"
	 * @generated
	 */
	int evaluate(EList<Assignment> assignments);

} // TemplateExpressionParameterArraySize
