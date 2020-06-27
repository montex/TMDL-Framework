/**
 */
package tmdl.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tmdl.library.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryFactoryImpl extends EFactoryImpl implements LibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LibraryFactory init() {
		try {
			LibraryFactory theLibraryFactory = (LibraryFactory)EPackage.Registry.INSTANCE.getEFactory(LibraryPackage.eNS_URI);
			if (theLibraryFactory != null) {
				return theLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFactoryImpl() {
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
			case LibraryPackage.LIBRARY: return createLibrary();
			case LibraryPackage.MODEL_INTERFACE: return createModelInterface();
			case LibraryPackage.TEMPLATE_ATOMIC: return createTemplateAtomic();
			case LibraryPackage.TEMPLATE_COMPOSITE: return createTemplateComposite();
			case LibraryPackage.BLOCK: return createBlock();
			case LibraryPackage.INTERFACE_VARIABLE: return createInterfaceVariable();
			case LibraryPackage.COMPOSITION_RULE_ALL: return createCompositionRuleAll();
			case LibraryPackage.COMPOSITION_RULE_MATCH: return createCompositionRuleMatch();
			case LibraryPackage.COMPOSITION_RULE_FORWARDS: return createCompositionRuleForwards();
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
	public ModelInterface createModelInterface() {
		ModelInterfaceImpl modelInterface = new ModelInterfaceImpl();
		return modelInterface;
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
	public InterfaceVariable createInterfaceVariable() {
		InterfaceVariableImpl interfaceVariable = new InterfaceVariableImpl();
		return interfaceVariable;
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
	public LibraryPackage getLibraryPackage() {
		return (LibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LibraryPackage getPackage() {
		return LibraryPackage.eINSTANCE;
	}

} //LibraryFactoryImpl
