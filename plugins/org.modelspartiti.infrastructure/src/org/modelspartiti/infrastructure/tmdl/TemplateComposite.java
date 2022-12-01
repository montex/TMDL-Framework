/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateComposite#getRules <em>Rules</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateComposite#getBind <em>Bind</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TemplateComposite#getSubmodules <em>Submodules</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateComposite()
 * @model
 * @generated
 */
public interface TemplateComposite extends TemplateSpecification {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.CompositionRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateComposite_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionRule> getRules();

	/**
	 * Returns the value of the '<em><b>Bind</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.Parambinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateComposite_Bind()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parambinding> getBind();

	/**
	 * Returns the value of the '<em><b>Submodules</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodules</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTemplateComposite_Submodules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getSubmodules();

} // TemplateComposite
