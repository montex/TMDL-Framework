/**
 */
package sant.impl;

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

import sant.Activity;
import sant.ExpressionActivityCasesNumber;
import sant.SANTPackage;

import tmdl.core.Assignment;

import tmdl.expressions.ExpressionsPackage;
import tmdl.expressions.TemplateExpression;
import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Activity Cases Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sant.impl.ExpressionActivityCasesNumberImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionActivityCasesNumberImpl extends MinimalEObjectImpl.Container implements ExpressionActivityCasesNumber {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionActivityCasesNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.EXPRESSION_ACTIVITY_CASES_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY, oldActivity, activity));
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluate(org.eclipse.emf.common.util.EList) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluate(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)SANTPackage.Literals.EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE__ELIST).getInvocationDelegate();

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
			case SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
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
			case SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY:
				setActivity((Activity)newValue);
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
			case SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY:
				setActivity((Activity)null);
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
			case SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER__ACTIVITY:
				return activity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TemplateExpression.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateExpressionInteger.class) {
			switch (baseOperationID) {
				case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER___EVALUATE__ELIST: return SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE__ELIST;
				case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER___EVALUATE: return SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE__ELIST:
				return evaluate((EList<Assignment>)arguments.get(0));
			case SANTPackage.EXPRESSION_ACTIVITY_CASES_NUMBER___EVALUATE:
				return evaluate();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExpressionActivityCasesNumberImpl
