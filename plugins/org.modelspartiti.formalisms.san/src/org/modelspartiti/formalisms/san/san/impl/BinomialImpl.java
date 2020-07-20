/**
 */
package org.modelspartiti.formalisms.san.san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.formalisms.san.san.Binomial;
import org.modelspartiti.formalisms.san.san.Expression;
import org.modelspartiti.formalisms.san.san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binomial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.impl.BinomialImpl#getT <em>T</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.impl.BinomialImpl#getP <em>P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinomialImpl extends DistributionImpl implements Binomial {
	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected Expression t;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected Expression p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinomialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.BINOMIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getT() {
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetT(Expression newT, NotificationChain msgs) {
		Expression oldT = t;
		t = newT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.BINOMIAL__T, oldT, newT);
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
	public void setT(Expression newT) {
		if (newT != t) {
			NotificationChain msgs = null;
			if (t != null)
				msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.BINOMIAL__T, null, msgs);
			if (newT != null)
				msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.BINOMIAL__T, null, msgs);
			msgs = basicSetT(newT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.BINOMIAL__T, newT, newT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(Expression newP, NotificationChain msgs) {
		Expression oldP = p;
		p = newP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.BINOMIAL__P, oldP, newP);
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
	public void setP(Expression newP) {
		if (newP != p) {
			NotificationChain msgs = null;
			if (p != null)
				msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.BINOMIAL__P, null, msgs);
			if (newP != null)
				msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.BINOMIAL__P, null, msgs);
			msgs = basicSetP(newP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.BINOMIAL__P, newP, newP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.BINOMIAL__T:
				return basicSetT(null, msgs);
			case SANPackage.BINOMIAL__P:
				return basicSetP(null, msgs);
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
			case SANPackage.BINOMIAL__T:
				return getT();
			case SANPackage.BINOMIAL__P:
				return getP();
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
			case SANPackage.BINOMIAL__T:
				setT((Expression)newValue);
				return;
			case SANPackage.BINOMIAL__P:
				setP((Expression)newValue);
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
			case SANPackage.BINOMIAL__T:
				setT((Expression)null);
				return;
			case SANPackage.BINOMIAL__P:
				setP((Expression)null);
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
			case SANPackage.BINOMIAL__T:
				return t != null;
			case SANPackage.BINOMIAL__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} //BinomialImpl
