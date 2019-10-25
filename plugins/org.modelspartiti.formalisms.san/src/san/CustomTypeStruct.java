/**
 */
package san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Type Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.CustomTypeStruct#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getCustomTypeStruct()
 * @model
 * @generated
 */
public interface CustomTypeStruct extends CustomTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link san.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see san.SANPackage#getCustomTypeStruct_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Field> getField();

} // CustomTypeStruct
