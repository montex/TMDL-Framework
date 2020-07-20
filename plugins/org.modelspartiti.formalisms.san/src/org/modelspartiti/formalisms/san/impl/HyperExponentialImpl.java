/**
 */
package org.modelspartiti.formalisms.san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.formalisms.san.Expression;
import org.modelspartiti.formalisms.san.HyperExponential;
import org.modelspartiti.formalisms.san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Exponential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.HyperExponentialImpl#getRate0 <em>Rate0</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.HyperExponentialImpl#getP0 <em>P0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HyperExponentialImpl extends DistributionImpl implements HyperExponential {
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
	 * The cached value of the '{@link #getP0() <em>P0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP0()
	 * @generated
	 * @ordered
	 */
	protected Expression p0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HyperExponentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.HYPER_EXPONENTIAL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.HYPER_EXPONENTIAL__RATE0, oldRate0, newRate0);
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
				msgs = ((InternalEObject)rate0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.HYPER_EXPONENTIAL__RATE0, null, msgs);
			if (newRate0 != null)
				msgs = ((InternalEObject)newRate0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.HYPER_EXPONENTIAL__RATE0, null, msgs);
			msgs = basicSetRate0(newRate0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.HYPER_EXPONENTIAL__RATE0, newRate0, newRate0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getP0() {
		return p0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP0(Expression newP0, NotificationChain msgs) {
		Expression oldP0 = p0;
		p0 = newP0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.HYPER_EXPONENTIAL__P0, oldP0, newP0);
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
	public void setP0(Expression newP0) {
		if (newP0 != p0) {
			NotificationChain msgs = null;
			if (p0 != null)
				msgs = ((InternalEObject)p0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.HYPER_EXPONENTIAL__P0, null, msgs);
			if (newP0 != null)
				msgs = ((InternalEObject)newP0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.HYPER_EXPONENTIAL__P0, null, msgs);
			msgs = basicSetP0(newP0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.HYPER_EXPONENTIAL__P0, newP0, newP0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.HYPER_EXPONENTIAL__RATE0:
				return basicSetRate0(null, msgs);
			case SANPackage.HYPER_EXPONENTIAL__P0:
				return basicSetP0(null, msgs);
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
			case SANPackage.HYPER_EXPONENTIAL__RATE0:
				return getRate0();
			case SANPackage.HYPER_EXPONENTIAL__P0:
				return getP0();
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
			case SANPackage.HYPER_EXPONENTIAL__RATE0:
				setRate0((Expression)newValue);
				return;
			case SANPackage.HYPER_EXPONENTIAL__P0:
				setP0((Expression)newValue);
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
			case SANPackage.HYPER_EXPONENTIAL__RATE0:
				setRate0((Expression)null);
				return;
			case SANPackage.HYPER_EXPONENTIAL__P0:
				setP0((Expression)null);
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
			case SANPackage.HYPER_EXPONENTIAL__RATE0:
				return rate0 != null;
			case SANPackage.HYPER_EXPONENTIAL__P0:
				return p0 != null;
		}
		return super.eIsSet(featureID);
	}

} //HyperExponentialImpl
