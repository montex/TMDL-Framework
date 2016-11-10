/**
 */
package sant;

import org.eclipse.emf.common.util.EList;
import tmdl.core.Assignment;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet mult = place.multiplicity \n\t\t\tin\n\t\t\t\tif mult.oclIsTypeOf(tmdl::core::MultiplicityValue) then\n\t\t\t\t\tmult.oclAsType(tmdl::core::MultiplicityValue).value.floor()\n\t\t\t\telse\n\t\t\t\t\tif mult.oclIsTypeOf(tmdl::core::MultiplicityArray) then\n\t\t\t\t\t\tmult.oclAsType(tmdl::core::MultiplicityArray).values->size()\n\t\t\t\t\telse\n\t\t\t\t\t\tlet par = mult.oclAsType(tmdl::core::MultiplicityParametric).parameter\n\t\t\t\t\t\tin\n\t\t\t\t\t\t\tif par.oclIsTypeOf(tmdl::core::ParameterSimple) then\n\t\t\t\t\t\t\t\tassignments->select(a | a.oclIsTypeOf(tmdl::core::AssignmentSimple))\n\t\t\t\t\t\t\t\t\t->collect(as | as.oclAsType(tmdl::core::AssignmentSimple))\n\t\t\t\t\t\t\t\t\t->select(i | i.parameter = par)\n\t\t\t\t\t\t\t\t\t->asSequence()->first().value\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tassignments->select(a | a.oclIsTypeOf(tmdl::core::AssignmentArray))\n\t\t\t\t\t\t\t\t\t->collect(as | as.oclAsType(tmdl::core::AssignmentArray))\n\t\t\t\t\t\t\t\t\t->select(i | i.parameter = par)\n\t\t\t\t\t\t\t\t\t->asSequence()->first().values->size()\n\t\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	int evaluate(EList<Assignment> assignments);

} // ExpressionPlaceTemplateSize
