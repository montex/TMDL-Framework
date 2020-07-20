/**
 */
package org.modelspartiti.infrastructure.tmdl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Parametric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityParametric#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getMultiplicityParametric()
 * @model
 * @generated
 */
public interface MultiplicityParametric extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getMultiplicityParametric_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.core.MultiplicityParametric#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // MultiplicityParametric
