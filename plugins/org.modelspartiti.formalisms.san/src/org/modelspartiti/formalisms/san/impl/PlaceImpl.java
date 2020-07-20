/**
 */
package org.modelspartiti.formalisms.san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.formalisms.san.Marking;
import org.modelspartiti.formalisms.san.Place;
import org.modelspartiti.formalisms.san.SANPackage;
import org.modelspartiti.formalisms.san.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.PlaceImpl#isIsExtended <em>Is Extended</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.PlaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.PlaceImpl#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends NamedElementImpl implements Place {
	/**
	 * The cached setting delegate for the '{@link #isIsExtended() <em>Is Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExtended()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_EXTENDED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SANPackage.Literals.PLACE__IS_EXTENDED).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected Marking marking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsExtended() {
		return (Boolean)IS_EXTENDED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.PLACE__TYPE, oldType, newType);
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
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.PLACE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.PLACE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.PLACE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marking getMarking() {
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarking(Marking newMarking, NotificationChain msgs) {
		Marking oldMarking = marking;
		marking = newMarking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.PLACE__MARKING, oldMarking, newMarking);
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
	public void setMarking(Marking newMarking) {
		if (newMarking != marking) {
			NotificationChain msgs = null;
			if (marking != null)
				msgs = ((InternalEObject)marking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.PLACE__MARKING, null, msgs);
			if (newMarking != null)
				msgs = ((InternalEObject)newMarking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.PLACE__MARKING, null, msgs);
			msgs = basicSetMarking(newMarking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.PLACE__MARKING, newMarking, newMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.PLACE__TYPE:
				return basicSetType(null, msgs);
			case SANPackage.PLACE__MARKING:
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
			case SANPackage.PLACE__IS_EXTENDED:
				return isIsExtended();
			case SANPackage.PLACE__TYPE:
				return getType();
			case SANPackage.PLACE__MARKING:
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
			case SANPackage.PLACE__TYPE:
				setType((Type)newValue);
				return;
			case SANPackage.PLACE__MARKING:
				setMarking((Marking)newValue);
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
			case SANPackage.PLACE__TYPE:
				setType((Type)null);
				return;
			case SANPackage.PLACE__MARKING:
				setMarking((Marking)null);
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
			case SANPackage.PLACE__IS_EXTENDED:
				return IS_EXTENDED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SANPackage.PLACE__TYPE:
				return type != null;
			case SANPackage.PLACE__MARKING:
				return marking != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
