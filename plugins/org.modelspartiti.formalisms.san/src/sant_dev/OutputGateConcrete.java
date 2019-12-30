/**
 */
package sant_dev;

import san.Case;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate Concrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.OutputGateConcrete#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getOutputGateConcrete()
 * @model
 * @generated
 */
public interface OutputGateConcrete extends OutputGate {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' reference.
	 * @see #setCase(Case)
	 * @see sant_dev.SANT_DEVPackage#getOutputGateConcrete_Case()
	 * @model required="true"
	 * @generated
	 */
	Case getCase();

	/**
	 * Sets the value of the '{@link sant_dev.OutputGateConcrete#getCase <em>Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' reference.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(Case value);

} // OutputGateConcrete
