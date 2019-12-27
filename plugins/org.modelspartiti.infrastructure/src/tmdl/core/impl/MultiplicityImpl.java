/**
 */
package tmdl.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tmdl.core.Assignment;
import tmdl.core.CorePackage;
import tmdl.core.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MultiplicityImpl extends MinimalEObjectImpl.Container implements Multiplicity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<Integer> listValues() {
		return listValues(new ArrayList<Assignment>());
	}
} //MultiplicityImpl
