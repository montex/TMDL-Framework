/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelspartiti.infrastructure.tmdl.Block;
import org.modelspartiti.infrastructure.tmdl.BlockRealization;
import org.modelspartiti.infrastructure.tmdl.Multiplicity;
import org.modelspartiti.infrastructure.tmdl.Variant;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.BlockRealizationImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.BlockRealizationImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.BlockRealizationImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockRealizationImpl extends MinimalEObjectImpl.Container implements BlockRealization {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Variant ref;

	/**
	 * The cached value of the '{@link #getMult() <em>Mult</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMult()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity mult;

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
		return tmdlPackage.Literals.BLOCK_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Variant)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmdlPackage.BLOCK_REALIZATION__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(Variant newRef) {
		Variant oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.BLOCK_REALIZATION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMult() {
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMult(Multiplicity newMult, NotificationChain msgs) {
		Multiplicity oldMult = mult;
		mult = newMult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tmdlPackage.BLOCK_REALIZATION__MULT, oldMult, newMult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMult(Multiplicity newMult) {
		if (newMult != mult) {
			NotificationChain msgs = null;
			if (mult != null)
				msgs = ((InternalEObject)mult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tmdlPackage.BLOCK_REALIZATION__MULT, null, msgs);
			if (newMult != null)
				msgs = ((InternalEObject)newMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tmdlPackage.BLOCK_REALIZATION__MULT, null, msgs);
			msgs = basicSetMult(newMult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.BLOCK_REALIZATION__MULT, newMult, newMult));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmdlPackage.BLOCK_REALIZATION__BLOCK, oldBlock, block));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.BLOCK_REALIZATION__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmdlPackage.BLOCK_REALIZATION__MULT:
				return basicSetMult(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmdlPackage.BLOCK_REALIZATION__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case tmdlPackage.BLOCK_REALIZATION__MULT:
				return getMult();
			case tmdlPackage.BLOCK_REALIZATION__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
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
			case tmdlPackage.BLOCK_REALIZATION__REF:
				setRef((Variant)newValue);
				return;
			case tmdlPackage.BLOCK_REALIZATION__MULT:
				setMult((Multiplicity)newValue);
				return;
			case tmdlPackage.BLOCK_REALIZATION__BLOCK:
				setBlock((Block)newValue);
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
			case tmdlPackage.BLOCK_REALIZATION__REF:
				setRef((Variant)null);
				return;
			case tmdlPackage.BLOCK_REALIZATION__MULT:
				setMult((Multiplicity)null);
				return;
			case tmdlPackage.BLOCK_REALIZATION__BLOCK:
				setBlock((Block)null);
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
			case tmdlPackage.BLOCK_REALIZATION__REF:
				return ref != null;
			case tmdlPackage.BLOCK_REALIZATION__MULT:
				return mult != null;
			case tmdlPackage.BLOCK_REALIZATION__BLOCK:
				return block != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockRealizationImpl
