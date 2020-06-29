/**
 */
package sant;

import org.eclipse.emf.common.util.EList;

import san.Gate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.GateTemplate#getPlaceTemplate <em>Place Template</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getGateTemplate()
 * @model abstract="true"
 * @generated
 */
public interface GateTemplate extends Gate {
	/**
	 * Returns the value of the '<em><b>Place Template</b></em>' reference list.
	 * The list contents are of type {@link sant.PlaceTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Template</em>' reference list.
	 * @see sant.SANTPackage#getGateTemplate_PlaceTemplate()
	 * @model required="true"
	 * @generated
	 */
	EList<PlaceTemplate> getPlaceTemplate();

} // GateTemplate
