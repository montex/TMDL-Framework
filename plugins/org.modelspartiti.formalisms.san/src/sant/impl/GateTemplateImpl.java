/**
 */
package sant.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import san.impl.GateImpl;

import sant.GateTemplate;
import sant.PlaceTemplate;
import sant.SANTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant.impl.GateTemplateImpl#getPlaceTemplate <em>Place Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GateTemplateImpl extends GateImpl implements GateTemplate {
	/**
	 * The cached value of the '{@link #getPlaceTemplate() <em>Place Template</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaceTemplate> placeTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.GATE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlaceTemplate> getPlaceTemplate() {
		if (placeTemplate == null) {
			placeTemplate = new EObjectResolvingEList<PlaceTemplate>(PlaceTemplate.class, this, SANTPackage.GATE_TEMPLATE__PLACE_TEMPLATE);
		}
		return placeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.GATE_TEMPLATE__PLACE_TEMPLATE:
				return getPlaceTemplate();
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
			case SANTPackage.GATE_TEMPLATE__PLACE_TEMPLATE:
				getPlaceTemplate().clear();
				getPlaceTemplate().addAll((Collection<? extends PlaceTemplate>)newValue);
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
			case SANTPackage.GATE_TEMPLATE__PLACE_TEMPLATE:
				getPlaceTemplate().clear();
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
			case SANTPackage.GATE_TEMPLATE__PLACE_TEMPLATE:
				return placeTemplate != null && !placeTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GateTemplateImpl
