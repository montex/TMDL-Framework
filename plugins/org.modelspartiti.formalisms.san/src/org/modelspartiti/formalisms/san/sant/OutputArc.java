/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.modelspartiti.formalisms.san.san.Case;
import org.modelspartiti.formalisms.san.san.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.OutputArc#getSourceCaseConcrete <em>Source Case Concrete</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.OutputArc#getSource <em>Source</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.OutputArc#getTarget <em>Target</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.OutputArc#getTemplateTarget <em>Template Target</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputArc()
 * @model
 * @generated
 */
public interface OutputArc extends ArcTemplate {
	/**
	 * Returns the value of the '<em><b>Source Case Concrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Case Concrete</em>' reference.
	 * @see #setSourceCaseConcrete(Case)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputArc_SourceCaseConcrete()
	 * @model
	 * @generated
	 */
	Case getSourceCaseConcrete();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.OutputArc#getSourceCaseConcrete <em>Source Case Concrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Case Concrete</em>' reference.
	 * @see #getSourceCaseConcrete()
	 * @generated
	 */
	void setSourceCaseConcrete(Case value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityTemplate)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputArc_Source()
	 * @model
	 * @generated
	 */
	ActivityTemplate getSource();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.OutputArc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityTemplate value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Place)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputArc_Target()
	 * @model
	 * @generated
	 */
	Place getTarget();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.OutputArc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Place value);

	/**
	 * Returns the value of the '<em><b>Template Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Target</em>' reference.
	 * @see #setTemplateTarget(PlaceTemplate)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getOutputArc_TemplateTarget()
	 * @model
	 * @generated
	 */
	PlaceTemplate getTemplateTarget();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.OutputArc#getTemplateTarget <em>Template Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Target</em>' reference.
	 * @see #getTemplateTarget()
	 * @generated
	 */
	void setTemplateTarget(PlaceTemplate value);

} // OutputArc
