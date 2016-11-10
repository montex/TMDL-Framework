/**
 */
package tmdl.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.core.MultiplicityValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.core.CorePackage#getMultiplicityValue()
 * @model
 * @generated
 */
public interface MultiplicityValue extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see tmdl.core.CorePackage#getMultiplicityValue_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link tmdl.core.MultiplicityValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model assignmentsMany="true" assignmentsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif value = 0 then Sequence{}\n\t\t\t\telse Sequence{1..value} endif'"
	 * @generated
	 */
	EList<Integer> asSequence(EList<Assignment> assignments);

} // MultiplicityValue
