/**
 */
package org.modelspartiti.infrastructure.tmdl.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.modelspartiti.infrastructure.tmdl.core.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.PARAMETER_SIMPLE: return createParameterSimple();
			case CorePackage.PARAMETER_ARRAY: return createParameterArray();
			case CorePackage.ASSIGNMENT_SIMPLE: return createAssignmentSimple();
			case CorePackage.ASSIGNMENT_ARRAY: return createAssignmentArray();
			case CorePackage.MULTIPLICITY_VALUE: return createMultiplicityValue();
			case CorePackage.MULTIPLICITY_ARRAY: return createMultiplicityArray();
			case CorePackage.MULTIPLICITY_PARAMETRIC: return createMultiplicityParametric();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterSimple createParameterSimple() {
		ParameterSimpleImpl parameterSimple = new ParameterSimpleImpl();
		return parameterSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterArray createParameterArray() {
		ParameterArrayImpl parameterArray = new ParameterArrayImpl();
		return parameterArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentSimple createAssignmentSimple() {
		AssignmentSimpleImpl assignmentSimple = new AssignmentSimpleImpl();
		return assignmentSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentArray createAssignmentArray() {
		AssignmentArrayImpl assignmentArray = new AssignmentArrayImpl();
		return assignmentArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityValue createMultiplicityValue() {
		MultiplicityValueImpl multiplicityValue = new MultiplicityValueImpl();
		return multiplicityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityArray createMultiplicityArray() {
		MultiplicityArrayImpl multiplicityArray = new MultiplicityArrayImpl();
		return multiplicityArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityParametric createMultiplicityParametric() {
		MultiplicityParametricImpl multiplicityParametric = new MultiplicityParametricImpl();
		return multiplicityParametric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
