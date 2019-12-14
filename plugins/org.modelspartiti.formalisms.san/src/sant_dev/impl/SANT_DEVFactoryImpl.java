/**
 */
package sant_dev.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sant_dev.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANT_DEVFactoryImpl extends EFactoryImpl implements SANT_DEVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SANT_DEVFactory init() {
		try {
			SANT_DEVFactory theSANT_DEVFactory = (SANT_DEVFactory)EPackage.Registry.INSTANCE.getEFactory(SANT_DEVPackage.eNS_URI);
			if (theSANT_DEVFactory != null) {
				return theSANT_DEVFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SANT_DEVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT_DEVFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SANT_DEVPackage.SANT: return createSANT();
			case SANT_DEVPackage.PLACE_TEMPLATE: return createPlaceTemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT createSANT() {
		SANTImpl sant = new SANTImpl();
		return sant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTemplate createPlaceTemplate() {
		PlaceTemplateImpl placeTemplate = new PlaceTemplateImpl();
		return placeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT_DEVPackage getSANT_DEVPackage() {
		return (SANT_DEVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SANT_DEVPackage getPackage() {
		return SANT_DEVPackage.eINSTANCE;
	}

} //SANT_DEVFactoryImpl
