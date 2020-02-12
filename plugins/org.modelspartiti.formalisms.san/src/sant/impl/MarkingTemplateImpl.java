/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sant.MarkingTemplate;
import sant.SANTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marking Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant.impl.MarkingTemplateImpl#getIdPlace <em>Id Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MarkingTemplateImpl extends MinimalEObjectImpl.Container implements MarkingTemplate {
	/**
	 * The default value of the '{@link #getIdPlace() <em>Id Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPlace()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PLACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdPlace() <em>Id Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPlace()
	 * @generated
	 * @ordered
	 */
	protected int idPlace = ID_PLACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkingTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.MARKING_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdPlace() {
		return idPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPlace(int newIdPlace) {
		int oldIdPlace = idPlace;
		idPlace = newIdPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.MARKING_TEMPLATE__ID_PLACE, oldIdPlace, idPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.MARKING_TEMPLATE__ID_PLACE:
				return getIdPlace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SANTPackage.MARKING_TEMPLATE__ID_PLACE:
				setIdPlace((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SANTPackage.MARKING_TEMPLATE__ID_PLACE:
				setIdPlace(ID_PLACE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SANTPackage.MARKING_TEMPLATE__ID_PLACE:
				return idPlace != ID_PLACE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idPlace: ");
		result.append(idPlace);
		result.append(')');
		return result.toString();
	}

} //MarkingTemplateImpl
