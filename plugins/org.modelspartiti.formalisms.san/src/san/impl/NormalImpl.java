/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Expression;
import san.Normal;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.NormalImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link san.impl.NormalImpl#getVariance <em>Variance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalImpl extends DistributionImpl implements Normal {
	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected Expression mean;

	/**
	 * The cached value of the '{@link #getVariance() <em>Variance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariance()
	 * @generated
	 * @ordered
	 */
	protected Expression variance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.NORMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMean(Expression newMean, NotificationChain msgs) {
		Expression oldMean = mean;
		mean = newMean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.NORMAL__MEAN, oldMean, newMean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(Expression newMean) {
		if (newMean != mean) {
			NotificationChain msgs = null;
			if (mean != null)
				msgs = ((InternalEObject)mean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.NORMAL__MEAN, null, msgs);
			if (newMean != null)
				msgs = ((InternalEObject)newMean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.NORMAL__MEAN, null, msgs);
			msgs = basicSetMean(newMean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.NORMAL__MEAN, newMean, newMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getVariance() {
		return variance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariance(Expression newVariance, NotificationChain msgs) {
		Expression oldVariance = variance;
		variance = newVariance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.NORMAL__VARIANCE, oldVariance, newVariance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariance(Expression newVariance) {
		if (newVariance != variance) {
			NotificationChain msgs = null;
			if (variance != null)
				msgs = ((InternalEObject)variance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.NORMAL__VARIANCE, null, msgs);
			if (newVariance != null)
				msgs = ((InternalEObject)newVariance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.NORMAL__VARIANCE, null, msgs);
			msgs = basicSetVariance(newVariance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.NORMAL__VARIANCE, newVariance, newVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.NORMAL__MEAN:
				return basicSetMean(null, msgs);
			case SANPackage.NORMAL__VARIANCE:
				return basicSetVariance(null, msgs);
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
			case SANPackage.NORMAL__MEAN:
				return getMean();
			case SANPackage.NORMAL__VARIANCE:
				return getVariance();
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
			case SANPackage.NORMAL__MEAN:
				setMean((Expression)newValue);
				return;
			case SANPackage.NORMAL__VARIANCE:
				setVariance((Expression)newValue);
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
			case SANPackage.NORMAL__MEAN:
				setMean((Expression)null);
				return;
			case SANPackage.NORMAL__VARIANCE:
				setVariance((Expression)null);
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
			case SANPackage.NORMAL__MEAN:
				return mean != null;
			case SANPackage.NORMAL__VARIANCE:
				return variance != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalImpl
