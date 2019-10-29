/**
 */
package san.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import san.LeafNode;
import san.MarkingExtended;
import san.Node;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marking Extended</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.MarkingExtendedImpl#getNode <em>Node</em>}</li>
 *   <li>{@link san.impl.MarkingExtendedImpl#getLeafnode <em>Leafnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkingExtendedImpl extends MarkingImpl implements MarkingExtended {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;
	/**
	 * The cached value of the '{@link #getLeafnode() <em>Leafnode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeafnode()
	 * @generated
	 * @ordered
	 */
	protected LeafNode leafnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkingExtendedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.MARKING_EXTENDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, SANPackage.MARKING_EXTENDED__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafNode getLeafnode() {
		return leafnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeafnode(LeafNode newLeafnode, NotificationChain msgs) {
		LeafNode oldLeafnode = leafnode;
		leafnode = newLeafnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.MARKING_EXTENDED__LEAFNODE, oldLeafnode, newLeafnode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeafnode(LeafNode newLeafnode) {
		if (newLeafnode != leafnode) {
			NotificationChain msgs = null;
			if (leafnode != null)
				msgs = ((InternalEObject)leafnode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.MARKING_EXTENDED__LEAFNODE, null, msgs);
			if (newLeafnode != null)
				msgs = ((InternalEObject)newLeafnode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.MARKING_EXTENDED__LEAFNODE, null, msgs);
			msgs = basicSetLeafnode(newLeafnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.MARKING_EXTENDED__LEAFNODE, newLeafnode, newLeafnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.MARKING_EXTENDED__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case SANPackage.MARKING_EXTENDED__LEAFNODE:
				return basicSetLeafnode(null, msgs);
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
			case SANPackage.MARKING_EXTENDED__NODE:
				return getNode();
			case SANPackage.MARKING_EXTENDED__LEAFNODE:
				return getLeafnode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SANPackage.MARKING_EXTENDED__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case SANPackage.MARKING_EXTENDED__LEAFNODE:
				setLeafnode((LeafNode)newValue);
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
			case SANPackage.MARKING_EXTENDED__NODE:
				getNode().clear();
				return;
			case SANPackage.MARKING_EXTENDED__LEAFNODE:
				setLeafnode((LeafNode)null);
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
			case SANPackage.MARKING_EXTENDED__NODE:
				return node != null && !node.isEmpty();
			case SANPackage.MARKING_EXTENDED__LEAFNODE:
				return leafnode != null;
		}
		return super.eIsSet(featureID);
	}

} //MarkingExtendedImpl
