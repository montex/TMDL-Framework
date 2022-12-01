/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.modelspartiti.infrastructure.tmdl.ModelInterfArray;
import org.modelspartiti.infrastructure.tmdl.Multiplicity;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Interf Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.ModelInterfArrayImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.ModelInterfArrayImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelInterfArrayImpl extends ModelInterfaceImpl implements ModelInterfArray {
	/**
	 * The cached value of the '{@link #getMult() <em>Mult</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMult()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity mult;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelInterfArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.MODEL_INTERF_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMult() {
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMult(Multiplicity newMult, NotificationChain msgs) {
		Multiplicity oldMult = mult;
		mult = newMult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tmdlPackage.MODEL_INTERF_ARRAY__MULT, oldMult, newMult);
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
	public void setMult(Multiplicity newMult) {
		if (newMult != mult) {
			NotificationChain msgs = null;
			if (mult != null)
				msgs = ((InternalEObject)mult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tmdlPackage.MODEL_INTERF_ARRAY__MULT, null, msgs);
			if (newMult != null)
				msgs = ((InternalEObject)newMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tmdlPackage.MODEL_INTERF_ARRAY__MULT, null, msgs);
			msgs = basicSetMult(newMult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.MODEL_INTERF_ARRAY__MULT, newMult, newMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLabels() {
		if (labels == null) {
			labels = new EDataTypeUniqueEList<String>(String.class, this, tmdlPackage.MODEL_INTERF_ARRAY__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmdlPackage.MODEL_INTERF_ARRAY__MULT:
				return basicSetMult(null, msgs);
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
			case tmdlPackage.MODEL_INTERF_ARRAY__MULT:
				return getMult();
			case tmdlPackage.MODEL_INTERF_ARRAY__LABELS:
				return getLabels();
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
			case tmdlPackage.MODEL_INTERF_ARRAY__MULT:
				setMult((Multiplicity)newValue);
				return;
			case tmdlPackage.MODEL_INTERF_ARRAY__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
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
			case tmdlPackage.MODEL_INTERF_ARRAY__MULT:
				setMult((Multiplicity)null);
				return;
			case tmdlPackage.MODEL_INTERF_ARRAY__LABELS:
				getLabels().clear();
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
			case tmdlPackage.MODEL_INTERF_ARRAY__MULT:
				return mult != null;
			case tmdlPackage.MODEL_INTERF_ARRAY__LABELS:
				return labels != null && !labels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (labels: ");
		result.append(labels);
		result.append(')');
		return result.toString();
	}

} //ModelInterfArrayImpl
