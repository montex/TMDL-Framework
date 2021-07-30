/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.infrastructure.tmdl.Reliability;
import org.modelspartiti.infrastructure.tmdl.ReliabilityCalc;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reliability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.ReliabilityImpl#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReliabilityImpl extends MetricImpl implements Reliability {
	/**
	 * The default value of the '{@link #getCalculation() <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected static final ReliabilityCalc CALCULATION_EDEFAULT = ReliabilityCalc.INSTANT_OF_TIME;

	/**
	 * The cached value of the '{@link #getCalculation() <em>Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected ReliabilityCalc calculation = CALCULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.RELIABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReliabilityCalc getCalculation() {
		return calculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculation(ReliabilityCalc newCalculation) {
		ReliabilityCalc oldCalculation = calculation;
		calculation = newCalculation == null ? CALCULATION_EDEFAULT : newCalculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.RELIABILITY__CALCULATION, oldCalculation, calculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmdlPackage.RELIABILITY__CALCULATION:
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
			case tmdlPackage.RELIABILITY__CALCULATION:
				setCalculation((ReliabilityCalc)newValue);
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
			case tmdlPackage.RELIABILITY__CALCULATION:
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
			case tmdlPackage.RELIABILITY__CALCULATION:
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

} //ReliabilityImpl
