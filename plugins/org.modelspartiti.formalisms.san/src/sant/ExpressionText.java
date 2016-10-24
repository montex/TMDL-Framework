/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.ExpressionText#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExpressionText()
 * @model
 * @generated
 */
public interface ExpressionText extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see sant.SANTPackage#getExpressionText_Text()
	 * @model dataType="sant.CodeFragment" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link sant.ExpressionText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // ExpressionText
