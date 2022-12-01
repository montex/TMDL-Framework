/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.CompItem#getItem <em>Item</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.CompItem#getBlock <em>Block</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.CompItem#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompItem()
 * @model
 * @generated
 */
public interface CompItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(ModelInterface)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompItem_Item()
	 * @model required="true"
	 * @generated
	 */
	ModelInterface getItem();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.CompItem#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(ModelInterface value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference.
	 * @see #setBlock(Block)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompItem_Block()
	 * @model
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.CompItem#getBlock <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' containment reference.
	 * @see #setIds(Multiplicity)
	 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage#getCompItem_Ids()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getIds();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.CompItem#getIds <em>Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ids</em>' containment reference.
	 * @see #getIds()
	 * @generated
	 */
	void setIds(Multiplicity value);

} // CompItem
