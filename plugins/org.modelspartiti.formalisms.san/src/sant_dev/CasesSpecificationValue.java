/**
 */
package sant_dev;

import san.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.CasesSpecificationValue#getId <em>Id</em>}</li>
 *   <li>{@link sant_dev.CasesSpecificationValue#getP <em>P</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationValue()
 * @model
 * @generated
 */
public interface CasesSpecificationValue extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationValue_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link sant_dev.CasesSpecificationValue#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(Expression)
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationValue_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getP();

	/**
	 * Sets the value of the '{@link sant_dev.CasesSpecificationValue#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(Expression value);

} // CasesSpecificationValue
