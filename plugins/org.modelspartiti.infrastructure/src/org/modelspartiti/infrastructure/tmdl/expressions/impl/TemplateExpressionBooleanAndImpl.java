/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions.impl;

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

import org.modelspartiti.infrastructure.tmdl.core.Assignment;

import org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage;
import org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean;
import org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanAnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Expression Boolean And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanAndImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.expressions.impl.TemplateExpressionBooleanAndImpl#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateExpressionBooleanAndImpl extends MinimalEObjectImpl.Container implements TemplateExpressionBooleanAnd {
	/**
	 * The cached value of the '{@link #getExp1() <em>Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp1()
	 * @generated
	 * @ordered
	 */
	protected TemplateExpressionBoolean exp1;

	/**
	 * The cached value of the '{@link #getExp2() <em>Exp2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp2()
	 * @generated
	 * @ordered
	 */
	protected TemplateExpressionBoolean exp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateExpressionBooleanAndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_BOOLEAN_AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateExpressionBoolean getExp1() {
		return exp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp1(TemplateExpressionBoolean newExp1, NotificationChain msgs) {
		TemplateExpressionBoolean oldExp1 = exp1;
		exp1 = newExp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1, oldExp1, newExp1);
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
	public void setExp1(TemplateExpressionBoolean newExp1) {
		if (newExp1 != exp1) {
			NotificationChain msgs = null;
			if (exp1 != null)
				msgs = ((InternalEObject)exp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1, null, msgs);
			if (newExp1 != null)
				msgs = ((InternalEObject)newExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1, null, msgs);
			msgs = basicSetExp1(newExp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1, newExp1, newExp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateExpressionBoolean getExp2() {
		return exp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp2(TemplateExpressionBoolean newExp2, NotificationChain msgs) {
		TemplateExpressionBoolean oldExp2 = exp2;
		exp2 = newExp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2, oldExp2, newExp2);
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
	public void setExp2(TemplateExpressionBoolean newExp2) {
		if (newExp2 != exp2) {
			NotificationChain msgs = null;
			if (exp2 != null)
				msgs = ((InternalEObject)exp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2, null, msgs);
			if (newExp2 != null)
				msgs = ((InternalEObject)newExp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2, null, msgs);
			msgs = basicSetExp2(newExp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2, newExp2, newExp2));
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_BOOLEAN_AND___EVALUATE__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean evaluate(EList<Assignment> assignments) {
		try {
			return (Boolean)EVALUATE_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{assignments}));
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
	protected static final EOperation.Internal.InvocationDelegate EVALUATE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean evaluate() {
		try {
			return (Boolean)EVALUATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1:
				return basicSetExp1(null, msgs);
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2:
				return basicSetExp2(null, msgs);
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1:
				return getExp1();
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2:
				return getExp2();
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1:
				setExp1((TemplateExpressionBoolean)newValue);
				return;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2:
				setExp2((TemplateExpressionBoolean)newValue);
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1:
				setExp1((TemplateExpressionBoolean)null);
				return;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2:
				setExp2((TemplateExpressionBoolean)null);
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP1:
				return exp1 != null;
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND__EXP2:
				return exp2 != null;
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND___EVALUATE__ELIST:
				return evaluate((EList<Assignment>)arguments.get(0));
			case ExpressionsPackage.TEMPLATE_EXPRESSION_BOOLEAN_AND___EVALUATE:
				return evaluate();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TemplateExpressionBooleanAndImpl
