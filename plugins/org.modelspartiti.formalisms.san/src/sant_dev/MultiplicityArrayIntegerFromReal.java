/**
 */
package sant_dev;

import org.eclipse.emf.common.util.EList;

import tmdl.core.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Array Integer From Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.MultiplicityArrayIntegerFromReal#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see sant_dev.SANT_DEVPackage#getMultiplicityArrayIntegerFromReal()
 * @model
 * @generated
 */
public interface MultiplicityArrayIntegerFromReal extends Multiplicity {
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
	 * @see sant_dev.SANT_DEVPackage#getMultiplicityArrayIntegerFromReal_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<Double> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> convertDoubleToInt();

} // MultiplicityArrayIntegerFromReal
