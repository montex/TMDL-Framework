/**
 */
package tmdl.core;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Parametric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.core.MultiplicityParametric#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.core.CorePackage#getMultiplicityParametric()
 * @model
 * @generated
 */
public interface MultiplicityParametric extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see tmdl.core.CorePackage#getMultiplicityParametric_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link tmdl.core.MultiplicityParametric#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif parameter.oclIsTypeOf(AssignmentSimple) then\n\t\t\t\t\tlet v =\tassignments->selectByType(AssignmentSimple)\n\t\t\t\t\t\t\t\t->select(a | a.oclAsType(AssignmentSimple).parameter = self.parameter)\n\t\t\t\t\t\t\t\t->asSequence()->first().oclAsType(AssignmentSimple).value\n\t\t\t\t\tin\n\t\t\t\t\tif v = 0 then Sequence{} else Sequence{1..v} endif\n\t\t\t\telse\n\t\t\t\t\tassignments->selectByType(AssignmentArray)\n\t\t\t\t\t\t\t\t->select(a | a.oclAsType(AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t\t\t\t->asSequence()->first().oclAsType(AssignmentArray).values\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Integer> asSequence(EList<Assignment> assignments);

} // MultiplicityParametric
