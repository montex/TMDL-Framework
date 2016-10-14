/**
 */
package tmdl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.library.MultiplicityArray#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.library.LibraryPackage#getMultiplicityArray()
 * @model
 * @generated
 */
public interface MultiplicityArray extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see tmdl.library.LibraryPackage#getMultiplicityArray_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<Double> getValues();

} // MultiplicityArray
