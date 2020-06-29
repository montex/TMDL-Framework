/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Expression;
import san.SANPackage;
import san.Triangular;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triangular</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.TriangularImpl#getMin <em>Min</em>}</li>
 *   <li>{@link san.impl.TriangularImpl#getMiddle <em>Middle</em>}</li>
 *   <li>{@link san.impl.TriangularImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriangularImpl extends DistributionImpl implements Triangular {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Expression min;

	/**
	 * The cached value of the '{@link #getMiddle() <em>Middle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddle()
	 * @generated
	 * @ordered
	 */
	protected Expression middle;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Expression max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangularImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.TRIANGULAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(Expression newMin, NotificationChain msgs) {
		Expression oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.TRIANGULAR__MIN, oldMin, newMin);
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
	public void setMin(Expression newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.TRIANGULAR__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.TRIANGULAR__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.TRIANGULAR__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getMiddle() {
		return middle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiddle(Expression newMiddle, NotificationChain msgs) {
		Expression oldMiddle = middle;
		middle = newMiddle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.TRIANGULAR__MIDDLE, oldMiddle, newMiddle);
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
	public void setMiddle(Expression newMiddle) {
		if (newMiddle != middle) {
			NotificationChain msgs = null;
			if (middle != null)
				msgs = ((InternalEObject)middle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.TRIANGULAR__MIDDLE, null, msgs);
			if (newMiddle != null)
				msgs = ((InternalEObject)newMiddle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.TRIANGULAR__MIDDLE, null, msgs);
			msgs = basicSetMiddle(newMiddle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.TRIANGULAR__MIDDLE, newMiddle, newMiddle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(Expression newMax, NotificationChain msgs) {
		Expression oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.TRIANGULAR__MAX, oldMax, newMax);
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
	public void setMax(Expression newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.TRIANGULAR__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.TRIANGULAR__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.TRIANGULAR__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.TRIANGULAR__MIN:
				return basicSetMin(null, msgs);
			case SANPackage.TRIANGULAR__MIDDLE:
				return basicSetMiddle(null, msgs);
			case SANPackage.TRIANGULAR__MAX:
				return basicSetMax(null, msgs);
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
			case SANPackage.TRIANGULAR__MIN:
				return getMin();
			case SANPackage.TRIANGULAR__MIDDLE:
				return getMiddle();
			case SANPackage.TRIANGULAR__MAX:
				return getMax();
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
			case SANPackage.TRIANGULAR__MIN:
				setMin((Expression)newValue);
				return;
			case SANPackage.TRIANGULAR__MIDDLE:
				setMiddle((Expression)newValue);
				return;
			case SANPackage.TRIANGULAR__MAX:
				setMax((Expression)newValue);
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
			case SANPackage.TRIANGULAR__MIN:
				setMin((Expression)null);
				return;
			case SANPackage.TRIANGULAR__MIDDLE:
				setMiddle((Expression)null);
				return;
			case SANPackage.TRIANGULAR__MAX:
				setMax((Expression)null);
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
			case SANPackage.TRIANGULAR__MIN:
				return min != null;
			case SANPackage.TRIANGULAR__MIDDLE:
				return middle != null;
			case SANPackage.TRIANGULAR__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //TriangularImpl
