/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.infrastructure.tmdl.Availability;
import org.modelspartiti.infrastructure.tmdl.AvailabilityCalc;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.AvailabilityImpl#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailabilityImpl extends MetricImpl implements Availability {
	/**
	 * The default value of the '{@link #getCalculation() <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected static final AvailabilityCalc CALCULATION_EDEFAULT = AvailabilityCalc.INSTANT_OF_TIME;

	/**
	 * The cached value of the '{@link #getCalculation() <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected AvailabilityCalc calculation = CALCULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.AVAILABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvailabilityCalc getCalculation() {
		return calculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculation(AvailabilityCalc newCalculation) {
		AvailabilityCalc oldCalculation = calculation;
		calculation = newCalculation == null ? CALCULATION_EDEFAULT : newCalculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.AVAILABILITY__CALCULATION, oldCalculation, calculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmdlPackage.AVAILABILITY__CALCULATION:
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
			case tmdlPackage.AVAILABILITY__CALCULATION:
				setCalculation((AvailabilityCalc)newValue);
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
			case tmdlPackage.AVAILABILITY__CALCULATION:
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
			case tmdlPackage.AVAILABILITY__CALCULATION:
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

} //AvailabilityImpl
