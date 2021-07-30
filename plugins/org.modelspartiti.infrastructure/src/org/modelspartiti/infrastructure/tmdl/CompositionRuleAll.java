/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Rule All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleAll#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompositionRuleAll()
 * @model
 * @generated
 */
public interface CompositionRuleAll extends CompositionRule {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.CompItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompositionRuleAll_Ref()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CompItem> getRef();

} // CompositionRuleAll
