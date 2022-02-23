/**
 */
package bpmnchor.provider;


import bpmnchor.BpmnchorFactory;
import bpmnchor.Definitions;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link bpmnchor.Definitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsItemProvider extends org.eclipse.bpmn2.provider.DefinitionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns Definitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Definitions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Definitions)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Definitions_type") :
			getString("_UI_Definitions_type") + " " + label;
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
				(Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
				 BpmnchorFactory.eINSTANCE.createMonitoringResource()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
				 BpmnchorFactory.eINSTANCE.createCommitmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
				 BpmnchorFactory.eINSTANCE.createCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
				 BpmnchorFactory.eINSTANCE.createConnectionPoint()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BpmnchorEditPlugin.INSTANCE;
	}

}
