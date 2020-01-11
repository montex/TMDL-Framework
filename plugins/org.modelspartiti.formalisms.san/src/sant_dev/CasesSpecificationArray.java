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
 *   <li>{@link sant_dev.CasesSpecificationArray#getNumCases <em>Num Cases</em>}</li>
 *   <li>{@link sant_dev.CasesSpecificationArray#getP <em>P</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationArray()
 * @model
 * @generated
 */
public interface CasesSpecificationArray extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Num Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Cases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cases</em>' attribute.
	 * @see #setNumCases(int)
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationArray_NumCases()
	 * @model required="true"
	 * @generated
	 */
	int getNumCases();

	/**
	 * Sets the value of the '{@link sant_dev.CasesSpecificationArray#getNumCases <em>Num Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cases</em>' attribute.
	 * @see #getNumCases()
	 * @generated
	 */
	void setNumCases(int value);

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
