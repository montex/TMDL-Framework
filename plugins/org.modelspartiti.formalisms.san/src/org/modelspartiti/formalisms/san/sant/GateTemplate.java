/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.formalisms.san.san.Gate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.GateTemplate#getPlaceTemplate <em>Place Template</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getGateTemplate()
 * @model abstract="true"
 * @generated
 */
public interface GateTemplate extends Gate {
	/**
	 * Returns the value of the '<em><b>Place Template</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.formalisms.san.sant.PlaceTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Template</em>' reference list.
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getGateTemplate_PlaceTemplate()
	 * @model required="true"
	 * @generated
	 */
	EList<PlaceTemplate> getPlaceTemplate();

} // GateTemplate
