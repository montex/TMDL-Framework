/**
 */
package tmdl.scenario;

import java.util.List;
import tmdl.library.TemplateAtomic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.scenario.VariantAtomic#getTemplate <em>Template</em>}</li>
 *   <li>{@link tmdl.scenario.VariantAtomic#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.scenario.ScenarioPackage#getVariantAtomic()
 * @model
 * @generated
 */
public interface VariantAtomic extends Variant {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(TemplateAtomic)
	 * @see tmdl.scenario.ScenarioPackage#getVariantAtomic_Template()
	 * @model required="true"
	 * @generated
	 */
	TemplateAtomic getTemplate();

	/**
	 * Sets the value of the '{@link tmdl.scenario.VariantAtomic#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateAtomic value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see tmdl.scenario.ScenarioPackage#getVariantAtomic_Labels()
	 * @model
	 * @generated
	 */
	List<String> getLabels();

} // VariantAtomic
