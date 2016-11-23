/**
 */
package sant.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sant.SANTPackage;
import sant.ThisContextIterator;
import tmdl.core.Assignment;
import tmdl.expressions.ExpressionsPackage;
import tmdl.expressions.TemplateExpression;
import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>This Context Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ThisContextIteratorImpl extends MinimalEObjectImpl.Container implements ThisContextIterator {

	private int iCurrentContext = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThisContextIteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.THIS_CONTEXT_ITERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int evaluate(EList<Assignment> assignments) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluate()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExpressionsPackage.Literals.TEMPLATE_EXPRESSION_INTEGER___EVALUATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int evaluate() {
		return iCurrentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TemplateExpression.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateExpressionInteger.class) {
			switch (baseOperationID) {
				case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER___EVALUATE__ELIST: return SANTPackage.THIS_CONTEXT_ITERATOR___EVALUATE__ELIST;
				case ExpressionsPackage.TEMPLATE_EXPRESSION_INTEGER___EVALUATE: return SANTPackage.THIS_CONTEXT_ITERATOR___EVALUATE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SANTPackage.THIS_CONTEXT_ITERATOR___EVALUATE__ELIST:
				return evaluate((EList<Assignment>)arguments.get(0));
			case SANTPackage.THIS_CONTEXT_ITERATOR___EVALUATE:
				return evaluate();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void setContext(int iContext) {
		this.iCurrentContext = iContext;
	}

} //ThisContextIteratorImpl
