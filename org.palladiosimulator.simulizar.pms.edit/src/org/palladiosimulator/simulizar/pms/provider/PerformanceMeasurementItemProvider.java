/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.simulizar.pms.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.simulizar.pms.PerformanceMeasurement;
import org.palladiosimulator.simulizar.pms.PmsFactory;
import org.palladiosimulator.simulizar.pms.PmsPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.simulizar.pms.PerformanceMeasurement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformanceMeasurementItemProvider
   extends UniqueElementItemProvider
   implements
      IEditingDomainItemProvider,
      IStructuredItemContentProvider,
      ITreeItemContentProvider,
      IItemLabelProvider,
      IItemPropertySource
{
   /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
   public PerformanceMeasurementItemProvider(AdapterFactory adapterFactory)
   {
        super(adapterFactory);
    }

   /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
   @Override
   public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
   {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addMeasuringPointPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

   /**
     * This adds a property descriptor for the Measuring Point feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasuringPointPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PerformanceMeasurement_measuringPoint_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PerformanceMeasurement_measuringPoint_feature", "_UI_PerformanceMeasurement_type"),
                 PmsPackage.Literals.PERFORMANCE_MEASUREMENT__MEASURING_POINT,
                 true,
                 false,
                 true,
                 null,
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
   public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
   {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(PmsPackage.Literals.PERFORMANCE_MEASUREMENT__MEASUREMENT_SPECIFICATION);
        }
        return childrenFeatures;
    }

   /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
   @Override
   protected EStructuralFeature getChildFeature(Object object, Object child)
   {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

   /**
     * This returns PerformanceMeasurement.gif.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
   @Override
   public Object getImage(Object object)
   {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/PerformanceMeasurement"));
    }

   /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
   @Override
   public String getText(Object object)
   {
        String label = ((PerformanceMeasurement)object).getGuid();
        return label == null || label.length() == 0 ?
            getString("_UI_PerformanceMeasurement_type") :
            getString("_UI_PerformanceMeasurement_type") + " " + label;
    }

   /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
   @Override
   public void notifyChanged(Notification notification)
   {
        updateChildren(notification);

        switch (notification.getFeatureID(PerformanceMeasurement.class)) {
            case PmsPackage.PERFORMANCE_MEASUREMENT__MEASUREMENT_SPECIFICATION:
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
   protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
   {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (PmsPackage.Literals.PERFORMANCE_MEASUREMENT__MEASUREMENT_SPECIFICATION,
                 PmsFactory.eINSTANCE.createMeasurementSpecification()));
    }

}