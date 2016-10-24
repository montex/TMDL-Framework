/**
 */
package sant.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import sant.ExpressionLoop;
import sant.ExpressionSegment;
import sant.SANTPackage;

import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sant.impl.ExpressionLoopImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link sant.impl.ExpressionLoopImpl#getEnd <em>End</em>}</li>
 *   <li>{@link sant.impl.ExpressionLoopImpl#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionLoopImpl extends MinimalEObjectImpl.Container implements ExpressionLoop {
	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected TemplateExpressionInteger begin;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected TemplateExpressionInteger end;

	/**
	 * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionSegment> do_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.EXPRESSION_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionInteger getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegin(TemplateExpressionInteger newBegin, NotificationChain msgs) {
		TemplateExpressionInteger oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_LOOP__BEGIN, oldBegin, newBegin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBegin(TemplateExpressionInteger newBegin) {
		if (newBegin != begin) {
			NotificationChain msgs = null;
			if (begin != null)
				msgs = ((InternalEObject)begin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_LOOP__BEGIN, null, msgs);
			if (newBegin != null)
				msgs = ((InternalEObject)newBegin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_LOOP__BEGIN, null, msgs);
			msgs = basicSetBegin(newBegin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_LOOP__BEGIN, newBegin, newBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExpressionInteger getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(TemplateExpressionInteger newEnd, NotificationChain msgs) {
		TemplateExpressionInteger oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_LOOP__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(TemplateExpressionInteger newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_LOOP__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.EXPRESSION_LOOP__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.EXPRESSION_LOOP__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionSegment> getDo() {
		if (do_ == null) {
			do_ = new EObjectContainmentEList<ExpressionSegment>(ExpressionSegment.class, this, SANTPackage.EXPRESSION_LOOP__DO);
		}
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANTPackage.EXPRESSION_LOOP__BEGIN:
				return basicSetBegin(null, msgs);
			case SANTPackage.EXPRESSION_LOOP__END:
				return basicSetEnd(null, msgs);
			case SANTPackage.EXPRESSION_LOOP__DO:
				return ((InternalEList<?>)getDo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.EXPRESSION_LOOP__BEGIN:
				return getBegin();
			case SANTPackage.EXPRESSION_LOOP__END:
				return getEnd();
			case SANTPackage.EXPRESSION_LOOP__DO:
				return getDo();
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
			case SANTPackage.EXPRESSION_LOOP__BEGIN:
				setBegin((TemplateExpressionInteger)newValue);
				return;
			case SANTPackage.EXPRESSION_LOOP__END:
				setEnd((TemplateExpressionInteger)newValue);
				return;
			case SANTPackage.EXPRESSION_LOOP__DO:
				getDo().clear();
				getDo().addAll((Collection<? extends ExpressionSegment>)newValue);
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
			case SANTPackage.EXPRESSION_LOOP__BEGIN:
				setBegin((TemplateExpressionInteger)null);
				return;
			case SANTPackage.EXPRESSION_LOOP__END:
				setEnd((TemplateExpressionInteger)null);
				return;
			case SANTPackage.EXPRESSION_LOOP__DO:
				getDo().clear();
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
			case SANTPackage.EXPRESSION_LOOP__BEGIN:
				return begin != null;
			case SANTPackage.EXPRESSION_LOOP__END:
				return end != null;
			case SANTPackage.EXPRESSION_LOOP__DO:
				return do_ != null && !do_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpressionLoopImpl
