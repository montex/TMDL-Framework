/**
 */
package tmdl.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tmdl.core.Assignment;
import tmdl.core.AssignmentArray;
import tmdl.core.AssignmentSimple;
import tmdl.core.CorePackage;
import tmdl.core.MultiplicityParametric;
import tmdl.core.Parameter;
import tmdl.core.ParameterArray;
import tmdl.core.ParameterSimple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Parametric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tmdl.core.impl.MultiplicityParametricImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityParametricImpl extends MultiplicityImpl implements MultiplicityParametric {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityParametricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MULTIPLICITY_PARAMETRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.MULTIPLICITY_PARAMETRIC__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULTIPLICITY_PARAMETRIC__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.MULTIPLICITY_PARAMETRIC__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case CorePackage.MULTIPLICITY_PARAMETRIC__PARAMETER:
				setParameter((Parameter)newValue);
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
			case CorePackage.MULTIPLICITY_PARAMETRIC__PARAMETER:
				setParameter((Parameter)null);
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
			case CorePackage.MULTIPLICITY_PARAMETRIC__PARAMETER:
				return parameter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<Integer> listValues(List<Assignment> assignments) {
		ArrayList<Integer> retValues = new ArrayList<Integer>();
		Iterator<Assignment> it = assignments.iterator();
		boolean found = false;
		Assignment ass = null;

		if(getParameter() instanceof ParameterSimple) {
			while(it.hasNext() && !found) {
				ass = it.next();
				if(ass instanceof AssignmentSimple) {
					AssignmentSimple assSimple = ((AssignmentSimple)ass);
					if(assSimple.getParameter().getName() == this.getParameter().getName()) {
						found = true;
						if(assSimple.getValue() > 0) {
							for(int i = 1; i <= assSimple.getValue(); i++) {
								retValues.add(i);
							}
						}
					}
				}
			}
		}else if(getParameter() instanceof ParameterArray) {
			while(it.hasNext() && !found) {
				ass = it.next();
				if(ass instanceof AssignmentArray) {
					AssignmentArray assArray = ((AssignmentArray)ass);
					
					if(assArray.getParameter().getName() == this.getParameter().getName()) {
						found = true;
						Iterator<Double> itArray = assArray.getValues().iterator();
						while(itArray.hasNext()) {
							retValues.add(itArray.next().intValue());
						}
					}
				}
			}
		}

		return retValues;
	}

} //MultiplicityParametricImpl
