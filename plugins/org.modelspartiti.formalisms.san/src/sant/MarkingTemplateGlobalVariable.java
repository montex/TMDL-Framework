/**
 */
package sant;

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
 *   <li>{@link sant.MarkingTemplateGlobalVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getMarkingTemplateGlobalVariable()
 * @model
 * @generated
 */
public interface MarkingTemplateGlobalVariable extends MarkingTemplate {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(GlobalVariable)
	 * @see sant.SANTPackage#getMarkingTemplateGlobalVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getVariable();

	/**
	 * Sets the value of the '{@link sant.MarkingTemplateGlobalVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(GlobalVariable value);

} // MarkingTemplateGlobalVariable
