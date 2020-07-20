/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.formalisms.san.san.Case;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Concrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.CasesSpecificationConcrete#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getCasesSpecificationConcrete()
 * @model
 * @generated
 */
public interface CasesSpecificationConcrete extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getCasesSpecificationConcrete_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Case> getCases();

} // CasesSpecificationConcrete
