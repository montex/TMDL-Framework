/**
 */
package org.modelspartiti.formalisms.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.ExpressionVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.SANPackage#getExpressionVariable()
 * @model
 * @generated
 */
public interface ExpressionVariable extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(GlobalVariable)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getExpressionVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getVariable();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.ExpressionVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(GlobalVariable value);

} // ExpressionVariable
