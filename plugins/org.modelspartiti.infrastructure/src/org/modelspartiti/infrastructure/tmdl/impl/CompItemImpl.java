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
import org.modelspartiti.infrastructure.tmdl.CompItem;
import org.modelspartiti.infrastructure.tmdl.ModelInterface;
import org.modelspartiti.infrastructure.tmdl.Multiplicity;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.CompItemImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.CompItemImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.CompItemImpl#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompItemImpl extends MinimalEObjectImpl.Container implements CompItem {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected ModelInterface item;

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
	 * The cached value of the '{@link #getIds() <em>Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity ids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmdlPackage.Literals.COMP_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelInterface getItem() {
		if (item != null && item.eIsProxy()) {
			InternalEObject oldItem = (InternalEObject)item;
			item = (ModelInterface)eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmdlPackage.COMP_ITEM__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelInterface basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItem(ModelInterface newItem) {
		ModelInterface oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.COMP_ITEM__ITEM, oldItem, item));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmdlPackage.COMP_ITEM__BLOCK, oldBlock, block));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.COMP_ITEM__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getIds() {
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIds(Multiplicity newIds, NotificationChain msgs) {
		Multiplicity oldIds = ids;
		ids = newIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tmdlPackage.COMP_ITEM__IDS, oldIds, newIds);
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
	public void setIds(Multiplicity newIds) {
		if (newIds != ids) {
			NotificationChain msgs = null;
			if (ids != null)
				msgs = ((InternalEObject)ids).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tmdlPackage.COMP_ITEM__IDS, null, msgs);
			if (newIds != null)
				msgs = ((InternalEObject)newIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tmdlPackage.COMP_ITEM__IDS, null, msgs);
			msgs = basicSetIds(newIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.COMP_ITEM__IDS, newIds, newIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmdlPackage.COMP_ITEM__IDS:
				return basicSetIds(null, msgs);
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
			case tmdlPackage.COMP_ITEM__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case tmdlPackage.COMP_ITEM__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
			case tmdlPackage.COMP_ITEM__IDS:
				return getIds();
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
			case tmdlPackage.COMP_ITEM__ITEM:
				setItem((ModelInterface)newValue);
				return;
			case tmdlPackage.COMP_ITEM__BLOCK:
				setBlock((Block)newValue);
				return;
			case tmdlPackage.COMP_ITEM__IDS:
				setIds((Multiplicity)newValue);
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
			case tmdlPackage.COMP_ITEM__ITEM:
				setItem((ModelInterface)null);
				return;
			case tmdlPackage.COMP_ITEM__BLOCK:
				setBlock((Block)null);
				return;
			case tmdlPackage.COMP_ITEM__IDS:
				setIds((Multiplicity)null);
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
			case tmdlPackage.COMP_ITEM__ITEM:
				return item != null;
			case tmdlPackage.COMP_ITEM__BLOCK:
				return block != null;
			case tmdlPackage.COMP_ITEM__IDS:
				return ids != null;
		}
		return super.eIsSet(featureID);
	}

} //CompItemImpl
