/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sant.ExpressionIfThenElse;
import sant.ExpressionSegment;
import sant.SANTPackage;

import tmdl.expressions.TemplateExpressionBoolean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sant.impl.ExpressionIfThenElseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sant.impl.ExpressionIfThenElseImpl#getIfTrue <em>If True</em>}</li>
 *   <li>{@link sant.impl.ExpressionIfThenElseImpl#getIfFalse <em>If False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionIfThenElseImpl extends MinimalEObjectImpl.Container implements ExpressionIfThenElse {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected TemplateExpressionBoolean condition;

	/**
	 * The cached value of the '{@link #getIfTrue() <em>If True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfTrue()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSegment ifTrue;

	/**
	 * The cached value of the '{@link #getIfFalse() <em>If False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFalse()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSegment ifFalse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionIfThenElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.EXPRESSION_IF_THEN_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionBoolean getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(TemplateExpressionBoolean newCondition, NotificationChain msgs) {
		TemplateExpressionBoolean oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(TemplateExpressionBoolean newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSegment getIfTrue() {
		return ifTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfTrue(ExpressionSegment newIfTrue, NotificationChain msgs) {
		ExpressionSegment oldIfTrue = ifTrue;
		ifTrue = newIfTrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE, oldIfTrue, newIfTrue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfTrue(ExpressionSegment newIfTrue) {
		if (newIfTrue != ifTrue) {
			NotificationChain msgs = null;
			if (ifTrue != null)
				msgs = ((InternalEObject)ifTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE, null, msgs);
			if (newIfTrue != null)
				msgs = ((InternalEObject)newIfTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE, null, msgs);
			msgs = basicSetIfTrue(newIfTrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE, newIfTrue, newIfTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSegment getIfFalse() {
		return ifFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfFalse(ExpressionSegment newIfFalse, NotificationChain msgs) {
		ExpressionSegment oldIfFalse = ifFalse;
		ifFalse = newIfFalse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE, oldIfFalse, newIfFalse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfFalse(ExpressionSegment newIfFalse) {
		if (newIfFalse != ifFalse) {
			NotificationChain msgs = null;
			if (ifFalse != null)
				msgs = ((InternalEObject)ifFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE, null, msgs);
			if (newIfFalse != null)
				msgs = ((InternalEObject)newIfFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE, null, msgs);
			msgs = basicSetIfFalse(newIfFalse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE, newIfFalse, newIfFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION:
				return basicSetCondition(null, msgs);
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE:
				return basicSetIfTrue(null, msgs);
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE:
				return basicSetIfFalse(null, msgs);
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
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION:
				return getCondition();
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE:
				return getIfTrue();
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE:
				return getIfFalse();
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
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION:
				setCondition((TemplateExpressionBoolean)newValue);
				return;
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE:
				setIfTrue((ExpressionSegment)newValue);
				return;
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE:
				setIfFalse((ExpressionSegment)newValue);
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
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION:
				setCondition((TemplateExpressionBoolean)null);
				return;
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE:
				setIfTrue((ExpressionSegment)null);
				return;
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE:
				setIfFalse((ExpressionSegment)null);
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
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__CONDITION:
				return condition != null;
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_TRUE:
				return ifTrue != null;
			case SANTPackage.EXPRESSION_IF_THEN_ELSE__IF_FALSE:
				return ifFalse != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionIfThenElseImpl
