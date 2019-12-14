/**
 */
package sant_dev;

import org.eclipse.emf.common.util.EList;

import san.CustomTypeDefinition;
import san.GlobalVariable;
import san.Place;
import tmdl.core.Parameter;
import tmdl.core.TemplateModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SANT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.SANT#getName <em>Name</em>}</li>
 *   <li>{@link sant_dev.SANT#getTemplatePlaces <em>Template Places</em>}</li>
 *   <li>{@link sant_dev.SANT#getPlace <em>Place</em>}</li>
 *   <li>{@link sant_dev.SANT#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sant_dev.SANT#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link sant_dev.SANT#getCustomType <em>Custom Type</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getSANT()
 * @model
 * @generated
 */
public interface SANT extends TemplateModel {
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
	 * @see sant_dev.SANT_DEVPackage#getSANT_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sant_dev.SANT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Template Places</b></em>' containment reference list.
	 * The list contents are of type {@link sant_dev.PlaceTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Places</em>' containment reference list.
	 * @see sant_dev.SANT_DEVPackage#getSANT_TemplatePlaces()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<PlaceTemplate> getTemplatePlaces();

	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference list.
	 * The list contents are of type {@link san.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference list.
	 * @see sant_dev.SANT_DEVPackage#getSANT_Place()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlace();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see sant_dev.SANT_DEVPackage#getSANT_Parameters()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Parameter> getParameters();

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
	 * @see sant_dev.SANT_DEVPackage#getSANT_GlobalVariables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<GlobalVariable> getGlobalVariables();

	/**
	 * Returns the value of the '<em><b>Custom Type</b></em>' containment reference list.
	 * The list contents are of type {@link san.CustomTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Type</em>' containment reference list.
	 * @see sant_dev.SANT_DEVPackage#getSANT_CustomType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomTypeDefinition> getCustomType();

} // SANT
