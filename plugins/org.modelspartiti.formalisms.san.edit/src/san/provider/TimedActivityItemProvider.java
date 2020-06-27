/**
 */
package san.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import san.SANFactory;
import san.SANPackage;
import san.TimedActivity;

/**
 * This is the item provider adapter for a {@link san.TimedActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedActivityItemProvider extends ActivityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedActivityItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION);
			childrenFeatures.add(SANPackage.Literals.TIMED_ACTIVITY__ACTIVATION);
			childrenFeatures.add(SANPackage.Literals.TIMED_ACTIVITY__REACTIVATION);
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
	 * This returns TimedActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimedActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimedActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TimedActivity_type") :
			getString("_UI_TimedActivity_type") + " " + label;
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

		switch (notification.getFeatureID(TimedActivity.class)) {
			case SANPackage.TIMED_ACTIVITY__TIME_DISTRIBUTION:
			case SANPackage.TIMED_ACTIVITY__ACTIVATION:
			case SANPackage.TIMED_ACTIVITY__REACTIVATION:
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
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createNormal()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createGamma()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createBinomial()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createDeterministic()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createLognormal()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createBeta()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createNegativeBinomial()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createGeometric()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createErlang()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createUniform()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createHyperExponential()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createWeibull()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createTriangular()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createConditionalWeibull()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createHypoExponential()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__TIME_DISTRIBUTION,
				 SANFactory.eINSTANCE.createPareto()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__ACTIVATION,
				 SANFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SANPackage.Literals.TIMED_ACTIVITY__REACTIVATION,
				 SANFactory.eINSTANCE.createExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SANPackage.Literals.TIMED_ACTIVITY__ACTIVATION ||
			childFeature == SANPackage.Literals.TIMED_ACTIVITY__REACTIVATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
