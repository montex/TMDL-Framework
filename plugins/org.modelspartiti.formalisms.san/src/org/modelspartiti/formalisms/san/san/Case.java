/**
 */
package org.modelspartiti.formalisms.san.san;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Case#getID <em>ID</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Case#getP <em>P</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getCase_ID()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Case#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getCase_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getP();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Case#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(Expression value);

} // Case
