/**
 */
package san.impl;

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
import san.Activity;
import san.Arc;
import san.Expression;
import san.Gate;
import san.GlobalVariable;
import san.Place;
import san.SAN;
import san.SANPackage;
import tmdl.core.TemplateModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.SANImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link san.impl.SANImpl#getName <em>Name</em>}</li>
 *   <li>{@link san.impl.SANImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link san.impl.SANImpl#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link san.impl.SANImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link san.impl.SANImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link san.impl.SANImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SANImpl extends MinimalEObjectImpl.Container implements SAN {
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
	protected SANImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.SAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentEList<Place>(Place.class, this, SANPackage.SAN__PLACES);
		}
		return places;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.SAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, SANPackage.SAN__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getGlobalVariables() {
		if (globalVariables == null) {
			globalVariables = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, SANPackage.SAN__GLOBAL_VARIABLES);
		}
		return globalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentEList<Arc>(Arc.class, this, SANPackage.SAN__ARCS);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, SANPackage.SAN__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getInitialization() {
		if (initialization == null) {
			initialization = new EObjectContainmentEList<Expression>(Expression.class, this, SANPackage.SAN__INITIALIZATION);
		}
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateModel templatize() {
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
			case SANPackage.SAN__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case SANPackage.SAN__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case SANPackage.SAN__GLOBAL_VARIABLES:
				return ((InternalEList<?>)getGlobalVariables()).basicRemove(otherEnd, msgs);
			case SANPackage.SAN__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case SANPackage.SAN__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
			case SANPackage.SAN__INITIALIZATION:
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
			case SANPackage.SAN__PLACES:
				return getPlaces();
			case SANPackage.SAN__NAME:
				return getName();
			case SANPackage.SAN__ACTIVITIES:
				return getActivities();
			case SANPackage.SAN__GLOBAL_VARIABLES:
				return getGlobalVariables();
			case SANPackage.SAN__ARCS:
				return getArcs();
			case SANPackage.SAN__GATES:
				return getGates();
			case SANPackage.SAN__INITIALIZATION:
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
			case SANPackage.SAN__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case SANPackage.SAN__NAME:
				setName((String)newValue);
				return;
			case SANPackage.SAN__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case SANPackage.SAN__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				getGlobalVariables().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case SANPackage.SAN__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case SANPackage.SAN__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Gate>)newValue);
				return;
			case SANPackage.SAN__INITIALIZATION:
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
			case SANPackage.SAN__PLACES:
				getPlaces().clear();
				return;
			case SANPackage.SAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SANPackage.SAN__ACTIVITIES:
				getActivities().clear();
				return;
			case SANPackage.SAN__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				return;
			case SANPackage.SAN__ARCS:
				getArcs().clear();
				return;
			case SANPackage.SAN__GATES:
				getGates().clear();
				return;
			case SANPackage.SAN__INITIALIZATION:
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
			case SANPackage.SAN__PLACES:
				return places != null && !places.isEmpty();
			case SANPackage.SAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SANPackage.SAN__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case SANPackage.SAN__GLOBAL_VARIABLES:
				return globalVariables != null && !globalVariables.isEmpty();
			case SANPackage.SAN__ARCS:
				return arcs != null && !arcs.isEmpty();
			case SANPackage.SAN__GATES:
				return gates != null && !gates.isEmpty();
			case SANPackage.SAN__INITIALIZATION:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SANPackage.SAN___TEMPLATIZE:
				return templatize();
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

} //SANImpl
