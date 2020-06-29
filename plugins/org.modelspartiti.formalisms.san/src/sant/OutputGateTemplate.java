/**
 */
package sant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.OutputGateTemplate#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getOutputGateTemplate()
 * @model
 * @generated
 */
public interface OutputGateTemplate extends OutputGate {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link sant.ActivityTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see sant.SANTPackage#getOutputGateTemplate_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<ActivityTemplate> getActivity();

} // OutputGateTemplate
