/**
 */
package tmdl.expressions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tmdl.core.Assignment;
import tmdl.core.ParameterArray;

import tmdl.expressions.ExpressionsPackage;
import tmdl.expressions.TemplateExpressionParameterArraySize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Expression Parameter Array Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tmdl.expressions.impl.TemplateExpressionParameterArraySizeImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateExpressionParameterArraySizeImpl extends MinimalEObjectImpl.Container implements TemplateExpressionParameterArraySize {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected ParameterArray parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateExpressionParameterArraySizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterArray getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (ParameterArray)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterArray basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(ParameterArray newParameter) {
		ParameterArray oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE___EVALUATE__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int evaluate(EList<Assignment> assignments) {
		try {
			return (Integer)EVALUATE_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{assignments}));
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
	protected static final EOperation.Internal.InvocationDelegate EVALUATE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_INTEGER___EVALUATE).getInvocationDelegate();

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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER:
				setParameter((ParameterArray)newValue);
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER:
				setParameter((ParameterArray)null);
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER:
				return parameter != null;
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
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE___EVALUATE__ELIST:
				return evaluate((EList<Assignment>)arguments.get(0));
			case ExpressionsPackage.TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE___EVALUATE:
				return evaluate();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TemplateExpressionParameterArraySizeImpl
