/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMDL Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TMDLSpecification#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.TMDLSpecification#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTMDLSpecification()
 * @model
 * @generated
 */
public interface TMDLSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(Library)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTMDLSpecification_Library()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.TMDLSpecification#getLibrary <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' containment reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference.
	 * @see #setScenario(Scenario)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getTMDLSpecification_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.TMDLSpecification#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

} // TMDLSpecification
