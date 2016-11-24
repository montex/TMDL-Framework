/**
 */
package tmdl.scenario;

import java.util.List;
import tmdl.library.TemplateComposite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.scenario.VariantComposite#getTemplate <em>Template</em>}</li>
 *   <li>{@link tmdl.scenario.VariantComposite#getRealizations <em>Realizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.scenario.ScenarioPackage#getVariantComposite()
 * @model
 * @generated
 */
public interface VariantComposite extends Variant {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(TemplateComposite)
	 * @see tmdl.scenario.ScenarioPackage#getVariantComposite_Template()
	 * @model required="true"
	 * @generated
	 */
	TemplateComposite getTemplate();

	/**
	 * Sets the value of the '{@link tmdl.scenario.VariantComposite#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateComposite value);

	/**
	 * Returns the value of the '<em><b>Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.scenario.BlockRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizations</em>' containment reference list.
	 * @see tmdl.scenario.ScenarioPackage#getVariantComposite_Realizations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<BlockRealization> getRealizations();

} // VariantComposite
