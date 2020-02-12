/**
 */
package tmdl.library.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tmdl.library.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tmdl.library.LibraryPackage
 * @generated
 */
public class LibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LibraryPackage.eINSTANCE;
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
	protected LibrarySwitch<Adapter> modelSwitch =
		new LibrarySwitch<Adapter>() {
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseModelInterface(ModelInterface object) {
				return createModelInterfaceAdapter();
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
			public Adapter caseInterfaceVariable(InterfaceVariable object) {
				return createInterfaceVariableAdapter();
			}
			@Override
			public Adapter caseCompositionRule(CompositionRule object) {
				return createCompositionRuleAdapter();
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
			public Adapter caseCompositionRuleForwards(CompositionRuleForwards object) {
				return createCompositionRuleForwardsAdapter();
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
	 * Creates a new adapter for an object of class '{@link tmdl.library.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.ModelInterface <em>Model Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.ModelInterface
	 * @generated
	 */
	public Adapter createModelInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.TemplateSpecification <em>Template Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.TemplateSpecification
	 * @generated
	 */
	public Adapter createTemplateSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.TemplateAtomic <em>Template Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.TemplateAtomic
	 * @generated
	 */
	public Adapter createTemplateAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.TemplateComposite <em>Template Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.TemplateComposite
	 * @generated
	 */
	public Adapter createTemplateCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.InterfaceVariable <em>Interface Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.InterfaceVariable
	 * @generated
	 */
	public Adapter createInterfaceVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.CompositionRule <em>Composition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.CompositionRule
	 * @generated
	 */
	public Adapter createCompositionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.CompositionRuleAll <em>Composition Rule All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.CompositionRuleAll
	 * @generated
	 */
	public Adapter createCompositionRuleAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.CompositionRuleMatch <em>Composition Rule Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.CompositionRuleMatch
	 * @generated
	 */
	public Adapter createCompositionRuleMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmdl.library.CompositionRuleForwards <em>Composition Rule Forwards</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmdl.library.CompositionRuleForwards
	 * @generated
	 */
	public Adapter createCompositionRuleForwardsAdapter() {
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

} //LibraryAdapterFactory
