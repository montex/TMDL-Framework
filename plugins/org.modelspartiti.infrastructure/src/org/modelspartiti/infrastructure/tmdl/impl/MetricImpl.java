/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.modelspartiti.infrastructure.tmdl.Metric;
import org.modelspartiti.infrastructure.tmdl.StateMetavariable;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.MetricImpl#getMinWorkingObs <em>Min Working Obs</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.MetricImpl#getDescr <em>Descr</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.MetricImpl#getObsPoints <em>Obs Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MetricImpl extends MinimalEObjectImpl.Container implements Metric {
	/**
	 * The default value of the '{@link #getMinWorkingObs() <em>Min Working Obs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWorkingObs()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_WORKING_OBS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinWorkingObs() <em>Min Working Obs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWorkingObs()
	 * @generated
	 * @ordered
	 */
	protected int minWorkingObs = MIN_WORKING_OBS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescr() <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescr() <em>Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected String descr = DESCR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObsPoints() <em>Obs Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObsPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMetavariable> obsPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinWorkingObs() {
		return minWorkingObs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinWorkingObs(int newMinWorkingObs) {
		int oldMinWorkingObs = minWorkingObs;
		minWorkingObs = newMinWorkingObs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.METRIC__MIN_WORKING_OBS, oldMinWorkingObs, minWorkingObs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescr() {
		return descr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescr(String newDescr) {
		String oldDescr = descr;
		descr = newDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.METRIC__DESCR, oldDescr, descr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateMetavariable> getObsPoints() {
		if (obsPoints == null) {
			obsPoints = new EObjectResolvingEList<StateMetavariable>(StateMetavariable.class, this, tmdlPackage.METRIC__OBS_POINTS);
		}
		return obsPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmdlPackage.METRIC__MIN_WORKING_OBS:
				return getMinWorkingObs();
			case tmdlPackage.METRIC__DESCR:
				return getDescr();
			case tmdlPackage.METRIC__OBS_POINTS:
				return getObsPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case tmdlPackage.METRIC__MIN_WORKING_OBS:
				setMinWorkingObs((Integer)newValue);
				return;
			case tmdlPackage.METRIC__DESCR:
				setDescr((String)newValue);
				return;
			case tmdlPackage.METRIC__OBS_POINTS:
				getObsPoints().clear();
				getObsPoints().addAll((Collection<? extends StateMetavariable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case tmdlPackage.METRIC__MIN_WORKING_OBS:
				setMinWorkingObs(MIN_WORKING_OBS_EDEFAULT);
				return;
			case tmdlPackage.METRIC__DESCR:
				setDescr(DESCR_EDEFAULT);
				return;
			case tmdlPackage.METRIC__OBS_POINTS:
				getObsPoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case tmdlPackage.METRIC__MIN_WORKING_OBS:
				return minWorkingObs != MIN_WORKING_OBS_EDEFAULT;
			case tmdlPackage.METRIC__DESCR:
				return DESCR_EDEFAULT == null ? descr != null : !DESCR_EDEFAULT.equals(descr);
			case tmdlPackage.METRIC__OBS_POINTS:
				return obsPoints != null && !obsPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minWorkingObs: ");
		result.append(minWorkingObs);
		result.append(", descr: ");
		result.append(descr);
		result.append(')');
		return result.toString();
	}

} //MetricImpl
