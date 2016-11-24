/**
 */
package tmdl.scenario;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import tmdl.core.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.scenario.Variant#getName <em>Name</em>}</li>
 *   <li>{@link tmdl.scenario.Variant#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.scenario.ScenarioPackage#getVariant()
 * @model abstract="true"
 * @generated
 */
public interface Variant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tmdl.scenario.ScenarioPackage#getVariant_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tmdl.scenario.Variant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link tmdl.core.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see tmdl.scenario.ScenarioPackage#getVariant_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	List<Assignment> getAssignments();

} // Variant
