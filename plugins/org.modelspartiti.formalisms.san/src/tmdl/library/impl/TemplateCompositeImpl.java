/**
 */
package tmdl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tmdl.library.Block;
import tmdl.library.CompositionRule;
import tmdl.library.LibraryPackage;
import tmdl.library.TemplateComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tmdl.library.impl.TemplateCompositeImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link tmdl.library.impl.TemplateCompositeImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateCompositeImpl extends TemplateSpecificationImpl implements TemplateComposite {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionRule> rules;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateCompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.TEMPLATE_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositionRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<CompositionRule>(CompositionRule.class, this, LibraryPackage.TEMPLATE_COMPOSITE__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<Block>(Block.class, this, LibraryPackage.TEMPLATE_COMPOSITE__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.TEMPLATE_COMPOSITE__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case LibraryPackage.TEMPLATE_COMPOSITE__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.TEMPLATE_COMPOSITE__RULES:
				return getRules();
			case LibraryPackage.TEMPLATE_COMPOSITE__BLOCKS:
				return getBlocks();
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
			case LibraryPackage.TEMPLATE_COMPOSITE__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends CompositionRule>)newValue);
				return;
			case LibraryPackage.TEMPLATE_COMPOSITE__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
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
			case LibraryPackage.TEMPLATE_COMPOSITE__RULES:
				getRules().clear();
				return;
			case LibraryPackage.TEMPLATE_COMPOSITE__BLOCKS:
				getBlocks().clear();
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
			case LibraryPackage.TEMPLATE_COMPOSITE__RULES:
				return rules != null && !rules.isEmpty();
			case LibraryPackage.TEMPLATE_COMPOSITE__BLOCKS:
				return blocks != null && !blocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateCompositeImpl
