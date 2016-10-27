/**
 */
package tmdl.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tmdl.core.Assignment;
import tmdl.core.AssignmentArray;
import tmdl.core.AssignmentSimple;
import tmdl.core.ConcreteModel;
import tmdl.core.CoreFactory;
import tmdl.core.CorePackage;
import tmdl.core.Multiplicity;
import tmdl.core.MultiplicityArray;
import tmdl.core.MultiplicityParametric;
import tmdl.core.MultiplicityValue;
import tmdl.core.Parameter;
import tmdl.core.ParameterArray;
import tmdl.core.ParameterSimple;
import tmdl.core.TemplateModel;

import tmdl.expressions.ExpressionsPackage;

import tmdl.expressions.impl.ExpressionsPackageImpl;

import tmdl.library.LibraryPackage;

import tmdl.library.impl.LibraryPackageImpl;

import tmdl.scenario.ScenarioPackage;

import tmdl.scenario.impl.ScenarioPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityParametricEClass = null;

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
	 * @see tmdl.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteModel() {
		return concreteModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteModel__Templatize() {
		return concreteModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateModel() {
		return templateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateModel__Concretize__EList() {
		return templateModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSimple() {
		return parameterSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterArray() {
		return parameterArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentSimple() {
		return assignmentSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentSimple_Parameter() {
		return (EReference)assignmentSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentSimple_Value() {
		return (EAttribute)assignmentSimpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentArray() {
		return assignmentArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentArray_Parameter() {
		return (EReference)assignmentArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentArray_Values() {
		return (EAttribute)assignmentArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicity() {
		return multiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicity__AsSequence() {
		return multiplicityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicity__AsSequence__EList() {
		return multiplicityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityValue() {
		return multiplicityValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityValue_Value() {
		return (EAttribute)multiplicityValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityValue__AsSequence__EList() {
		return multiplicityValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityArray() {
		return multiplicityArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityArray_Values() {
		return (EAttribute)multiplicityArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityArray__AsSequence__EList() {
		return multiplicityArrayEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityParametric() {
		return multiplicityParametricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityParametric_Parameter() {
		return (EReference)multiplicityParametricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityParametric__AsSequence__EList() {
		return multiplicityParametricEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		concreteModelEClass = createEClass(CONCRETE_MODEL);
		createEOperation(concreteModelEClass, CONCRETE_MODEL___TEMPLATIZE);

		templateModelEClass = createEClass(TEMPLATE_MODEL);
		createEOperation(templateModelEClass, TEMPLATE_MODEL___CONCRETIZE__ELIST);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		parameterSimpleEClass = createEClass(PARAMETER_SIMPLE);

		parameterArrayEClass = createEClass(PARAMETER_ARRAY);

		assignmentEClass = createEClass(ASSIGNMENT);

		assignmentSimpleEClass = createEClass(ASSIGNMENT_SIMPLE);
		createEReference(assignmentSimpleEClass, ASSIGNMENT_SIMPLE__PARAMETER);
		createEAttribute(assignmentSimpleEClass, ASSIGNMENT_SIMPLE__VALUE);

		assignmentArrayEClass = createEClass(ASSIGNMENT_ARRAY);
		createEReference(assignmentArrayEClass, ASSIGNMENT_ARRAY__PARAMETER);
		createEAttribute(assignmentArrayEClass, ASSIGNMENT_ARRAY__VALUES);

		multiplicityEClass = createEClass(MULTIPLICITY);
		createEOperation(multiplicityEClass, MULTIPLICITY___AS_SEQUENCE);
		createEOperation(multiplicityEClass, MULTIPLICITY___AS_SEQUENCE__ELIST);

		multiplicityValueEClass = createEClass(MULTIPLICITY_VALUE);
		createEAttribute(multiplicityValueEClass, MULTIPLICITY_VALUE__VALUE);
		createEOperation(multiplicityValueEClass, MULTIPLICITY_VALUE___AS_SEQUENCE__ELIST);

		multiplicityArrayEClass = createEClass(MULTIPLICITY_ARRAY);
		createEAttribute(multiplicityArrayEClass, MULTIPLICITY_ARRAY__VALUES);
		createEOperation(multiplicityArrayEClass, MULTIPLICITY_ARRAY___AS_SEQUENCE__ELIST);

		multiplicityParametricEClass = createEClass(MULTIPLICITY_PARAMETRIC);
		createEReference(multiplicityParametricEClass, MULTIPLICITY_PARAMETRIC__PARAMETER);
		createEOperation(multiplicityParametricEClass, MULTIPLICITY_PARAMETRIC___AS_SEQUENCE__ELIST);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterSimpleEClass.getESuperTypes().add(this.getParameter());
		parameterArrayEClass.getESuperTypes().add(this.getParameter());
		assignmentSimpleEClass.getESuperTypes().add(this.getAssignment());
		assignmentArrayEClass.getESuperTypes().add(this.getAssignment());
		multiplicityValueEClass.getESuperTypes().add(this.getMultiplicity());
		multiplicityArrayEClass.getESuperTypes().add(this.getMultiplicity());
		multiplicityParametricEClass.getESuperTypes().add(this.getMultiplicity());

		// Initialize classes, features, and operations; add parameters
		initEClass(concreteModelEClass, ConcreteModel.class, "ConcreteModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getConcreteModel__Templatize(), this.getTemplateModel(), "templatize", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(templateModelEClass, TemplateModel.class, "TemplateModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTemplateModel__Concretize__EList(), this.getConcreteModel(), "concretize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssignment(), "parameterValues", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterSimpleEClass, ParameterSimple.class, "ParameterSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterArrayEClass, ParameterArray.class, "ParameterArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentEClass, Assignment.class, "Assignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentSimpleEClass, AssignmentSimple.class, "AssignmentSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentSimple_Parameter(), this.getParameterSimple(), null, "parameter", null, 1, 1, AssignmentSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignmentSimple_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, AssignmentSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentArrayEClass, AssignmentArray.class, "AssignmentArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentArray_Parameter(), this.getParameterArray(), null, "parameter", null, 1, 1, AssignmentArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignmentArray_Values(), ecorePackage.getEDouble(), "values", null, 0, -1, AssignmentArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMultiplicity__AsSequence(), ecorePackage.getEInt(), "asSequence", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMultiplicity__AsSequence__EList(), ecorePackage.getEInt(), "asSequence", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(multiplicityValueEClass, MultiplicityValue.class, "MultiplicityValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, MultiplicityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMultiplicityValue__AsSequence__EList(), ecorePackage.getEInt(), "asSequence", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(multiplicityArrayEClass, MultiplicityArray.class, "MultiplicityArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityArray_Values(), ecorePackage.getEInt(), "values", null, 1, -1, MultiplicityArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMultiplicityArray__AsSequence__EList(), ecorePackage.getEInt(), "asSequence", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(multiplicityParametricEClass, MultiplicityParametric.class, "MultiplicityParametric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityParametric_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, MultiplicityParametric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMultiplicityParametric__AsSequence__EList(), ecorePackage.getEInt(), "asSequence", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (getMultiplicity__AsSequence(), 
		   source, 
		   new String[] {
			 "body", "asSequence(Assignment.allInstances())"
		   });	
		addAnnotation
		  (getMultiplicityValue__AsSequence__EList(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tif value = 0 then Sequence{}\n\t\t\t\telse Sequence{1..value} endif"
		   });	
		addAnnotation
		  (getMultiplicityArray__AsSequence__EList(), 
		   source, 
		   new String[] {
			 "body", "values"
		   });	
		addAnnotation
		  (getMultiplicityParametric__AsSequence__EList(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tif parameter.oclIsTypeOf(AssignmentSimple) then\n\t\t\t\t\tlet v =\tassignments->selectByType(AssignmentSimple)\n\t\t\t\t\t\t\t\t->select(a | a.oclAsType(AssignmentSimple).parameter = self.parameter)\n\t\t\t\t\t\t\t\t->asSequence()->first().oclAsType(AssignmentSimple).value\n\t\t\t\t\tin\n\t\t\t\t\tif v = 0 then Sequence{} else Sequence{1..v} endif\n\t\t\t\telse\n\t\t\t\t\tassignments->selectByType(AssignmentArray)\n\t\t\t\t\t\t\t\t->select(a | a.oclAsType(AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t\t\t\t->asSequence()->first().oclAsType(AssignmentArray).values\n\t\t\t\tendif"
		   });
	}

} //CorePackageImpl
