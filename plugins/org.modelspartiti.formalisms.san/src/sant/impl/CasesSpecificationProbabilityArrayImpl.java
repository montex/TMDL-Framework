/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sant.CasesSpecificationProbabilityArray;
import sant.SANTPackage;

import tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cases Specification Probability Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sant.impl.CasesSpecificationProbabilityArrayImpl#getPValues <em>PValues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CasesSpecificationProbabilityArrayImpl extends CasesSpecificationImpl implements CasesSpecificationProbabilityArray {
	/**
	 * The cached value of the '{@link #getPValues() <em>PValues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPValues()
	 * @generated
	 * @ordered
	 */
	protected ParameterArray pValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationProbabilityArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.CASES_SPECIFICATION_PROBABILITY_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterArray getPValues() {
		if (pValues != null && pValues.eIsProxy()) {
			InternalEObject oldPValues = (InternalEObject)pValues;
			pValues = (ParameterArray)eResolveProxy(oldPValues);
			if (pValues != oldPValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES, oldPValues, pValues));
			}
		}
		return pValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterArray basicGetPValues() {
		return pValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPValues(ParameterArray newPValues) {
		ParameterArray oldPValues = pValues;
		pValues = newPValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES, oldPValues, pValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES:
				if (resolve) return getPValues();
				return basicGetPValues();
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
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES:
				setPValues((ParameterArray)newValue);
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
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES:
				setPValues((ParameterArray)null);
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
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES:
				return pValues != null;
		}
		return super.eIsSet(featureID);
	}

} //CasesSpecificationProbabilityArrayImpl
