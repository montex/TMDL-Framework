/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sant.Expression;
import sant.Lognormal;
import sant.SANTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lognormal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sant.impl.LognormalImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link sant.impl.LognormalImpl#getAlphaSquared <em>Alpha Squared</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LognormalImpl extends DistributionImpl implements Lognormal {
	/**
	 * The cached value of the '{@link #getMu() <em>Mu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected Expression mu;

	/**
	 * The cached value of the '{@link #getAlphaSquared() <em>Alpha Squared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaSquared()
	 * @generated
	 * @ordered
	 */
	protected Expression alphaSquared;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LognormalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.LOGNORMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMu() {
		return mu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMu(Expression newMu, NotificationChain msgs) {
		Expression oldMu = mu;
		mu = newMu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.LOGNORMAL__MU, oldMu, newMu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMu(Expression newMu) {
		if (newMu != mu) {
			NotificationChain msgs = null;
			if (mu != null)
				msgs = ((InternalEObject)mu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.LOGNORMAL__MU, null, msgs);
			if (newMu != null)
				msgs = ((InternalEObject)newMu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.LOGNORMAL__MU, null, msgs);
			msgs = basicSetMu(newMu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.LOGNORMAL__MU, newMu, newMu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAlphaSquared() {
		return alphaSquared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphaSquared(Expression newAlphaSquared, NotificationChain msgs) {
		Expression oldAlphaSquared = alphaSquared;
		alphaSquared = newAlphaSquared;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.LOGNORMAL__ALPHA_SQUARED, oldAlphaSquared, newAlphaSquared);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphaSquared(Expression newAlphaSquared) {
		if (newAlphaSquared != alphaSquared) {
			NotificationChain msgs = null;
			if (alphaSquared != null)
				msgs = ((InternalEObject)alphaSquared).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.LOGNORMAL__ALPHA_SQUARED, null, msgs);
			if (newAlphaSquared != null)
				msgs = ((InternalEObject)newAlphaSquared).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.LOGNORMAL__ALPHA_SQUARED, null, msgs);
			msgs = basicSetAlphaSquared(newAlphaSquared, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.LOGNORMAL__ALPHA_SQUARED, newAlphaSquared, newAlphaSquared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANTPackage.LOGNORMAL__MU:
				return basicSetMu(null, msgs);
			case SANTPackage.LOGNORMAL__ALPHA_SQUARED:
				return basicSetAlphaSquared(null, msgs);
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
			case SANTPackage.LOGNORMAL__MU:
				return getMu();
			case SANTPackage.LOGNORMAL__ALPHA_SQUARED:
				return getAlphaSquared();
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
			case SANTPackage.LOGNORMAL__MU:
				setMu((Expression)newValue);
				return;
			case SANTPackage.LOGNORMAL__ALPHA_SQUARED:
				setAlphaSquared((Expression)newValue);
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
			case SANTPackage.LOGNORMAL__MU:
				setMu((Expression)null);
				return;
			case SANTPackage.LOGNORMAL__ALPHA_SQUARED:
				setAlphaSquared((Expression)null);
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
			case SANTPackage.LOGNORMAL__MU:
				return mu != null;
			case SANTPackage.LOGNORMAL__ALPHA_SQUARED:
				return alphaSquared != null;
		}
		return super.eIsSet(featureID);
	}

} //LognormalImpl
