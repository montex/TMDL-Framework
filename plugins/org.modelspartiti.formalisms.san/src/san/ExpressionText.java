/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.ExpressionText#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getExpressionText()
 * @model
 * @generated
 */
public interface ExpressionText extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see san.SANPackage#getExpressionText_Text()
	 * @model dataType="san.CodeFragment" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link san.ExpressionText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // ExpressionText
