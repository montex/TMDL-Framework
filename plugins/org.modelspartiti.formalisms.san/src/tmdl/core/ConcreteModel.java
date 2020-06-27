/**
 */
package tmdl.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.core.CorePackage#getConcreteModel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConcreteModel extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	TemplateModel templatize();

} // ConcreteModel
