/**
 */
package org.modelspartiti.formalisms.san.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelspartiti.formalisms.san.ExpressionMarking;
import org.modelspartiti.formalisms.san.Place;
import org.modelspartiti.formalisms.san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Marking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.impl.ExpressionMarkingImpl#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionMarkingImpl extends MinimalEObjectImpl.Container implements ExpressionMarking {
	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionMarkingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.EXPRESSION_MARKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject)place;
			place = (Place)eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANPackage.EXPRESSION_MARKING__PLACE, oldPlace, place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlace(Place newPlace) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.EXPRESSION_MARKING__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANPackage.EXPRESSION_MARKING__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
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
			case SANPackage.EXPRESSION_MARKING__PLACE:
				setPlace((Place)newValue);
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
			case SANPackage.EXPRESSION_MARKING__PLACE:
				setPlace((Place)null);
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
			case SANPackage.EXPRESSION_MARKING__PLACE:
				return place != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionMarkingImpl
