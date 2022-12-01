/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.modelspartiti.infrastructure.tmdl.Metric;
import org.modelspartiti.infrastructure.tmdl.ModelInterface;
import org.modelspartiti.infrastructure.tmdl.Parameter;
import org.modelspartiti.infrastructure.tmdl.TemplateSpecification;
import org.modelspartiti.infrastructure.tmdl.tmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.impl.TemplateSpecificationImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TemplateSpecificationImpl extends MinimalEObjectImpl.Container implements TemplateSpecification {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> labels;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metrics;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelInterface> interfaces;

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
		return tmdlPackage.Literals.TEMPLATE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, tmdlPackage.TEMPLATE_SPECIFICATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmdlPackage.TEMPLATE_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLabels() {
		if (labels == null) {
			labels = new EDataTypeUniqueEList<String>(String.class, this, tmdlPackage.TEMPLATE_SPECIFICATION__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metric> getMetrics() {
		if (metrics == null) {
			metrics = new EObjectResolvingEList<Metric>(Metric.class, this, tmdlPackage.TEMPLATE_SPECIFICATION__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<ModelInterface>(ModelInterface.class, this, tmdlPackage.TEMPLATE_SPECIFICATION__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmdlPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case tmdlPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
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
			case tmdlPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				return getParameters();
			case tmdlPackage.TEMPLATE_SPECIFICATION__NAME:
				return getName();
			case tmdlPackage.TEMPLATE_SPECIFICATION__LABELS:
				return getLabels();
			case tmdlPackage.TEMPLATE_SPECIFICATION__METRICS:
				return getMetrics();
			case tmdlPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				return getInterfaces();
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
			case tmdlPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case tmdlPackage.TEMPLATE_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case tmdlPackage.TEMPLATE_SPECIFICATION__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
				return;
			case tmdlPackage.TEMPLATE_SPECIFICATION__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends Metric>)newValue);
				return;
			case tmdlPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends ModelInterface>)newValue);
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
			case tmdlPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				getParameters().clear();
				return;
			case tmdlPackage.TEMPLATE_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tmdlPackage.TEMPLATE_SPECIFICATION__LABELS:
				getLabels().clear();
				return;
			case tmdlPackage.TEMPLATE_SPECIFICATION__METRICS:
				getMetrics().clear();
				return;
			case tmdlPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				getInterfaces().clear();
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
			case tmdlPackage.TEMPLATE_SPECIFICATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case tmdlPackage.TEMPLATE_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tmdlPackage.TEMPLATE_SPECIFICATION__LABELS:
				return labels != null && !labels.isEmpty();
			case tmdlPackage.TEMPLATE_SPECIFICATION__METRICS:
				return metrics != null && !metrics.isEmpty();
			case tmdlPackage.TEMPLATE_SPECIFICATION__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
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
		result.append(", labels: ");
		result.append(labels);
		result.append(')');
		return result.toString();
	}

} //TemplateSpecificationImpl
