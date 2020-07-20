/**
 */
package org.modelspartiti.infrastructure.tmdl.scenario.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelspartiti.infrastructure.tmdl.library.Block;

import org.modelspartiti.infrastructure.tmdl.scenario.BlockRealization;
import org.modelspartiti.infrastructure.tmdl.scenario.ScenarioPackage;
import org.modelspartiti.infrastructure.tmdl.scenario.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.scenario.impl.BlockRealizationImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.scenario.impl.BlockRealizationImpl#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockRealizationImpl extends MinimalEObjectImpl.Container implements BlockRealization {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block block;

	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected Variant variant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.BLOCK_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block getBlock() {
		if (block != null && block.eIsProxy()) {
			InternalEObject oldBlock = (InternalEObject)block;
			block = (Block)eResolveProxy(oldBlock);
			if (block != oldBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.BLOCK_REALIZATION__BLOCK, oldBlock, block));
			}
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlock(Block newBlock) {
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.BLOCK_REALIZATION__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant getVariant() {
		if (variant != null && variant.eIsProxy()) {
			InternalEObject oldVariant = (InternalEObject)variant;
			variant = (Variant)eResolveProxy(oldVariant);
			if (variant != oldVariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.BLOCK_REALIZATION__VARIANT, oldVariant, variant));
			}
		}
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant basicGetVariant() {
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariant(Variant newVariant) {
		Variant oldVariant = variant;
		variant = newVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.BLOCK_REALIZATION__VARIANT, oldVariant, variant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.BLOCK_REALIZATION__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
			case ScenarioPackage.BLOCK_REALIZATION__VARIANT:
				if (resolve) return getVariant();
				return basicGetVariant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenarioPackage.BLOCK_REALIZATION__BLOCK:
				setBlock((Block)newValue);
				return;
			case ScenarioPackage.BLOCK_REALIZATION__VARIANT:
				setVariant((Variant)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScenarioPackage.BLOCK_REALIZATION__BLOCK:
				setBlock((Block)null);
				return;
			case ScenarioPackage.BLOCK_REALIZATION__VARIANT:
				setVariant((Variant)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScenarioPackage.BLOCK_REALIZATION__BLOCK:
				return block != null;
			case ScenarioPackage.BLOCK_REALIZATION__VARIANT:
				return variant != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockRealizationImpl
