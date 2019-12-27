/**
 */
package sant_dev.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Expression;

import sant_dev.CasesSpecificationValue;
import sant_dev.SANT_DEVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cases Specification Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.impl.CasesSpecificationValueImpl#getId <em>Id</em>}</li>
 *   <li>{@link sant_dev.impl.CasesSpecificationValueImpl#getP <em>P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasesSpecificationValueImpl extends CasesSpecificationImpl implements CasesSpecificationValue {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected Expression p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANT_DEVPackage.Literals.CASES_SPECIFICATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_VALUE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(Expression newP, NotificationChain msgs) {
		Expression oldP = p;
		p = newP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P, oldP, newP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(Expression newP) {
		if (newP != p) {
			NotificationChain msgs = null;
			if (p != null)
				msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P, null, msgs);
			if (newP != null)
				msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P, null, msgs);
			msgs = basicSetP(newP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P, newP, newP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P:
				return basicSetP(null, msgs);
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
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__ID:
				return getId();
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P:
				return getP();
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
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__ID:
				setId((Integer)newValue);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P:
				setP((Expression)newValue);
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
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__ID:
				setId(ID_EDEFAULT);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P:
				setP((Expression)null);
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
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__ID:
				return id != ID_EDEFAULT;
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE__P:
				return p != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CasesSpecificationValueImpl
