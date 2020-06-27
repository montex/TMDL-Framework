/**
 */
package tmdl.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.core.CorePackage#getTemplateModel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TemplateModel extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" parameterValuesMany="true"
	 * @generated
	 */
	ConcreteModel concretize(EList<Assignment> parameterValues);

} // TemplateModel
