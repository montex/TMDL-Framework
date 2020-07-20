/**
 */
package org.modelspartiti.formalisms.san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.formalisms.san.ConditionalWeibull;
import org.modelspartiti.formalisms.san.Expression;
import org.modelspartiti.formalisms.san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Weibull</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.ConditionalWeibullImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.ConditionalWeibullImpl#getBeta <em>Beta</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.ConditionalWeibullImpl#getT <em>T</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalWeibullImpl extends DistributionImpl implements ConditionalWeibull {
	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected Expression alpha;

	/**
	 * The cached value of the '{@link #getBeta() <em>Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeta()
	 * @generated
	 * @ordered
	 */
	protected Expression beta;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalWeibullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.CONDITIONAL_WEIBULL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlpha(Expression newAlpha, NotificationChain msgs) {
		Expression oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.CONDITIONAL_WEIBULL__ALPHA, oldAlpha, newAlpha);
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
	public void setAlpha(Expression newAlpha) {
		if (newAlpha != alpha) {
			NotificationChain msgs = null;
			if (alpha != null)
				msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.CONDITIONAL_WEIBULL__ALPHA, null, msgs);
			if (newAlpha != null)
				msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.CONDITIONAL_WEIBULL__ALPHA, null, msgs);
			msgs = basicSetAlpha(newAlpha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.CONDITIONAL_WEIBULL__ALPHA, newAlpha, newAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getBeta() {
		return beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeta(Expression newBeta, NotificationChain msgs) {
		Expression oldBeta = beta;
		beta = newBeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.CONDITIONAL_WEIBULL__BETA, oldBeta, newBeta);
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
	public void setBeta(Expression newBeta) {
		if (newBeta != beta) {
			NotificationChain msgs = null;
			if (beta != null)
				msgs = ((InternalEObject)beta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.CONDITIONAL_WEIBULL__BETA, null, msgs);
			if (newBeta != null)
				msgs = ((InternalEObject)newBeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.CONDITIONAL_WEIBULL__BETA, null, msgs);
			msgs = basicSetBeta(newBeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.CONDITIONAL_WEIBULL__BETA, newBeta, newBeta));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.CONDITIONAL_WEIBULL__T, oldT, newT);
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
				msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.CONDITIONAL_WEIBULL__T, null, msgs);
			if (newT != null)
				msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.CONDITIONAL_WEIBULL__T, null, msgs);
			msgs = basicSetT(newT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.CONDITIONAL_WEIBULL__T, newT, newT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.CONDITIONAL_WEIBULL__ALPHA:
				return basicSetAlpha(null, msgs);
			case SANPackage.CONDITIONAL_WEIBULL__BETA:
				return basicSetBeta(null, msgs);
			case SANPackage.CONDITIONAL_WEIBULL__T:
				return basicSetT(null, msgs);
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
			case SANPackage.CONDITIONAL_WEIBULL__ALPHA:
				return getAlpha();
			case SANPackage.CONDITIONAL_WEIBULL__BETA:
				return getBeta();
			case SANPackage.CONDITIONAL_WEIBULL__T:
				return getT();
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
			case SANPackage.CONDITIONAL_WEIBULL__ALPHA:
				setAlpha((Expression)newValue);
				return;
			case SANPackage.CONDITIONAL_WEIBULL__BETA:
				setBeta((Expression)newValue);
				return;
			case SANPackage.CONDITIONAL_WEIBULL__T:
				setT((Expression)newValue);
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
			case SANPackage.CONDITIONAL_WEIBULL__ALPHA:
				setAlpha((Expression)null);
				return;
			case SANPackage.CONDITIONAL_WEIBULL__BETA:
				setBeta((Expression)null);
				return;
			case SANPackage.CONDITIONAL_WEIBULL__T:
				setT((Expression)null);
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
			case SANPackage.CONDITIONAL_WEIBULL__ALPHA:
				return alpha != null;
			case SANPackage.CONDITIONAL_WEIBULL__BETA:
				return beta != null;
			case SANPackage.CONDITIONAL_WEIBULL__T:
				return t != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalWeibullImpl
