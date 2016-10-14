/**
 */
package tmdl.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tmdl.core.Assignment;
import tmdl.core.ConcreteModel;
import tmdl.core.CorePackage;
import tmdl.core.TemplateModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TemplateModelImpl extends MinimalEObjectImpl.Container implements TemplateModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TEMPLATE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteModel concretize(EList<Assignment> parameterValues) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case CorePackage.TEMPLATE_MODEL___CONCRETIZE__ELIST:
				return concretize((EList<Assignment>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TemplateModelImpl
