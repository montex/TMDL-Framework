/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.LoopIterator#getLoop <em>Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getLoopIterator()
 * @model
 * @generated
 */
public interface LoopIterator extends VariabilityIterator {
	/**
	 * Returns the value of the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' reference.
	 * @see #setLoop(ExpressionLoop)
	 * @see sant.SANTPackage#getLoopIterator_Loop()
	 * @model required="true"
	 * @generated
	 */
	ExpressionLoop getLoop();

	/**
	 * Sets the value of the '{@link sant.LoopIterator#getLoop <em>Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' reference.
	 * @see #getLoop()
	 * @generated
	 */
	void setLoop(ExpressionLoop value);

} // LoopIterator
