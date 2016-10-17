/**
 */
package tmdl.expressions;

import tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Array Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionArrayAggregate#getParameter <em>Parameter</em>}</li>
 *   <li>{@link tmdl.expressions.TemplateExpressionArrayAggregate#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionArrayAggregate()
 * @model
 * @generated
 */
public interface TemplateExpressionArrayAggregate extends TemplateExpressionReal {
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
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionArrayAggregate_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterArray getParameter();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionArrayAggregate#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterArray value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link tmdl.expressions.ArrayAggregateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see tmdl.expressions.ArrayAggregateKind
	 * @see #setFunction(ArrayAggregateKind)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionArrayAggregate_Function()
	 * @model
	 * @generated
	 */
	ArrayAggregateKind getFunction();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionArrayAggregate#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see tmdl.expressions.ArrayAggregateKind
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(ArrayAggregateKind value);

} // TemplateExpressionArrayAggregate
