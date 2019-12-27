/**
 */
package sant_dev.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sant_dev.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANT_DEVFactoryImpl extends EFactoryImpl implements SANT_DEVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SANT_DEVFactory init() {
		try {
			SANT_DEVFactory theSANT_DEVFactory = (SANT_DEVFactory)EPackage.Registry.INSTANCE.getEFactory(SANT_DEVPackage.eNS_URI);
			if (theSANT_DEVFactory != null) {
				return theSANT_DEVFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SANT_DEVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT_DEVFactoryImpl() {
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
			case SANT_DEVPackage.SANT: return createSANT();
			case SANT_DEVPackage.PLACE_TEMPLATE: return createPlaceTemplate();
			case SANT_DEVPackage.MULTIPLICITY_RANGE_OPERATOR: return createMultiplicityRangeOperator();
			case SANT_DEVPackage.MULTIPLICITY_ARRAY_INTEGER_FROM_REAL: return createMultiplicityArrayIntegerFromReal();
			case SANT_DEVPackage.CASES_SPECIFICATION_VALUE: return createCasesSpecificationValue();
			case SANT_DEVPackage.CASES_SPECIFICATION_ARRAY: return createCasesSpecificationArray();
			case SANT_DEVPackage.CASES_SPECIFICATION_PARAMETRIC: return createCasesSpecificationParametric();
			case SANT_DEVPackage.CASES_SPECIFICATION_RANGE_OPERATOR: return createCasesSpecificationRangeOperator();
			case SANT_DEVPackage.TIMED_ACTIVITY_TEMPLATE: return createTimedActivityTemplate();
			case SANT_DEVPackage.INSTANTANEOUS_ACTIVITY_TEMPLATE: return createInstantaneousActivityTemplate();
			case SANT_DEVPackage.MARKING_TEMPLATE_SIMPLE: return createMarkingTemplateSimple();
			case SANT_DEVPackage.MARKING_TEMPLATE_GLOBAL_VARIABLE: return createMarkingTemplateGlobalVariable();
			case SANT_DEVPackage.OUTPUT_GATE_TEMPLATE: return createOutputGateTemplate();
			case SANT_DEVPackage.INPUT_GATE_TEMPLATE: return createInputGateTemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT createSANT() {
		SANTImpl sant = new SANTImpl();
		return sant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTemplate createPlaceTemplate() {
		PlaceTemplateImpl placeTemplate = new PlaceTemplateImpl();
		return placeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityRangeOperator createMultiplicityRangeOperator() {
		MultiplicityRangeOperatorImpl multiplicityRangeOperator = new MultiplicityRangeOperatorImpl();
		return multiplicityRangeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityArrayIntegerFromReal createMultiplicityArrayIntegerFromReal() {
		MultiplicityArrayIntegerFromRealImpl multiplicityArrayIntegerFromReal = new MultiplicityArrayIntegerFromRealImpl();
		return multiplicityArrayIntegerFromReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasesSpecificationValue createCasesSpecificationValue() {
		CasesSpecificationValueImpl casesSpecificationValue = new CasesSpecificationValueImpl();
		return casesSpecificationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasesSpecificationArray createCasesSpecificationArray() {
		CasesSpecificationArrayImpl casesSpecificationArray = new CasesSpecificationArrayImpl();
		return casesSpecificationArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasesSpecificationParametric createCasesSpecificationParametric() {
		CasesSpecificationParametricImpl casesSpecificationParametric = new CasesSpecificationParametricImpl();
		return casesSpecificationParametric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasesSpecificationRangeOperator createCasesSpecificationRangeOperator() {
		CasesSpecificationRangeOperatorImpl casesSpecificationRangeOperator = new CasesSpecificationRangeOperatorImpl();
		return casesSpecificationRangeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedActivityTemplate createTimedActivityTemplate() {
		TimedActivityTemplateImpl timedActivityTemplate = new TimedActivityTemplateImpl();
		return timedActivityTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantaneousActivityTemplate createInstantaneousActivityTemplate() {
		InstantaneousActivityTemplateImpl instantaneousActivityTemplate = new InstantaneousActivityTemplateImpl();
		return instantaneousActivityTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingTemplateSimple createMarkingTemplateSimple() {
		MarkingTemplateSimpleImpl markingTemplateSimple = new MarkingTemplateSimpleImpl();
		return markingTemplateSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingTemplateGlobalVariable createMarkingTemplateGlobalVariable() {
		MarkingTemplateGlobalVariableImpl markingTemplateGlobalVariable = new MarkingTemplateGlobalVariableImpl();
		return markingTemplateGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputGateTemplate createOutputGateTemplate() {
		OutputGateTemplateImpl outputGateTemplate = new OutputGateTemplateImpl();
		return outputGateTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputGateTemplate createInputGateTemplate() {
		InputGateTemplateImpl inputGateTemplate = new InputGateTemplateImpl();
		return inputGateTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT_DEVPackage getSANT_DEVPackage() {
		return (SANT_DEVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SANT_DEVPackage getPackage() {
		return SANT_DEVPackage.eINSTANCE;
	}

} //SANT_DEVFactoryImpl
