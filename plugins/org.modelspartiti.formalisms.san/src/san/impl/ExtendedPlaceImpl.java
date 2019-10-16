/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.ExtendedPlace;
import san.ExtendedTypeDefinition;
import san.MarkingExtended;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.ExtendedPlaceImpl#getMarking <em>Marking</em>}</li>
 *   <li>{@link san.impl.ExtendedPlaceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedPlaceImpl<T extends ExtendedTypeDefinition> extends PlaceImpl implements ExtendedPlace<T> {
	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected MarkingExtended marking;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected T type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.EXTENDED_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingExtended getMarking() {
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarking(MarkingExtended newMarking, NotificationChain msgs) {
		MarkingExtended oldMarking = marking;
		marking = newMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.EXTENDED_PLACE__MARKING, oldMarking, newMarking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarking(MarkingExtended newMarking) {
		if (newMarking != marking) {
			NotificationChain msgs = null;
			if (marking != null)
				msgs = ((InternalEObject)marking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.EXTENDED_PLACE__MARKING, null, msgs);
			if (newMarking != null)
				msgs = ((InternalEObject)newMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.EXTENDED_PLACE__MARKING, null, msgs);
			msgs = basicSetMarking(newMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.EXTENDED_PLACE__MARKING, newMarking, newMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (T)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANPackage.EXTENDED_PLACE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(T newType) {
		T oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.EXTENDED_PLACE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.EXTENDED_PLACE__MARKING:
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
			case SANPackage.EXTENDED_PLACE__MARKING:
				return getMarking();
			case SANPackage.EXTENDED_PLACE__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SANPackage.EXTENDED_PLACE__MARKING:
				setMarking((MarkingExtended)newValue);
				return;
			case SANPackage.EXTENDED_PLACE__TYPE:
				setType((T)newValue);
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
			case SANPackage.EXTENDED_PLACE__MARKING:
				setMarking((MarkingExtended)null);
				return;
			case SANPackage.EXTENDED_PLACE__TYPE:
				setType((T)null);
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
			case SANPackage.EXTENDED_PLACE__MARKING:
				return marking != null;
			case SANPackage.EXTENDED_PLACE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtendedPlaceImpl
