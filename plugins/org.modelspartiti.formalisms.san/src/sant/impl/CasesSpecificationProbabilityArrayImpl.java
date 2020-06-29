/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sant.CasesSpecificationProbabilityArray;
import sant.SANTPackage;

import tmdl.core.Parameter;
import tmdl.core.ParameterArray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cases Specification Probability Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant.impl.CasesSpecificationProbabilityArrayImpl#getCaseParameter <em>Case Parameter</em>}</li>
 *   <li>{@link sant.impl.CasesSpecificationProbabilityArrayImpl#getPValues <em>PValues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasesSpecificationProbabilityArrayImpl extends CasesSpecificationImpl implements CasesSpecificationProbabilityArray {
	/**
	 * The cached value of the '{@link #getCaseParameter() <em>Case Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter caseParameter;

	/**
	 * The cached value of the '{@link #getPValues() <em>PValues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPValues()
	 * @generated
	 * @ordered
	 */
	protected ParameterArray pValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationProbabilityArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.CASES_SPECIFICATION_PROBABILITY_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getCaseParameter() {
		if (caseParameter != null && caseParameter.eIsProxy()) {
			InternalEObject oldCaseParameter = (InternalEObject)caseParameter;
			caseParameter = (Parameter)eResolveProxy(oldCaseParameter);
			if (caseParameter != oldCaseParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__CASE_PARAMETER, oldCaseParameter, caseParameter));
			}
		}
		return caseParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetCaseParameter() {
		return caseParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseParameter(Parameter newCaseParameter) {
		Parameter oldCaseParameter = caseParameter;
		caseParameter = newCaseParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__CASE_PARAMETER, oldCaseParameter, caseParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterArray getPValues() {
		if (pValues != null && pValues.eIsProxy()) {
			InternalEObject oldPValues = (InternalEObject)pValues;
			pValues = (ParameterArray)eResolveProxy(oldPValues);
			if (pValues != oldPValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES, oldPValues, pValues));
			}
		}
		return pValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterArray basicGetPValues() {
		return pValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPValues(ParameterArray newPValues) {
		ParameterArray oldPValues = pValues;
		pValues = newPValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES, oldPValues, pValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__CASE_PARAMETER:
				if (resolve) return getCaseParameter();
				return basicGetCaseParameter();
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES:
				if (resolve) return getPValues();
				return basicGetPValues();
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
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__CASE_PARAMETER:
				setCaseParameter((Parameter)newValue);
				return;
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES:
				setPValues((ParameterArray)newValue);
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
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__CASE_PARAMETER:
				setCaseParameter((Parameter)null);
				return;
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES:
				setPValues((ParameterArray)null);
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
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__CASE_PARAMETER:
				return caseParameter != null;
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY__PVALUES:
				return pValues != null;
		}
		return super.eIsSet(featureID);
	}

} //CasesSpecificationProbabilityArrayImpl
