/**
 */
package sant_dev;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Template Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.MarkingTemplateSimple#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getMarkingTemplateSimple()
 * @model
 * @generated
 */
public interface MarkingTemplateSimple extends MarkingTemplate {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(short)
	 * @see sant_dev.SANT_DEVPackage#getMarkingTemplateSimple_Value()
	 * @model required="true"
	 * @generated
	 */
	short getValue();

	/**
	 * Sets the value of the '{@link sant_dev.MarkingTemplateSimple#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(short value);

} // MarkingTemplateSimple
