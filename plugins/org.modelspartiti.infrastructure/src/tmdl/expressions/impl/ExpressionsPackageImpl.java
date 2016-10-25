/**
 */
package tmdl.expressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tmdl.core.CorePackage;

import tmdl.core.impl.CorePackageImpl;

import tmdl.expressions.ArrayAggregateKind;
import tmdl.expressions.ExpressionsFactory;
import tmdl.expressions.ExpressionsPackage;
import tmdl.expressions.TemplateExpression;
import tmdl.expressions.TemplateExpressionArrayAggregate;
import tmdl.expressions.TemplateExpressionBoolaenLiteral;
import tmdl.expressions.TemplateExpressionBoolean;
import tmdl.expressions.TemplateExpressionBooleanAnd;
import tmdl.expressions.TemplateExpressionBooleanBinaryOperation;
import tmdl.expressions.TemplateExpressionBooleanNot;
import tmdl.expressions.TemplateExpressionBooleanOr;
import tmdl.expressions.TemplateExpressionBooleanToInteger;
import tmdl.expressions.TemplateExpressionBooleanUnaryOperation;
import tmdl.expressions.TemplateExpressionInteger;
import tmdl.expressions.TemplateExpressionIntegerFromReal;
import tmdl.expressions.TemplateExpressionIntegerLiteral;
import tmdl.expressions.TemplateExpressionParameterArraySize;
import tmdl.expressions.TemplateExpressionParameterArrayValueAt;
import tmdl.expressions.TemplateExpressionParameterSimple;
import tmdl.expressions.TemplateExpressionReal;
import tmdl.expressions.TemplateExpressionRealBinaryOperation;
import tmdl.expressions.TemplateExpressionRealCeil;
import tmdl.expressions.TemplateExpressionRealDivide;
import tmdl.expressions.TemplateExpressionRealFloor;
import tmdl.expressions.TemplateExpressionRealFromInteger;
import tmdl.expressions.TemplateExpressionRealIfThenElse;
import tmdl.expressions.TemplateExpressionRealLiteral;
import tmdl.expressions.TemplateExpressionRealModulo;
import tmdl.expressions.TemplateExpressionRealMultiply;
import tmdl.expressions.TemplateExpressionRealRound;
import tmdl.expressions.TemplateExpressionRealSubtract;
import tmdl.expressions.TemplateExpressionRealSum;
import tmdl.expressions.TemplateExpressionRealUnary;

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
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionBoolaenLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionIntegerFromRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealFromIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionParameterSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionParameterArrayValueAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionParameterArraySizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionArrayAggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealBinaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealSumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealSubtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealMultiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealDivideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealModuloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealUnaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealFloorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealCeilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealRoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionRealIfThenElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionBooleanUnaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionBooleanNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionBooleanToIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionBooleanBinaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionBooleanAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpressionBooleanOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arrayAggregateKindEEnum = null;

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
	 * @see tmdl.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init() {
		if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpression() {
		return templateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionInteger() {
		return templateExpressionIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionInteger__Evaluate__EList() {
		return templateExpressionIntegerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionReal() {
		return templateExpressionRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionReal__Evaluate__EList() {
		return templateExpressionRealEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBoolean() {
		return templateExpressionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionBoolean__Evaluate__EList() {
		return templateExpressionBooleanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionIntegerLiteral() {
		return templateExpressionIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateExpressionIntegerLiteral_Value() {
		return (EAttribute)templateExpressionIntegerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionIntegerLiteral__Evaluate__EList() {
		return templateExpressionIntegerLiteralEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealLiteral() {
		return templateExpressionRealLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateExpressionRealLiteral_Value() {
		return (EAttribute)templateExpressionRealLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealLiteral__Evaluate__EList() {
		return templateExpressionRealLiteralEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBoolaenLiteral() {
		return templateExpressionBoolaenLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateExpressionBoolaenLiteral_Value() {
		return (EAttribute)templateExpressionBoolaenLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionBoolaenLiteral__Evaluate__EList() {
		return templateExpressionBoolaenLiteralEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionIntegerFromReal() {
		return templateExpressionIntegerFromRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionIntegerFromReal_Exp() {
		return (EReference)templateExpressionIntegerFromRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionIntegerFromReal__Evaluate__EList() {
		return templateExpressionIntegerFromRealEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealFromInteger() {
		return templateExpressionRealFromIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealFromInteger_Exp() {
		return (EReference)templateExpressionRealFromIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealFromInteger__Evaluate__EList() {
		return templateExpressionRealFromIntegerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionParameterSimple() {
		return templateExpressionParameterSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionParameterSimple_Parameter() {
		return (EReference)templateExpressionParameterSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionParameterSimple__Evaluate__EList() {
		return templateExpressionParameterSimpleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionParameterArrayValueAt() {
		return templateExpressionParameterArrayValueAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionParameterArrayValueAt_Parameter() {
		return (EReference)templateExpressionParameterArrayValueAtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionParameterArrayValueAt_Position() {
		return (EReference)templateExpressionParameterArrayValueAtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionParameterArrayValueAt__Evaluate__EList() {
		return templateExpressionParameterArrayValueAtEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionParameterArraySize() {
		return templateExpressionParameterArraySizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionParameterArraySize_Parameter() {
		return (EReference)templateExpressionParameterArraySizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionParameterArraySize__Evaluate__EList() {
		return templateExpressionParameterArraySizeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionArrayAggregate() {
		return templateExpressionArrayAggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionArrayAggregate_Parameter() {
		return (EReference)templateExpressionArrayAggregateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateExpressionArrayAggregate_Function() {
		return (EAttribute)templateExpressionArrayAggregateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionArrayAggregate__Evaluate__EList() {
		return templateExpressionArrayAggregateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealBinaryOperation() {
		return templateExpressionRealBinaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealBinaryOperation_Exp1() {
		return (EReference)templateExpressionRealBinaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealBinaryOperation_Exp2() {
		return (EReference)templateExpressionRealBinaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealSum() {
		return templateExpressionRealSumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealSum__Evaluate__EList() {
		return templateExpressionRealSumEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealSubtract() {
		return templateExpressionRealSubtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealSubtract__Evaluate__EList() {
		return templateExpressionRealSubtractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealMultiply() {
		return templateExpressionRealMultiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealMultiply__Evaluate__EList() {
		return templateExpressionRealMultiplyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealDivide() {
		return templateExpressionRealDivideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealDivide__Evaluate__EList() {
		return templateExpressionRealDivideEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealModulo() {
		return templateExpressionRealModuloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealModulo_Exp1() {
		return (EReference)templateExpressionRealModuloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealModulo_Exp2() {
		return (EReference)templateExpressionRealModuloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealModulo__Evaluate__EList() {
		return templateExpressionRealModuloEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealUnary() {
		return templateExpressionRealUnaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealUnary_Exp() {
		return (EReference)templateExpressionRealUnaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealFloor() {
		return templateExpressionRealFloorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealFloor_Exp() {
		return (EReference)templateExpressionRealFloorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealFloor__Evaluate__EList() {
		return templateExpressionRealFloorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealCeil() {
		return templateExpressionRealCeilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealCeil_Exp() {
		return (EReference)templateExpressionRealCeilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealCeil__Evaluate__EList() {
		return templateExpressionRealCeilEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealRound() {
		return templateExpressionRealRoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealRound_Exp() {
		return (EReference)templateExpressionRealRoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealRound__Evaluate__EList() {
		return templateExpressionRealRoundEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionRealIfThenElse() {
		return templateExpressionRealIfThenElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealIfThenElse_Condition() {
		return (EReference)templateExpressionRealIfThenElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealIfThenElse_IfTrue() {
		return (EReference)templateExpressionRealIfThenElseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealIfThenElse_IfFalse() {
		return (EReference)templateExpressionRealIfThenElseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionRealIfThenElse__Evaluate__EList() {
		return templateExpressionRealIfThenElseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBooleanUnaryOperation() {
		return templateExpressionBooleanUnaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionBooleanUnaryOperation_Exp() {
		return (EReference)templateExpressionBooleanUnaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBooleanNot() {
		return templateExpressionBooleanNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionBooleanNot__Evaluate__EList() {
		return templateExpressionBooleanNotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBooleanToInteger() {
		return templateExpressionBooleanToIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionBooleanToInteger_Exp() {
		return (EReference)templateExpressionBooleanToIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionBooleanToInteger__Evaluate__EList() {
		return templateExpressionBooleanToIntegerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBooleanBinaryOperation() {
		return templateExpressionBooleanBinaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionBooleanBinaryOperation_Exp1() {
		return (EReference)templateExpressionBooleanBinaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionBooleanBinaryOperation_Exp2() {
		return (EReference)templateExpressionBooleanBinaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBooleanAnd() {
		return templateExpressionBooleanAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionBooleanAnd__Evaluate__EList() {
		return templateExpressionBooleanAndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBooleanOr() {
		return templateExpressionBooleanOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateExpressionBooleanOr__Evaluate__EList() {
		return templateExpressionBooleanOrEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArrayAggregateKind() {
		return arrayAggregateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory)getEFactoryInstance();
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
		templateExpressionEClass = createEClass(TEMPLATE_EXPRESSION);

		templateExpressionIntegerEClass = createEClass(TEMPLATE_EXPRESSION_INTEGER);
		createEOperation(templateExpressionIntegerEClass, TEMPLATE_EXPRESSION_INTEGER___EVALUATE__ELIST);

		templateExpressionRealEClass = createEClass(TEMPLATE_EXPRESSION_REAL);
		createEOperation(templateExpressionRealEClass, TEMPLATE_EXPRESSION_REAL___EVALUATE__ELIST);

		templateExpressionBooleanEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN);
		createEOperation(templateExpressionBooleanEClass, TEMPLATE_EXPRESSION_BOOLEAN___EVALUATE__ELIST);

		templateExpressionIntegerLiteralEClass = createEClass(TEMPLATE_EXPRESSION_INTEGER_LITERAL);
		createEAttribute(templateExpressionIntegerLiteralEClass, TEMPLATE_EXPRESSION_INTEGER_LITERAL__VALUE);
		createEOperation(templateExpressionIntegerLiteralEClass, TEMPLATE_EXPRESSION_INTEGER_LITERAL___EVALUATE__ELIST);

		templateExpressionRealLiteralEClass = createEClass(TEMPLATE_EXPRESSION_REAL_LITERAL);
		createEAttribute(templateExpressionRealLiteralEClass, TEMPLATE_EXPRESSION_REAL_LITERAL__VALUE);
		createEOperation(templateExpressionRealLiteralEClass, TEMPLATE_EXPRESSION_REAL_LITERAL___EVALUATE__ELIST);

		templateExpressionBoolaenLiteralEClass = createEClass(TEMPLATE_EXPRESSION_BOOLAEN_LITERAL);
		createEAttribute(templateExpressionBoolaenLiteralEClass, TEMPLATE_EXPRESSION_BOOLAEN_LITERAL__VALUE);
		createEOperation(templateExpressionBoolaenLiteralEClass, TEMPLATE_EXPRESSION_BOOLAEN_LITERAL___EVALUATE__ELIST);

		templateExpressionIntegerFromRealEClass = createEClass(TEMPLATE_EXPRESSION_INTEGER_FROM_REAL);
		createEReference(templateExpressionIntegerFromRealEClass, TEMPLATE_EXPRESSION_INTEGER_FROM_REAL__EXP);
		createEOperation(templateExpressionIntegerFromRealEClass, TEMPLATE_EXPRESSION_INTEGER_FROM_REAL___EVALUATE__ELIST);

		templateExpressionRealFromIntegerEClass = createEClass(TEMPLATE_EXPRESSION_REAL_FROM_INTEGER);
		createEReference(templateExpressionRealFromIntegerEClass, TEMPLATE_EXPRESSION_REAL_FROM_INTEGER__EXP);
		createEOperation(templateExpressionRealFromIntegerEClass, TEMPLATE_EXPRESSION_REAL_FROM_INTEGER___EVALUATE__ELIST);

		templateExpressionParameterSimpleEClass = createEClass(TEMPLATE_EXPRESSION_PARAMETER_SIMPLE);
		createEReference(templateExpressionParameterSimpleEClass, TEMPLATE_EXPRESSION_PARAMETER_SIMPLE__PARAMETER);
		createEOperation(templateExpressionParameterSimpleEClass, TEMPLATE_EXPRESSION_PARAMETER_SIMPLE___EVALUATE__ELIST);

		templateExpressionParameterArrayValueAtEClass = createEClass(TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT);
		createEReference(templateExpressionParameterArrayValueAtEClass, TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT__PARAMETER);
		createEReference(templateExpressionParameterArrayValueAtEClass, TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT__POSITION);
		createEOperation(templateExpressionParameterArrayValueAtEClass, TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT___EVALUATE__ELIST);

		templateExpressionParameterArraySizeEClass = createEClass(TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE);
		createEReference(templateExpressionParameterArraySizeEClass, TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER);
		createEOperation(templateExpressionParameterArraySizeEClass, TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE___EVALUATE__ELIST);

		templateExpressionArrayAggregateEClass = createEClass(TEMPLATE_EXPRESSION_ARRAY_AGGREGATE);
		createEReference(templateExpressionArrayAggregateEClass, TEMPLATE_EXPRESSION_ARRAY_AGGREGATE__PARAMETER);
		createEAttribute(templateExpressionArrayAggregateEClass, TEMPLATE_EXPRESSION_ARRAY_AGGREGATE__FUNCTION);
		createEOperation(templateExpressionArrayAggregateEClass, TEMPLATE_EXPRESSION_ARRAY_AGGREGATE___EVALUATE__ELIST);

		templateExpressionRealBinaryOperationEClass = createEClass(TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION);
		createEReference(templateExpressionRealBinaryOperationEClass, TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP1);
		createEReference(templateExpressionRealBinaryOperationEClass, TEMPLATE_EXPRESSION_REAL_BINARY_OPERATION__EXP2);

		templateExpressionRealSumEClass = createEClass(TEMPLATE_EXPRESSION_REAL_SUM);
		createEOperation(templateExpressionRealSumEClass, TEMPLATE_EXPRESSION_REAL_SUM___EVALUATE__ELIST);

		templateExpressionRealSubtractEClass = createEClass(TEMPLATE_EXPRESSION_REAL_SUBTRACT);
		createEOperation(templateExpressionRealSubtractEClass, TEMPLATE_EXPRESSION_REAL_SUBTRACT___EVALUATE__ELIST);

		templateExpressionRealMultiplyEClass = createEClass(TEMPLATE_EXPRESSION_REAL_MULTIPLY);
		createEOperation(templateExpressionRealMultiplyEClass, TEMPLATE_EXPRESSION_REAL_MULTIPLY___EVALUATE__ELIST);

		templateExpressionRealDivideEClass = createEClass(TEMPLATE_EXPRESSION_REAL_DIVIDE);
		createEOperation(templateExpressionRealDivideEClass, TEMPLATE_EXPRESSION_REAL_DIVIDE___EVALUATE__ELIST);

		templateExpressionRealModuloEClass = createEClass(TEMPLATE_EXPRESSION_REAL_MODULO);
		createEReference(templateExpressionRealModuloEClass, TEMPLATE_EXPRESSION_REAL_MODULO__EXP1);
		createEReference(templateExpressionRealModuloEClass, TEMPLATE_EXPRESSION_REAL_MODULO__EXP2);
		createEOperation(templateExpressionRealModuloEClass, TEMPLATE_EXPRESSION_REAL_MODULO___EVALUATE__ELIST);

		templateExpressionRealUnaryEClass = createEClass(TEMPLATE_EXPRESSION_REAL_UNARY);
		createEReference(templateExpressionRealUnaryEClass, TEMPLATE_EXPRESSION_REAL_UNARY__EXP);

		templateExpressionRealFloorEClass = createEClass(TEMPLATE_EXPRESSION_REAL_FLOOR);
		createEReference(templateExpressionRealFloorEClass, TEMPLATE_EXPRESSION_REAL_FLOOR__EXP);
		createEOperation(templateExpressionRealFloorEClass, TEMPLATE_EXPRESSION_REAL_FLOOR___EVALUATE__ELIST);

		templateExpressionRealCeilEClass = createEClass(TEMPLATE_EXPRESSION_REAL_CEIL);
		createEReference(templateExpressionRealCeilEClass, TEMPLATE_EXPRESSION_REAL_CEIL__EXP);
		createEOperation(templateExpressionRealCeilEClass, TEMPLATE_EXPRESSION_REAL_CEIL___EVALUATE__ELIST);

		templateExpressionRealRoundEClass = createEClass(TEMPLATE_EXPRESSION_REAL_ROUND);
		createEReference(templateExpressionRealRoundEClass, TEMPLATE_EXPRESSION_REAL_ROUND__EXP);
		createEOperation(templateExpressionRealRoundEClass, TEMPLATE_EXPRESSION_REAL_ROUND___EVALUATE__ELIST);

		templateExpressionRealIfThenElseEClass = createEClass(TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE);
		createEReference(templateExpressionRealIfThenElseEClass, TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION);
		createEReference(templateExpressionRealIfThenElseEClass, TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE);
		createEReference(templateExpressionRealIfThenElseEClass, TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE);
		createEOperation(templateExpressionRealIfThenElseEClass, TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE___EVALUATE__ELIST);

		templateExpressionBooleanUnaryOperationEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION);
		createEReference(templateExpressionBooleanUnaryOperationEClass, TEMPLATE_EXPRESSION_BOOLEAN_UNARY_OPERATION__EXP);

		templateExpressionBooleanNotEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_NOT);
		createEOperation(templateExpressionBooleanNotEClass, TEMPLATE_EXPRESSION_BOOLEAN_NOT___EVALUATE__ELIST);

		templateExpressionBooleanToIntegerEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER);
		createEReference(templateExpressionBooleanToIntegerEClass, TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER__EXP);
		createEOperation(templateExpressionBooleanToIntegerEClass, TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER___EVALUATE__ELIST);

		templateExpressionBooleanBinaryOperationEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION);
		createEReference(templateExpressionBooleanBinaryOperationEClass, TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP1);
		createEReference(templateExpressionBooleanBinaryOperationEClass, TEMPLATE_EXPRESSION_BOOLEAN_BINARY_OPERATION__EXP2);

		templateExpressionBooleanAndEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_AND);
		createEOperation(templateExpressionBooleanAndEClass, TEMPLATE_EXPRESSION_BOOLEAN_AND___EVALUATE__ELIST);

		templateExpressionBooleanOrEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_OR);
		createEOperation(templateExpressionBooleanOrEClass, TEMPLATE_EXPRESSION_BOOLEAN_OR___EVALUATE__ELIST);

		// Create enums
		arrayAggregateKindEEnum = createEEnum(ARRAY_AGGREGATE_KIND);
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
		templateExpressionIntegerEClass.getESuperTypes().add(this.getTemplateExpression());
		templateExpressionRealEClass.getESuperTypes().add(this.getTemplateExpression());
		templateExpressionBooleanEClass.getESuperTypes().add(this.getTemplateExpression());
		templateExpressionIntegerLiteralEClass.getESuperTypes().add(this.getTemplateExpressionInteger());
		templateExpressionRealLiteralEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionBoolaenLiteralEClass.getESuperTypes().add(this.getTemplateExpressionBoolean());
		templateExpressionIntegerFromRealEClass.getESuperTypes().add(this.getTemplateExpressionInteger());
		templateExpressionRealFromIntegerEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionParameterSimpleEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionParameterArrayValueAtEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionParameterArraySizeEClass.getESuperTypes().add(this.getTemplateExpressionInteger());
		templateExpressionArrayAggregateEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionRealBinaryOperationEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionRealSumEClass.getESuperTypes().add(this.getTemplateExpressionRealBinaryOperation());
		templateExpressionRealSubtractEClass.getESuperTypes().add(this.getTemplateExpressionRealBinaryOperation());
		templateExpressionRealMultiplyEClass.getESuperTypes().add(this.getTemplateExpressionRealBinaryOperation());
		templateExpressionRealDivideEClass.getESuperTypes().add(this.getTemplateExpressionRealBinaryOperation());
		templateExpressionRealModuloEClass.getESuperTypes().add(this.getTemplateExpressionInteger());
		templateExpressionRealUnaryEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionRealFloorEClass.getESuperTypes().add(this.getTemplateExpressionInteger());
		templateExpressionRealCeilEClass.getESuperTypes().add(this.getTemplateExpressionInteger());
		templateExpressionRealRoundEClass.getESuperTypes().add(this.getTemplateExpressionInteger());
		templateExpressionRealIfThenElseEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionBooleanUnaryOperationEClass.getESuperTypes().add(this.getTemplateExpressionBoolean());
		templateExpressionBooleanNotEClass.getESuperTypes().add(this.getTemplateExpressionBooleanUnaryOperation());
		templateExpressionBooleanToIntegerEClass.getESuperTypes().add(this.getTemplateExpressionInteger());
		templateExpressionBooleanBinaryOperationEClass.getESuperTypes().add(this.getTemplateExpressionBoolean());
		templateExpressionBooleanAndEClass.getESuperTypes().add(this.getTemplateExpressionBooleanBinaryOperation());
		templateExpressionBooleanOrEClass.getESuperTypes().add(this.getTemplateExpressionBooleanBinaryOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(templateExpressionEClass, TemplateExpression.class, "TemplateExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionIntegerEClass, TemplateExpressionInteger.class, "TemplateExpressionInteger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTemplateExpressionInteger__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealEClass, TemplateExpressionReal.class, "TemplateExpressionReal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionReal__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionBooleanEClass, TemplateExpressionBoolean.class, "TemplateExpressionBoolean", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionBoolean__Evaluate__EList(), ecorePackage.getEBoolean(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionIntegerLiteralEClass, TemplateExpressionIntegerLiteral.class, "TemplateExpressionIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateExpressionIntegerLiteral_Value(), ecorePackage.getEInt(), "value", null, 1, 1, TemplateExpressionIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionIntegerLiteral__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealLiteralEClass, TemplateExpressionRealLiteral.class, "TemplateExpressionRealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateExpressionRealLiteral_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, TemplateExpressionRealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionRealLiteral__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionBoolaenLiteralEClass, TemplateExpressionBoolaenLiteral.class, "TemplateExpressionBoolaenLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateExpressionBoolaenLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, TemplateExpressionBoolaenLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionBoolaenLiteral__Evaluate__EList(), ecorePackage.getEBoolean(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionIntegerFromRealEClass, TemplateExpressionIntegerFromReal.class, "TemplateExpressionIntegerFromReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionIntegerFromReal_Exp(), this.getTemplateExpressionReal(), null, "exp", null, 1, 1, TemplateExpressionIntegerFromReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionIntegerFromReal__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealFromIntegerEClass, TemplateExpressionRealFromInteger.class, "TemplateExpressionRealFromInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealFromInteger_Exp(), this.getTemplateExpressionInteger(), null, "exp", null, 1, 1, TemplateExpressionRealFromInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionRealFromInteger__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionParameterSimpleEClass, TemplateExpressionParameterSimple.class, "TemplateExpressionParameterSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionParameterSimple_Parameter(), theCorePackage.getParameterSimple(), null, "parameter", null, 1, 1, TemplateExpressionParameterSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionParameterSimple__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionParameterArrayValueAtEClass, TemplateExpressionParameterArrayValueAt.class, "TemplateExpressionParameterArrayValueAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionParameterArrayValueAt_Parameter(), theCorePackage.getParameterArray(), null, "parameter", null, 1, 1, TemplateExpressionParameterArrayValueAt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionParameterArrayValueAt_Position(), this.getTemplateExpressionInteger(), null, "position", null, 1, 1, TemplateExpressionParameterArrayValueAt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionParameterArrayValueAt__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionParameterArraySizeEClass, TemplateExpressionParameterArraySize.class, "TemplateExpressionParameterArraySize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionParameterArraySize_Parameter(), theCorePackage.getParameterArray(), null, "parameter", null, 1, 1, TemplateExpressionParameterArraySize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionParameterArraySize__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionArrayAggregateEClass, TemplateExpressionArrayAggregate.class, "TemplateExpressionArrayAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionArrayAggregate_Parameter(), theCorePackage.getParameterArray(), null, "parameter", null, 1, 1, TemplateExpressionArrayAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateExpressionArrayAggregate_Function(), this.getArrayAggregateKind(), "function", null, 1, 1, TemplateExpressionArrayAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionArrayAggregate__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealBinaryOperationEClass, TemplateExpressionRealBinaryOperation.class, "TemplateExpressionRealBinaryOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealBinaryOperation_Exp1(), this.getTemplateExpressionReal(), null, "exp1", null, 1, 1, TemplateExpressionRealBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionRealBinaryOperation_Exp2(), this.getTemplateExpressionReal(), null, "exp2", null, 1, 1, TemplateExpressionRealBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionRealSumEClass, TemplateExpressionRealSum.class, "TemplateExpressionRealSum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionRealSum__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealSubtractEClass, TemplateExpressionRealSubtract.class, "TemplateExpressionRealSubtract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionRealSubtract__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealMultiplyEClass, TemplateExpressionRealMultiply.class, "TemplateExpressionRealMultiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionRealMultiply__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealDivideEClass, TemplateExpressionRealDivide.class, "TemplateExpressionRealDivide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionRealDivide__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealModuloEClass, TemplateExpressionRealModulo.class, "TemplateExpressionRealModulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealModulo_Exp1(), this.getTemplateExpressionInteger(), null, "exp1", null, 1, 1, TemplateExpressionRealModulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionRealModulo_Exp2(), this.getTemplateExpressionInteger(), null, "exp2", null, 1, 1, TemplateExpressionRealModulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionRealModulo__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealUnaryEClass, TemplateExpressionRealUnary.class, "TemplateExpressionRealUnary", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealUnary_Exp(), this.getTemplateExpressionReal(), null, "exp", null, 1, 1, TemplateExpressionRealUnary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionRealFloorEClass, TemplateExpressionRealFloor.class, "TemplateExpressionRealFloor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealFloor_Exp(), this.getTemplateExpressionReal(), null, "exp", null, 1, 1, TemplateExpressionRealFloor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionRealFloor__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealCeilEClass, TemplateExpressionRealCeil.class, "TemplateExpressionRealCeil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealCeil_Exp(), this.getTemplateExpressionReal(), null, "exp", null, 1, 1, TemplateExpressionRealCeil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionRealCeil__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealRoundEClass, TemplateExpressionRealRound.class, "TemplateExpressionRealRound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealRound_Exp(), this.getTemplateExpressionReal(), null, "exp", null, 1, 1, TemplateExpressionRealRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionRealRound__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionRealIfThenElseEClass, TemplateExpressionRealIfThenElse.class, "TemplateExpressionRealIfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealIfThenElse_Condition(), this.getTemplateExpressionBoolean(), null, "condition", null, 1, 1, TemplateExpressionRealIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionRealIfThenElse_IfTrue(), this.getTemplateExpressionReal(), null, "ifTrue", null, 1, 1, TemplateExpressionRealIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionRealIfThenElse_IfFalse(), this.getTemplateExpressionReal(), null, "ifFalse", null, 1, 1, TemplateExpressionRealIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionRealIfThenElse__Evaluate__EList(), ecorePackage.getEDouble(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionBooleanUnaryOperationEClass, TemplateExpressionBooleanUnaryOperation.class, "TemplateExpressionBooleanUnaryOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionBooleanUnaryOperation_Exp(), this.getTemplateExpressionBoolean(), null, "exp", null, 1, 1, TemplateExpressionBooleanUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionBooleanNotEClass, TemplateExpressionBooleanNot.class, "TemplateExpressionBooleanNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionBooleanNot__Evaluate__EList(), ecorePackage.getEBoolean(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionBooleanToIntegerEClass, TemplateExpressionBooleanToInteger.class, "TemplateExpressionBooleanToInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionBooleanToInteger_Exp(), this.getTemplateExpressionBoolean(), null, "exp", null, 1, 1, TemplateExpressionBooleanToInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateExpressionBooleanToInteger__Evaluate__EList(), ecorePackage.getEInt(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionBooleanBinaryOperationEClass, TemplateExpressionBooleanBinaryOperation.class, "TemplateExpressionBooleanBinaryOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionBooleanBinaryOperation_Exp1(), this.getTemplateExpressionBoolean(), null, "exp1", null, 1, 1, TemplateExpressionBooleanBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionBooleanBinaryOperation_Exp2(), this.getTemplateExpressionBoolean(), null, "exp2", null, 1, 1, TemplateExpressionBooleanBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionBooleanAndEClass, TemplateExpressionBooleanAnd.class, "TemplateExpressionBooleanAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionBooleanAnd__Evaluate__EList(), ecorePackage.getEBoolean(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateExpressionBooleanOrEClass, TemplateExpressionBooleanOr.class, "TemplateExpressionBooleanOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplateExpressionBooleanOr__Evaluate__EList(), ecorePackage.getEBoolean(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getAssignment(), "assignments", 0, -1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arrayAggregateKindEEnum, ArrayAggregateKind.class, "ArrayAggregateKind");
		addEEnumLiteral(arrayAggregateKindEEnum, ArrayAggregateKind.MIN);
		addEEnumLiteral(arrayAggregateKindEEnum, ArrayAggregateKind.MAX);
		addEEnumLiteral(arrayAggregateKindEEnum, ArrayAggregateKind.AVG);
		addEEnumLiteral(arrayAggregateKindEEnum, ArrayAggregateKind.SUM);

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
		  (getTemplateExpressionIntegerLiteral__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "value"
		   });	
		addAnnotation
		  (getTemplateExpressionRealLiteral__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "value"
		   });	
		addAnnotation
		  (getTemplateExpressionBoolaenLiteral__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "value"
		   });	
		addAnnotation
		  (getTemplateExpressionIntegerFromReal__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp.evaluate(assignments).floor()"
		   });	
		addAnnotation
		  (getTemplateExpressionRealFromInteger__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp.evaluate(assignments)"
		   });	
		addAnnotation
		  (getTemplateExpressionParameterSimple__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "assignments->select(as | as.oclIsTypeOf(core::AssignmentSimple))\n\t\t\t\t\t\t->select(a | a.oclAsType(core::AssignmentSimple).parameter = self.parameter)\n\t\t\t\t\t\t->asSequence()->first().oclAsType(core::AssignmentSimple).value"
		   });	
		addAnnotation
		  (getTemplateExpressionParameterArrayValueAt__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "assignments->select(as | as.oclIsTypeOf(core::AssignmentArray))\n\t\t\t\t\t\t->select(a | a.oclAsType(core::AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t\t->asSequence()->first().oclAsType(core::AssignmentArray).values\n\t\t\t\t\t\t->at(position.evaluate(assignments))"
		   });	
		addAnnotation
		  (getTemplateExpressionParameterArraySize__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "assignments->select(as | as.oclIsTypeOf(core::AssignmentArray))\n\t\t\t\t\t\t->select(a | a.oclAsType(core::AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t\t->asSequence()->first().oclAsType(core::AssignmentArray).values\n\t\t\t\t\t\t->size()"
		   });	
		addAnnotation
		  (getTemplateExpressionArrayAggregate__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet array = assignments->select(as | as.oclIsTypeOf(core::AssignmentArray))\n\t\t\t\t\t->select(a | a.oclAsType(core::AssignmentArray).parameter = self.parameter)\n\t\t\t\t\t->asSequence()->first().oclAsType(core::AssignmentArray).values\n\t\t\t\tin\n\t\t\t\t\tif function = ArrayAggregateKind::sum then array->sum()\n\t\t\t\t\telse if function = ArrayAggregateKind::min then array->min()\n\t\t\t\t\telse if function = ArrayAggregateKind::max then array->max()\n\t\t\t\t\telse\n\t\t\t\t\t\tarray->sum()/array->size()\n\t\t\t\t\tendif endif endif"
		   });	
		addAnnotation
		  (getTemplateExpressionRealSum__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp1.evaluate(assignments) + exp2.evaluate(assignments)"
		   });	
		addAnnotation
		  (getTemplateExpressionRealSubtract__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp1.evaluate(assignments) - exp2.evaluate(assignments)"
		   });	
		addAnnotation
		  (getTemplateExpressionRealMultiply__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp1.evaluate(assignments) * exp2.evaluate(assignments)"
		   });	
		addAnnotation
		  (getTemplateExpressionRealDivide__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp1.evaluate(assignments) / exp2.evaluate(assignments)"
		   });	
		addAnnotation
		  (getTemplateExpressionRealModulo__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp1.evaluate(assignments).mod(exp2.evaluate(assignments))"
		   });	
		addAnnotation
		  (getTemplateExpressionRealFloor__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp.evaluate(assignments).floor()"
		   });	
		addAnnotation
		  (getTemplateExpressionRealCeil__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tlet n = exp.evaluate(assignments) in\n\t\t\t\tif n.floor() = n.round() then n.floor()+1\n\t\t\t\telse n.round() endif"
		   });	
		addAnnotation
		  (getTemplateExpressionRealRound__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp.evaluate(assignments).round()"
		   });	
		addAnnotation
		  (getTemplateExpressionRealIfThenElse__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tif condition.evaluate(assignments)\n\t\t\t\tthen ifTrue.evaluate(assignments)\n\t\t\t\telse ifFalse.evaluate(assignments)\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getTemplateExpressionBooleanNot__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "not exp.evaluate(assignments)"
		   });	
		addAnnotation
		  (getTemplateExpressionBooleanToInteger__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp.evaluate(assignments)"
		   });	
		addAnnotation
		  (getTemplateExpressionBooleanAnd__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp1.evaluate(assignments) and exp2.evaluate(assignments)"
		   });	
		addAnnotation
		  (getTemplateExpressionBooleanOr__Evaluate__EList(), 
		   source, 
		   new String[] {
			 "body", "exp1.evaluate(assignments) or exp2.evaluate(assignments)"
		   });
	}

} //ExpressionsPackageImpl
