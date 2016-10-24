/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sant.CasesSpecificationParametric;
import sant.SANTPackage;

import tmdl.expressions.TemplateExpressionInteger;
import tmdl.expressions.TemplateExpressionReal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cases Specification Parametric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sant.impl.CasesSpecificationParametricImpl#getNumCases <em>Num Cases</em>}</li>
 *   <li>{@link sant.impl.CasesSpecificationParametricImpl#getPExpression <em>PExpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CasesSpecificationParametricImpl extends CasesSpecificationImpl implements CasesSpecificationParametric {
	/**
	 * The cached value of the '{@link #getNumCases() <em>Num Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCases()
	 * @generated
	 * @ordered
	 */
	protected TemplateExpressionInteger numCases;

	/**
	 * The cached value of the '{@link #getPExpression() <em>PExpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPExpression()
	 * @generated
	 * @ordered
	 */
	protected TemplateExpressionReal pExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationParametricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.CASES_SPECIFICATION_PARAMETRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionInteger getNumCases() {
		return numCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumCases(TemplateExpressionInteger newNumCases, NotificationChain msgs) {
		TemplateExpressionInteger oldNumCases = numCases;
		numCases = newNumCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES, oldNumCases, newNumCases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCases(TemplateExpressionInteger newNumCases) {
		if (newNumCases != numCases) {
			NotificationChain msgs = null;
			if (numCases != null)
				msgs = ((InternalEObject)numCases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES, null, msgs);
			if (newNumCases != null)
				msgs = ((InternalEObject)newNumCases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES, null, msgs);
			msgs = basicSetNumCases(newNumCases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES, newNumCases, newNumCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionReal getPExpression() {
		return pExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPExpression(TemplateExpressionReal newPExpression, NotificationChain msgs) {
		TemplateExpressionReal oldPExpression = pExpression;
		pExpression = newPExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION, oldPExpression, newPExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPExpression(TemplateExpressionReal newPExpression) {
		if (newPExpression != pExpression) {
			NotificationChain msgs = null;
			if (pExpression != null)
				msgs = ((InternalEObject)pExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION, null, msgs);
			if (newPExpression != null)
				msgs = ((InternalEObject)newPExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION, null, msgs);
			msgs = basicSetPExpression(newPExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION, newPExpression, newPExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES:
				return basicSetNumCases(null, msgs);
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION:
				return basicSetPExpression(null, msgs);
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
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES:
				return getNumCases();
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION:
				return getPExpression();
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
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES:
				setNumCases((TemplateExpressionInteger)newValue);
				return;
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION:
				setPExpression((TemplateExpressionReal)newValue);
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
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES:
				setNumCases((TemplateExpressionInteger)null);
				return;
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION:
				setPExpression((TemplateExpressionReal)null);
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
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__NUM_CASES:
				return numCases != null;
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC__PEXPRESSION:
				return pExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //CasesSpecificationParametricImpl
