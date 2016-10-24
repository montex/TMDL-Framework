/**
 */
package sant.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sant.*;

import tmdl.core.TemplateModel;

import tmdl.expressions.TemplateExpression;
import tmdl.expressions.TemplateExpressionInteger;

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
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseNormalPlace(NormalPlace object) {
				return createNormalPlaceAdapter();
			}
			@Override
			public Adapter caseExtendedPlace(ExtendedPlace object) {
				return createExtendedPlaceAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseCasesSpecification(CasesSpecification object) {
				return createCasesSpecificationAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseCasesSpecificationCases(CasesSpecificationCases object) {
				return createCasesSpecificationCasesAdapter();
			}
			@Override
			public Adapter caseCasesSpecificationProbabilityArray(CasesSpecificationProbabilityArray object) {
				return createCasesSpecificationProbabilityArrayAdapter();
			}
			@Override
			public Adapter caseCasesSpecificationParametric(CasesSpecificationParametric object) {
				return createCasesSpecificationParametricAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
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
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
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
			public Adapter caseInputGate(InputGate object) {
				return createInputGateAdapter();
			}
			@Override
			public Adapter caseInstantaneousActivity(InstantaneousActivity object) {
				return createInstantaneousActivityAdapter();
			}
			@Override
			public Adapter caseTimedActivity(TimedActivity object) {
				return createTimedActivityAdapter();
			}
			@Override
			public Adapter caseDistribution(Distribution object) {
				return createDistributionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionSegment(ExpressionSegment object) {
				return createExpressionSegmentAdapter();
			}
			@Override
			public Adapter caseExpressionText(ExpressionText object) {
				return createExpressionTextAdapter();
			}
			@Override
			public Adapter caseExpressionMarking(ExpressionMarking object) {
				return createExpressionMarkingAdapter();
			}
			@Override
			public Adapter caseExpressionVariable(ExpressionVariable object) {
				return createExpressionVariableAdapter();
			}
			@Override
			public Adapter caseExpressionTemplateExpression(ExpressionTemplateExpression object) {
				return createExpressionTemplateExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionIterationElement(ExpressionIterationElement object) {
				return createExpressionIterationElementAdapter();
			}
			@Override
			public Adapter caseExpressionActivityCasesNumber(ExpressionActivityCasesNumber object) {
				return createExpressionActivityCasesNumberAdapter();
			}
			@Override
			public Adapter caseExpressionPlaceTemplateSize(ExpressionPlaceTemplateSize object) {
				return createExpressionPlaceTemplateSizeAdapter();
			}
			@Override
			public Adapter caseExpressionIfThenElse(ExpressionIfThenElse object) {
				return createExpressionIfThenElseAdapter();
			}
			@Override
			public Adapter caseExpressionLoop(ExpressionLoop object) {
				return createExpressionLoopAdapter();
			}
			@Override
			public Adapter caseVariabilityIterator(VariabilityIterator object) {
				return createVariabilityIteratorAdapter();
			}
			@Override
			public Adapter caseThisContextIterator(ThisContextIterator object) {
				return createThisContextIteratorAdapter();
			}
			@Override
			public Adapter caseLoopIterator(LoopIterator object) {
				return createLoopIteratorAdapter();
			}
			@Override
			public Adapter caseMarking(Marking object) {
				return createMarkingAdapter();
			}
			@Override
			public Adapter caseMarkingInteger(MarkingInteger object) {
				return createMarkingIntegerAdapter();
			}
			@Override
			public Adapter caseMarkingExtended(MarkingExtended object) {
				return createMarkingExtendedAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseMarkingVariableSimple(MarkingVariableSimple object) {
				return createMarkingVariableSimpleAdapter();
			}
			@Override
			public Adapter caseExponential(Exponential object) {
				return createExponentialAdapter();
			}
			@Override
			public Adapter caseNormal(Normal object) {
				return createNormalAdapter();
			}
			@Override
			public Adapter caseGamma(Gamma object) {
				return createGammaAdapter();
			}
			@Override
			public Adapter caseBinomial(Binomial object) {
				return createBinomialAdapter();
			}
			@Override
			public Adapter caseDeterministic(Deterministic object) {
				return createDeterministicAdapter();
			}
			@Override
			public Adapter caseLognormal(Lognormal object) {
				return createLognormalAdapter();
			}
			@Override
			public Adapter caseBeta(Beta object) {
				return createBetaAdapter();
			}
			@Override
			public Adapter caseNegativeBinomial(NegativeBinomial object) {
				return createNegativeBinomialAdapter();
			}
			@Override
			public Adapter caseGeometric(Geometric object) {
				return createGeometricAdapter();
			}
			@Override
			public Adapter caseErlang(Erlang object) {
				return createErlangAdapter();
			}
			@Override
			public Adapter caseUniform(Uniform object) {
				return createUniformAdapter();
			}
			@Override
			public Adapter caseHyperExponential(HyperExponential object) {
				return createHyperExponentialAdapter();
			}
			@Override
			public Adapter caseWeibull(Weibull object) {
				return createWeibullAdapter();
			}
			@Override
			public Adapter caseTriangular(Triangular object) {
				return createTriangularAdapter();
			}
			@Override
			public Adapter caseConditionalWeibull(ConditionalWeibull object) {
				return createConditionalWeibullAdapter();
			}
			@Override
			public Adapter caseHypoExponential(HypoExponential object) {
				return createHypoExponentialAdapter();
			}
			@Override
			public Adapter casePareto(Pareto object) {
				return createParetoAdapter();
			}
			@Override
			public Adapter caseMarkingSimple(MarkingSimple object) {
				return createMarkingSimpleAdapter();
			}
			@Override
			public Adapter caseMarkingString(MarkingString object) {
				return createMarkingStringAdapter();
			}
			@Override
			public Adapter caseMarkingVariableExtended(MarkingVariableExtended object) {
				return createMarkingVariableExtendedAdapter();
			}
			@Override
			public Adapter caseTemplateModel(TemplateModel object) {
				return createTemplateModelAdapter();
			}
			@Override
			public Adapter caseTemplateExpression(TemplateExpression object) {
				return createTemplateExpressionAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionInteger(TemplateExpressionInteger object) {
				return createTemplateExpressionIntegerAdapter();
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
	 * Creates a new adapter for an object of class '{@link sant.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.NormalPlace <em>Normal Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.NormalPlace
	 * @generated
	 */
	public Adapter createNormalPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExtendedPlace <em>Extended Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExtendedPlace
	 * @generated
	 */
	public Adapter createExtendedPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
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
	 * Creates a new adapter for an object of class '{@link sant.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.CasesSpecificationCases <em>Cases Specification Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.CasesSpecificationCases
	 * @generated
	 */
	public Adapter createCasesSpecificationCasesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link sant.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
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
	 * Creates a new adapter for an object of class '{@link sant.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
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
	 * Creates a new adapter for an object of class '{@link sant.InputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.InputGate
	 * @generated
	 */
	public Adapter createInputGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.InstantaneousActivity <em>Instantaneous Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.InstantaneousActivity
	 * @generated
	 */
	public Adapter createInstantaneousActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.TimedActivity <em>Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.TimedActivity
	 * @generated
	 */
	public Adapter createTimedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Distribution
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionSegment <em>Expression Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionSegment
	 * @generated
	 */
	public Adapter createExpressionSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionText
	 * @generated
	 */
	public Adapter createExpressionTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionMarking <em>Expression Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionMarking
	 * @generated
	 */
	public Adapter createExpressionMarkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionVariable <em>Expression Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionVariable
	 * @generated
	 */
	public Adapter createExpressionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionTemplateExpression <em>Expression Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionTemplateExpression
	 * @generated
	 */
	public Adapter createExpressionTemplateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionIterationElement <em>Expression Iteration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionIterationElement
	 * @generated
	 */
	public Adapter createExpressionIterationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionActivityCasesNumber <em>Expression Activity Cases Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionActivityCasesNumber
	 * @generated
	 */
	public Adapter createExpressionActivityCasesNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionPlaceTemplateSize <em>Expression Place Template Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionPlaceTemplateSize
	 * @generated
	 */
	public Adapter createExpressionPlaceTemplateSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionIfThenElse <em>Expression If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionIfThenElse
	 * @generated
	 */
	public Adapter createExpressionIfThenElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ExpressionLoop <em>Expression Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ExpressionLoop
	 * @generated
	 */
	public Adapter createExpressionLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.VariabilityIterator <em>Variability Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.VariabilityIterator
	 * @generated
	 */
	public Adapter createVariabilityIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ThisContextIterator <em>This Context Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ThisContextIterator
	 * @generated
	 */
	public Adapter createThisContextIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.LoopIterator <em>Loop Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.LoopIterator
	 * @generated
	 */
	public Adapter createLoopIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Marking
	 * @generated
	 */
	public Adapter createMarkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingInteger <em>Marking Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingInteger
	 * @generated
	 */
	public Adapter createMarkingIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingExtended <em>Marking Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingExtended
	 * @generated
	 */
	public Adapter createMarkingExtendedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingVariableSimple <em>Marking Variable Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingVariableSimple
	 * @generated
	 */
	public Adapter createMarkingVariableSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Exponential
	 * @generated
	 */
	public Adapter createExponentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Normal
	 * @generated
	 */
	public Adapter createNormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Gamma
	 * @generated
	 */
	public Adapter createGammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Binomial <em>Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Binomial
	 * @generated
	 */
	public Adapter createBinomialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Deterministic <em>Deterministic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Deterministic
	 * @generated
	 */
	public Adapter createDeterministicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Lognormal <em>Lognormal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Lognormal
	 * @generated
	 */
	public Adapter createLognormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Beta
	 * @generated
	 */
	public Adapter createBetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.NegativeBinomial <em>Negative Binomial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.NegativeBinomial
	 * @generated
	 */
	public Adapter createNegativeBinomialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Geometric <em>Geometric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Geometric
	 * @generated
	 */
	public Adapter createGeometricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Erlang <em>Erlang</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Erlang
	 * @generated
	 */
	public Adapter createErlangAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Uniform
	 * @generated
	 */
	public Adapter createUniformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.HyperExponential <em>Hyper Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.HyperExponential
	 * @generated
	 */
	public Adapter createHyperExponentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Weibull <em>Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Weibull
	 * @generated
	 */
	public Adapter createWeibullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Triangular <em>Triangular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Triangular
	 * @generated
	 */
	public Adapter createTriangularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.ConditionalWeibull <em>Conditional Weibull</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.ConditionalWeibull
	 * @generated
	 */
	public Adapter createConditionalWeibullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.HypoExponential <em>Hypo Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.HypoExponential
	 * @generated
	 */
	public Adapter createHypoExponentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.Pareto <em>Pareto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.Pareto
	 * @generated
	 */
	public Adapter createParetoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingSimple <em>Marking Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingSimple
	 * @generated
	 */
	public Adapter createMarkingSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingString <em>Marking String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingString
	 * @generated
	 */
	public Adapter createMarkingStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sant.MarkingVariableExtended <em>Marking Variable Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sant.MarkingVariableExtended
	 * @generated
	 */
	public Adapter createMarkingVariableExtendedAdapter() {
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
	 * Creates a new adapter for an object of class '{@link tmdl.expressions.TemplateExpression <em>Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.expressions.TemplateExpression
	 * @generated
	 */
	public Adapter createTemplateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.expressions.TemplateExpressionInteger <em>Template Expression Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.expressions.TemplateExpressionInteger
	 * @generated
	 */
	public Adapter createTemplateExpressionIntegerAdapter() {
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
