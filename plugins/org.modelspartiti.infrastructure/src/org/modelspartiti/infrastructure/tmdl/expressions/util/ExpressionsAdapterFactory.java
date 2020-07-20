/**
 */
package org.modelspartiti.infrastructure.tmdl.expressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modelspartiti.infrastructure.tmdl.expressions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modelspartiti.infrastructure.tmdl.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
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
	protected ExpressionsSwitch<Adapter> modelSwitch =
		new ExpressionsSwitch<Adapter>() {
			@Override
			public Adapter caseTemplateExpression(TemplateExpression object) {
				return createTemplateExpressionAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionInteger(TemplateExpressionInteger object) {
				return createTemplateExpressionIntegerAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionReal(TemplateExpressionReal object) {
				return createTemplateExpressionRealAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionBoolean(TemplateExpressionBoolean object) {
				return createTemplateExpressionBooleanAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionIntegerLiteral(TemplateExpressionIntegerLiteral object) {
				return createTemplateExpressionIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealLiteral(TemplateExpressionRealLiteral object) {
				return createTemplateExpressionRealLiteralAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionBoolaenLiteral(TemplateExpressionBoolaenLiteral object) {
				return createTemplateExpressionBoolaenLiteralAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionIntegerFromReal(TemplateExpressionIntegerFromReal object) {
				return createTemplateExpressionIntegerFromRealAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealFromInteger(TemplateExpressionRealFromInteger object) {
				return createTemplateExpressionRealFromIntegerAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionParameterSimple(TemplateExpressionParameterSimple object) {
				return createTemplateExpressionParameterSimpleAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionParameterArrayValueAt(TemplateExpressionParameterArrayValueAt object) {
				return createTemplateExpressionParameterArrayValueAtAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionParameterArraySize(TemplateExpressionParameterArraySize object) {
				return createTemplateExpressionParameterArraySizeAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionArrayAggregate(TemplateExpressionArrayAggregate object) {
				return createTemplateExpressionArrayAggregateAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealBinaryOperation(TemplateExpressionRealBinaryOperation object) {
				return createTemplateExpressionRealBinaryOperationAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealSum(TemplateExpressionRealSum object) {
				return createTemplateExpressionRealSumAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealSubtract(TemplateExpressionRealSubtract object) {
				return createTemplateExpressionRealSubtractAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealMultiply(TemplateExpressionRealMultiply object) {
				return createTemplateExpressionRealMultiplyAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealDivide(TemplateExpressionRealDivide object) {
				return createTemplateExpressionRealDivideAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealModulo(TemplateExpressionRealModulo object) {
				return createTemplateExpressionRealModuloAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealUnary(TemplateExpressionRealUnary object) {
				return createTemplateExpressionRealUnaryAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealFloor(TemplateExpressionRealFloor object) {
				return createTemplateExpressionRealFloorAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealCeil(TemplateExpressionRealCeil object) {
				return createTemplateExpressionRealCeilAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealRound(TemplateExpressionRealRound object) {
				return createTemplateExpressionRealRoundAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionRealIfThenElse(TemplateExpressionRealIfThenElse object) {
				return createTemplateExpressionRealIfThenElseAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionBooleanUnaryOperation(TemplateExpressionBooleanUnaryOperation object) {
				return createTemplateExpressionBooleanUnaryOperationAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionBooleanNot(TemplateExpressionBooleanNot object) {
				return createTemplateExpressionBooleanNotAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionBooleanToInteger(TemplateExpressionBooleanToInteger object) {
				return createTemplateExpressionBooleanToIntegerAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionBooleanBinaryOperation(TemplateExpressionBooleanBinaryOperation object) {
				return createTemplateExpressionBooleanBinaryOperationAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionBooleanAnd(TemplateExpressionBooleanAnd object) {
				return createTemplateExpressionBooleanAndAdapter();
			}
			@Override
			public Adapter caseTemplateExpressionBooleanOr(TemplateExpressionBooleanOr object) {
				return createTemplateExpressionBooleanOrAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpression <em>Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpression
	 * @generated
	 */
	public Adapter createTemplateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger <em>Template Expression Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionInteger
	 * @generated
	 */
	public Adapter createTemplateExpressionIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal <em>Template Expression Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionReal
	 * @generated
	 */
	public Adapter createTemplateExpressionRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean <em>Template Expression Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolean
	 * @generated
	 */
	public Adapter createTemplateExpressionBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerLiteral <em>Template Expression Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerLiteral
	 * @generated
	 */
	public Adapter createTemplateExpressionIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealLiteral <em>Template Expression Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealLiteral
	 * @generated
	 */
	public Adapter createTemplateExpressionRealLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolaenLiteral <em>Template Expression Boolaen Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBoolaenLiteral
	 * @generated
	 */
	public Adapter createTemplateExpressionBoolaenLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerFromReal <em>Template Expression Integer From Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionIntegerFromReal
	 * @generated
	 */
	public Adapter createTemplateExpressionIntegerFromRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger <em>Template Expression Real From Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFromInteger
	 * @generated
	 */
	public Adapter createTemplateExpressionRealFromIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterSimple <em>Template Expression Parameter Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterSimple
	 * @generated
	 */
	public Adapter createTemplateExpressionParameterSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt <em>Template Expression Parameter Array Value At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArrayValueAt
	 * @generated
	 */
	public Adapter createTemplateExpressionParameterArrayValueAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize <em>Template Expression Parameter Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionParameterArraySize
	 * @generated
	 */
	public Adapter createTemplateExpressionParameterArraySizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate <em>Template Expression Array Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionArrayAggregate
	 * @generated
	 */
	public Adapter createTemplateExpressionArrayAggregateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation <em>Template Expression Real Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealBinaryOperation
	 * @generated
	 */
	public Adapter createTemplateExpressionRealBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSum <em>Template Expression Real Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSum
	 * @generated
	 */
	public Adapter createTemplateExpressionRealSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSubtract <em>Template Expression Real Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealSubtract
	 * @generated
	 */
	public Adapter createTemplateExpressionRealSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealMultiply <em>Template Expression Real Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealMultiply
	 * @generated
	 */
	public Adapter createTemplateExpressionRealMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealDivide <em>Template Expression Real Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealDivide
	 * @generated
	 */
	public Adapter createTemplateExpressionRealDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo <em>Template Expression Real Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealModulo
	 * @generated
	 */
	public Adapter createTemplateExpressionRealModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary <em>Template Expression Real Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealUnary
	 * @generated
	 */
	public Adapter createTemplateExpressionRealUnaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFloor <em>Template Expression Real Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealFloor
	 * @generated
	 */
	public Adapter createTemplateExpressionRealFloorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealCeil <em>Template Expression Real Ceil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealCeil
	 * @generated
	 */
	public Adapter createTemplateExpressionRealCeilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealRound <em>Template Expression Real Round</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealRound
	 * @generated
	 */
	public Adapter createTemplateExpressionRealRoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse <em>Template Expression Real If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionRealIfThenElse
	 * @generated
	 */
	public Adapter createTemplateExpressionRealIfThenElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation <em>Template Expression Boolean Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanUnaryOperation
	 * @generated
	 */
	public Adapter createTemplateExpressionBooleanUnaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanNot <em>Template Expression Boolean Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanNot
	 * @generated
	 */
	public Adapter createTemplateExpressionBooleanNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanToInteger <em>Template Expression Boolean To Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanToInteger
	 * @generated
	 */
	public Adapter createTemplateExpressionBooleanToIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation <em>Template Expression Boolean Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanBinaryOperation
	 * @generated
	 */
	public Adapter createTemplateExpressionBooleanBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanAnd <em>Template Expression Boolean And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanAnd
	 * @generated
	 */
	public Adapter createTemplateExpressionBooleanAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanOr <em>Template Expression Boolean Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modelspartiti.infrastructure.tmdl.expressions.TemplateExpressionBooleanOr
	 * @generated
	 */
	public Adapter createTemplateExpressionBooleanOrAdapter() {
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

} //ExpressionsAdapterFactory
