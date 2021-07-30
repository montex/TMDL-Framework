/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getRef <em>Ref</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getMult <em>Mult</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlockRealization()
 * @model
 * @generated
 */
public interface BlockRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Variant)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlockRealization_Ref()
	 * @model required="true"
	 * @generated
	 */
	Variant getRef();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Variant value);

	/**
	 * Returns the value of the '<em><b>Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult</em>' containment reference.
	 * @see #setMult(Multiplicity)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlockRealization_Mult()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getMult();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getMult <em>Mult</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult</em>' containment reference.
	 * @see #getMult()
	 * @generated
	 */
	void setMult(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference.
	 * @see #setBlock(Block)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getBlockRealization_Block()
	 * @model required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.BlockRealization#getBlock <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

} // BlockRealization
