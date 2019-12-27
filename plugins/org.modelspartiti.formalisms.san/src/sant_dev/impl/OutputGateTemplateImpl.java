/**
 */
package sant_dev.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import san.impl.GateImpl;

import sant_dev.ActivityTemplate;
import sant_dev.OutputGateTemplate;
import sant_dev.PlaceTemplate;
import sant_dev.SANT_DEVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Gate Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.impl.OutputGateTemplateImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link sant_dev.impl.OutputGateTemplateImpl#getPlaceTemplate <em>Place Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputGateTemplateImpl extends GateImpl implements OutputGateTemplate {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityTemplate> activity;

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
	protected OutputGateTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANT_DEVPackage.Literals.OUTPUT_GATE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityTemplate> getActivity() {
		if (activity == null) {
			activity = new EObjectResolvingEList<ActivityTemplate>(ActivityTemplate.class, this, SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceTemplate> getPlaceTemplate() {
		if (placeTemplate == null) {
			placeTemplate = new EObjectResolvingEList<PlaceTemplate>(PlaceTemplate.class, this, SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__PLACE_TEMPLATE);
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
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__ACTIVITY:
				return getActivity();
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__PLACE_TEMPLATE:
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
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityTemplate>)newValue);
				return;
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__PLACE_TEMPLATE:
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
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__ACTIVITY:
				getActivity().clear();
				return;
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__PLACE_TEMPLATE:
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
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE__PLACE_TEMPLATE:
				return placeTemplate != null && !placeTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputGateTemplateImpl
