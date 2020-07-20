/**
 */
package org.modelspartiti.formalisms.san.sant.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.modelspartiti.formalisms.san.san.Case;

import org.modelspartiti.formalisms.san.sant.OutputGateConcrete;
import org.modelspartiti.formalisms.san.sant.SANTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Gate Concrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.impl.OutputGateConcreteImpl#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputGateConcreteImpl extends OutputGateImpl implements OutputGateConcrete {
	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> case_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputGateConcreteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.OUTPUT_GATE_CONCRETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Case> getCase() {
		if (case_ == null) {
			case_ = new EObjectResolvingEList<Case>(Case.class, this, SANTPackage.OUTPUT_GATE_CONCRETE__CASE);
		}
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.OUTPUT_GATE_CONCRETE__CASE:
				return getCase();
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
			case SANTPackage.OUTPUT_GATE_CONCRETE__CASE:
				getCase().clear();
				getCase().addAll((Collection<? extends Case>)newValue);
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
			case SANTPackage.OUTPUT_GATE_CONCRETE__CASE:
				getCase().clear();
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
			case SANTPackage.OUTPUT_GATE_CONCRETE__CASE:
				return case_ != null && !case_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputGateConcreteImpl
