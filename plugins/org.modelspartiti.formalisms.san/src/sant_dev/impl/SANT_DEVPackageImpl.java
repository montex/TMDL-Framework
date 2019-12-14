/**
 */
package sant_dev.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import san.SANPackage;

import sant_dev.PlaceTemplate;
import sant_dev.SANT_DEVFactory;
import sant_dev.SANT_DEVPackage;

import tmdl.core.CorePackage;

import tmdl.expressions.ExpressionsPackage;

import tmdl.library.LibraryPackage;

import tmdl.scenario.ScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANT_DEVPackageImpl extends EPackageImpl implements SANT_DEVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass santEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeTemplateEClass = null;

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
	 * @see sant_dev.SANT_DEVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SANT_DEVPackageImpl() {
		super(eNS_URI, SANT_DEVFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SANT_DEVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SANT_DEVPackage init() {
		if (isInited) return (SANT_DEVPackage)EPackage.Registry.INSTANCE.getEPackage(SANT_DEVPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSANT_DEVPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SANT_DEVPackageImpl theSANT_DEVPackage = registeredSANT_DEVPackage instanceof SANT_DEVPackageImpl ? (SANT_DEVPackageImpl)registeredSANT_DEVPackage : new SANT_DEVPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SANPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		LibraryPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSANT_DEVPackage.createPackageContents();

		// Initialize created meta-data
		theSANT_DEVPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSANT_DEVPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SANT_DEVPackage.eNS_URI, theSANT_DEVPackage);
		return theSANT_DEVPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSANT() {
		return santEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSANT_Name() {
		return (EAttribute)santEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_TemplatePlaces() {
		return (EReference)santEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_Place() {
		return (EReference)santEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_Parameters() {
		return (EReference)santEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_GlobalVariables() {
		return (EReference)santEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANT_CustomType() {
		return (EReference)santEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceTemplate() {
		return placeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceTemplate_Multiplicity() {
		return (EReference)placeTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlaceTemplate__GeneratedPlace__Multiplicity() {
		return placeTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT_DEVFactory getSANT_DEVFactory() {
		return (SANT_DEVFactory)getEFactoryInstance();
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
		santEClass = createEClass(SANT);
		createEAttribute(santEClass, SANT__NAME);
		createEReference(santEClass, SANT__TEMPLATE_PLACES);
		createEReference(santEClass, SANT__PLACE);
		createEReference(santEClass, SANT__PARAMETERS);
		createEReference(santEClass, SANT__GLOBAL_VARIABLES);
		createEReference(santEClass, SANT__CUSTOM_TYPE);

		placeTemplateEClass = createEClass(PLACE_TEMPLATE);
		createEReference(placeTemplateEClass, PLACE_TEMPLATE__MULTIPLICITY);
		createEOperation(placeTemplateEClass, PLACE_TEMPLATE___GENERATED_PLACE__MULTIPLICITY);
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
		SANPackage theSANPackage = (SANPackage)EPackage.Registry.INSTANCE.getEPackage(SANPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		santEClass.getESuperTypes().add(theCorePackage.getTemplateModel());
		placeTemplateEClass.getESuperTypes().add(theSANPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(santEClass, sant_dev.SANT.class, "SANT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSANT_Name(), ecorePackage.getEString(), "name", null, 1, 1, sant_dev.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_TemplatePlaces(), this.getPlaceTemplate(), null, "templatePlaces", null, 0, -1, sant_dev.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSANT_TemplatePlaces().getEKeys().add(theSANPackage.getNamedElement_Name());
		initEReference(getSANT_Place(), theSANPackage.getPlace(), null, "place", null, 0, -1, sant_dev.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSANT_Parameters(), theCorePackage.getParameter(), null, "parameters", null, 0, -1, sant_dev.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSANT_Parameters().getEKeys().add(theCorePackage.getParameter_Name());
		initEReference(getSANT_GlobalVariables(), theSANPackage.getGlobalVariable(), null, "globalVariables", null, 0, -1, sant_dev.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSANT_GlobalVariables().getEKeys().add(theSANPackage.getNamedElement_Name());
		initEReference(getSANT_CustomType(), theSANPackage.getCustomTypeDefinition(), null, "customType", null, 0, -1, sant_dev.SANT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeTemplateEClass, PlaceTemplate.class, "PlaceTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceTemplate_Multiplicity(), theCorePackage.getMultiplicity(), null, "multiplicity", null, 0, 1, PlaceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPlaceTemplate__GeneratedPlace__Multiplicity(), theSANPackage.getPlace(), "generatedPlace", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getMultiplicity(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SANT_DEVPackageImpl
