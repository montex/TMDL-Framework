/**
 */
package sant;

import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.Expression#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link sant.ExpressionSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see sant.SANTPackage#getExpression_Segments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<ExpressionSegment> getSegments();

} // Expression
