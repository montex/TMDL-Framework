/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Activity#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getActivity_Cases()
	 * @model containment="true" keys="ID" required="true"
	 * @generated
	 */
	EList<Case> getCases();

} // Activity
