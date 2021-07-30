/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.modelspartiti.infrastructure.tmdl.Block;
import org.modelspartiti.infrastructure.tmdl.CompositionRule;
import org.modelspartiti.infrastructure.tmdl.Parambinding;
import org.modelspartiti.infrastructure.tmdl.TemplateComposite;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateCompositeImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateCompositeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateCompositeImpl#getSubmodules <em>Submodules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateCompositeImpl extends TemplateSpecificationImpl implements TemplateComposite {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionRule> rules;

	/**
	 * The cached value of the '{@link #getBind() <em>Bind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected EList<Parambinding> bind;

	/**
	 * The cached value of the '{@link #getSubmodules() <em>Submodules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodules()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> submodules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateCompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.TEMPLATE_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositionRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<CompositionRule>(CompositionRule.class, this, tmdlPackage.TEMPLATE_COMPOSITE__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parambinding> getBind() {
		if (bind == null) {
			bind = new EObjectContainmentEList<Parambinding>(Parambinding.class, this, tmdlPackage.TEMPLATE_COMPOSITE__BIND);
		}
		return bind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getSubmodules() {
		if (submodules == null) {
			submodules = new EObjectContainmentEList<Block>(Block.class, this, tmdlPackage.TEMPLATE_COMPOSITE__SUBMODULES);
		}
		return submodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmdlPackage.TEMPLATE_COMPOSITE__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case tmdlPackage.TEMPLATE_COMPOSITE__BIND:
				return ((InternalEList<?>)getBind()).basicRemove(otherEnd, msgs);
			case tmdlPackage.TEMPLATE_COMPOSITE__SUBMODULES:
				return ((InternalEList<?>)getSubmodules()).basicRemove(otherEnd, msgs);
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
			case tmdlPackage.TEMPLATE_COMPOSITE__RULES:
				return getRules();
			case tmdlPackage.TEMPLATE_COMPOSITE__BIND:
				return getBind();
			case tmdlPackage.TEMPLATE_COMPOSITE__SUBMODULES:
				return getSubmodules();
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
			case tmdlPackage.TEMPLATE_COMPOSITE__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends CompositionRule>)newValue);
				return;
			case tmdlPackage.TEMPLATE_COMPOSITE__BIND:
				getBind().clear();
				getBind().addAll((Collection<? extends Parambinding>)newValue);
				return;
			case tmdlPackage.TEMPLATE_COMPOSITE__SUBMODULES:
				getSubmodules().clear();
				getSubmodules().addAll((Collection<? extends Block>)newValue);
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
			case tmdlPackage.TEMPLATE_COMPOSITE__RULES:
				getRules().clear();
				return;
			case tmdlPackage.TEMPLATE_COMPOSITE__BIND:
				getBind().clear();
				return;
			case tmdlPackage.TEMPLATE_COMPOSITE__SUBMODULES:
				getSubmodules().clear();
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
			case tmdlPackage.TEMPLATE_COMPOSITE__RULES:
				return rules != null && !rules.isEmpty();
			case tmdlPackage.TEMPLATE_COMPOSITE__BIND:
				return bind != null && !bind.isEmpty();
			case tmdlPackage.TEMPLATE_COMPOSITE__SUBMODULES:
				return submodules != null && !submodules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateCompositeImpl
