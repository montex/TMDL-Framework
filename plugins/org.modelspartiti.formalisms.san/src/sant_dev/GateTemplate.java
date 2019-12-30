/**
 */
package sant_dev;

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
 *   <li>{@link sant_dev.GateTemplate#getPlaceTemplate <em>Place Template</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getGateTemplate()
 * @model abstract="true"
 * @generated
 */
public interface GateTemplate extends Gate {
	/**
	 * Returns the value of the '<em><b>Place Template</b></em>' reference list.
	 * The list contents are of type {@link sant_dev.PlaceTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Template</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Template</em>' reference list.
	 * @see sant_dev.SANT_DEVPackage#getGateTemplate_PlaceTemplate()
	 * @model required="true"
	 * @generated
	 */
	EList<PlaceTemplate> getPlaceTemplate();

} // GateTemplate
