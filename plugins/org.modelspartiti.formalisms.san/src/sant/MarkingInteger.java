/**
 */
package sant;

import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.MarkingInteger#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getMarkingInteger()
 * @model
 * @generated
 */
public interface MarkingInteger extends MarkingSimple {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TemplateExpressionInteger)
	 * @see sant.SANTPackage#getMarkingInteger_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getValue();

	/**
	 * Sets the value of the '{@link sant.MarkingInteger#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TemplateExpressionInteger value);

} // MarkingInteger
