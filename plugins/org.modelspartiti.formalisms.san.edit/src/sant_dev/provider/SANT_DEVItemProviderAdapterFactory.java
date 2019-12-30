/**
 */
package sant_dev.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import sant_dev.util.SANT_DEVAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SANT_DEVItemProviderAdapterFactory extends SANT_DEVAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANT_DEVItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.SANT} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SANTItemProvider santItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.SANT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSANTAdapter() {
		if (santItemProvider == null) {
			santItemProvider = new SANTItemProvider(this);
		}

		return santItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.PlaceTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceTemplateItemProvider placeTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.PlaceTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlaceTemplateAdapter() {
		if (placeTemplateItemProvider == null) {
			placeTemplateItemProvider = new PlaceTemplateItemProvider(this);
		}

		return placeTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.MultiplicityRangeOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityRangeOperatorItemProvider multiplicityRangeOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.MultiplicityRangeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicityRangeOperatorAdapter() {
		if (multiplicityRangeOperatorItemProvider == null) {
			multiplicityRangeOperatorItemProvider = new MultiplicityRangeOperatorItemProvider(this);
		}

		return multiplicityRangeOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.MultiplicityArrayIntegerFromReal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityArrayIntegerFromRealItemProvider multiplicityArrayIntegerFromRealItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.MultiplicityArrayIntegerFromReal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicityArrayIntegerFromRealAdapter() {
		if (multiplicityArrayIntegerFromRealItemProvider == null) {
			multiplicityArrayIntegerFromRealItemProvider = new MultiplicityArrayIntegerFromRealItemProvider(this);
		}

		return multiplicityArrayIntegerFromRealItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.CasesSpecificationConcrete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationConcreteItemProvider casesSpecificationConcreteItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.CasesSpecificationConcrete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCasesSpecificationConcreteAdapter() {
		if (casesSpecificationConcreteItemProvider == null) {
			casesSpecificationConcreteItemProvider = new CasesSpecificationConcreteItemProvider(this);
		}

		return casesSpecificationConcreteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.CasesSpecificationArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationArrayItemProvider casesSpecificationArrayItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.CasesSpecificationArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCasesSpecificationArrayAdapter() {
		if (casesSpecificationArrayItemProvider == null) {
			casesSpecificationArrayItemProvider = new CasesSpecificationArrayItemProvider(this);
		}

		return casesSpecificationArrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.CasesSpecificationParametric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationParametricItemProvider casesSpecificationParametricItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.CasesSpecificationParametric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCasesSpecificationParametricAdapter() {
		if (casesSpecificationParametricItemProvider == null) {
			casesSpecificationParametricItemProvider = new CasesSpecificationParametricItemProvider(this);
		}

		return casesSpecificationParametricItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.CasesSpecificationRangeOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasesSpecificationRangeOperatorItemProvider casesSpecificationRangeOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.CasesSpecificationRangeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCasesSpecificationRangeOperatorAdapter() {
		if (casesSpecificationRangeOperatorItemProvider == null) {
			casesSpecificationRangeOperatorItemProvider = new CasesSpecificationRangeOperatorItemProvider(this);
		}

		return casesSpecificationRangeOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.TimedActivityTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedActivityTemplateItemProvider timedActivityTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.TimedActivityTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedActivityTemplateAdapter() {
		if (timedActivityTemplateItemProvider == null) {
			timedActivityTemplateItemProvider = new TimedActivityTemplateItemProvider(this);
		}

		return timedActivityTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.InstantaneousActivityTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantaneousActivityTemplateItemProvider instantaneousActivityTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.InstantaneousActivityTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstantaneousActivityTemplateAdapter() {
		if (instantaneousActivityTemplateItemProvider == null) {
			instantaneousActivityTemplateItemProvider = new InstantaneousActivityTemplateItemProvider(this);
		}

		return instantaneousActivityTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.MarkingTemplateSimple} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkingTemplateSimpleItemProvider markingTemplateSimpleItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.MarkingTemplateSimple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMarkingTemplateSimpleAdapter() {
		if (markingTemplateSimpleItemProvider == null) {
			markingTemplateSimpleItemProvider = new MarkingTemplateSimpleItemProvider(this);
		}

		return markingTemplateSimpleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.MarkingTemplateGlobalVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkingTemplateGlobalVariableItemProvider markingTemplateGlobalVariableItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.MarkingTemplateGlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMarkingTemplateGlobalVariableAdapter() {
		if (markingTemplateGlobalVariableItemProvider == null) {
			markingTemplateGlobalVariableItemProvider = new MarkingTemplateGlobalVariableItemProvider(this);
		}

		return markingTemplateGlobalVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.OutputGateConcrete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputGateConcreteItemProvider outputGateConcreteItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.OutputGateConcrete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputGateConcreteAdapter() {
		if (outputGateConcreteItemProvider == null) {
			outputGateConcreteItemProvider = new OutputGateConcreteItemProvider(this);
		}

		return outputGateConcreteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.OutputGateTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputGateTemplateItemProvider outputGateTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.OutputGateTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputGateTemplateAdapter() {
		if (outputGateTemplateItemProvider == null) {
			outputGateTemplateItemProvider = new OutputGateTemplateItemProvider(this);
		}

		return outputGateTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.InputGateTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputGateTemplateItemProvider inputGateTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.InputGateTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputGateTemplateAdapter() {
		if (inputGateTemplateItemProvider == null) {
			inputGateTemplateItemProvider = new InputGateTemplateItemProvider(this);
		}

		return inputGateTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.InputArc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputArcItemProvider inputArcItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.InputArc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputArcAdapter() {
		if (inputArcItemProvider == null) {
			inputArcItemProvider = new InputArcItemProvider(this);
		}

		return inputArcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link sant_dev.OutputArc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputArcItemProvider outputArcItemProvider;

	/**
	 * This creates an adapter for a {@link sant_dev.OutputArc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputArcAdapter() {
		if (outputArcItemProvider == null) {
			outputArcItemProvider = new OutputArcItemProvider(this);
		}

		return outputArcItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (santItemProvider != null) santItemProvider.dispose();
		if (placeTemplateItemProvider != null) placeTemplateItemProvider.dispose();
		if (multiplicityRangeOperatorItemProvider != null) multiplicityRangeOperatorItemProvider.dispose();
		if (multiplicityArrayIntegerFromRealItemProvider != null) multiplicityArrayIntegerFromRealItemProvider.dispose();
		if (casesSpecificationConcreteItemProvider != null) casesSpecificationConcreteItemProvider.dispose();
		if (casesSpecificationArrayItemProvider != null) casesSpecificationArrayItemProvider.dispose();
		if (casesSpecificationParametricItemProvider != null) casesSpecificationParametricItemProvider.dispose();
		if (casesSpecificationRangeOperatorItemProvider != null) casesSpecificationRangeOperatorItemProvider.dispose();
		if (timedActivityTemplateItemProvider != null) timedActivityTemplateItemProvider.dispose();
		if (instantaneousActivityTemplateItemProvider != null) instantaneousActivityTemplateItemProvider.dispose();
		if (markingTemplateSimpleItemProvider != null) markingTemplateSimpleItemProvider.dispose();
		if (markingTemplateGlobalVariableItemProvider != null) markingTemplateGlobalVariableItemProvider.dispose();
		if (outputGateConcreteItemProvider != null) outputGateConcreteItemProvider.dispose();
		if (outputGateTemplateItemProvider != null) outputGateTemplateItemProvider.dispose();
		if (inputGateTemplateItemProvider != null) inputGateTemplateItemProvider.dispose();
		if (inputArcItemProvider != null) inputArcItemProvider.dispose();
		if (outputArcItemProvider != null) outputArcItemProvider.dispose();
	}

}
