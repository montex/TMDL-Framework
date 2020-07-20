/**
 */
package org.modelspartiti.formalisms.san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.formalisms.san.Expression;
import org.modelspartiti.formalisms.san.HypoExponential;
import org.modelspartiti.formalisms.san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypo Exponential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.HypoExponentialImpl#getRate0 <em>Rate0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HypoExponentialImpl extends DistributionImpl implements HypoExponential {
	/**
	 * The cached value of the '{@link #getRate0() <em>Rate0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate0()
	 * @generated
	 * @ordered
	 */
	protected Expression rate0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypoExponentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.HYPO_EXPONENTIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRate0() {
		return rate0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate0(Expression newRate0, NotificationChain msgs) {
		Expression oldRate0 = rate0;
		rate0 = newRate0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.HYPO_EXPONENTIAL__RATE0, oldRate0, newRate0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRate0(Expression newRate0) {
		if (newRate0 != rate0) {
			NotificationChain msgs = null;
			if (rate0 != null)
				msgs = ((InternalEObject)rate0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.HYPO_EXPONENTIAL__RATE0, null, msgs);
			if (newRate0 != null)
				msgs = ((InternalEObject)newRate0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.HYPO_EXPONENTIAL__RATE0, null, msgs);
			msgs = basicSetRate0(newRate0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.HYPO_EXPONENTIAL__RATE0, newRate0, newRate0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.HYPO_EXPONENTIAL__RATE0:
				return basicSetRate0(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANPackage.HYPO_EXPONENTIAL__RATE0:
				return getRate0();
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
			case SANPackage.HYPO_EXPONENTIAL__RATE0:
				setRate0((Expression)newValue);
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
			case SANPackage.HYPO_EXPONENTIAL__RATE0:
				setRate0((Expression)null);
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
			case SANPackage.HYPO_EXPONENTIAL__RATE0:
				return rate0 != null;
		}
		return super.eIsSet(featureID);
	}

} //HypoExponentialImpl
