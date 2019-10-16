/**
 */
package san;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.ExtendedTypeDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getExtendedTypeDefinition()
 * @model abstract="true"
 * @generated
 */
public interface ExtendedTypeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link san.ExtendedPlaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see san.ExtendedPlaceType
	 * @see #setType(ExtendedPlaceType)
	 * @see san.SANPackage#getExtendedTypeDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	ExtendedPlaceType getType();

	/**
	 * Sets the value of the '{@link san.ExtendedTypeDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see san.ExtendedPlaceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExtendedPlaceType value);

} // ExtendedTypeDefinition
