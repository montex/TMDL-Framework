/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Block#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Block#getRef <em>Ref</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Block#getMult <em>Mult</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Block#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.Block#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlock_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Block#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(TemplateSpecification)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlock_Ref()
	 * @model required="true"
	 * @generated
	 */
	TemplateSpecification getRef();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Block#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(TemplateSpecification value);

	/**
	 * Returns the value of the '<em><b>Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult</em>' containment reference.
	 * @see #setMult(Multiplicity)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlock_Mult()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getMult();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.Block#getMult <em>Mult</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult</em>' containment reference.
	 * @see #getMult()
	 * @generated
	 */
	void setMult(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlock_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.modelspartiti.infrastructure.tmdl.ModelInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlock_Interfaces()
	 * @model
	 * @generated
	 */
	EList<ModelInterface> getInterfaces();

} // Block
