/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.infrastructure.tmdl.core.Assignment;
import org.modelspartiti.infrastructure.tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Array Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionArrayAggregate()
 * @model
 * @generated
 */
public interface TemplateExpressionArrayAggregate extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterArray)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionArrayAggregate_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getParameter();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterArray value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind
	 * @see #setFunction(ArrayAggregateKind)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionArrayAggregate_Function()
	 * @model required="true"
	 * @generated
	 */
	ArrayAggregateKind getFunction();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ArrayAggregateKind
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(ArrayAggregateKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet array = assignments-&gt;select(as | as.oclIsTypeOf(core::AssignmentArray))\n\t\t\t\t\t-&gt;select(a | a.oclAsType(core::AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t-&gt;asSequence()-&gt;first().oclAsType(core::AssignmentArray).values\n\t\t\t\tin\n\t\t\t\t\tif function = ArrayAggregateKind::sum then array-&gt;sum()\n\t\t\t\t\telse if function = ArrayAggregateKind::min then array-&gt;min()\n\t\t\t\t\telse if function = ArrayAggregateKind::max then array-&gt;max()\n\t\t\t\t\telse\n\t\t\t\t\t\tarray-&gt;sum()/array-&gt;size()\n\t\t\t\t\tendif endif endif'"
	 * @generated
	 */
	double evaluate(EList<Assignment> assignments);

} // TemplateExpressionArrayAggregate
