/**
 */
package sant_dev;

import org.eclipse.emf.common.util.EList;
import san.NamedElement;
import san.Place;
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
 *   <li>{@link sant_dev.PlaceTemplate#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getPlaceTemplate()
 * @model
 * @generated
 */
public interface PlaceTemplate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see sant_dev.SANT_DEVPackage#getPlaceTemplate_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link sant_dev.PlaceTemplate#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	EList<Place> generatedPlace(Multiplicity multiplicity);

} // PlaceTemplate
