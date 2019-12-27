/**
 */
package sant_dev;

import org.eclipse.emf.common.util.EList;

import san.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Range Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.CasesSpecificationRangeOperator#getMin <em>Min</em>}</li>
 *   <li>{@link sant_dev.CasesSpecificationRangeOperator#getMax <em>Max</em>}</li>
 *   <li>{@link sant_dev.CasesSpecificationRangeOperator#getStep <em>Step</em>}</li>
 *   <li>{@link sant_dev.CasesSpecificationRangeOperator#getP <em>P</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationRangeOperator()
 * @model
 * @generated
 */
public interface CasesSpecificationRangeOperator extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationRangeOperator_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link sant_dev.CasesSpecificationRangeOperator#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationRangeOperator_Max()
	 * @model required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link sant_dev.CasesSpecificationRangeOperator#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationRangeOperator_Step()
	 * @model
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link sant_dev.CasesSpecificationRangeOperator#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

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
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationRangeOperator_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getP();

} // CasesSpecificationRangeOperator
