/**
 */
package tmdl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Expression Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.core.ParameterExpressionAggregate#getParameter <em>Parameter</em>}</li>
 *   <li>{@link tmdl.core.ParameterExpressionAggregate#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.core.CorePackage#getParameterExpressionAggregate()
 * @model
 * @generated
 */
public interface ParameterExpressionAggregate extends ParameterExpression {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see tmdl.core.CorePackage#getParameterExpressionAggregate_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link tmdl.core.ParameterExpressionAggregate#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link tmdl.core.AggregateFunctionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see tmdl.core.AggregateFunctionKind
	 * @see #setFunction(AggregateFunctionKind)
	 * @see tmdl.core.CorePackage#getParameterExpressionAggregate_Function()
	 * @model
	 * @generated
	 */
	AggregateFunctionKind getFunction();

	/**
	 * Sets the value of the '{@link tmdl.core.ParameterExpressionAggregate#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see tmdl.core.AggregateFunctionKind
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(AggregateFunctionKind value);

} // ParameterExpressionAggregate
