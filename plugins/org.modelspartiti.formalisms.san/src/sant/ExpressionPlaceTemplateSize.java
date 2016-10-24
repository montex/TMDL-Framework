/**
 */
package sant;

import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Place Template Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.ExpressionPlaceTemplateSize#getPlace <em>Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExpressionPlaceTemplateSize()
 * @model
 * @generated
 */
public interface ExpressionPlaceTemplateSize extends ExpressionSegment, TemplateExpressionInteger {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see sant.SANTPackage#getExpressionPlaceTemplateSize_Place()
	 * @model required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link sant.ExpressionPlaceTemplateSize#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // ExpressionPlaceTemplateSize
