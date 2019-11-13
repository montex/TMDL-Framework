/**
 */
package san;

import org.eclipse.emf.common.util.EList;

import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.ExpressionLoop#getDo <em>Do</em>}</li>
 *   <li>{@link san.ExpressionLoop#getBegin <em>Begin</em>}</li>
 *   <li>{@link san.ExpressionLoop#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getExpressionLoop()
 * @model
 * @generated
 */
public interface ExpressionLoop extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference list.
	 * The list contents are of type {@link san.ExpressionSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference list.
	 * @see san.SANPackage#getExpressionLoop_Do()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExpressionSegment> getDo();

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
	 * @see san.SANPackage#getExpressionLoop_Begin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getBegin();

	/**
	 * Sets the value of the '{@link san.ExpressionLoop#getBegin <em>Begin</em>}' containment reference.
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
	 * @see san.SANPackage#getExpressionLoop_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getEnd();

	/**
	 * Sets the value of the '{@link san.ExpressionLoop#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TemplateExpressionInteger value);

} // ExpressionLoop
