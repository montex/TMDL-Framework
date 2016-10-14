/**
 */
package tmdl.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tmdl.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelspartiti.org/infrastructure/tmdl/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = tmdl.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link tmdl.core.ConcreteModel <em>Concrete Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.core.ConcreteModel
	 * @see tmdl.core.impl.CorePackageImpl#getConcreteModel()
	 * @generated
	 */
	int CONCRETE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Concrete Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_MODEL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Templatize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_MODEL___TEMPLATIZE = 0;

	/**
	 * The number of operations of the '<em>Concrete Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tmdl.core.TemplateModel <em>Template Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.core.TemplateModel
	 * @see tmdl.core.impl.CorePackageImpl#getTemplateModel()
	 * @generated
	 */
	int TEMPLATE_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_MODEL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Concretize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_MODEL___CONCRETIZE__ELIST = 0;

	/**
	 * The number of operations of the '<em>Template Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tmdl.core.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.core.impl.ParameterImpl
	 * @see tmdl.core.impl.CorePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tmdl.core.impl.ParameterSimpleImpl <em>Parameter Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.core.impl.ParameterSimpleImpl
	 * @see tmdl.core.impl.CorePackageImpl#getParameterSimple()
	 * @generated
	 */
	int PARAMETER_SIMPLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SIMPLE__NAME = PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>Parameter Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SIMPLE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SIMPLE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.core.impl.ParameterArrayImpl <em>Parameter Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.core.impl.ParameterArrayImpl
	 * @see tmdl.core.impl.CorePackageImpl#getParameterArray()
	 * @generated
	 */
	int PARAMETER_ARRAY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY__NAME = PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>Parameter Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.core.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.core.impl.AssignmentImpl
	 * @see tmdl.core.impl.CorePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 5;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tmdl.core.impl.AssignmentSimpleImpl <em>Assignment Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.core.impl.AssignmentSimpleImpl
	 * @see tmdl.core.impl.CorePackageImpl#getAssignmentSimple()
	 * @generated
	 */
	int ASSIGNMENT_SIMPLE = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_SIMPLE__PARAMETER = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_SIMPLE__VALUE = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_SIMPLE_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_SIMPLE_OPERATION_COUNT = ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmdl.core.impl.AssignmentArrayImpl <em>Assignment Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmdl.core.impl.AssignmentArrayImpl
	 * @see tmdl.core.impl.CorePackageImpl#getAssignmentArray()
	 * @generated
	 */
	int ASSIGNMENT_ARRAY = 7;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ARRAY__PARAMETER = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ARRAY__VALUE = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ARRAY_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ARRAY_OPERATION_COUNT = ASSIGNMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tmdl.core.ConcreteModel <em>Concrete Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Model</em>'.
	 * @see tmdl.core.ConcreteModel
	 * @generated
	 */
	EClass getConcreteModel();

	/**
	 * Returns the meta object for the '{@link tmdl.core.ConcreteModel#templatize() <em>Templatize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Templatize</em>' operation.
	 * @see tmdl.core.ConcreteModel#templatize()
	 * @generated
	 */
	EOperation getConcreteModel__Templatize();

	/**
	 * Returns the meta object for class '{@link tmdl.core.TemplateModel <em>Template Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Model</em>'.
	 * @see tmdl.core.TemplateModel
	 * @generated
	 */
	EClass getTemplateModel();

	/**
	 * Returns the meta object for the '{@link tmdl.core.TemplateModel#concretize(org.eclipse.emf.common.util.EList) <em>Concretize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Concretize</em>' operation.
	 * @see tmdl.core.TemplateModel#concretize(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTemplateModel__Concretize__EList();

	/**
	 * Returns the meta object for class '{@link tmdl.core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see tmdl.core.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute list '{@link tmdl.core.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see tmdl.core.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link tmdl.core.ParameterSimple <em>Parameter Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Simple</em>'.
	 * @see tmdl.core.ParameterSimple
	 * @generated
	 */
	EClass getParameterSimple();

	/**
	 * Returns the meta object for class '{@link tmdl.core.ParameterArray <em>Parameter Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Array</em>'.
	 * @see tmdl.core.ParameterArray
	 * @generated
	 */
	EClass getParameterArray();

	/**
	 * Returns the meta object for class '{@link tmdl.core.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see tmdl.core.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for class '{@link tmdl.core.AssignmentSimple <em>Assignment Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Simple</em>'.
	 * @see tmdl.core.AssignmentSimple
	 * @generated
	 */
	EClass getAssignmentSimple();

	/**
	 * Returns the meta object for the reference '{@link tmdl.core.AssignmentSimple#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see tmdl.core.AssignmentSimple#getParameter()
	 * @see #getAssignmentSimple()
	 * @generated
	 */
	EReference getAssignmentSimple_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link tmdl.core.AssignmentSimple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tmdl.core.AssignmentSimple#getValue()
	 * @see #getAssignmentSimple()
	 * @generated
	 */
	EAttribute getAssignmentSimple_Value();

	/**
	 * Returns the meta object for class '{@link tmdl.core.AssignmentArray <em>Assignment Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Array</em>'.
	 * @see tmdl.core.AssignmentArray
	 * @generated
	 */
	EClass getAssignmentArray();

	/**
	 * Returns the meta object for the reference '{@link tmdl.core.AssignmentArray#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see tmdl.core.AssignmentArray#getParameter()
	 * @see #getAssignmentArray()
	 * @generated
	 */
	EReference getAssignmentArray_Parameter();

	/**
	 * Returns the meta object for the attribute list '{@link tmdl.core.AssignmentArray#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see tmdl.core.AssignmentArray#getValue()
	 * @see #getAssignmentArray()
	 * @generated
	 */
	EAttribute getAssignmentArray_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tmdl.core.ConcreteModel <em>Concrete Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.core.ConcreteModel
		 * @see tmdl.core.impl.CorePackageImpl#getConcreteModel()
		 * @generated
		 */
		EClass CONCRETE_MODEL = eINSTANCE.getConcreteModel();

		/**
		 * The meta object literal for the '<em><b>Templatize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONCRETE_MODEL___TEMPLATIZE = eINSTANCE.getConcreteModel__Templatize();

		/**
		 * The meta object literal for the '{@link tmdl.core.TemplateModel <em>Template Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.core.TemplateModel
		 * @see tmdl.core.impl.CorePackageImpl#getTemplateModel()
		 * @generated
		 */
		EClass TEMPLATE_MODEL = eINSTANCE.getTemplateModel();

		/**
		 * The meta object literal for the '<em><b>Concretize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATE_MODEL___CONCRETIZE__ELIST = eINSTANCE.getTemplateModel__Concretize__EList();

		/**
		 * The meta object literal for the '{@link tmdl.core.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.core.impl.ParameterImpl
		 * @see tmdl.core.impl.CorePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link tmdl.core.impl.ParameterSimpleImpl <em>Parameter Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.core.impl.ParameterSimpleImpl
		 * @see tmdl.core.impl.CorePackageImpl#getParameterSimple()
		 * @generated
		 */
		EClass PARAMETER_SIMPLE = eINSTANCE.getParameterSimple();

		/**
		 * The meta object literal for the '{@link tmdl.core.impl.ParameterArrayImpl <em>Parameter Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.core.impl.ParameterArrayImpl
		 * @see tmdl.core.impl.CorePackageImpl#getParameterArray()
		 * @generated
		 */
		EClass PARAMETER_ARRAY = eINSTANCE.getParameterArray();

		/**
		 * The meta object literal for the '{@link tmdl.core.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.core.impl.AssignmentImpl
		 * @see tmdl.core.impl.CorePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '{@link tmdl.core.impl.AssignmentSimpleImpl <em>Assignment Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.core.impl.AssignmentSimpleImpl
		 * @see tmdl.core.impl.CorePackageImpl#getAssignmentSimple()
		 * @generated
		 */
		EClass ASSIGNMENT_SIMPLE = eINSTANCE.getAssignmentSimple();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_SIMPLE__PARAMETER = eINSTANCE.getAssignmentSimple_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_SIMPLE__VALUE = eINSTANCE.getAssignmentSimple_Value();

		/**
		 * The meta object literal for the '{@link tmdl.core.impl.AssignmentArrayImpl <em>Assignment Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmdl.core.impl.AssignmentArrayImpl
		 * @see tmdl.core.impl.CorePackageImpl#getAssignmentArray()
		 * @generated
		 */
		EClass ASSIGNMENT_ARRAY = eINSTANCE.getAssignmentArray();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_ARRAY__PARAMETER = eINSTANCE.getAssignmentArray_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_ARRAY__VALUE = eINSTANCE.getAssignmentArray_Value();

	}

} //CorePackage
