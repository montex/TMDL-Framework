/**
 */
package paramlist.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modelspartiti.infrastructure.tmdl.core.CorePackage;

import org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage;

import org.modelspartiti.infrastructure.tmdl.library.LibraryPackage;

import org.modelspartiti.infrastructure.tmdl.scenario.ScenarioPackage;

import paramlist.ParamList;
import paramlist.ParamlistFactory;
import paramlist.ParamlistPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParamlistPackageImpl extends EPackageImpl implements ParamlistPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramListEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see paramlist.ParamlistPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParamlistPackageImpl() {
		super(eNS_URI, ParamlistFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ParamlistPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParamlistPackage init() {
		if (isInited) return (ParamlistPackage)EPackage.Registry.INSTANCE.getEPackage(ParamlistPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredParamlistPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ParamlistPackageImpl theParamlistPackage = registeredParamlistPackage instanceof ParamlistPackageImpl ? (ParamlistPackageImpl)registeredParamlistPackage : new ParamlistPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ScenarioPackage.eINSTANCE.eClass();
		LibraryPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theParamlistPackage.createPackageContents();

		// Initialize created meta-data
		theParamlistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParamlistPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParamlistPackage.eNS_URI, theParamlistPackage);
		return theParamlistPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParamList() {
		return paramListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParamList_Assignments() {
		return (EReference)paramListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParamlistFactory getParamlistFactory() {
		return (ParamlistFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		paramListEClass = createEClass(PARAM_LIST);
		createEReference(paramListEClass, PARAM_LIST__ASSIGNMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(paramListEClass, ParamList.class, "ParamList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamList_Assignments(), theCorePackage.getAssignment(), null, "assignments", null, 0, -1, ParamList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ParamlistPackageImpl
