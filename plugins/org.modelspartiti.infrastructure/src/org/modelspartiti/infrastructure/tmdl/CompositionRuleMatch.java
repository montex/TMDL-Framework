/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Rule Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch#getRef <em>Ref</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompositionRuleMatch()
 * @model
 * @generated
 */
public interface CompositionRuleMatch extends CompositionRule {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.CompItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompositionRuleMatch_Ref()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CompItem> getRef();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompositionRuleMatch_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

} // CompositionRuleMatch
