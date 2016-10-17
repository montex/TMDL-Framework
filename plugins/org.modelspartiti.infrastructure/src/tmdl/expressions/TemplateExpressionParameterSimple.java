/**
 */
package tmdl.expressions;

import tmdl.core.ParameterSimple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Parameter Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionParameterSimple#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterSimple()
 * @model
 * @generated
 */
public interface TemplateExpressionParameterSimple extends TemplateExpressionReal {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterSimple)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionParameterSimple_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterSimple getParameter();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionParameterSimple#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterSimple value);

} // TemplateExpressionParameterSimple
