/**
 */
package sant.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sant.Activity;
import sant.Arc;
import sant.Expression;
import sant.Gate;
import sant.GlobalVariable;
import sant.Place;
import sant.SANT;
import sant.SANTPackage;

import tmdl.core.Assignment;
import tmdl.core.ConcreteModel;
import tmdl.core.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SANT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sant.impl.SANTImpl#getName <em>Name</em>}</li>
 *   <li>{@link sant.impl.SANTImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sant.impl.SANTImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link sant.impl.SANTImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link sant.impl.SANTImpl#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link sant.impl.SANTImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link sant.impl.SANTImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link sant.impl.SANTImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

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
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gates;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> initialization;

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
		return SANTPackage.Literals.SANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.SANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, SANTPackage.SANT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentEList<Place>(Place.class, this, SANTPackage.SANT__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, SANTPackage.SANT__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<GlobalVariable> getGlobalVariables() {
		if (globalVariables == null) {
			globalVariables = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, SANTPackage.SANT__GLOBAL_VARIABLES);
		}
		return globalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentEList<Arc>(Arc.class, this, SANTPackage.SANT__ARCS);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, SANTPackage.SANT__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Expression> getInitialization() {
		if (initialization == null) {
			initialization = new EObjectContainmentEList<Expression>(Expression.class, this, SANTPackage.SANT__INITIALIZATION);
		}
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteModel concretize(List<Assignment> parameterValues) {
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
			case SANTPackage.SANT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case SANTPackage.SANT__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case SANTPackage.SANT__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case SANTPackage.SANT__GLOBAL_VARIABLES:
				return ((InternalEList<?>)getGlobalVariables()).basicRemove(otherEnd, msgs);
			case SANTPackage.SANT__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case SANTPackage.SANT__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
			case SANTPackage.SANT__INITIALIZATION:
				return ((InternalEList<?>)getInitialization()).basicRemove(otherEnd, msgs);
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
			case SANTPackage.SANT__NAME:
				return getName();
			case SANTPackage.SANT__PARAMETERS:
				return getParameters();
			case SANTPackage.SANT__PLACES:
				return getPlaces();
			case SANTPackage.SANT__ACTIVITIES:
				return getActivities();
			case SANTPackage.SANT__GLOBAL_VARIABLES:
				return getGlobalVariables();
			case SANTPackage.SANT__ARCS:
				return getArcs();
			case SANTPackage.SANT__GATES:
				return getGates();
			case SANTPackage.SANT__INITIALIZATION:
				return getInitialization();
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
			case SANTPackage.SANT__NAME:
				setName((String)newValue);
				return;
			case SANTPackage.SANT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case SANTPackage.SANT__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case SANTPackage.SANT__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case SANTPackage.SANT__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				getGlobalVariables().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case SANTPackage.SANT__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case SANTPackage.SANT__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Gate>)newValue);
				return;
			case SANTPackage.SANT__INITIALIZATION:
				getInitialization().clear();
				getInitialization().addAll((Collection<? extends Expression>)newValue);
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
			case SANTPackage.SANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SANTPackage.SANT__PARAMETERS:
				getParameters().clear();
				return;
			case SANTPackage.SANT__PLACES:
				getPlaces().clear();
				return;
			case SANTPackage.SANT__ACTIVITIES:
				getActivities().clear();
				return;
			case SANTPackage.SANT__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				return;
			case SANTPackage.SANT__ARCS:
				getArcs().clear();
				return;
			case SANTPackage.SANT__GATES:
				getGates().clear();
				return;
			case SANTPackage.SANT__INITIALIZATION:
				getInitialization().clear();
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
			case SANTPackage.SANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SANTPackage.SANT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SANTPackage.SANT__PLACES:
				return places != null && !places.isEmpty();
			case SANTPackage.SANT__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case SANTPackage.SANT__GLOBAL_VARIABLES:
				return globalVariables != null && !globalVariables.isEmpty();
			case SANTPackage.SANT__ARCS:
				return arcs != null && !arcs.isEmpty();
			case SANTPackage.SANT__GATES:
				return gates != null && !gates.isEmpty();
			case SANTPackage.SANT__INITIALIZATION:
				return initialization != null && !initialization.isEmpty();
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
			case SANTPackage.SANT___CONCRETIZE__LIST:
				return concretize((List<Assignment>)arguments.get(0));
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SANTImpl
