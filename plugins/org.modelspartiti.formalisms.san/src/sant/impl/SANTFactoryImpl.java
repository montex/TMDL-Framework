/**
 */
package sant.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sant.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANTFactoryImpl extends EFactoryImpl implements SANTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SANTFactory init() {
		try {
			SANTFactory theSANTFactory = (SANTFactory)EPackage.Registry.INSTANCE.getEFactory(SANTPackage.eNS_URI);
			if (theSANTFactory != null) {
				return theSANTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SANTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANTFactoryImpl() {
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
			case SANTPackage.SANT: return createSANT();
			case SANTPackage.PLACE_TEMPLATE: return createPlaceTemplate();
			case SANTPackage.MULTIPLICITY_RANGE_OPERATOR: return createMultiplicityRangeOperator();
			case SANTPackage.CASES_SPECIFICATION_CONCRETE: return createCasesSpecificationConcrete();
			case SANTPackage.CASES_SPECIFICATION_ARRAY: return createCasesSpecificationArray();
			case SANTPackage.CASES_SPECIFICATION_PARAMETRIC: return createCasesSpecificationParametric();
			case SANTPackage.CASES_SPECIFICATION_PROBABILITY_ARRAY: return createCasesSpecificationProbabilityArray();
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE: return createTimedActivityTemplate();
			case SANTPackage.INSTANTANEOUS_ACTIVITY_TEMPLATE: return createInstantaneousActivityTemplate();
			case SANTPackage.MARKING_TEMPLATE_SIMPLE: return createMarkingTemplateSimple();
			case SANTPackage.MARKING_TEMPLATE_GLOBAL_VARIABLE: return createMarkingTemplateGlobalVariable();
			case SANTPackage.OUTPUT_GATE_CONCRETE: return createOutputGateConcrete();
			case SANTPackage.OUTPUT_GATE_TEMPLATE: return createOutputGateTemplate();
			case SANTPackage.INPUT_GATE_TEMPLATE: return createInputGateTemplate();
			case SANTPackage.INPUT_ARC: return createInputArc();
			case SANTPackage.OUTPUT_ARC: return createOutputArc();
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
	public SANT createSANT() {
		SANTImpl sant = new SANTImpl();
		return sant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaceTemplate createPlaceTemplate() {
		PlaceTemplateImpl placeTemplate = new PlaceTemplateImpl();
		return placeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityRangeOperator createMultiplicityRangeOperator() {
		MultiplicityRangeOperatorImpl multiplicityRangeOperator = new MultiplicityRangeOperatorImpl();
		return multiplicityRangeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CasesSpecificationConcrete createCasesSpecificationConcrete() {
		CasesSpecificationConcreteImpl casesSpecificationConcrete = new CasesSpecificationConcreteImpl();
		return casesSpecificationConcrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CasesSpecificationArray createCasesSpecificationArray() {
		CasesSpecificationArrayImpl casesSpecificationArray = new CasesSpecificationArrayImpl();
		return casesSpecificationArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CasesSpecificationParametric createCasesSpecificationParametric() {
		CasesSpecificationParametricImpl casesSpecificationParametric = new CasesSpecificationParametricImpl();
		return casesSpecificationParametric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CasesSpecificationProbabilityArray createCasesSpecificationProbabilityArray() {
		CasesSpecificationProbabilityArrayImpl casesSpecificationProbabilityArray = new CasesSpecificationProbabilityArrayImpl();
		return casesSpecificationProbabilityArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimedActivityTemplate createTimedActivityTemplate() {
		TimedActivityTemplateImpl timedActivityTemplate = new TimedActivityTemplateImpl();
		return timedActivityTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstantaneousActivityTemplate createInstantaneousActivityTemplate() {
		InstantaneousActivityTemplateImpl instantaneousActivityTemplate = new InstantaneousActivityTemplateImpl();
		return instantaneousActivityTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkingTemplateSimple createMarkingTemplateSimple() {
		MarkingTemplateSimpleImpl markingTemplateSimple = new MarkingTemplateSimpleImpl();
		return markingTemplateSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkingTemplateGlobalVariable createMarkingTemplateGlobalVariable() {
		MarkingTemplateGlobalVariableImpl markingTemplateGlobalVariable = new MarkingTemplateGlobalVariableImpl();
		return markingTemplateGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputGateConcrete createOutputGateConcrete() {
		OutputGateConcreteImpl outputGateConcrete = new OutputGateConcreteImpl();
		return outputGateConcrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputGateTemplate createOutputGateTemplate() {
		OutputGateTemplateImpl outputGateTemplate = new OutputGateTemplateImpl();
		return outputGateTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputGateTemplate createInputGateTemplate() {
		InputGateTemplateImpl inputGateTemplate = new InputGateTemplateImpl();
		return inputGateTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputArc createInputArc() {
		InputArcImpl inputArc = new InputArcImpl();
		return inputArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputArc createOutputArc() {
		OutputArcImpl outputArc = new OutputArcImpl();
		return outputArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SANTPackage getSANTPackage() {
		return (SANTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SANTPackage getPackage() {
		return SANTPackage.eINSTANCE;
	}

} //SANTFactoryImpl
