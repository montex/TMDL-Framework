/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pareto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.Pareto#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link sant.Pareto#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getPareto()
 * @model
 * @generated
 */
public interface Pareto extends Distribution {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(Expression)
	 * @see sant.SANTPackage#getPareto_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLowerBound();

	/**
	 * Sets the value of the '{@link sant.Pareto#getLowerBound <em>Lower Bound</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(Expression)
	 * @see sant.SANTPackage#getPareto_Shape()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getShape();

	/**
	 * Sets the value of the '{@link sant.Pareto#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Expression value);

} // Pareto
