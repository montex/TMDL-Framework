/**
 */
package sant_dev.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import san.Expression;

import sant_dev.CasesSpecificationArray;
import sant_dev.SANT_DEVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cases Specification Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.impl.CasesSpecificationArrayImpl#getNumCases <em>Num Cases</em>}</li>
 *   <li>{@link sant_dev.impl.CasesSpecificationArrayImpl#getP <em>P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasesSpecificationArrayImpl extends CasesSpecificationImpl implements CasesSpecificationArray {
	/**
	 * The default value of the '{@link #getNumCases() <em>Num Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCases()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_CASES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumCases() <em>Num Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCases()
	 * @generated
	 * @ordered
	 */
	protected int numCases = NUM_CASES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANT_DEVPackage.Literals.CASES_SPECIFICATION_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumCases() {
		return numCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCases(int newNumCases) {
		int oldNumCases = numCases;
		numCases = newNumCases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__NUM_CASES, oldNumCases, numCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getP() {
		if (p == null) {
			p = new EObjectContainmentEList<Expression>(Expression.class, this, SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__P);
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
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
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__NUM_CASES:
				return getNumCases();
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__P:
				return getP();
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
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__NUM_CASES:
				setNumCases((Integer)newValue);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__P:
				getP().clear();
				getP().addAll((Collection<? extends Expression>)newValue);
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
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__NUM_CASES:
				setNumCases(NUM_CASES_EDEFAULT);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__P:
				getP().clear();
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
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__NUM_CASES:
				return numCases != NUM_CASES_EDEFAULT;
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY__P:
				return p != null && !p.isEmpty();
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
		result.append(" (numCases: ");
		result.append(numCases);
		result.append(')');
		return result.toString();
	}

} //CasesSpecificationArrayImpl
