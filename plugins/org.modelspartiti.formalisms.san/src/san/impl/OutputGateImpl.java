/**
 */
package san.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import san.Case;
import san.OutputGate;
import san.SANPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link san.impl.OutputGateImpl#getActivityCase <em>Activity Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputGateImpl extends GateImpl implements OutputGate {
	/**
	 * The cached value of the '{@link #getActivityCase() <em>Activity Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCase()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> activityCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANPackage.Literals.OUTPUT_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Case> getActivityCase() {
		if (activityCase == null) {
			activityCase = new EObjectResolvingEList<Case>(Case.class, this, SANPackage.OUTPUT_GATE__ACTIVITY_CASE);
		}
		return activityCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANPackage.OUTPUT_GATE__ACTIVITY_CASE:
				return getActivityCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SANPackage.OUTPUT_GATE__ACTIVITY_CASE:
				getActivityCase().clear();
				getActivityCase().addAll((Collection<? extends Case>)newValue);
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
			case SANPackage.OUTPUT_GATE__ACTIVITY_CASE:
				getActivityCase().clear();
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
			case SANPackage.OUTPUT_GATE__ACTIVITY_CASE:
				return activityCase != null && !activityCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputGateImpl
