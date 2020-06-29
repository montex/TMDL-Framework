/**
 */
package sant;

import san.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.ActivityTemplate#getCasesTemplate <em>Cases Template</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getActivityTemplate()
 * @model abstract="true"
 * @generated
 */
public interface ActivityTemplate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cases Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases Template</em>' containment reference.
	 * @see #setCasesTemplate(CasesSpecification)
	 * @see sant.SANTPackage#getActivityTemplate_CasesTemplate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CasesSpecification getCasesTemplate();

	/**
	 * Sets the value of the '{@link sant.ActivityTemplate#getCasesTemplate <em>Cases Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cases Template</em>' containment reference.
	 * @see #getCasesTemplate()
	 * @generated
	 */
	void setCasesTemplate(CasesSpecification value);

} // ActivityTemplate
