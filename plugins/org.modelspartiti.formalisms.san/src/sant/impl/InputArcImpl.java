/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Place;

import sant.ActivityTemplate;
import sant.InputArc;
import sant.PlaceTemplate;
import sant.SANTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant.impl.InputArcImpl#getSource <em>Source</em>}</li>
 *   <li>{@link sant.impl.InputArcImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link sant.impl.InputArcImpl#getTemplateSource <em>Template Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputArcImpl extends ArcTemplateImpl implements InputArc {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Place source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityTemplate target;

	/**
	 * The cached value of the '{@link #getTemplateSource() <em>Template Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateSource()
	 * @generated
	 * @ordered
	 */
	protected PlaceTemplate templateSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.INPUT_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Place)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.INPUT_ARC__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Place newSource) {
		Place oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.INPUT_ARC__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTemplate getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityTemplate)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.INPUT_ARC__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTemplate basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ActivityTemplate newTarget) {
		ActivityTemplate oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.INPUT_ARC__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTemplate getTemplateSource() {
		if (templateSource != null && templateSource.eIsProxy()) {
			InternalEObject oldTemplateSource = (InternalEObject)templateSource;
			templateSource = (PlaceTemplate)eResolveProxy(oldTemplateSource);
			if (templateSource != oldTemplateSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.INPUT_ARC__TEMPLATE_SOURCE, oldTemplateSource, templateSource));
			}
		}
		return templateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTemplate basicGetTemplateSource() {
		return templateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateSource(PlaceTemplate newTemplateSource) {
		PlaceTemplate oldTemplateSource = templateSource;
		templateSource = newTemplateSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.INPUT_ARC__TEMPLATE_SOURCE, oldTemplateSource, templateSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.INPUT_ARC__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SANTPackage.INPUT_ARC__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SANTPackage.INPUT_ARC__TEMPLATE_SOURCE:
				if (resolve) return getTemplateSource();
				return basicGetTemplateSource();
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
			case SANTPackage.INPUT_ARC__SOURCE:
				setSource((Place)newValue);
				return;
			case SANTPackage.INPUT_ARC__TARGET:
				setTarget((ActivityTemplate)newValue);
				return;
			case SANTPackage.INPUT_ARC__TEMPLATE_SOURCE:
				setTemplateSource((PlaceTemplate)newValue);
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
			case SANTPackage.INPUT_ARC__SOURCE:
				setSource((Place)null);
				return;
			case SANTPackage.INPUT_ARC__TARGET:
				setTarget((ActivityTemplate)null);
				return;
			case SANTPackage.INPUT_ARC__TEMPLATE_SOURCE:
				setTemplateSource((PlaceTemplate)null);
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
			case SANTPackage.INPUT_ARC__SOURCE:
				return source != null;
			case SANTPackage.INPUT_ARC__TARGET:
				return target != null;
			case SANTPackage.INPUT_ARC__TEMPLATE_SOURCE:
				return templateSource != null;
		}
		return super.eIsSet(featureID);
	}

} //InputArcImpl
