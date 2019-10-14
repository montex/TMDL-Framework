/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Beta;
import san.Expression;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.BetaImpl#getAlpha1 <em>Alpha1</em>}</li>
 *   <li>{@link san.impl.BetaImpl#getBeta1 <em>Beta1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BetaImpl extends DistributionImpl implements Beta {
	/**
	 * The cached value of the '{@link #getAlpha1() <em>Alpha1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha1()
	 * @generated
	 * @ordered
	 */
	protected Expression alpha1;

	/**
	 * The cached value of the '{@link #getBeta1() <em>Beta1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeta1()
	 * @generated
	 * @ordered
	 */
	protected Expression beta1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAlpha1() {
		return alpha1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlpha1(Expression newAlpha1, NotificationChain msgs) {
		Expression oldAlpha1 = alpha1;
		alpha1 = newAlpha1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.BETA__ALPHA1, oldAlpha1, newAlpha1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha1(Expression newAlpha1) {
		if (newAlpha1 != alpha1) {
			NotificationChain msgs = null;
			if (alpha1 != null)
				msgs = ((InternalEObject)alpha1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.BETA__ALPHA1, null, msgs);
			if (newAlpha1 != null)
				msgs = ((InternalEObject)newAlpha1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.BETA__ALPHA1, null, msgs);
			msgs = basicSetAlpha1(newAlpha1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.BETA__ALPHA1, newAlpha1, newAlpha1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBeta1() {
		return beta1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeta1(Expression newBeta1, NotificationChain msgs) {
		Expression oldBeta1 = beta1;
		beta1 = newBeta1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.BETA__BETA1, oldBeta1, newBeta1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeta1(Expression newBeta1) {
		if (newBeta1 != beta1) {
			NotificationChain msgs = null;
			if (beta1 != null)
				msgs = ((InternalEObject)beta1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.BETA__BETA1, null, msgs);
			if (newBeta1 != null)
				msgs = ((InternalEObject)newBeta1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.BETA__BETA1, null, msgs);
			msgs = basicSetBeta1(newBeta1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.BETA__BETA1, newBeta1, newBeta1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.BETA__ALPHA1:
				return basicSetAlpha1(null, msgs);
			case SANPackage.BETA__BETA1:
				return basicSetBeta1(null, msgs);
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
			case SANPackage.BETA__ALPHA1:
				return getAlpha1();
			case SANPackage.BETA__BETA1:
				return getBeta1();
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
			case SANPackage.BETA__ALPHA1:
				setAlpha1((Expression)newValue);
				return;
			case SANPackage.BETA__BETA1:
				setBeta1((Expression)newValue);
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
			case SANPackage.BETA__ALPHA1:
				setAlpha1((Expression)null);
				return;
			case SANPackage.BETA__BETA1:
				setBeta1((Expression)null);
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
			case SANPackage.BETA__ALPHA1:
				return alpha1 != null;
			case SANPackage.BETA__BETA1:
				return beta1 != null;
		}
		return super.eIsSet(featureID);
	}

} //BetaImpl
