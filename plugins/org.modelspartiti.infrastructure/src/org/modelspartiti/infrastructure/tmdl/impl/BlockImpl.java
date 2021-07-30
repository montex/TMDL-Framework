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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.modelspartiti.infrastructure.tmdl.Block;
import org.modelspartiti.infrastructure.tmdl.ModelInterface;
import org.modelspartiti.infrastructure.tmdl.Multiplicity;
import org.modelspartiti.infrastructure.tmdl.TemplateSpecification;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.BlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.BlockImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.BlockImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.BlockImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.BlockImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
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
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected TemplateSpecification ref;

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
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelInterface> interfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.BLOCK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.BLOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateSpecification getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (TemplateSpecification)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmdlPackage.BLOCK__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecification basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(TemplateSpecification newRef) {
		TemplateSpecification oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.BLOCK__REF, oldRef, ref));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tmdlPackage.BLOCK__MULT, oldMult, newMult);
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
				msgs = ((InternalEObject)mult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tmdlPackage.BLOCK__MULT, null, msgs);
			if (newMult != null)
				msgs = ((InternalEObject)newMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tmdlPackage.BLOCK__MULT, null, msgs);
			msgs = basicSetMult(newMult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.BLOCK__MULT, newMult, newMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLabels() {
		if (labels == null) {
			labels = new EDataTypeUniqueEList<String>(String.class, this, tmdlPackage.BLOCK__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<ModelInterface>(ModelInterface.class, this, tmdlPackage.BLOCK__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmdlPackage.BLOCK__MULT:
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
			case tmdlPackage.BLOCK__NAME:
				return getName();
			case tmdlPackage.BLOCK__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case tmdlPackage.BLOCK__MULT:
				return getMult();
			case tmdlPackage.BLOCK__LABELS:
				return getLabels();
			case tmdlPackage.BLOCK__INTERFACES:
				return getInterfaces();
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
			case tmdlPackage.BLOCK__NAME:
				setName((String)newValue);
				return;
			case tmdlPackage.BLOCK__REF:
				setRef((TemplateSpecification)newValue);
				return;
			case tmdlPackage.BLOCK__MULT:
				setMult((Multiplicity)newValue);
				return;
			case tmdlPackage.BLOCK__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
				return;
			case tmdlPackage.BLOCK__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends ModelInterface>)newValue);
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
			case tmdlPackage.BLOCK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tmdlPackage.BLOCK__REF:
				setRef((TemplateSpecification)null);
				return;
			case tmdlPackage.BLOCK__MULT:
				setMult((Multiplicity)null);
				return;
			case tmdlPackage.BLOCK__LABELS:
				getLabels().clear();
				return;
			case tmdlPackage.BLOCK__INTERFACES:
				getInterfaces().clear();
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
			case tmdlPackage.BLOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tmdlPackage.BLOCK__REF:
				return ref != null;
			case tmdlPackage.BLOCK__MULT:
				return mult != null;
			case tmdlPackage.BLOCK__LABELS:
				return labels != null && !labels.isEmpty();
			case tmdlPackage.BLOCK__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
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

} //BlockImpl
