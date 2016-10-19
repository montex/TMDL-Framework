/**
 */
package tmdl.expressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
import tmdl.expressions.TemplateExpressionBooleanBinary;
import tmdl.expressions.TemplateExpressionBooleanNot;
import tmdl.expressions.TemplateExpressionBooleanOr;
import tmdl.expressions.TemplateExpressionBooleanToInteger;
import tmdl.expressions.TemplateExpressionBooleanUnary;
import tmdl.expressions.TemplateExpressionInteger;
import tmdl.expressions.TemplateExpressionIntegerFromReal;
import tmdl.expressions.TemplateExpressionIntegerLiteral;
import tmdl.expressions.TemplateExpressionParameterArraySize;
import tmdl.expressions.TemplateExpressionParameterArrayValueAt;
import tmdl.expressions.TemplateExpressionParameterSimple;
import tmdl.expressions.TemplateExpressionReal;
import tmdl.expressions.TemplateExpressionRealBinary;
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
	private EClass templateExpressionRealBinaryEClass = null;

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
	private EClass templateExpressionBooleanUnaryEClass = null;

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
	private EClass templateExpressionBooleanBinaryEClass = null;

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
	public EClass getTemplateExpressionReal() {
		return templateExpressionRealEClass;
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
	public EClass getTemplateExpressionRealBinary() {
		return templateExpressionRealBinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealBinary_Exp1() {
		return (EReference)templateExpressionRealBinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionRealBinary_Exp2() {
		return (EReference)templateExpressionRealBinaryEClass.getEStructuralFeatures().get(1);
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
	public EClass getTemplateExpressionRealSubtract() {
		return templateExpressionRealSubtractEClass;
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
	public EClass getTemplateExpressionRealDivide() {
		return templateExpressionRealDivideEClass;
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
	public EClass getTemplateExpressionRealCeil() {
		return templateExpressionRealCeilEClass;
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
	public EClass getTemplateExpressionBooleanUnary() {
		return templateExpressionBooleanUnaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionBooleanUnary_Exp() {
		return (EReference)templateExpressionBooleanUnaryEClass.getEStructuralFeatures().get(0);
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
	public EClass getTemplateExpressionBooleanToInteger() {
		return templateExpressionBooleanToIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExpressionBooleanBinary() {
		return templateExpressionBooleanBinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionBooleanBinary_Exp1() {
		return (EReference)templateExpressionBooleanBinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExpressionBooleanBinary_Exp2() {
		return (EReference)templateExpressionBooleanBinaryEClass.getEStructuralFeatures().get(1);
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
	public EClass getTemplateExpressionBooleanOr() {
		return templateExpressionBooleanOrEClass;
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

		templateExpressionRealEClass = createEClass(TEMPLATE_EXPRESSION_REAL);

		templateExpressionBooleanEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN);

		templateExpressionIntegerLiteralEClass = createEClass(TEMPLATE_EXPRESSION_INTEGER_LITERAL);
		createEAttribute(templateExpressionIntegerLiteralEClass, TEMPLATE_EXPRESSION_INTEGER_LITERAL__VALUE);

		templateExpressionRealLiteralEClass = createEClass(TEMPLATE_EXPRESSION_REAL_LITERAL);
		createEAttribute(templateExpressionRealLiteralEClass, TEMPLATE_EXPRESSION_REAL_LITERAL__VALUE);

		templateExpressionBoolaenLiteralEClass = createEClass(TEMPLATE_EXPRESSION_BOOLAEN_LITERAL);
		createEAttribute(templateExpressionBoolaenLiteralEClass, TEMPLATE_EXPRESSION_BOOLAEN_LITERAL__VALUE);

		templateExpressionIntegerFromRealEClass = createEClass(TEMPLATE_EXPRESSION_INTEGER_FROM_REAL);
		createEReference(templateExpressionIntegerFromRealEClass, TEMPLATE_EXPRESSION_INTEGER_FROM_REAL__EXP);

		templateExpressionRealFromIntegerEClass = createEClass(TEMPLATE_EXPRESSION_REAL_FROM_INTEGER);
		createEReference(templateExpressionRealFromIntegerEClass, TEMPLATE_EXPRESSION_REAL_FROM_INTEGER__EXP);

		templateExpressionParameterSimpleEClass = createEClass(TEMPLATE_EXPRESSION_PARAMETER_SIMPLE);
		createEReference(templateExpressionParameterSimpleEClass, TEMPLATE_EXPRESSION_PARAMETER_SIMPLE__PARAMETER);

		templateExpressionParameterArrayValueAtEClass = createEClass(TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT);
		createEReference(templateExpressionParameterArrayValueAtEClass, TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT__PARAMETER);
		createEReference(templateExpressionParameterArrayValueAtEClass, TEMPLATE_EXPRESSION_PARAMETER_ARRAY_VALUE_AT__POSITION);

		templateExpressionParameterArraySizeEClass = createEClass(TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE);
		createEReference(templateExpressionParameterArraySizeEClass, TEMPLATE_EXPRESSION_PARAMETER_ARRAY_SIZE__PARAMETER);

		templateExpressionArrayAggregateEClass = createEClass(TEMPLATE_EXPRESSION_ARRAY_AGGREGATE);
		createEReference(templateExpressionArrayAggregateEClass, TEMPLATE_EXPRESSION_ARRAY_AGGREGATE__PARAMETER);
		createEAttribute(templateExpressionArrayAggregateEClass, TEMPLATE_EXPRESSION_ARRAY_AGGREGATE__FUNCTION);

		templateExpressionRealBinaryEClass = createEClass(TEMPLATE_EXPRESSION_REAL_BINARY);
		createEReference(templateExpressionRealBinaryEClass, TEMPLATE_EXPRESSION_REAL_BINARY__EXP1);
		createEReference(templateExpressionRealBinaryEClass, TEMPLATE_EXPRESSION_REAL_BINARY__EXP2);

		templateExpressionRealSumEClass = createEClass(TEMPLATE_EXPRESSION_REAL_SUM);

		templateExpressionRealSubtractEClass = createEClass(TEMPLATE_EXPRESSION_REAL_SUBTRACT);

		templateExpressionRealMultiplyEClass = createEClass(TEMPLATE_EXPRESSION_REAL_MULTIPLY);

		templateExpressionRealDivideEClass = createEClass(TEMPLATE_EXPRESSION_REAL_DIVIDE);

		templateExpressionRealModuloEClass = createEClass(TEMPLATE_EXPRESSION_REAL_MODULO);

		templateExpressionRealUnaryEClass = createEClass(TEMPLATE_EXPRESSION_REAL_UNARY);
		createEReference(templateExpressionRealUnaryEClass, TEMPLATE_EXPRESSION_REAL_UNARY__EXP);

		templateExpressionRealFloorEClass = createEClass(TEMPLATE_EXPRESSION_REAL_FLOOR);

		templateExpressionRealCeilEClass = createEClass(TEMPLATE_EXPRESSION_REAL_CEIL);

		templateExpressionRealRoundEClass = createEClass(TEMPLATE_EXPRESSION_REAL_ROUND);

		templateExpressionRealIfThenElseEClass = createEClass(TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE);
		createEReference(templateExpressionRealIfThenElseEClass, TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__CONDITION);
		createEReference(templateExpressionRealIfThenElseEClass, TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_TRUE);
		createEReference(templateExpressionRealIfThenElseEClass, TEMPLATE_EXPRESSION_REAL_IF_THEN_ELSE__IF_FALSE);

		templateExpressionBooleanUnaryEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_UNARY);
		createEReference(templateExpressionBooleanUnaryEClass, TEMPLATE_EXPRESSION_BOOLEAN_UNARY__EXP);

		templateExpressionBooleanNotEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_NOT);

		templateExpressionBooleanToIntegerEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_TO_INTEGER);

		templateExpressionBooleanBinaryEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_BINARY);
		createEReference(templateExpressionBooleanBinaryEClass, TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP1);
		createEReference(templateExpressionBooleanBinaryEClass, TEMPLATE_EXPRESSION_BOOLEAN_BINARY__EXP2);

		templateExpressionBooleanAndEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_AND);

		templateExpressionBooleanOrEClass = createEClass(TEMPLATE_EXPRESSION_BOOLEAN_OR);

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
		templateExpressionRealBinaryEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionRealSumEClass.getESuperTypes().add(this.getTemplateExpressionRealBinary());
		templateExpressionRealSubtractEClass.getESuperTypes().add(this.getTemplateExpressionRealBinary());
		templateExpressionRealMultiplyEClass.getESuperTypes().add(this.getTemplateExpressionRealBinary());
		templateExpressionRealDivideEClass.getESuperTypes().add(this.getTemplateExpressionRealBinary());
		templateExpressionRealModuloEClass.getESuperTypes().add(this.getTemplateExpressionRealBinary());
		templateExpressionRealUnaryEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionRealFloorEClass.getESuperTypes().add(this.getTemplateExpressionRealUnary());
		templateExpressionRealCeilEClass.getESuperTypes().add(this.getTemplateExpressionRealUnary());
		templateExpressionRealRoundEClass.getESuperTypes().add(this.getTemplateExpressionRealUnary());
		templateExpressionRealIfThenElseEClass.getESuperTypes().add(this.getTemplateExpressionReal());
		templateExpressionBooleanUnaryEClass.getESuperTypes().add(this.getTemplateExpressionBoolean());
		templateExpressionBooleanNotEClass.getESuperTypes().add(this.getTemplateExpressionBooleanUnary());
		templateExpressionBooleanToIntegerEClass.getESuperTypes().add(this.getTemplateExpressionBooleanUnary());
		templateExpressionBooleanBinaryEClass.getESuperTypes().add(this.getTemplateExpressionBoolean());
		templateExpressionBooleanAndEClass.getESuperTypes().add(this.getTemplateExpressionBooleanBinary());
		templateExpressionBooleanOrEClass.getESuperTypes().add(this.getTemplateExpressionBooleanBinary());

		// Initialize classes, features, and operations; add parameters
		initEClass(templateExpressionEClass, TemplateExpression.class, "TemplateExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionIntegerEClass, TemplateExpressionInteger.class, "TemplateExpressionInteger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealEClass, TemplateExpressionReal.class, "TemplateExpressionReal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionBooleanEClass, TemplateExpressionBoolean.class, "TemplateExpressionBoolean", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionIntegerLiteralEClass, TemplateExpressionIntegerLiteral.class, "TemplateExpressionIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateExpressionIntegerLiteral_Value(), ecorePackage.getEInt(), "value", null, 1, 1, TemplateExpressionIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionRealLiteralEClass, TemplateExpressionRealLiteral.class, "TemplateExpressionRealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateExpressionRealLiteral_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, TemplateExpressionRealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionBoolaenLiteralEClass, TemplateExpressionBoolaenLiteral.class, "TemplateExpressionBoolaenLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateExpressionBoolaenLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, TemplateExpressionBoolaenLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionIntegerFromRealEClass, TemplateExpressionIntegerFromReal.class, "TemplateExpressionIntegerFromReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionIntegerFromReal_Exp(), this.getTemplateExpressionReal(), null, "exp", null, 1, 1, TemplateExpressionIntegerFromReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionRealFromIntegerEClass, TemplateExpressionRealFromInteger.class, "TemplateExpressionRealFromInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealFromInteger_Exp(), this.getTemplateExpressionInteger(), null, "exp", null, 1, 1, TemplateExpressionRealFromInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionParameterSimpleEClass, TemplateExpressionParameterSimple.class, "TemplateExpressionParameterSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionParameterSimple_Parameter(), theCorePackage.getParameterSimple(), null, "parameter", null, 1, 1, TemplateExpressionParameterSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionParameterArrayValueAtEClass, TemplateExpressionParameterArrayValueAt.class, "TemplateExpressionParameterArrayValueAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionParameterArrayValueAt_Parameter(), theCorePackage.getParameterArray(), null, "parameter", null, 1, 1, TemplateExpressionParameterArrayValueAt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionParameterArrayValueAt_Position(), this.getTemplateExpressionInteger(), null, "position", null, 1, 1, TemplateExpressionParameterArrayValueAt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionParameterArraySizeEClass, TemplateExpressionParameterArraySize.class, "TemplateExpressionParameterArraySize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionParameterArraySize_Parameter(), theCorePackage.getParameterArray(), null, "parameter", null, 1, 1, TemplateExpressionParameterArraySize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionArrayAggregateEClass, TemplateExpressionArrayAggregate.class, "TemplateExpressionArrayAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionArrayAggregate_Parameter(), theCorePackage.getParameterArray(), null, "parameter", null, 1, 1, TemplateExpressionArrayAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateExpressionArrayAggregate_Function(), this.getArrayAggregateKind(), "function", null, 0, 1, TemplateExpressionArrayAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionRealBinaryEClass, TemplateExpressionRealBinary.class, "TemplateExpressionRealBinary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealBinary_Exp1(), this.getTemplateExpressionReal(), null, "exp1", null, 1, 1, TemplateExpressionRealBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionRealBinary_Exp2(), this.getTemplateExpressionReal(), null, "exp2", null, 1, 1, TemplateExpressionRealBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionRealSumEClass, TemplateExpressionRealSum.class, "TemplateExpressionRealSum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealSubtractEClass, TemplateExpressionRealSubtract.class, "TemplateExpressionRealSubtract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealMultiplyEClass, TemplateExpressionRealMultiply.class, "TemplateExpressionRealMultiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealDivideEClass, TemplateExpressionRealDivide.class, "TemplateExpressionRealDivide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealModuloEClass, TemplateExpressionRealModulo.class, "TemplateExpressionRealModulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealUnaryEClass, TemplateExpressionRealUnary.class, "TemplateExpressionRealUnary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealUnary_Exp(), this.getTemplateExpressionReal(), null, "exp", null, 1, 1, TemplateExpressionRealUnary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionRealFloorEClass, TemplateExpressionRealFloor.class, "TemplateExpressionRealFloor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealCeilEClass, TemplateExpressionRealCeil.class, "TemplateExpressionRealCeil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealRoundEClass, TemplateExpressionRealRound.class, "TemplateExpressionRealRound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionRealIfThenElseEClass, TemplateExpressionRealIfThenElse.class, "TemplateExpressionRealIfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionRealIfThenElse_Condition(), this.getTemplateExpressionBoolean(), null, "condition", null, 1, 1, TemplateExpressionRealIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionRealIfThenElse_IfTrue(), this.getTemplateExpressionReal(), null, "ifTrue", null, 1, 1, TemplateExpressionRealIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionRealIfThenElse_IfFalse(), this.getTemplateExpressionReal(), null, "ifFalse", null, 0, 1, TemplateExpressionRealIfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionBooleanUnaryEClass, TemplateExpressionBooleanUnary.class, "TemplateExpressionBooleanUnary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionBooleanUnary_Exp(), this.getTemplateExpressionBoolean(), null, "exp", null, 1, 1, TemplateExpressionBooleanUnary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionBooleanNotEClass, TemplateExpressionBooleanNot.class, "TemplateExpressionBooleanNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionBooleanToIntegerEClass, TemplateExpressionBooleanToInteger.class, "TemplateExpressionBooleanToInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionBooleanBinaryEClass, TemplateExpressionBooleanBinary.class, "TemplateExpressionBooleanBinary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExpressionBooleanBinary_Exp1(), this.getTemplateExpressionBoolean(), null, "exp1", null, 1, 1, TemplateExpressionBooleanBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExpressionBooleanBinary_Exp2(), this.getTemplateExpressionBoolean(), null, "exp2", null, 1, 1, TemplateExpressionBooleanBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpressionBooleanAndEClass, TemplateExpressionBooleanAnd.class, "TemplateExpressionBooleanAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateExpressionBooleanOrEClass, TemplateExpressionBooleanOr.class, "TemplateExpressionBooleanOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(arrayAggregateKindEEnum, ArrayAggregateKind.class, "ArrayAggregateKind");
		addEEnumLiteral(arrayAggregateKindEEnum, ArrayAggregateKind.MIN);
		addEEnumLiteral(arrayAggregateKindEEnum, ArrayAggregateKind.MAX);
		addEEnumLiteral(arrayAggregateKindEEnum, ArrayAggregateKind.AVG);
		addEEnumLiteral(arrayAggregateKindEEnum, ArrayAggregateKind.SUM);

		// Create resource
		createResource(eNS_URI);
	}

} //ExpressionsPackageImpl
