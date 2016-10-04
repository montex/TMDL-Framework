/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Expression;
import san.Gamma;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link san.impl.GammaImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link san.impl.GammaImpl#getBeta <em>Beta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GammaImpl extends DistributionImpl implements Gamma {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.GAMMA__ALPHA, oldAlpha, newAlpha);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(Expression newAlpha) {
		if (newAlpha != alpha) {
			NotificationChain msgs = null;
			if (alpha != null)
				msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.GAMMA__ALPHA, null, msgs);
			if (newAlpha != null)
				msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.GAMMA__ALPHA, null, msgs);
			msgs = basicSetAlpha(newAlpha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.GAMMA__ALPHA, newAlpha, newAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.GAMMA__BETA, oldBeta, newBeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeta(Expression newBeta) {
		if (newBeta != beta) {
			NotificationChain msgs = null;
			if (beta != null)
				msgs = ((InternalEObject)beta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.GAMMA__BETA, null, msgs);
			if (newBeta != null)
				msgs = ((InternalEObject)newBeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.GAMMA__BETA, null, msgs);
			msgs = basicSetBeta(newBeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.GAMMA__BETA, newBeta, newBeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.GAMMA__ALPHA:
				return basicSetAlpha(null, msgs);
			case SANPackage.GAMMA__BETA:
				return basicSetBeta(null, msgs);
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
			case SANPackage.GAMMA__ALPHA:
				return getAlpha();
			case SANPackage.GAMMA__BETA:
				return getBeta();
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
			case SANPackage.GAMMA__ALPHA:
				setAlpha((Expression)newValue);
				return;
			case SANPackage.GAMMA__BETA:
				setBeta((Expression)newValue);
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
			case SANPackage.GAMMA__ALPHA:
				setAlpha((Expression)null);
				return;
			case SANPackage.GAMMA__BETA:
				setBeta((Expression)null);
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
			case SANPackage.GAMMA__ALPHA:
				return alpha != null;
			case SANPackage.GAMMA__BETA:
				return beta != null;
		}
		return super.eIsSet(featureID);
	}

} //GammaImpl
