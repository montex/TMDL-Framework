/**
 */
package sant_dev;

import san.GlobalVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Template Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.MarkingTemplateGlobalVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getMarkingTemplateGlobalVariable()
 * @model
 * @generated
 */
public interface MarkingTemplateGlobalVariable extends MarkingTemplate {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(GlobalVariable)
	 * @see sant_dev.SANT_DEVPackage#getMarkingTemplateGlobalVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getVariable();

	/**
	 * Sets the value of the '{@link sant_dev.MarkingTemplateGlobalVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(GlobalVariable value);

} // MarkingTemplateGlobalVariable
