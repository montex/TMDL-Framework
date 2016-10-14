/**
 */
package tmdl.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tmdl.core.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tmdl.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseConcreteModel(ConcreteModel object) {
				return createConcreteModelAdapter();
			}
			@Override
			public Adapter caseTemplateModel(TemplateModel object) {
				return createTemplateModelAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterSimple(ParameterSimple object) {
				return createParameterSimpleAdapter();
			}
			@Override
			public Adapter caseParameterArray(ParameterArray object) {
				return createParameterArrayAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseAssignmentSimple(AssignmentSimple object) {
				return createAssignmentSimpleAdapter();
			}
			@Override
			public Adapter caseAssignmentArray(AssignmentArray object) {
				return createAssignmentArrayAdapter();
			}
			@Override
			public Adapter caseMultiplicity(Multiplicity object) {
				return createMultiplicityAdapter();
			}
			@Override
			public Adapter caseMultiplicityValue(MultiplicityValue object) {
				return createMultiplicityValueAdapter();
			}
			@Override
			public Adapter caseMultiplicityArray(MultiplicityArray object) {
				return createMultiplicityArrayAdapter();
			}
			@Override
			public Adapter caseMultiplicityParametric(MultiplicityParametric object) {
				return createMultiplicityParametricAdapter();
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
	 * Creates a new adapter for an object of class '{@link tmdl.core.ConcreteModel <em>Concrete Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.ConcreteModel
	 * @generated
	 */
	public Adapter createConcreteModelAdapter() {
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
	 * Creates a new adapter for an object of class '{@link tmdl.core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.ParameterSimple <em>Parameter Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.ParameterSimple
	 * @generated
	 */
	public Adapter createParameterSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.ParameterArray <em>Parameter Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.ParameterArray
	 * @generated
	 */
	public Adapter createParameterArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.AssignmentSimple <em>Assignment Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.AssignmentSimple
	 * @generated
	 */
	public Adapter createAssignmentSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.AssignmentArray <em>Assignment Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.AssignmentArray
	 * @generated
	 */
	public Adapter createAssignmentArrayAdapter() {
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
	 * Creates a new adapter for an object of class '{@link tmdl.core.MultiplicityValue <em>Multiplicity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.MultiplicityValue
	 * @generated
	 */
	public Adapter createMultiplicityValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.MultiplicityArray <em>Multiplicity Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.MultiplicityArray
	 * @generated
	 */
	public Adapter createMultiplicityArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.core.MultiplicityParametric <em>Multiplicity Parametric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.core.MultiplicityParametric
	 * @generated
	 */
	public Adapter createMultiplicityParametricAdapter() {
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

} //CoreAdapterFactory
