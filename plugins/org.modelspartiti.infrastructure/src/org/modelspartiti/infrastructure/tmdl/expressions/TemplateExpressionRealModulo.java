/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.infrastructure.tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealModulo()
 * @model
 * @generated
 */
public interface TemplateExpressionRealModulo extends TemplateExpressionInteger {
	/**
	 * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp1</em>' containment reference.
	 * @see #setExp1(TemplateExpressionInteger)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealModulo_Exp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getExp1();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#getExp1 <em>Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp1</em>' containment reference.
	 * @see #getExp1()
	 * @generated
	 */
	void setExp1(TemplateExpressionInteger value);

	/**
	 * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp2</em>' containment reference.
	 * @see #setExp2(TemplateExpressionInteger)
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealModulo_Exp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getExp2();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo#getExp2 <em>Exp2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp2</em>' containment reference.
	 * @see #getExp2()
	 * @generated
	 */
	void setExp2(TemplateExpressionInteger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='exp1.evaluate(assignments).mod(exp2.evaluate(assignments))'"
	 * @generated
	 */
	int evaluate(EList<Assignment> assignments);

} // TemplateExpressionRealModulo
