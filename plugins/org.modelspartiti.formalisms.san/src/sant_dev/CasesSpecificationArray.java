/**
 */
package sant_dev;

import org.eclipse.emf.common.util.EList;

import san.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.CasesSpecificationArray#getId <em>Id</em>}</li>
 *   <li>{@link sant_dev.CasesSpecificationArray#getP <em>P</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationArray()
 * @model
 * @generated
 */
public interface CasesSpecificationArray extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute list.
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationArray_Id()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getId();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link san.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationArray_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getP();

} // CasesSpecificationArray
