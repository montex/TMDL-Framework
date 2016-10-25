/**
 */
package tmdl.expressions;

import org.eclipse.emf.common.util.EList;

import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Real If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getCondition <em>Condition</em>}</li>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getIfTrue <em>If True</em>}</li>
 *   <li>{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getIfFalse <em>If False</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealIfThenElse()
 * @model
 * @generated
 */
public interface TemplateExpressionRealIfThenElse extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(TemplateExpressionBoolean)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealIfThenElse_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionBoolean getCondition();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(TemplateExpressionBoolean value);

	/**
	 * Returns the value of the '<em><b>If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If True</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If True</em>' containment reference.
	 * @see #setIfTrue(TemplateExpressionReal)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealIfThenElse_IfTrue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getIfTrue();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getIfTrue <em>If True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If True</em>' containment reference.
	 * @see #getIfTrue()
	 * @generated
	 */
	void setIfTrue(TemplateExpressionReal value);

	/**
	 * Returns the value of the '<em><b>If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If False</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If False</em>' containment reference.
	 * @see #setIfFalse(TemplateExpressionReal)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionRealIfThenElse_IfFalse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getIfFalse();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionRealIfThenElse#getIfFalse <em>If False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If False</em>' containment reference.
	 * @see #getIfFalse()
	 * @generated
	 */
	void setIfFalse(TemplateExpressionReal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif condition.evaluate(assignments)\n\t\t\t\tthen ifTrue.evaluate(assignments)\n\t\t\t\telse ifFalse.evaluate(assignments)\n\t\t\t\tendif'"
	 * @generated
	 */
	double evaluate(EList<Assignment> assignments);

} // TemplateExpressionRealIfThenElse
