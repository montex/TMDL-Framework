/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.OutputGateTemplate#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputGateTemplate()
 * @model
 * @generated
 */
public interface OutputGateTemplate extends OutputGate {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.sant.ActivityTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputGateTemplate_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<ActivityTemplate> getActivity();

} // OutputGateTemplate
