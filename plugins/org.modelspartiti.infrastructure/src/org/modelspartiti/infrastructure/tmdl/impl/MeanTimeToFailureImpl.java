/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure;
import org.modelspartiti.infrastructure.tmdl.MeanTimeToFailureCalc;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mean Time To Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.MeanTimeToFailureImpl#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeanTimeToFailureImpl extends MetricImpl implements MeanTimeToFailure {
	/**
	 * The default value of the '{@link #getCalculation() <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected static final MeanTimeToFailureCalc CALCULATION_EDEFAULT = MeanTimeToFailureCalc.INTERVAL_OF_TIME;

	/**
	 * The cached value of the '{@link #getCalculation() <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected MeanTimeToFailureCalc calculation = CALCULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeanTimeToFailureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.MEAN_TIME_TO_FAILURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeanTimeToFailureCalc getCalculation() {
		return calculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculation(MeanTimeToFailureCalc newCalculation) {
		MeanTimeToFailureCalc oldCalculation = calculation;
		calculation = newCalculation == null ? CALCULATION_EDEFAULT : newCalculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.MEAN_TIME_TO_FAILURE__CALCULATION, oldCalculation, calculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmdlPackage.MEAN_TIME_TO_FAILURE__CALCULATION:
				return getCalculation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case tmdlPackage.MEAN_TIME_TO_FAILURE__CALCULATION:
				setCalculation((MeanTimeToFailureCalc)newValue);
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
			case tmdlPackage.MEAN_TIME_TO_FAILURE__CALCULATION:
				setCalculation(CALCULATION_EDEFAULT);
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
			case tmdlPackage.MEAN_TIME_TO_FAILURE__CALCULATION:
				return calculation != CALCULATION_EDEFAULT;
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
		result.append(" (calculation: ");
		result.append(calculation);
		result.append(')');
		return result.toString();
	}

} //MeanTimeToFailureImpl
