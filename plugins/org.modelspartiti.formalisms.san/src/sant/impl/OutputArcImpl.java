/**
 */
package sant.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import san.Case;
import san.Place;

import sant.ActivityTemplate;
import sant.OutputArc;
import sant.PlaceTemplate;
import sant.SANTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sant.impl.OutputArcImpl#getSourceCaseConcrete <em>Source Case Concrete</em>}</li>
 *   <li>{@link sant.impl.OutputArcImpl#getSource <em>Source</em>}</li>
 *   <li>{@link sant.impl.OutputArcImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link sant.impl.OutputArcImpl#getTemplateTarget <em>Template Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputArcImpl extends ArcTemplateImpl implements OutputArc {
	/**
	 * The cached value of the '{@link #getSourceCaseConcrete() <em>Source Case Concrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCaseConcrete()
	 * @generated
	 * @ordered
	 */
	protected Case sourceCaseConcrete;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityTemplate source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Place target;

	/**
	 * The cached value of the '{@link #getTemplateTarget() <em>Template Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateTarget()
	 * @generated
	 * @ordered
	 */
	protected PlaceTemplate templateTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.OUTPUT_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Case getSourceCaseConcrete() {
		if (sourceCaseConcrete != null && sourceCaseConcrete.eIsProxy()) {
			InternalEObject oldSourceCaseConcrete = (InternalEObject)sourceCaseConcrete;
			sourceCaseConcrete = (Case)eResolveProxy(oldSourceCaseConcrete);
			if (sourceCaseConcrete != oldSourceCaseConcrete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.OUTPUT_ARC__SOURCE_CASE_CONCRETE, oldSourceCaseConcrete, sourceCaseConcrete));
			}
		}
		return sourceCaseConcrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case basicGetSourceCaseConcrete() {
		return sourceCaseConcrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceCaseConcrete(Case newSourceCaseConcrete) {
		Case oldSourceCaseConcrete = sourceCaseConcrete;
		sourceCaseConcrete = newSourceCaseConcrete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.OUTPUT_ARC__SOURCE_CASE_CONCRETE, oldSourceCaseConcrete, sourceCaseConcrete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityTemplate getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityTemplate)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.OUTPUT_ARC__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTemplate basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ActivityTemplate newSource) {
		ActivityTemplate oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.OUTPUT_ARC__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Place)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.OUTPUT_ARC__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Place newTarget) {
		Place oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.OUTPUT_ARC__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaceTemplate getTemplateTarget() {
		if (templateTarget != null && templateTarget.eIsProxy()) {
			InternalEObject oldTemplateTarget = (InternalEObject)templateTarget;
			templateTarget = (PlaceTemplate)eResolveProxy(oldTemplateTarget);
			if (templateTarget != oldTemplateTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SANTPackage.OUTPUT_ARC__TEMPLATE_TARGET, oldTemplateTarget, templateTarget));
			}
		}
		return templateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTemplate basicGetTemplateTarget() {
		return templateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateTarget(PlaceTemplate newTemplateTarget) {
		PlaceTemplate oldTemplateTarget = templateTarget;
		templateTarget = newTemplateTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.OUTPUT_ARC__TEMPLATE_TARGET, oldTemplateTarget, templateTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.OUTPUT_ARC__SOURCE_CASE_CONCRETE:
				if (resolve) return getSourceCaseConcrete();
				return basicGetSourceCaseConcrete();
			case SANTPackage.OUTPUT_ARC__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SANTPackage.OUTPUT_ARC__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SANTPackage.OUTPUT_ARC__TEMPLATE_TARGET:
				if (resolve) return getTemplateTarget();
				return basicGetTemplateTarget();
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
			case SANTPackage.OUTPUT_ARC__SOURCE_CASE_CONCRETE:
				setSourceCaseConcrete((Case)newValue);
				return;
			case SANTPackage.OUTPUT_ARC__SOURCE:
				setSource((ActivityTemplate)newValue);
				return;
			case SANTPackage.OUTPUT_ARC__TARGET:
				setTarget((Place)newValue);
				return;
			case SANTPackage.OUTPUT_ARC__TEMPLATE_TARGET:
				setTemplateTarget((PlaceTemplate)newValue);
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
			case SANTPackage.OUTPUT_ARC__SOURCE_CASE_CONCRETE:
				setSourceCaseConcrete((Case)null);
				return;
			case SANTPackage.OUTPUT_ARC__SOURCE:
				setSource((ActivityTemplate)null);
				return;
			case SANTPackage.OUTPUT_ARC__TARGET:
				setTarget((Place)null);
				return;
			case SANTPackage.OUTPUT_ARC__TEMPLATE_TARGET:
				setTemplateTarget((PlaceTemplate)null);
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
			case SANTPackage.OUTPUT_ARC__SOURCE_CASE_CONCRETE:
				return sourceCaseConcrete != null;
			case SANTPackage.OUTPUT_ARC__SOURCE:
				return source != null;
			case SANTPackage.OUTPUT_ARC__TARGET:
				return target != null;
			case SANTPackage.OUTPUT_ARC__TEMPLATE_TARGET:
				return templateTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputArcImpl
