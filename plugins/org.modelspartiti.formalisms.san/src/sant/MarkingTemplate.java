/**
 */
package sant;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.MarkingTemplate#getIdPlace <em>Id Place</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getMarkingTemplate()
 * @model abstract="true"
 * @generated
 */
public interface MarkingTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Place</em>' attribute.
	 * @see #setIdPlace(int)
	 * @see sant.SANTPackage#getMarkingTemplate_IdPlace()
	 * @model required="true"
	 * @generated
	 */
	int getIdPlace();

	/**
	 * Sets the value of the '{@link sant.MarkingTemplate#getIdPlace <em>Id Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Place</em>' attribute.
	 * @see #getIdPlace()
	 * @generated
	 */
	void setIdPlace(int value);

} // MarkingTemplate
