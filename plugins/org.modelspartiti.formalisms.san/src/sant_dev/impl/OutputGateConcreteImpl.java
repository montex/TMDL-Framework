/**
 */
package sant_dev.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Case;

import sant_dev.OutputGateConcrete;
import sant_dev.SANT_DEVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Gate Concrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.impl.OutputGateConcreteImpl#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputGateConcreteImpl extends OutputGateImpl implements OutputGateConcrete {
	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected Case case_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputGateConcreteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANT_DEVPackage.Literals.OUTPUT_GATE_CONCRETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case getCase() {
		if (case_ != null && case_.eIsProxy()) {
			InternalEObject oldCase = (InternalEObject)case_;
			case_ = (Case)eResolveProxy(oldCase);
			if (case_ != oldCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANT_DEVPackage.OUTPUT_GATE_CONCRETE__CASE, oldCase, case_));
			}
		}
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case basicGetCase() {
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCase(Case newCase) {
		Case oldCase = case_;
		case_ = newCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.OUTPUT_GATE_CONCRETE__CASE, oldCase, case_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANT_DEVPackage.OUTPUT_GATE_CONCRETE__CASE:
				if (resolve) return getCase();
				return basicGetCase();
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
			case SANT_DEVPackage.OUTPUT_GATE_CONCRETE__CASE:
				setCase((Case)newValue);
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
			case SANT_DEVPackage.OUTPUT_GATE_CONCRETE__CASE:
				setCase((Case)null);
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
			case SANT_DEVPackage.OUTPUT_GATE_CONCRETE__CASE:
				return case_ != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputGateConcreteImpl
