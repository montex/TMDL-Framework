/**
 */
package org.modelspartiti.formalisms.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.PrimitiveType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.SANPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelspartiti.formalisms.san.ExtendedPlaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.modelspartiti.formalisms.san.ExtendedPlaceType
	 * @see #setType(ExtendedPlaceType)
	 * @see org.modelspartiti.formalisms.san.SANPackage#getPrimitiveType_Type()
	 * @model required="true"
	 * @generated
	 */
	ExtendedPlaceType getType();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.PrimitiveType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.modelspartiti.formalisms.san.ExtendedPlaceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExtendedPlaceType value);

} // PrimitiveType
