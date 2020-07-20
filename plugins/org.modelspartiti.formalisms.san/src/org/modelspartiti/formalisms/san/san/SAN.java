/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.infrastructure.tmdl.core.ConcreteModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.SAN#getPlaces <em>Places</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.SAN#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.SAN#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.SAN#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.SAN#getArcs <em>Arcs</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.SAN#getGates <em>Gates</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.SAN#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.SAN#getCustomtype <em>Customtype</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN()
 * @model
 * @generated
 */
public interface SAN extends ConcreteModel {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN_Places()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.SAN#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN_Activities()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN_GlobalVariables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<GlobalVariable> getGlobalVariables();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN_Gates()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN_Initialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getInitialization();

	/**
	 * Returns the value of the '<em><b>Customtype</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.CustomTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customtype</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getSAN_Customtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomTypeDefinition> getCustomtype();

} // SAN
