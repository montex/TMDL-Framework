/**
 */
package sant_dev;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sant_dev.SANT_DEVPackage
 * @generated
 */
public interface SANT_DEVFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANT_DEVFactory eINSTANCE = sant_dev.impl.SANT_DEVFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SANT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SANT</em>'.
	 * @generated
	 */
	SANT createSANT();

	/**
	 * Returns a new object of class '<em>Place Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Template</em>'.
	 * @generated
	 */
	PlaceTemplate createPlaceTemplate();

	/**
	 * Returns a new object of class '<em>Multiplicity Range Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Range Operator</em>'.
	 * @generated
	 */
	MultiplicityRangeOperator createMultiplicityRangeOperator();

	/**
	 * Returns a new object of class '<em>Multiplicity Array Integer From Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Array Integer From Real</em>'.
	 * @generated
	 */
	MultiplicityArrayIntegerFromReal createMultiplicityArrayIntegerFromReal();

	/**
	 * Returns a new object of class '<em>Cases Specification Concrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cases Specification Concrete</em>'.
	 * @generated
	 */
	CasesSpecificationConcrete createCasesSpecificationConcrete();

	/**
	 * Returns a new object of class '<em>Cases Specification Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cases Specification Array</em>'.
	 * @generated
	 */
	CasesSpecificationArray createCasesSpecificationArray();

	/**
	 * Returns a new object of class '<em>Cases Specification Parametric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cases Specification Parametric</em>'.
	 * @generated
	 */
	CasesSpecificationParametric createCasesSpecificationParametric();

	/**
	 * Returns a new object of class '<em>Timed Activity Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Activity Template</em>'.
	 * @generated
	 */
	TimedActivityTemplate createTimedActivityTemplate();

	/**
	 * Returns a new object of class '<em>Instantaneous Activity Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantaneous Activity Template</em>'.
	 * @generated
	 */
	InstantaneousActivityTemplate createInstantaneousActivityTemplate();

	/**
	 * Returns a new object of class '<em>Marking Template Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Template Simple</em>'.
	 * @generated
	 */
	MarkingTemplateSimple createMarkingTemplateSimple();

	/**
	 * Returns a new object of class '<em>Marking Template Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Template Global Variable</em>'.
	 * @generated
	 */
	MarkingTemplateGlobalVariable createMarkingTemplateGlobalVariable();

	/**
	 * Returns a new object of class '<em>Output Gate Concrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Gate Concrete</em>'.
	 * @generated
	 */
	OutputGateConcrete createOutputGateConcrete();

	/**
	 * Returns a new object of class '<em>Output Gate Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Gate Template</em>'.
	 * @generated
	 */
	OutputGateTemplate createOutputGateTemplate();

	/**
	 * Returns a new object of class '<em>Input Gate Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Gate Template</em>'.
	 * @generated
	 */
	InputGateTemplate createInputGateTemplate();

	/**
	 * Returns a new object of class '<em>Input Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Arc</em>'.
	 * @generated
	 */
	InputArc createInputArc();

	/**
	 * Returns a new object of class '<em>Output Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Arc</em>'.
	 * @generated
	 */
	OutputArc createOutputArc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SANT_DEVPackage getSANT_DEVPackage();

} //SANT_DEVFactory
