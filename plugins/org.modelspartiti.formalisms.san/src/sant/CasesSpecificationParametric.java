/**
 */
package sant;

import tmdl.expressions.TemplateExpressionInteger;
import tmdl.expressions.TemplateExpressionReal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Parametric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.CasesSpecificationParametric#getNumCases <em>Num Cases</em>}</li>
 *   <li>{@link sant.CasesSpecificationParametric#getPExpression <em>PExpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getCasesSpecificationParametric()
 * @model
 * @generated
 */
public interface CasesSpecificationParametric extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Num Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Cases</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cases</em>' containment reference.
	 * @see #setNumCases(TemplateExpressionInteger)
	 * @see sant.SANTPackage#getCasesSpecificationParametric_NumCases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getNumCases();

	/**
	 * Sets the value of the '{@link sant.CasesSpecificationParametric#getNumCases <em>Num Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cases</em>' containment reference.
	 * @see #getNumCases()
	 * @generated
	 */
	void setNumCases(TemplateExpressionInteger value);

	/**
	 * Returns the value of the '<em><b>PExpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PExpression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PExpression</em>' containment reference.
	 * @see #setPExpression(TemplateExpressionReal)
	 * @see sant.SANTPackage#getCasesSpecificationParametric_PExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionReal getPExpression();

	/**
	 * Sets the value of the '{@link sant.CasesSpecificationParametric#getPExpression <em>PExpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PExpression</em>' containment reference.
	 * @see #getPExpression()
	 * @generated
	 */
	void setPExpression(TemplateExpressionReal value);

} // CasesSpecificationParametric
