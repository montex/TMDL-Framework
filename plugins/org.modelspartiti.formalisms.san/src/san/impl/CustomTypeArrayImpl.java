/**
 */
package san.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.CustomTypeArray;
import san.SANPackage;
import san.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.CustomTypeArrayImpl#getSize <em>Size</em>}</li>
 *   <li>{@link san.impl.CustomTypeArrayImpl#getName <em>Name</em>}</li>
 *   <li>{@link san.impl.CustomTypeArrayImpl#getTypeArray <em>Type Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomTypeArrayImpl extends CustomTypeDefinitionImpl implements CustomTypeArray {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeArray() <em>Type Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArray()
	 * @generated
	 * @ordered
	 */
	protected Type typeArray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.CUSTOM_TYPE_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.CUSTOM_TYPE_ARRAY__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.CUSTOM_TYPE_ARRAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTypeArray() {
		return typeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeArray(Type newTypeArray, NotificationChain msgs) {
		Type oldTypeArray = typeArray;
		typeArray = newTypeArray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY, oldTypeArray, newTypeArray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeArray(Type newTypeArray) {
		if (newTypeArray != typeArray) {
			NotificationChain msgs = null;
			if (typeArray != null)
				msgs = ((InternalEObject)typeArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY, null, msgs);
			if (newTypeArray != null)
				msgs = ((InternalEObject)newTypeArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY, null, msgs);
			msgs = basicSetTypeArray(newTypeArray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY, newTypeArray, newTypeArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY:
				return basicSetTypeArray(null, msgs);
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
			case SANPackage.CUSTOM_TYPE_ARRAY__SIZE:
				return getSize();
			case SANPackage.CUSTOM_TYPE_ARRAY__NAME:
				return getName();
			case SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY:
				return getTypeArray();
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
			case SANPackage.CUSTOM_TYPE_ARRAY__SIZE:
				setSize((Integer)newValue);
				return;
			case SANPackage.CUSTOM_TYPE_ARRAY__NAME:
				setName((String)newValue);
				return;
			case SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY:
				setTypeArray((Type)newValue);
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
			case SANPackage.CUSTOM_TYPE_ARRAY__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case SANPackage.CUSTOM_TYPE_ARRAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY:
				setTypeArray((Type)null);
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
			case SANPackage.CUSTOM_TYPE_ARRAY__SIZE:
				return size != SIZE_EDEFAULT;
			case SANPackage.CUSTOM_TYPE_ARRAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SANPackage.CUSTOM_TYPE_ARRAY__TYPE_ARRAY:
				return typeArray != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (size: ");
		result.append(size);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CustomTypeArrayImpl
