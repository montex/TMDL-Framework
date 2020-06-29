/**
 */
package sant;

import org.eclipse.emf.common.util.EList;

import san.NamedElement;

import tmdl.core.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.PlaceTemplate#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link sant.PlaceTemplate#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getPlaceTemplate()
 * @model
 * @generated
 */
public interface PlaceTemplate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see sant.SANTPackage#getPlaceTemplate_Multiplicity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link sant.PlaceTemplate#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference list.
	 * The list contents are of type {@link sant.MarkingTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference list.
	 * @see sant.SANTPackage#getPlaceTemplate_Marking()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkingTemplate> getMarking();

} // PlaceTemplate
