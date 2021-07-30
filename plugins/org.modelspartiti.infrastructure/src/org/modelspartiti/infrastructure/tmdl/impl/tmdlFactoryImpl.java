/**
 */
package org.modelspartiti.infrastructure.tmdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.modelspartiti.infrastructure.tmdl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tmdlFactoryImpl extends EFactoryImpl implements tmdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tmdlFactory init() {
		try {
			tmdlFactory thetmdlFactory = (tmdlFactory)EPackage.Registry.INSTANCE.getEFactory(tmdlPackage.eNS_URI);
			if (thetmdlFactory != null) {
				return thetmdlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tmdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmdlFactoryImpl() {
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
			case tmdlPackage.TMDL_SPECIFICATION: return createTMDLSpecification();
			case tmdlPackage.LIBRARY: return createLibrary();
			case tmdlPackage.SCENARIO: return createScenario();
			case tmdlPackage.TEMPLATE_ATOMIC: return createTemplateAtomic();
			case tmdlPackage.TEMPLATE_COMPOSITE: return createTemplateComposite();
			case tmdlPackage.BLOCK: return createBlock();
			case tmdlPackage.VARIANT: return createVariant();
			case tmdlPackage.BLOCK_REALIZATION: return createBlockRealization();
			case tmdlPackage.MODEL_INTERF_SIMPLE: return createModelInterfSimple();
			case tmdlPackage.MODEL_INTERF_ARRAY: return createModelInterfArray();
			case tmdlPackage.COMPOSITION_RULE_FORWARDS: return createCompositionRuleForwards();
			case tmdlPackage.COMPOSITION_RULE_ALL: return createCompositionRuleAll();
			case tmdlPackage.COMPOSITION_RULE_MATCH: return createCompositionRuleMatch();
			case tmdlPackage.COMP_ITEM: return createCompItem();
			case tmdlPackage.VALUE_INT: return createValueInt();
			case tmdlPackage.VALUE_DOUBLE: return createValueDouble();
			case tmdlPackage.VALUE_ARRAY_INT: return createValueArrayInt();
			case tmdlPackage.VALUE_ARRAY_DOUBLE: return createValueArrayDouble();
			case tmdlPackage.PARAMETER: return createParameter();
			case tmdlPackage.PARAMETRIC: return createParametric();
			case tmdlPackage.PARAMBINDING: return createParambinding();
			case tmdlPackage.ASSIGNMENT: return createAssignment();
			case tmdlPackage.AVAILABILITY: return createAvailability();
			case tmdlPackage.RELIABILITY: return createReliability();
			case tmdlPackage.MEAN_TIME_TO_FAILURE: return createMeanTimeToFailure();
			case tmdlPackage.STATE_METAVARIABLE: return createStateMetavariable();
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
			case tmdlPackage.AVAILABILITY_CALC:
				return createAvailabilityCalcFromString(eDataType, initialValue);
			case tmdlPackage.RELIABILITY_CALC:
				return createReliabilityCalcFromString(eDataType, initialValue);
			case tmdlPackage.MEAN_TIME_TO_FAILURE_CALC:
				return createMeanTimeToFailureCalcFromString(eDataType, initialValue);
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
			case tmdlPackage.AVAILABILITY_CALC:
				return convertAvailabilityCalcToString(eDataType, instanceValue);
			case tmdlPackage.RELIABILITY_CALC:
				return convertReliabilityCalcToString(eDataType, instanceValue);
			case tmdlPackage.MEAN_TIME_TO_FAILURE_CALC:
				return convertMeanTimeToFailureCalcToString(eDataType, instanceValue);
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
	public TMDLSpecification createTMDLSpecification() {
		TMDLSpecificationImpl tmdlSpecification = new TMDLSpecificationImpl();
		return tmdlSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateAtomic createTemplateAtomic() {
		TemplateAtomicImpl templateAtomic = new TemplateAtomicImpl();
		return templateAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateComposite createTemplateComposite() {
		TemplateCompositeImpl templateComposite = new TemplateCompositeImpl();
		return templateComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockRealization createBlockRealization() {
		BlockRealizationImpl blockRealization = new BlockRealizationImpl();
		return blockRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelInterfSimple createModelInterfSimple() {
		ModelInterfSimpleImpl modelInterfSimple = new ModelInterfSimpleImpl();
		return modelInterfSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelInterfArray createModelInterfArray() {
		ModelInterfArrayImpl modelInterfArray = new ModelInterfArrayImpl();
		return modelInterfArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionRuleForwards createCompositionRuleForwards() {
		CompositionRuleForwardsImpl compositionRuleForwards = new CompositionRuleForwardsImpl();
		return compositionRuleForwards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionRuleAll createCompositionRuleAll() {
		CompositionRuleAllImpl compositionRuleAll = new CompositionRuleAllImpl();
		return compositionRuleAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionRuleMatch createCompositionRuleMatch() {
		CompositionRuleMatchImpl compositionRuleMatch = new CompositionRuleMatchImpl();
		return compositionRuleMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompItem createCompItem() {
		CompItemImpl compItem = new CompItemImpl();
		return compItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueInt createValueInt() {
		ValueIntImpl valueInt = new ValueIntImpl();
		return valueInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueDouble createValueDouble() {
		ValueDoubleImpl valueDouble = new ValueDoubleImpl();
		return valueDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueArrayInt createValueArrayInt() {
		ValueArrayIntImpl valueArrayInt = new ValueArrayIntImpl();
		return valueArrayInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueArrayDouble createValueArrayDouble() {
		ValueArrayDoubleImpl valueArrayDouble = new ValueArrayDoubleImpl();
		return valueArrayDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parametric createParametric() {
		ParametricImpl parametric = new ParametricImpl();
		return parametric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parambinding createParambinding() {
		ParambindingImpl parambinding = new ParambindingImpl();
		return parambinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Availability createAvailability() {
		AvailabilityImpl availability = new AvailabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reliability createReliability() {
		ReliabilityImpl reliability = new ReliabilityImpl();
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeanTimeToFailure createMeanTimeToFailure() {
		MeanTimeToFailureImpl meanTimeToFailure = new MeanTimeToFailureImpl();
		return meanTimeToFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMetavariable createStateMetavariable() {
		StateMetavariableImpl stateMetavariable = new StateMetavariableImpl();
		return stateMetavariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityCalc createAvailabilityCalcFromString(EDataType eDataType, String initialValue) {
		AvailabilityCalc result = AvailabilityCalc.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityCalcToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityCalc createReliabilityCalcFromString(EDataType eDataType, String initialValue) {
		ReliabilityCalc result = ReliabilityCalc.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliabilityCalcToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeanTimeToFailureCalc createMeanTimeToFailureCalcFromString(EDataType eDataType, String initialValue) {
		MeanTimeToFailureCalc result = MeanTimeToFailureCalc.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeanTimeToFailureCalcToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tmdlPackage gettmdlPackage() {
		return (tmdlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tmdlPackage getPackage() {
		return tmdlPackage.eINSTANCE;
	}

} //tmdlFactoryImpl
