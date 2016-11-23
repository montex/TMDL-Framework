/**
 */
package sant;

import tmdl.expressions.TemplateExpressionInteger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>This Context Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see sant.SANTPackage#getThisContextIterator()
 * @model
 * @generated
 */
public interface ThisContextIterator extends VariabilityIterator, TemplateExpressionInteger {

	/**
	 * Set the context in order to support the evaluate() operation.
	 * The '<em><b>ThisContextIterator</em></b>' element can be evaluate only when a specific
	 * numerical context is given
	 * @generated NOT
	 */
	public void setContext(int iContext);

} // ThisContextIterator
