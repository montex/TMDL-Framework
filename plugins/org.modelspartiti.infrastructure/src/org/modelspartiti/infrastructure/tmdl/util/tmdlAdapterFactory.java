/**
 */
package org.modelspartiti.infrastructure.tmdl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modelspartiti.infrastructure.tmdl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage
 * @generated
 */
public class tmdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static tmdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = tmdlPackage.eINSTANCE;
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
	protected tmdlSwitch<Adapter> modelSwitch =
		new tmdlSwitch<Adapter>() {
			@Override
			public Adapter caseTMDLSpecification(TMDLSpecification object) {
				return createTMDLSpecificationAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseTemplateSpecification(TemplateSpecification object) {
				return createTemplateSpecificationAdapter();
			}
			@Override
			public Adapter caseTemplateAtomic(TemplateAtomic object) {
				return createTemplateAtomicAdapter();
			}
			@Override
			public Adapter caseTemplateComposite(TemplateComposite object) {
				return createTemplateCompositeAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseVariant(Variant object) {
				return createVariantAdapter();
			}
			@Override
			public Adapter caseBlockRealization(BlockRealization object) {
				return createBlockRealizationAdapter();
			}
			@Override
			public Adapter caseModelInterface(ModelInterface object) {
				return createModelInterfaceAdapter();
			}
			@Override
			public Adapter caseModelInterfSimple(ModelInterfSimple object) {
				return createModelInterfSimpleAdapter();
			}
			@Override
			public Adapter caseModelInterfArray(ModelInterfArray object) {
				return createModelInterfArrayAdapter();
			}
			@Override
			public Adapter caseCompositionRule(CompositionRule object) {
				return createCompositionRuleAdapter();
			}
			@Override
			public Adapter caseCompositionRuleForwards(CompositionRuleForwards object) {
				return createCompositionRuleForwardsAdapter();
			}
			@Override
			public Adapter caseCompositionRuleAll(CompositionRuleAll object) {
				return createCompositionRuleAllAdapter();
			}
			@Override
			public Adapter caseCompositionRuleMatch(CompositionRuleMatch object) {
				return createCompositionRuleMatchAdapter();
			}
			@Override
			public Adapter caseCompItem(CompItem object) {
				return createCompItemAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseValueInt(ValueInt object) {
				return createValueIntAdapter();
			}
			@Override
			public Adapter caseValueDouble(ValueDouble object) {
				return createValueDoubleAdapter();
			}
			@Override
			public Adapter caseValueArray(ValueArray object) {
				return createValueArrayAdapter();
			}
			@Override
			public Adapter caseValueArrayInt(ValueArrayInt object) {
				return createValueArrayIntAdapter();
			}
			@Override
			public Adapter caseValueArrayDouble(ValueArrayDouble object) {
				return createValueArrayDoubleAdapter();
			}
			@Override
			public Adapter caseMultiplicity(Multiplicity object) {
				return createMultiplicityAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParametric(Parametric object) {
				return createParametricAdapter();
			}
			@Override
			public Adapter caseParambinding(Parambinding object) {
				return createParambindingAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseAvailability(Availability object) {
				return createAvailabilityAdapter();
			}
			@Override
			public Adapter caseReliability(Reliability object) {
				return createReliabilityAdapter();
			}
			@Override
			public Adapter caseMeanTimeToFailure(MeanTimeToFailure object) {
				return createMeanTimeToFailureAdapter();
			}
			@Override
			public Adapter caseStateMetavariable(StateMetavariable object) {
				return createStateMetavariableAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.TMDLSpecification <em>TMDL Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.TMDLSpecification
	 * @generated
	 */
	public Adapter createTMDLSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.TemplateSpecification <em>Template Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateSpecification
	 * @generated
	 */
	public Adapter createTemplateSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.TemplateAtomic <em>Template Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateAtomic
	 * @generated
	 */
	public Adapter createTemplateAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.TemplateComposite <em>Template Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.TemplateComposite
	 * @generated
	 */
	public Adapter createTemplateCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Variant
	 * @generated
	 */
	public Adapter createVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.BlockRealization <em>Block Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.BlockRealization
	 * @generated
	 */
	public Adapter createBlockRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.ModelInterface <em>Model Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterface
	 * @generated
	 */
	public Adapter createModelInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.ModelInterfSimple <em>Model Interf Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterfSimple
	 * @generated
	 */
	public Adapter createModelInterfSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.ModelInterfArray <em>Model Interf Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.ModelInterfArray
	 * @generated
	 */
	public Adapter createModelInterfArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.CompositionRule <em>Composition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRule
	 * @generated
	 */
	public Adapter createCompositionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards <em>Composition Rule Forwards</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleForwards
	 * @generated
	 */
	public Adapter createCompositionRuleForwardsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleAll <em>Composition Rule All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleAll
	 * @generated
	 */
	public Adapter createCompositionRuleAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch <em>Composition Rule Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.CompositionRuleMatch
	 * @generated
	 */
	public Adapter createCompositionRuleMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.CompItem <em>Comp Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.CompItem
	 * @generated
	 */
	public Adapter createCompItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.ValueInt <em>Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueInt
	 * @generated
	 */
	public Adapter createValueIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.ValueDouble <em>Value Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueDouble
	 * @generated
	 */
	public Adapter createValueDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.ValueArray <em>Value Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueArray
	 * @generated
	 */
	public Adapter createValueArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.ValueArrayInt <em>Value Array Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueArrayInt
	 * @generated
	 */
	public Adapter createValueArrayIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.ValueArrayDouble <em>Value Array Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.ValueArrayDouble
	 * @generated
	 */
	public Adapter createValueArrayDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Multiplicity
	 * @generated
	 */
	public Adapter createMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Parametric <em>Parametric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Parametric
	 * @generated
	 */
	public Adapter createParametricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Parambinding <em>Parambinding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Parambinding
	 * @generated
	 */
	public Adapter createParambindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Availability
	 * @generated
	 */
	public Adapter createAvailabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.Reliability
	 * @generated
	 */
	public Adapter createReliabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure <em>Mean Time To Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.MeanTimeToFailure
	 * @generated
	 */
	public Adapter createMeanTimeToFailureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.StateMetavariable <em>State Metavariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.StateMetavariable
	 * @generated
	 */
	public Adapter createStateMetavariableAdapter() {
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

} //tmdlAdapterFactory
