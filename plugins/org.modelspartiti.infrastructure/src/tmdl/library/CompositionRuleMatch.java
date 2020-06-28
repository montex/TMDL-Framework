/**
 */
package tmdl.library;

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
 *   <li>{@link tmdl.library.CompositionRuleMatch#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see tmdl.library.LibraryPackage#getCompositionRuleMatch()
 * @model
 * @generated
 */
public interface CompositionRuleMatch extends CompositionRule {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see tmdl.library.LibraryPackage#getCompositionRuleMatch_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

} // CompositionRuleMatch
