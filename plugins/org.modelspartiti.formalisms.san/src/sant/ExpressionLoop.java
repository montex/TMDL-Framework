/**
 */
package sant;

import org.eclipse.emf.common.util.EList;
import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.ExpressionLoop#getBegin <em>Begin</em>}</li>
 *   <li>{@link sant.ExpressionLoop#getEnd <em>End</em>}</li>
 *   <li>{@link sant.ExpressionLoop#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExpressionLoop()
 * @model
 * @generated
 */
public interface ExpressionLoop extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(TemplateExpressionInteger)
	 * @see sant.SANTPackage#getExpressionLoop_Begin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getBegin();

	/**
	 * Sets the value of the '{@link sant.ExpressionLoop#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(TemplateExpressionInteger value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(TemplateExpressionInteger)
	 * @see sant.SANTPackage#getExpressionLoop_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getEnd();

	/**
	 * Sets the value of the '{@link sant.ExpressionLoop#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TemplateExpressionInteger value);

	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference list.
	 * The list contents are of type {@link sant.ExpressionSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference list.
	 * @see sant.SANTPackage#getExpressionLoop_Do()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExpressionSegment> getDo();

} // ExpressionLoop
