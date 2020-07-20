/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.OutputGate#getActivityCase <em>Activity Case</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getOutputGate()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface OutputGate extends Gate {
	/**
	 * Returns the value of the '<em><b>Activity Case</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Case</em>' reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getOutputGate_ActivityCase()
	 * @model required="true"
	 * @generated
	 */
	EList<Case> getActivityCase();

} // OutputGate
