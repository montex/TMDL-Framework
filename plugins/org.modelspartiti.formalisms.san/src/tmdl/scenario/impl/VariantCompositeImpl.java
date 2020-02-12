/**
 */
package tmdl.scenario.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tmdl.library.TemplateComposite;

import tmdl.scenario.BlockRealization;
import tmdl.scenario.ScenarioPackage;
import tmdl.scenario.VariantComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tmdl.scenario.impl.VariantCompositeImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link tmdl.scenario.impl.VariantCompositeImpl#getRealizations <em>Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantCompositeImpl extends VariantImpl implements VariantComposite {
	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected TemplateComposite template;

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
	protected VariantCompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.VARIANT_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateComposite getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (TemplateComposite)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.VARIANT_COMPOSITE__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateComposite basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateComposite newTemplate) {
		TemplateComposite oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.VARIANT_COMPOSITE__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockRealization> getRealizations() {
		if (realizations == null) {
			realizations = new EObjectContainmentEList<BlockRealization>(BlockRealization.class, this, ScenarioPackage.VARIANT_COMPOSITE__REALIZATIONS);
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
			case ScenarioPackage.VARIANT_COMPOSITE__REALIZATIONS:
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
			case ScenarioPackage.VARIANT_COMPOSITE__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case ScenarioPackage.VARIANT_COMPOSITE__REALIZATIONS:
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
			case ScenarioPackage.VARIANT_COMPOSITE__TEMPLATE:
				setTemplate((TemplateComposite)newValue);
				return;
			case ScenarioPackage.VARIANT_COMPOSITE__REALIZATIONS:
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
			case ScenarioPackage.VARIANT_COMPOSITE__TEMPLATE:
				setTemplate((TemplateComposite)null);
				return;
			case ScenarioPackage.VARIANT_COMPOSITE__REALIZATIONS:
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
			case ScenarioPackage.VARIANT_COMPOSITE__TEMPLATE:
				return template != null;
			case ScenarioPackage.VARIANT_COMPOSITE__REALIZATIONS:
				return realizations != null && !realizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariantCompositeImpl
