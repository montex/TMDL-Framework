/**
 */
package sant.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import san.Gate;
import san.NamedElement;

import sant.*;

import tmdl.core.Multiplicity;
import tmdl.core.TemplateModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sant.SANTPackage
 * @generated
 */
public class SANTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SANTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SANTPackage.eINSTANCE;
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
	protected SANTSwitch<Adapter> modelSwitch =
		new SANTSwitch<Adapter>() {
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
			public Adapter caseActivityTemplate(ActivityTemplate object) {
				return createActivityTemplateAdapter();
			}
			@Override
			public Adapter caseCasesSpecification(CasesSpecification object) {
				return createCasesSpecificationAdapter();
			}
			@Override
			public Adapter caseCasesSpecificationConcrete(CasesSpecificationConcrete object) {
				return createCasesSpecificationConcreteAdapter();
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
			public Adapter caseCasesSpecificationProbabilityArray(CasesSpecificationProbabilityArray object) {
				return createCasesSpecificationProbabilityArrayAdapter();
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
			public Adapter caseGateTemplate(GateTemplate object) {
				return createGateTemplateAdapter();
			}
			@Override
			public Adapter caseOutputGate(OutputGate object) {
				return createOutputGateAdapter();
			}
			@Override
			public Adapter caseOutputGateConcrete(OutputGateConcrete object) {
				return createOutputGateConcreteAdapter();
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
			public Adapter caseArcTemplate(ArcTemplate object) {
				return createArcTemplateAdapter();
			}
			@Override
			public Adapter caseInputArc(InputArc object) {
				return createInputArcAdapter();
			}
			@Override
			public Adapter caseOutputArc(OutputArc object) {
				return createOutputArcAdapter();
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
	 * Creates a new adapter for an object of class '{@link sant.SANT <em>SANT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.SANT
	 * @generated
	 */
	public Adapter createSANTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.PlaceTemplate <em>Place Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.PlaceTemplate
	 * @generated
	 */
	public Adapter createPlaceTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MultiplicityRangeOperator <em>Multiplicity Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MultiplicityRangeOperator
	 * @generated
	 */
	public Adapter createMultiplicityRangeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ActivityTemplate <em>Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ActivityTemplate
	 * @generated
	 */
	public Adapter createActivityTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.CasesSpecification <em>Cases Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.CasesSpecification
	 * @generated
	 */
	public Adapter createCasesSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.CasesSpecificationConcrete <em>Cases Specification Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.CasesSpecificationConcrete
	 * @generated
	 */
	public Adapter createCasesSpecificationConcreteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.CasesSpecificationArray <em>Cases Specification Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.CasesSpecificationArray
	 * @generated
	 */
	public Adapter createCasesSpecificationArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.CasesSpecificationParametric <em>Cases Specification Parametric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.CasesSpecificationParametric
	 * @generated
	 */
	public Adapter createCasesSpecificationParametricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.CasesSpecificationProbabilityArray <em>Cases Specification Probability Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.CasesSpecificationProbabilityArray
	 * @generated
	 */
	public Adapter createCasesSpecificationProbabilityArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.TimedActivityTemplate <em>Timed Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.TimedActivityTemplate
	 * @generated
	 */
	public Adapter createTimedActivityTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.InstantaneousActivityTemplate <em>Instantaneous Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.InstantaneousActivityTemplate
	 * @generated
	 */
	public Adapter createInstantaneousActivityTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingTemplate <em>Marking Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingTemplate
	 * @generated
	 */
	public Adapter createMarkingTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingTemplateSimple <em>Marking Template Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingTemplateSimple
	 * @generated
	 */
	public Adapter createMarkingTemplateSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingTemplateGlobalVariable <em>Marking Template Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingTemplateGlobalVariable
	 * @generated
	 */
	public Adapter createMarkingTemplateGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.GateTemplate <em>Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.GateTemplate
	 * @generated
	 */
	public Adapter createGateTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.OutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.OutputGate
	 * @generated
	 */
	public Adapter createOutputGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.OutputGateConcrete <em>Output Gate Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.OutputGateConcrete
	 * @generated
	 */
	public Adapter createOutputGateConcreteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.OutputGateTemplate <em>Output Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.OutputGateTemplate
	 * @generated
	 */
	public Adapter createOutputGateTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.InputGateTemplate <em>Input Gate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.InputGateTemplate
	 * @generated
	 */
	public Adapter createInputGateTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ArcTemplate <em>Arc Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ArcTemplate
	 * @generated
	 */
	public Adapter createArcTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.InputArc <em>Input Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.InputArc
	 * @generated
	 */
	public Adapter createInputArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.OutputArc <em>Output Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.OutputArc
	 * @generated
	 */
	public Adapter createOutputArcAdapter() {
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

} //SANTAdapterFactory
