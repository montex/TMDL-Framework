/**
 */
package tmdl.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tmdl.core.*;

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
			case CorePackage.PARAMETER_EXPRESSION_VALUE: return createParameterExpressionValue();
			case CorePackage.PARAMETER_EXPRESSION_VALUE_AT: return createParameterExpressionValueAt();
			case CorePackage.PARAMETER_EXPRESSION_AGGREGATE: return createParameterExpressionAggregate();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.AGGREGATE_FUNCTION_KIND:
				return createAggregateFunctionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.AGGREGATE_FUNCTION_KIND:
				return convertAggregateFunctionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSimple createParameterSimple() {
		ParameterSimpleImpl parameterSimple = new ParameterSimpleImpl();
		return parameterSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterArray createParameterArray() {
		ParameterArrayImpl parameterArray = new ParameterArrayImpl();
		return parameterArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentSimple createAssignmentSimple() {
		AssignmentSimpleImpl assignmentSimple = new AssignmentSimpleImpl();
		return assignmentSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentArray createAssignmentArray() {
		AssignmentArrayImpl assignmentArray = new AssignmentArrayImpl();
		return assignmentArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityValue createMultiplicityValue() {
		MultiplicityValueImpl multiplicityValue = new MultiplicityValueImpl();
		return multiplicityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityArray createMultiplicityArray() {
		MultiplicityArrayImpl multiplicityArray = new MultiplicityArrayImpl();
		return multiplicityArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityParametric createMultiplicityParametric() {
		MultiplicityParametricImpl multiplicityParametric = new MultiplicityParametricImpl();
		return multiplicityParametric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterExpressionValue createParameterExpressionValue() {
		ParameterExpressionValueImpl parameterExpressionValue = new ParameterExpressionValueImpl();
		return parameterExpressionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterExpressionValueAt createParameterExpressionValueAt() {
		ParameterExpressionValueAtImpl parameterExpressionValueAt = new ParameterExpressionValueAtImpl();
		return parameterExpressionValueAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterExpressionAggregate createParameterExpressionAggregate() {
		ParameterExpressionAggregateImpl parameterExpressionAggregate = new ParameterExpressionAggregateImpl();
		return parameterExpressionAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateFunctionKind createAggregateFunctionKindFromString(EDataType eDataType, String initialValue) {
		AggregateFunctionKind result = AggregateFunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
