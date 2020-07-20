/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Expression#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.ExpressionSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getExpression_Segments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExpressionSegment> getSegments();

} // Expression
