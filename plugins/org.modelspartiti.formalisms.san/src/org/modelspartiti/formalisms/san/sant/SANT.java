/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.formalisms.san.san.CustomTypeDefinition;
import org.modelspartiti.formalisms.san.san.GlobalVariable;
import org.modelspartiti.formalisms.san.san.Place;

import org.modelspartiti.infrastructure.tmdl.core.Parameter;
import org.modelspartiti.infrastructure.tmdl.core.TemplateModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SANT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getTemplatePlaces <em>Template Places</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getPlaces <em>Places</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getActivityTemplates <em>Activity Templates</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getGates <em>Gates</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.SANT#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT()
 * @model
 * @generated
 */
public interface SANT extends TemplateModel {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.SANT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Template Places</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.sant.PlaceTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Places</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_TemplatePlaces()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<PlaceTemplate> getTemplatePlaces();

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Activity Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.sant.ActivityTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Templates</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_ActivityTemplates()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ActivityTemplate> getActivityTemplates();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_Parameters()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_GlobalVariables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<GlobalVariable> getGlobalVariables();

	/**
	 * Returns the value of the '<em><b>Custom Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.CustomTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Type</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_CustomType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomTypeDefinition> getCustomType();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.sant.GateTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<GateTemplate> getGates();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.sant.ArcTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getSANT_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArcTemplate> getArcs();

} // SANT
