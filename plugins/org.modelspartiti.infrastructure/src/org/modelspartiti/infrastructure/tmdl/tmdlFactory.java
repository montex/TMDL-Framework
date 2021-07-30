/**
 */
package org.modelspartiti.infrastructure.tmdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelspartiti.infrastructure.tmdl.tmdlPackage
 * @generated
 */
public interface tmdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tmdlFactory eINSTANCE = org.modelspartiti.infrastructure.tmdl.impl.tmdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TMDL Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMDL Specification</em>'.
	 * @generated
	 */
	TMDLSpecification createTMDLSpecification();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Template Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Atomic</em>'.
	 * @generated
	 */
	TemplateAtomic createTemplateAtomic();

	/**
	 * Returns a new object of class '<em>Template Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Composite</em>'.
	 * @generated
	 */
	TemplateComposite createTemplateComposite();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant</em>'.
	 * @generated
	 */
	Variant createVariant();

	/**
	 * Returns a new object of class '<em>Block Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Realization</em>'.
	 * @generated
	 */
	BlockRealization createBlockRealization();

	/**
	 * Returns a new object of class '<em>Model Interf Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Interf Simple</em>'.
	 * @generated
	 */
	ModelInterfSimple createModelInterfSimple();

	/**
	 * Returns a new object of class '<em>Model Interf Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Interf Array</em>'.
	 * @generated
	 */
	ModelInterfArray createModelInterfArray();

	/**
	 * Returns a new object of class '<em>Composition Rule Forwards</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Rule Forwards</em>'.
	 * @generated
	 */
	CompositionRuleForwards createCompositionRuleForwards();

	/**
	 * Returns a new object of class '<em>Composition Rule All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Rule All</em>'.
	 * @generated
	 */
	CompositionRuleAll createCompositionRuleAll();

	/**
	 * Returns a new object of class '<em>Composition Rule Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Rule Match</em>'.
	 * @generated
	 */
	CompositionRuleMatch createCompositionRuleMatch();

	/**
	 * Returns a new object of class '<em>Comp Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Item</em>'.
	 * @generated
	 */
	CompItem createCompItem();

	/**
	 * Returns a new object of class '<em>Value Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Int</em>'.
	 * @generated
	 */
	ValueInt createValueInt();

	/**
	 * Returns a new object of class '<em>Value Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Double</em>'.
	 * @generated
	 */
	ValueDouble createValueDouble();

	/**
	 * Returns a new object of class '<em>Value Array Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Array Int</em>'.
	 * @generated
	 */
	ValueArrayInt createValueArrayInt();

	/**
	 * Returns a new object of class '<em>Value Array Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Array Double</em>'.
	 * @generated
	 */
	ValueArrayDouble createValueArrayDouble();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Parametric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametric</em>'.
	 * @generated
	 */
	Parametric createParametric();

	/**
	 * Returns a new object of class '<em>Parambinding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parambinding</em>'.
	 * @generated
	 */
	Parambinding createParambinding();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability</em>'.
	 * @generated
	 */
	Availability createAvailability();

	/**
	 * Returns a new object of class '<em>Reliability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reliability</em>'.
	 * @generated
	 */
	Reliability createReliability();

	/**
	 * Returns a new object of class '<em>Mean Time To Failure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mean Time To Failure</em>'.
	 * @generated
	 */
	MeanTimeToFailure createMeanTimeToFailure();

	/**
	 * Returns a new object of class '<em>State Metavariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Metavariable</em>'.
	 * @generated
	 */
	StateMetavariable createStateMetavariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	tmdlPackage gettmdlPackage();

} //tmdlFactory
