/**
 */
package org.modelspartiti.formalisms.san.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pareto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Pareto#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.Pareto#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getPareto()
 * @model
 * @generated
 */
public interface Pareto extends Distribution {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getPareto_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLowerBound();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Pareto#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Expression value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getPareto_Shape()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getShape();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.Pareto#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Expression value);

} // Pareto
