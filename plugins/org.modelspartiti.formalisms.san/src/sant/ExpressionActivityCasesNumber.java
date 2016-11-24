/**
 */
package sant;

import java.util.List;
import tmdl.core.Assignment;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet c = activity.cases\n\t\t\tin\n\t\t\t\tif c.oclIsTypeOf(CasesSpecificationCases) then\n\t\t\t\t\tc.oclAsType(CasesSpecificationCases).cases->size()\n\t\t\t\telse\n\t\t\t\t\tif c.oclIsTypeOf(CasesSpecificationProbabilityArray) then\n\t\t\t\t\t\tc.oclAsType(CasesSpecificationProbabilityArray).pValues->size()\n\t\t\t\t\telse\n\t\t\t\t\t\tc.oclAsType(CasesSpecificationParametric).pExpression.evaluate(assignments)\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	int evaluate(List<Assignment> assignments);

} // ExpressionActivityCasesNumber
