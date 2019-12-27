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

import sant_dev.CasesSpecificationRangeOperator;
import sant_dev.SANT_DEVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cases Specification Range Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.impl.CasesSpecificationRangeOperatorImpl#getMin <em>Min</em>}</li>
 *   <li>{@link sant_dev.impl.CasesSpecificationRangeOperatorImpl#getMax <em>Max</em>}</li>
 *   <li>{@link sant_dev.impl.CasesSpecificationRangeOperatorImpl#getStep <em>Step</em>}</li>
 *   <li>{@link sant_dev.impl.CasesSpecificationRangeOperatorImpl#getP <em>P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasesSpecificationRangeOperatorImpl extends CasesSpecificationImpl implements CasesSpecificationRangeOperator {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected int step = STEP_EDEFAULT;

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
	protected CasesSpecificationRangeOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANT_DEVPackage.Literals.CASES_SPECIFICATION_RANGE_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(int newStep) {
		int oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getP() {
		if (p == null) {
			p = new EObjectContainmentEList<Expression>(Expression.class, this, SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__P);
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
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__P:
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
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MIN:
				return getMin();
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MAX:
				return getMax();
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__STEP:
				return getStep();
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__P:
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
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MIN:
				setMin((Integer)newValue);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MAX:
				setMax((Integer)newValue);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__STEP:
				setStep((Integer)newValue);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__P:
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
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__STEP:
				setStep(STEP_EDEFAULT);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__P:
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
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MIN:
				return min != MIN_EDEFAULT;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__MAX:
				return max != MAX_EDEFAULT;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__STEP:
				return step != STEP_EDEFAULT;
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR__P:
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", step: ");
		result.append(step);
		result.append(')');
		return result.toString();
	}

} //CasesSpecificationRangeOperatorImpl
