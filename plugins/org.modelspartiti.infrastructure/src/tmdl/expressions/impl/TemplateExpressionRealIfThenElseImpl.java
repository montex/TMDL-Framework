/**
 */
package tmdl.expressions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tmdl.core.Assignment;

import tmdl.expressions.ExpressionsPackage;
import tmdl.expressions.TemplateExpressionBoolean;
import tmdl.expressions.TemplateExpressionReal;
import tmdl.expressions.TemplateExpressionRealIfThenElse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Expression Real If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl#getIfTrue <em>If True</em>}</li>
 *   <li>{@link tmdl.expressions.impl.TemplateExpressionRealIfThenElseImpl#getIfFalse <em>If False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateExpressionRealIfThenElseImpl extends MinimalEObjectImpl.Container implements TemplateExpressionRealIfThenElse {
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
	protected TemplateExpressionReal ifTrue;

	/**
	 * The cached value of the '{@link #getIfFalse() <em>If False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFalse()
	 * @generated
	 * @ordered
	 */
	protected TemplateExpressionReal ifFalse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateExpressionRealIfThenElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionReal getIfTrue() {
		return ifTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfTrue(TemplateExpressionReal newIfTrue, NotificationChain msgs) {
		TemplateExpressionReal oldIfTrue = ifTrue;
		ifTrue = newIfTrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE, oldIfTrue, newIfTrue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfTrue(TemplateExpressionReal newIfTrue) {
		if (newIfTrue != ifTrue) {
			NotificationChain msgs = null;
			if (ifTrue != null)
				msgs = ((InternalEObject)ifTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE, null, msgs);
			if (newIfTrue != null)
				msgs = ((InternalEObject)newIfTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE, null, msgs);
			msgs = basicSetIfTrue(newIfTrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE, newIfTrue, newIfTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionReal getIfFalse() {
		return ifFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfFalse(TemplateExpressionReal newIfFalse, NotificationChain msgs) {
		TemplateExpressionReal oldIfFalse = ifFalse;
		ifFalse = newIfFalse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE, oldIfFalse, newIfFalse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfFalse(TemplateExpressionReal newIfFalse) {
		if (newIfFalse != ifFalse) {
			NotificationChain msgs = null;
			if (ifFalse != null)
				msgs = ((InternalEObject)ifFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE, null, msgs);
			if (newIfFalse != null)
				msgs = ((InternalEObject)newIfFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE, null, msgs);
			msgs = basicSetIfFalse(newIfFalse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE, newIfFalse, newIfFalse));
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE___EVALUATE__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double evaluate(EList<Assignment> assignments) {
		try {
			return (Double)EVALUATE_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{assignments}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluate()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_REAL___EVALUATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int evaluate() {
		try {
			return (Integer)EVALUATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION:
				return basicSetCondition(null, msgs);
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE:
				return basicSetIfTrue(null, msgs);
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE:
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION:
				return getCondition();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE:
				return getIfTrue();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE:
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION:
				setCondition((TemplateExpressionBoolean)newValue);
				return;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE:
				setIfTrue((TemplateExpressionReal)newValue);
				return;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE:
				setIfFalse((TemplateExpressionReal)newValue);
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION:
				setCondition((TemplateExpressionBoolean)null);
				return;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE:
				setIfTrue((TemplateExpressionReal)null);
				return;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE:
				setIfFalse((TemplateExpressionReal)null);
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION:
				return condition != null;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE:
				return ifTrue != null;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE:
				return ifFalse != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE___EVALUATE__ELIST:
				return evaluate((EList<Assignment>)arguments.get(0));
			case ExpressionsPackage.TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE___EVALUATE:
				return evaluate();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TemplateExpressionRealIfThenElseImpl
