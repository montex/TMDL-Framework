/**
 */
package sant_dev;

import org.eclipse.emf.common.util.EList;

import san.Expression;

import tmdl.core.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cases Specification Parametric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.CasesSpecificationParametric#getParameter <em>Parameter</em>}</li>
 *   <li>{@link sant_dev.CasesSpecificationParametric#getP <em>P</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationParametric()
 * @model
 * @generated
 */
public interface CasesSpecificationParametric extends CasesSpecification {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationParametric_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link sant_dev.CasesSpecificationParametric#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

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
	 * @see sant_dev.SANT_DEVPackage#getCasesSpecificationParametric_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getP();

} // CasesSpecificationParametric
