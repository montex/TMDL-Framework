/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Metric#getMinWorkingObs <em>Min Working Obs</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Metric#getDescr <em>Descr</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Metric#getObsPoints <em>Obs Points</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getMetric()
 * @model abstract="true"
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Working Obs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Working Obs</em>' attribute.
	 * @see #setMinWorkingObs(int)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getMetric_MinWorkingObs()
	 * @model required="true"
	 * @generated
	 */
	int getMinWorkingObs();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Metric#getMinWorkingObs <em>Min Working Obs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Working Obs</em>' attribute.
	 * @see #getMinWorkingObs()
	 * @generated
	 */
	void setMinWorkingObs(int value);

	/**
	 * Returns the value of the '<em><b>Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descr</em>' attribute.
	 * @see #setDescr(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getMetric_Descr()
	 * @model
	 * @generated
	 */
	String getDescr();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Metric#getDescr <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr</em>' attribute.
	 * @see #getDescr()
	 * @generated
	 */
	void setDescr(String value);

	/**
	 * Returns the value of the '<em><b>Obs Points</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.StateMetavariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obs Points</em>' reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getMetric_ObsPoints()
	 * @model required="true"
	 * @generated
	 */
	EList<StateMetavariable> getObsPoints();

} // Metric
