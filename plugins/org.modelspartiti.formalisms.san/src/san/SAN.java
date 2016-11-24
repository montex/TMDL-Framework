/**
 */
package san;

import java.util.List;
import tmdl.core.ConcreteModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link san.SAN#getPlaces <em>Places</em>}</li>
 *   <li>{@link san.SAN#getName <em>Name</em>}</li>
 *   <li>{@link san.SAN#getActivities <em>Activities</em>}</li>
 *   <li>{@link san.SAN#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link san.SAN#getArcs <em>Arcs</em>}</li>
 *   <li>{@link san.SAN#getGates <em>Gates</em>}</li>
 *   <li>{@link san.SAN#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see san.SANPackage#getSAN()
 * @model
 * @generated
 */
public interface SAN extends ConcreteModel {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link san.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see san.SANPackage#getSAN_Places()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	List<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see san.SANPackage#getSAN_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link san.SAN#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link san.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see san.SANPackage#getSAN_Activities()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	List<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' containment reference list.
	 * The list contents are of type {@link san.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables</em>' containment reference list.
	 * @see san.SANPackage#getSAN_GlobalVariables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	List<GlobalVariable> getGlobalVariables();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link san.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see san.SANPackage#getSAN_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	List<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link san.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see san.SANPackage#getSAN_Gates()
	 * @model containment="true"
	 * @generated
	 */
	List<Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference list.
	 * The list contents are of type {@link san.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference list.
	 * @see san.SANPackage#getSAN_Initialization()
	 * @model containment="true"
	 * @generated
	 */
	List<Expression> getInitialization();

} // SAN
