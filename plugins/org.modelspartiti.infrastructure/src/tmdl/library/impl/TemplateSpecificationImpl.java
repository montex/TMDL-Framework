/**
 */
package tmdl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tmdl.core.Parameter;

import tmdl.library.LibraryPackage;
import tmdl.library.ModelInterface;
import tmdl.library.TemplateSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tmdl.library.impl.TemplateSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tmdl.library.impl.TemplateSpecificationImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link tmdl.library.impl.TemplateSpecificationImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TemplateSpecificationImpl extends MinimalEObjectImpl.Container implements TemplateSpecification {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelInterface> interfaces;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.TEMPLATE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TEMPLATE_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<ModelInterface>(ModelInterface.class, this, LibraryPackage.TEMPLATE_SPECIFICATION__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameters() {
		if (parameters != null && parameters.eIsProxy()) {
			InternalEObject oldParameters = (InternalEObject)parameters;
			parameters = (Parameter)eResolveProxy(oldParameters);
			if (parameters != oldParameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.TEMPLATE_SPECIFICATION__PARAMETERS, oldParameters, parameters));
			}
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(Parameter newParameters) {
		Parameter oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.TEMPLATE_SPECIFICATION__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.TEMPLATE_SPECIFICATION__NAME:
				return getName();
			case LibraryPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				return getInterfaces();
			case LibraryPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				if (resolve) return getParameters();
				return basicGetParameters();
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
			case LibraryPackage.TEMPLATE_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends ModelInterface>)newValue);
				return;
			case LibraryPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				setParameters((Parameter)newValue);
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
			case LibraryPackage.TEMPLATE_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				getInterfaces().clear();
				return;
			case LibraryPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				setParameters((Parameter)null);
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
			case LibraryPackage.TEMPLATE_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case LibraryPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				return parameters != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TemplateSpecificationImpl
