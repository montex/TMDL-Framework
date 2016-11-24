/**
 */
package tmdl.library;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Rule Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.library.CompositionRuleMatch#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Labels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see tmdl.library.LibraryPackage#getCompositionRuleMatch_Labels()
	 * @model
	 * @generated
	 */
	List<String> getLabels();

} // CompositionRuleMatch
