/**
 */
package sant_dev.impl;

import java.lang.reflect.InvocationTargetException;

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
import san.CustomTypeDefinition;
import san.GlobalVariable;
import san.Place;
import sant_dev.ActivityTemplate;
import sant_dev.GateTemplate;
import sant_dev.PlaceTemplate;
import sant_dev.SANT;
import sant_dev.SANT_DEVPackage;

import tmdl.core.Assignment;
import tmdl.core.ConcreteModel;
import tmdl.core.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SANT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.impl.SANTImpl#getName <em>Name</em>}</li>
 *   <li>{@link sant_dev.impl.SANTImpl#getTemplatePlaces <em>Template Places</em>}</li>
 *   <li>{@link sant_dev.impl.SANTImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link sant_dev.impl.SANTImpl#getActivityTemplates <em>Activity Templates</em>}</li>
 *   <li>{@link sant_dev.impl.SANTImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sant_dev.impl.SANTImpl#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link sant_dev.impl.SANTImpl#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link sant_dev.impl.SANTImpl#getGates <em>Gates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SANTImpl extends MinimalEObjectImpl.Container implements SANT {
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
	 * The cached value of the '{@link #getTemplatePlaces() <em>Template Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplatePlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaceTemplate> templatePlaces;

	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getActivityTemplates() <em>Activity Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityTemplate> activityTemplates;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getGlobalVariables() <em>Global Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> globalVariables;

	/**
	 * The cached value of the '{@link #getCustomType() <em>Custom Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomType()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomTypeDefinition> customType;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<GateTemplate> gates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SANTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANT_DEVPackage.Literals.SANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.SANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceTemplate> getTemplatePlaces() {
		if (templatePlaces == null) {
			templatePlaces = new EObjectContainmentEList<PlaceTemplate>(PlaceTemplate.class, this, SANT_DEVPackage.SANT__TEMPLATE_PLACES);
		}
		return templatePlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentEList<Place>(Place.class, this, SANT_DEVPackage.SANT__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityTemplate> getActivityTemplates() {
		if (activityTemplates == null) {
			activityTemplates = new EObjectContainmentEList<ActivityTemplate>(ActivityTemplate.class, this, SANT_DEVPackage.SANT__ACTIVITY_TEMPLATES);
		}
		return activityTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, SANT_DEVPackage.SANT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getGlobalVariables() {
		if (globalVariables == null) {
			globalVariables = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, SANT_DEVPackage.SANT__GLOBAL_VARIABLES);
		}
		return globalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomTypeDefinition> getCustomType() {
		if (customType == null) {
			customType = new EObjectContainmentEList<CustomTypeDefinition>(CustomTypeDefinition.class, this, SANT_DEVPackage.SANT__CUSTOM_TYPE);
		}
		return customType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GateTemplate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<GateTemplate>(GateTemplate.class, this, SANT_DEVPackage.SANT__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteModel concretize(EList<Assignment> parameterValues) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANT_DEVPackage.SANT__TEMPLATE_PLACES:
				return ((InternalEList<?>)getTemplatePlaces()).basicRemove(otherEnd, msgs);
			case SANT_DEVPackage.SANT__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case SANT_DEVPackage.SANT__ACTIVITY_TEMPLATES:
				return ((InternalEList<?>)getActivityTemplates()).basicRemove(otherEnd, msgs);
			case SANT_DEVPackage.SANT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case SANT_DEVPackage.SANT__GLOBAL_VARIABLES:
				return ((InternalEList<?>)getGlobalVariables()).basicRemove(otherEnd, msgs);
			case SANT_DEVPackage.SANT__CUSTOM_TYPE:
				return ((InternalEList<?>)getCustomType()).basicRemove(otherEnd, msgs);
			case SANT_DEVPackage.SANT__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
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
			case SANT_DEVPackage.SANT__NAME:
				return getName();
			case SANT_DEVPackage.SANT__TEMPLATE_PLACES:
				return getTemplatePlaces();
			case SANT_DEVPackage.SANT__PLACES:
				return getPlaces();
			case SANT_DEVPackage.SANT__ACTIVITY_TEMPLATES:
				return getActivityTemplates();
			case SANT_DEVPackage.SANT__PARAMETERS:
				return getParameters();
			case SANT_DEVPackage.SANT__GLOBAL_VARIABLES:
				return getGlobalVariables();
			case SANT_DEVPackage.SANT__CUSTOM_TYPE:
				return getCustomType();
			case SANT_DEVPackage.SANT__GATES:
				return getGates();
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
			case SANT_DEVPackage.SANT__NAME:
				setName((String)newValue);
				return;
			case SANT_DEVPackage.SANT__TEMPLATE_PLACES:
				getTemplatePlaces().clear();
				getTemplatePlaces().addAll((Collection<? extends PlaceTemplate>)newValue);
				return;
			case SANT_DEVPackage.SANT__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case SANT_DEVPackage.SANT__ACTIVITY_TEMPLATES:
				getActivityTemplates().clear();
				getActivityTemplates().addAll((Collection<? extends ActivityTemplate>)newValue);
				return;
			case SANT_DEVPackage.SANT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case SANT_DEVPackage.SANT__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				getGlobalVariables().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case SANT_DEVPackage.SANT__CUSTOM_TYPE:
				getCustomType().clear();
				getCustomType().addAll((Collection<? extends CustomTypeDefinition>)newValue);
				return;
			case SANT_DEVPackage.SANT__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends GateTemplate>)newValue);
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
			case SANT_DEVPackage.SANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SANT_DEVPackage.SANT__TEMPLATE_PLACES:
				getTemplatePlaces().clear();
				return;
			case SANT_DEVPackage.SANT__PLACES:
				getPlaces().clear();
				return;
			case SANT_DEVPackage.SANT__ACTIVITY_TEMPLATES:
				getActivityTemplates().clear();
				return;
			case SANT_DEVPackage.SANT__PARAMETERS:
				getParameters().clear();
				return;
			case SANT_DEVPackage.SANT__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				return;
			case SANT_DEVPackage.SANT__CUSTOM_TYPE:
				getCustomType().clear();
				return;
			case SANT_DEVPackage.SANT__GATES:
				getGates().clear();
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
			case SANT_DEVPackage.SANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SANT_DEVPackage.SANT__TEMPLATE_PLACES:
				return templatePlaces != null && !templatePlaces.isEmpty();
			case SANT_DEVPackage.SANT__PLACES:
				return places != null && !places.isEmpty();
			case SANT_DEVPackage.SANT__ACTIVITY_TEMPLATES:
				return activityTemplates != null && !activityTemplates.isEmpty();
			case SANT_DEVPackage.SANT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SANT_DEVPackage.SANT__GLOBAL_VARIABLES:
				return globalVariables != null && !globalVariables.isEmpty();
			case SANT_DEVPackage.SANT__CUSTOM_TYPE:
				return customType != null && !customType.isEmpty();
			case SANT_DEVPackage.SANT__GATES:
				return gates != null && !gates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SANT_DEVPackage.SANT___CONCRETIZE__ELIST:
				return concretize((EList<Assignment>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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

} //SANTImpl
