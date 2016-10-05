/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.MarkingSimple;
import san.NormalPlace;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link san.impl.NormalPlaceImpl#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalPlaceImpl extends PlaceImpl implements NormalPlace {
	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected MarkingSimple marking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.NORMAL_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingSimple getMarking() {
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarking(MarkingSimple newMarking, NotificationChain msgs) {
		MarkingSimple oldMarking = marking;
		marking = newMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.NORMAL_PLACE__MARKING, oldMarking, newMarking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarking(MarkingSimple newMarking) {
		if (newMarking != marking) {
			NotificationChain msgs = null;
			if (marking != null)
				msgs = ((InternalEObject)marking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.NORMAL_PLACE__MARKING, null, msgs);
			if (newMarking != null)
				msgs = ((InternalEObject)newMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.NORMAL_PLACE__MARKING, null, msgs);
			msgs = basicSetMarking(newMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.NORMAL_PLACE__MARKING, newMarking, newMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.NORMAL_PLACE__MARKING:
				return basicSetMarking(null, msgs);
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
			case SANPackage.NORMAL_PLACE__MARKING:
				return getMarking();
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
			case SANPackage.NORMAL_PLACE__MARKING:
				setMarking((MarkingSimple)newValue);
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
			case SANPackage.NORMAL_PLACE__MARKING:
				setMarking((MarkingSimple)null);
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
			case SANPackage.NORMAL_PLACE__MARKING:
				return marking != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalPlaceImpl
