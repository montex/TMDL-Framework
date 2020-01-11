/**
 */
package sant_dev.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import san.SANFactory;

import sant_dev.SANT;
import sant_dev.SANT_DEVFactory;
import sant_dev.SANT_DEVPackage;
import tmdl.core.CoreFactory;

/**
 * This is the item provider adapter for a {@link sant_dev.SANT} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SANTItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANTItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SANT_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SANT_name_feature", "_UI_SANT_type"),
				 SANT_DEVPackage.Literals.SANT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SANT_DEVPackage.Literals.SANT__TEMPLATE_PLACES);
			childrenFeatures.add(SANT_DEVPackage.Literals.SANT__PLACES);
			childrenFeatures.add(SANT_DEVPackage.Literals.SANT__ACTIVITY_TEMPLATES);
			childrenFeatures.add(SANT_DEVPackage.Literals.SANT__PARAMETERS);
			childrenFeatures.add(SANT_DEVPackage.Literals.SANT__GLOBAL_VARIABLES);
			childrenFeatures.add(SANT_DEVPackage.Literals.SANT__CUSTOM_TYPE);
			childrenFeatures.add(SANT_DEVPackage.Literals.SANT__GATES);
			childrenFeatures.add(SANT_DEVPackage.Literals.SANT__ARCS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SANT.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SANT"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SANT)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SANT_type") :
			getString("_UI_SANT_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SANT.class)) {
			case SANT_DEVPackage.SANT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SANT_DEVPackage.SANT__TEMPLATE_PLACES:
			case SANT_DEVPackage.SANT__PLACES:
			case SANT_DEVPackage.SANT__ACTIVITY_TEMPLATES:
			case SANT_DEVPackage.SANT__PARAMETERS:
			case SANT_DEVPackage.SANT__GLOBAL_VARIABLES:
			case SANT_DEVPackage.SANT__CUSTOM_TYPE:
			case SANT_DEVPackage.SANT__GATES:
			case SANT_DEVPackage.SANT__ARCS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__TEMPLATE_PLACES,
				 SANT_DEVFactory.eINSTANCE.createPlaceTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__PLACES,
				 SANFactory.eINSTANCE.createPlace()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__ACTIVITY_TEMPLATES,
				 SANT_DEVFactory.eINSTANCE.createTimedActivityTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__ACTIVITY_TEMPLATES,
				 SANT_DEVFactory.eINSTANCE.createInstantaneousActivityTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__PARAMETERS,
				 CoreFactory.eINSTANCE.createParameterSimple()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__PARAMETERS,
				 CoreFactory.eINSTANCE.createParameterArray()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__GLOBAL_VARIABLES,
				 SANFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__CUSTOM_TYPE,
				 SANFactory.eINSTANCE.createCustomTypeArray()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__CUSTOM_TYPE,
				 SANFactory.eINSTANCE.createCustomTypeStruct()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__GATES,
				 SANT_DEVFactory.eINSTANCE.createOutputGateConcrete()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__GATES,
				 SANT_DEVFactory.eINSTANCE.createOutputGateTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__GATES,
				 SANT_DEVFactory.eINSTANCE.createInputGateTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__ARCS,
				 SANT_DEVFactory.eINSTANCE.createInputArc()));

		newChildDescriptors.add
			(createChildParameter
				(SANT_DEVPackage.Literals.SANT__ARCS,
				 SANT_DEVFactory.eINSTANCE.createOutputArc()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SANT_DEVEditPlugin.INSTANCE;
	}

}
