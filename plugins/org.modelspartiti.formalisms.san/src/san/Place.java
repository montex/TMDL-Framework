/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.Place#isIsExtended <em>Is Extended</em>}</li>
 *   <li>{@link san.Place#getType <em>Type</em>}</li>
 *   <li>{@link san.Place#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended</em>' attribute.
	 * @see san.SANPackage#getPlace_IsExtended()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='type.oclIsTypeOf(ComplexType) or (type.oclIsTypeOf(PrimitiveType) and type.oclAsType(PrimitiveType).type &lt;&gt; ExtendedPlaceType::short)'"
	 * @generated
	 */
	boolean isIsExtended();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see san.SANPackage#getPlace_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link san.Place#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(Marking)
	 * @see san.SANPackage#getPlace_Marking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Marking getMarking();

	/**
	 * Sets the value of the '{@link san.Place#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(Marking value);

} // Place
