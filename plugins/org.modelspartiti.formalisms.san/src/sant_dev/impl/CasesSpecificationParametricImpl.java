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

import sant_dev.CasesSpecificationParametric;
import sant_dev.SANT_DEVPackage;

import tmdl.core.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cases Specification Parametric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant_dev.impl.CasesSpecificationParametricImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link sant_dev.impl.CasesSpecificationParametricImpl#getP <em>P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasesSpecificationParametricImpl extends CasesSpecificationImpl implements CasesSpecificationParametric {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

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
		return SANT_DEVPackage.Literals.CASES_SPECIFICATION_PARAMETRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER, oldParameter, newParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getP() {
		if (p == null) {
			p = new EObjectContainmentEList<Expression>(Expression.class, this, SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__P);
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
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER:
				return basicSetParameter(null, msgs);
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__P:
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
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER:
				return getParameter();
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__P:
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
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__P:
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
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER:
				setParameter((Parameter)null);
				return;
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__P:
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
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__PARAMETER:
				return parameter != null;
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC__P:
				return p != null && !p.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CasesSpecificationParametricImpl
