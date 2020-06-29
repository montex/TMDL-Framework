/**
 */
package sant;

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
 *   <li>{@link sant.CasesSpecificationConcrete#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getCasesSpecificationConcrete()
 * @model
 * @generated
 */
public interface CasesSpecificationConcrete extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link san.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see sant.SANTPackage#getCasesSpecificationConcrete_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Case> getCases();

} // CasesSpecificationConcrete
