/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.modelspartiti.infrastructure.tmdl.Parameter;
import org.modelspartiti.infrastructure.tmdl.Parametric;
import org.modelspartiti.infrastructure.tmdl.StateMetavariable;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Metavariable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.StateMetavariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.StateMetavariableImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.StateMetavariableImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.StateMetavariableImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMetavariableImpl extends MinimalEObjectImpl.Container implements StateMetavariable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getMult() <em>Mult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMult()
	 * @generated
	 * @ordered
	 */
	protected Parametric mult;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMetavariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.STATE_METAVARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.STATE_METAVARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLabels() {
		if (labels == null) {
			labels = new EDataTypeUniqueEList<String>(String.class, this, tmdlPackage.STATE_METAVARIABLE__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parametric getMult() {
		if (mult != null && mult.eIsProxy()) {
			InternalEObject oldMult = (InternalEObject)mult;
			mult = (Parametric)eResolveProxy(oldMult);
			if (mult != oldMult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmdlPackage.STATE_METAVARIABLE__MULT, oldMult, mult));
			}
		}
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametric basicGetMult() {
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMult(Parametric newMult) {
		Parametric oldMult = mult;
		mult = newMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.STATE_METAVARIABLE__MULT, oldMult, mult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, tmdlPackage.STATE_METAVARIABLE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmdlPackage.STATE_METAVARIABLE__NAME:
				return getName();
			case tmdlPackage.STATE_METAVARIABLE__LABELS:
				return getLabels();
			case tmdlPackage.STATE_METAVARIABLE__MULT:
				if (resolve) return getMult();
				return basicGetMult();
			case tmdlPackage.STATE_METAVARIABLE__PARAMETERS:
				return getParameters();
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
			case tmdlPackage.STATE_METAVARIABLE__NAME:
				setName((String)newValue);
				return;
			case tmdlPackage.STATE_METAVARIABLE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
				return;
			case tmdlPackage.STATE_METAVARIABLE__MULT:
				setMult((Parametric)newValue);
				return;
			case tmdlPackage.STATE_METAVARIABLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case tmdlPackage.STATE_METAVARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tmdlPackage.STATE_METAVARIABLE__LABELS:
				getLabels().clear();
				return;
			case tmdlPackage.STATE_METAVARIABLE__MULT:
				setMult((Parametric)null);
				return;
			case tmdlPackage.STATE_METAVARIABLE__PARAMETERS:
				getParameters().clear();
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
			case tmdlPackage.STATE_METAVARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tmdlPackage.STATE_METAVARIABLE__LABELS:
				return labels != null && !labels.isEmpty();
			case tmdlPackage.STATE_METAVARIABLE__MULT:
				return mult != null;
			case tmdlPackage.STATE_METAVARIABLE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", labels: ");
		result.append(labels);
		result.append(')');
		return result.toString();
	}

} //StateMetavariableImpl
