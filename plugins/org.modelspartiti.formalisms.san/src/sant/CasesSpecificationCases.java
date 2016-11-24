/**
 */
package sant;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Cases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.CasesSpecificationCases#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getCasesSpecificationCases()
 * @model
 * @generated
 */
public interface CasesSpecificationCases extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link sant.Case}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see sant.SANTPackage#getCasesSpecificationCases_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<Case> getCases();

} // CasesSpecificationCases
