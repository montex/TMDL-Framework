/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.formalisms.san.san.Case;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate Concrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.OutputGateConcrete#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputGateConcrete()
 * @model
 * @generated
 */
public interface OutputGateConcrete extends OutputGate {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputGateConcrete_Case()
	 * @model required="true"
	 * @generated
	 */
	EList<Case> getCase();

} // OutputGateConcrete
