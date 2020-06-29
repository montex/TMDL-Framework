/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.impl.NamedElementImpl;

import sant.ActivityTemplate;
import sant.CasesSpecification;
import sant.SANTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant.impl.ActivityTemplateImpl#getCasesTemplate <em>Cases Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityTemplateImpl extends NamedElementImpl implements ActivityTemplate {
	/**
	 * The cached value of the '{@link #getCasesTemplate() <em>Cases Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasesTemplate()
	 * @generated
	 * @ordered
	 */
	protected CasesSpecification casesTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.ACTIVITY_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CasesSpecification getCasesTemplate() {
		return casesTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCasesTemplate(CasesSpecification newCasesTemplate, NotificationChain msgs) {
		CasesSpecification oldCasesTemplate = casesTemplate;
		casesTemplate = newCasesTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE, oldCasesTemplate, newCasesTemplate);
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
	public void setCasesTemplate(CasesSpecification newCasesTemplate) {
		if (newCasesTemplate != casesTemplate) {
			NotificationChain msgs = null;
			if (casesTemplate != null)
				msgs = ((InternalEObject)casesTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE, null, msgs);
			if (newCasesTemplate != null)
				msgs = ((InternalEObject)newCasesTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE, null, msgs);
			msgs = basicSetCasesTemplate(newCasesTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE, newCasesTemplate, newCasesTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE:
				return basicSetCasesTemplate(null, msgs);
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
			case SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE:
				return getCasesTemplate();
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
			case SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE:
				setCasesTemplate((CasesSpecification)newValue);
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
			case SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE:
				setCasesTemplate((CasesSpecification)null);
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
			case SANTPackage.ACTIVITY_TEMPLATE__CASES_TEMPLATE:
				return casesTemplate != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityTemplateImpl
