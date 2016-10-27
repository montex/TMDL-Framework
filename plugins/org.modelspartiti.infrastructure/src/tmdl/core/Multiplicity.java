/**
 */
package tmdl.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tmdl.core.CorePackage#getMultiplicity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Multiplicity extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='asSequence(Assignment.allInstances())'"
	 * @generated
	 */
	EList<Integer> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model assignmentsMany="true" assignmentsOrdered="false"
	 * @generated
	 */
	EList<Integer> asSequence(EList<Assignment> assignments);
} // Multiplicity
