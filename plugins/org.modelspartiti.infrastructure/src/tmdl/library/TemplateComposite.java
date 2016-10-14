/**
 */
package tmdl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.library.TemplateComposite#getRules <em>Rules</em>}</li>
 *   <li>{@link tmdl.library.TemplateComposite#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.library.LibraryPackage#getTemplateComposite()
 * @model
 * @generated
 */
public interface TemplateComposite extends TemplateSpecification {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.library.CompositionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see tmdl.library.LibraryPackage#getTemplateComposite_Rules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CompositionRule> getRules();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.library.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see tmdl.library.LibraryPackage#getTemplateComposite_Blocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlocks();

} // TemplateComposite
