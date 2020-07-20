/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Gate#getFunction <em>Function</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Gate#getPlaces <em>Places</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getGate()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Gate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getGate_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFunction();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Gate#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Expression value);

	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.san.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getGate_Places()
	 * @model required="true"
	 * @generated
	 */
	EList<Place> getPlaces();

} // Gate
