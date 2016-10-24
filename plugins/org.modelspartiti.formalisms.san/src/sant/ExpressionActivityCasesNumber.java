/**
 */
package sant;

import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Activity Cases Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.ExpressionActivityCasesNumber#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExpressionActivityCasesNumber()
 * @model
 * @generated
 */
public interface ExpressionActivityCasesNumber extends ExpressionSegment, TemplateExpressionInteger {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see sant.SANTPackage#getExpressionActivityCasesNumber_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link sant.ExpressionActivityCasesNumber#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // ExpressionActivityCasesNumber
