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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.modelspartiti.infrastructure.tmdl.Assignment;
import org.modelspartiti.infrastructure.tmdl.BlockRealization;
import org.modelspartiti.infrastructure.tmdl.TemplateSpecification;
import org.modelspartiti.infrastructure.tmdl.Variant;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.VariantImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.VariantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.VariantImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.VariantImpl#getRealizations <em>Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantImpl extends MinimalEObjectImpl.Container implements Variant {
	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignments;

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
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected TemplateSpecification template;

	/**
	 * The cached value of the '{@link #getRealizations() <em>Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockRealization> realizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assignment> getAssignments() {
		if (assignments == null) {
			assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, tmdlPackage.VARIANT__ASSIGNMENTS);
		}
		return assignments;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.VARIANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateSpecification getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (TemplateSpecification)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmdlPackage.VARIANT__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecification basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(TemplateSpecification newTemplate) {
		TemplateSpecification oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.VARIANT__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockRealization> getRealizations() {
		if (realizations == null) {
			realizations = new EObjectContainmentEList<BlockRealization>(BlockRealization.class, this, tmdlPackage.VARIANT__REALIZATIONS);
		}
		return realizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmdlPackage.VARIANT__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
			case tmdlPackage.VARIANT__REALIZATIONS:
				return ((InternalEList<?>)getRealizations()).basicRemove(otherEnd, msgs);
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
			case tmdlPackage.VARIANT__ASSIGNMENTS:
				return getAssignments();
			case tmdlPackage.VARIANT__NAME:
				return getName();
			case tmdlPackage.VARIANT__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case tmdlPackage.VARIANT__REALIZATIONS:
				return getRealizations();
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
			case tmdlPackage.VARIANT__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends Assignment>)newValue);
				return;
			case tmdlPackage.VARIANT__NAME:
				setName((String)newValue);
				return;
			case tmdlPackage.VARIANT__TEMPLATE:
				setTemplate((TemplateSpecification)newValue);
				return;
			case tmdlPackage.VARIANT__REALIZATIONS:
				getRealizations().clear();
				getRealizations().addAll((Collection<? extends BlockRealization>)newValue);
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
			case tmdlPackage.VARIANT__ASSIGNMENTS:
				getAssignments().clear();
				return;
			case tmdlPackage.VARIANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tmdlPackage.VARIANT__TEMPLATE:
				setTemplate((TemplateSpecification)null);
				return;
			case tmdlPackage.VARIANT__REALIZATIONS:
				getRealizations().clear();
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
			case tmdlPackage.VARIANT__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
			case tmdlPackage.VARIANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tmdlPackage.VARIANT__TEMPLATE:
				return template != null;
			case tmdlPackage.VARIANT__REALIZATIONS:
				return realizations != null && !realizations.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //VariantImpl
