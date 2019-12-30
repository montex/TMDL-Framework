/**
 */
package sant_dev;

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
 *   <li>{@link sant_dev.OutputGateTemplate#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getOutputGateTemplate()
 * @model
 * @generated
 */
public interface OutputGateTemplate extends OutputGate {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link sant_dev.ActivityTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see sant_dev.SANT_DEVPackage#getOutputGateTemplate_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<ActivityTemplate> getActivity();

} // OutputGateTemplate
