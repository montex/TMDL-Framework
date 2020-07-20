/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Distribution#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getDistribution()
 * @model abstract="true"
 * @generated
 */
public interface Distribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getDistribution_Parameters()
	 * @model required="true"
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Distribution#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

} // Distribution
