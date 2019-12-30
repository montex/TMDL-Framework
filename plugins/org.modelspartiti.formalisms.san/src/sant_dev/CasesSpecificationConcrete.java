/**
 */
package sant_dev;

import org.eclipse.emf.common.util.EList;

import san.Case;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Concrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.CasesSpecificationConcrete#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationConcrete()
 * @model
 * @generated
 */
public interface CasesSpecificationConcrete extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link san.Case}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationConcrete_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Case> getCases();

} // CasesSpecificationConcrete
