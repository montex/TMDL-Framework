/**
 */
package sant_dev.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import san.Gate;
import san.NamedElement;
import sant_dev.*;

import tmdl.core.Multiplicity;
import tmdl.core.TemplateModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sant_dev.SANT_DEVPackage
 * @generated
 */
public class SANT_DEVAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SANT_DEVPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT_DEVAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SANT_DEVPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SANT_DEVSwitch<Adapter> modelSwitch =
		new SANT_DEVSwitch<Adapter>() {
			@Override
			public Adapter caseSANT(SANT object) {
				return createSANTAdapter();
			}
			@Override
			public Adapter casePlaceTemplate(PlaceTemplate object) {
				return createPlaceTemplateAdapter();
			}
			@Override
			public Adapter caseMultiplicityRangeOperator(MultiplicityRangeOperator object) {
				return createMultiplicityRangeOperatorAdapter();
			}
			@Override
			public Adapter caseMultiplicityArrayIntegerFromReal(MultiplicityArrayIntegerFromReal object) {
				return createMultiplicityArrayIntegerFromRealAdapter();
			}
			@Override
			public Adapter caseActivityTemplate(ActivityTemplate object) {
				return createActivityTemplateAdapter();
			}
			@Override
			public Adapter caseCasesSpecification(CasesSpecification object) {
				return createCasesSpecificationAdapter();
			}
			@Override
			public Adapter caseCasesSpecificationValue(CasesSpecificationValue object) {
				return createCasesSpecificationValueAdapter();
			}
			@Override
			public Adapter caseCasesSpecificationArray(CasesSpecificationArray object) {
				return createCasesSpecificationArrayAdapter();
			}
			@Override
			public Adapter caseCasesSpecificationParametric(CasesSpecificationParametric object) {
				return createCasesSpecificationParametricAdapter();
			}
			@Override
			public Adapter caseCasesSpecificationRangeOperator(CasesSpecificationRangeOperator object) {
				return createCasesSpecificationRangeOperatorAdapter();
			}
			@Override
			public Adapter caseTimedActivityTemplate(TimedActivityTemplate object) {
				return createTimedActivityTemplateAdapter();
			}
			@Override
			public Adapter caseInstantaneousActivityTemplate(InstantaneousActivityTemplate object) {
				return createInstantaneousActivityTemplateAdapter();
			}
			@Override
			public Adapter caseMarkingTemplate(MarkingTemplate object) {
				return createMarkingTemplateAdapter();
			}
			@Override
			public Adapter caseMarkingTemplateSimple(MarkingTemplateSimple object) {
				return createMarkingTemplateSimpleAdapter();
			}
			@Override
			public Adapter caseMarkingTemplateGlobalVariable(MarkingTemplateGlobalVariable object) {
				return createMarkingTemplateGlobalVariableAdapter();
			}
			@Override
			public Adapter caseOutputGateTemplate(OutputGateTemplate object) {
				return createOutputGateTemplateAdapter();
			}
			@Override
			public Adapter caseInputGateTemplate(InputGateTemplate object) {
				return createInputGateTemplateAdapter();
			}
			@Override
			public Adapter caseTemplateModel(TemplateModel object) {
				return createTemplateModelAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseMultiplicity(Multiplicity object) {
				return createMultiplicityAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.SANT <em>SANT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.SANT
	 * @generated
	 */
	public Adapter createSANTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.PlaceTemplate <em>Place Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.PlaceTemplate
	 * @generated
	 */
	public Adapter createPlaceTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.MultiplicityRangeOperator <em>Multiplicity Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.MultiplicityRangeOperator
	 * @generated
	 */
	public Adapter createMultiplicityRangeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.MultiplicityArrayIntegerFromReal <em>Multiplicity Array Integer From Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.MultiplicityArrayIntegerFromReal
	 * @generated
	 */
	public Adapter createMultiplicityArrayIntegerFromRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.ActivityTemplate <em>Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.ActivityTemplate
	 * @generated
	 */
	public Adapter createActivityTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.CasesSpecification <em>Cases Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.CasesSpecification
	 * @generated
	 */
	public Adapter createCasesSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.CasesSpecificationValue <em>Cases Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.CasesSpecificationValue
	 * @generated
	 */
	public Adapter createCasesSpecificationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.CasesSpecificationArray <em>Cases Specification Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.CasesSpecificationArray
	 * @generated
	 */
	public Adapter createCasesSpecificationArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.CasesSpecificationParametric <em>Cases Specification Parametric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.CasesSpecificationParametric
	 * @generated
	 */
	public Adapter createCasesSpecificationParametricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.CasesSpecificationRangeOperator <em>Cases Specification Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.CasesSpecificationRangeOperator
	 * @generated
	 */
	public Adapter createCasesSpecificationRangeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.TimedActivityTemplate <em>Timed Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.TimedActivityTemplate
	 * @generated
	 */
	public Adapter createTimedActivityTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.InstantaneousActivityTemplate <em>Instantaneous Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.InstantaneousActivityTemplate
	 * @generated
	 */
	public Adapter createInstantaneousActivityTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.MarkingTemplate <em>Marking Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.MarkingTemplate
	 * @generated
	 */
	public Adapter createMarkingTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.MarkingTemplateSimple <em>Marking Template Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.MarkingTemplateSimple
	 * @generated
	 */
	public Adapter createMarkingTemplateSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.MarkingTemplateGlobalVariable <em>Marking Template Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.MarkingTemplateGlobalVariable
	 * @generated
	 */
	public Adapter createMarkingTemplateGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.OutputGateTemplate <em>Output Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.OutputGateTemplate
	 * @generated
	 */
	public Adapter createOutputGateTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant_dev.InputGateTemplate <em>Input Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant_dev.InputGateTemplate
	 * @generated
	 */
	public Adapter createInputGateTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.TemplateModel <em>Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.TemplateModel
	 * @generated
	 */
	public Adapter createTemplateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link san.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see san.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.Multiplicity
	 * @generated
	 */
	public Adapter createMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link san.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see san.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SANT_DEVAdapterFactory
