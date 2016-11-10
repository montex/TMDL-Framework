/**
 */
package tmdl.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import tmdl.core.Assignment;
import tmdl.core.CorePackage;
import tmdl.core.MultiplicityArray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tmdl.core.impl.MultiplicityArrayImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityArrayImpl extends MinimalEObjectImpl.Container implements MultiplicityArray {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MULTIPLICITY_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<Integer>(Integer.class, this, CorePackage.MULTIPLICITY_ARRAY__VALUES);
		}
		return values;
	}

	/**
	 * The cached invocation delegate for the '{@link #asSequence(org.eclipse.emf.common.util.EList) <em>As Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #asSequence(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AS_SEQUENCE_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)CorePackage.Literals.MULTIPLICITY_ARRAY___AS_SEQUENCE__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> asSequence(EList<Assignment> assignments) {
		try {
			return (EList<Integer>)AS_SEQUENCE_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{assignments}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #asSequence() <em>As Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #asSequence()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AS_SEQUENCE__EINVOCATION_DELEGATE = ((EOperation.Internal)CorePackage.Literals.MULTIPLICITY___AS_SEQUENCE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> asSequence() {
		try {
			return (EList<Integer>)AS_SEQUENCE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case CorePackage.MULTIPLICITY_ARRAY__VALUES:
				return getValues();
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
			case CorePackage.MULTIPLICITY_ARRAY__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Integer>)newValue);
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
			case CorePackage.MULTIPLICITY_ARRAY__VALUES:
				getValues().clear();
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
			case CorePackage.MULTIPLICITY_ARRAY__VALUES:
				return values != null && !values.isEmpty();
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
			case CorePackage.MULTIPLICITY_ARRAY___AS_SEQUENCE__ELIST:
				return asSequence((EList<Assignment>)arguments.get(0));
			case CorePackage.MULTIPLICITY_ARRAY___AS_SEQUENCE:
				return asSequence();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //MultiplicityArrayImpl
