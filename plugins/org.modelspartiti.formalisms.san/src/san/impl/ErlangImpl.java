/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Erlang;
import san.Expression;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erlang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.ErlangImpl#getM <em>M</em>}</li>
 *   <li>{@link san.impl.ErlangImpl#getBeta <em>Beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErlangImpl extends DistributionImpl implements Erlang {
	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected Expression m;

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
	protected ErlangImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.ERLANG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getM() {
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM(Expression newM, NotificationChain msgs) {
		Expression oldM = m;
		m = newM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.ERLANG__M, oldM, newM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM(Expression newM) {
		if (newM != m) {
			NotificationChain msgs = null;
			if (m != null)
				msgs = ((InternalEObject)m).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.ERLANG__M, null, msgs);
			if (newM != null)
				msgs = ((InternalEObject)newM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.ERLANG__M, null, msgs);
			msgs = basicSetM(newM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.ERLANG__M, newM, newM));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.ERLANG__BETA, oldBeta, newBeta);
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
				msgs = ((InternalEObject)beta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.ERLANG__BETA, null, msgs);
			if (newBeta != null)
				msgs = ((InternalEObject)newBeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.ERLANG__BETA, null, msgs);
			msgs = basicSetBeta(newBeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.ERLANG__BETA, newBeta, newBeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.ERLANG__M:
				return basicSetM(null, msgs);
			case SANPackage.ERLANG__BETA:
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
			case SANPackage.ERLANG__M:
				return getM();
			case SANPackage.ERLANG__BETA:
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
			case SANPackage.ERLANG__M:
				setM((Expression)newValue);
				return;
			case SANPackage.ERLANG__BETA:
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
			case SANPackage.ERLANG__M:
				setM((Expression)null);
				return;
			case SANPackage.ERLANG__BETA:
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
			case SANPackage.ERLANG__M:
				return m != null;
			case SANPackage.ERLANG__BETA:
				return beta != null;
		}
		return super.eIsSet(featureID);
	}

} //ErlangImpl
