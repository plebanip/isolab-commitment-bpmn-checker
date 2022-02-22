/**
 */
package bpmnchor.impl;

import bpmnchor.BpmnchorPackage;
import bpmnchor.MonitoringResType;
import bpmnchor.MonitoringResource;

import org.eclipse.bpmn2.ItemDefinition;
import org.eclipse.bpmn2.Participant;

import org.eclipse.bpmn2.impl.RootElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmnchor.impl.MonitoringResourceImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link bpmnchor.impl.MonitoringResourceImpl#isCanCompute <em>Can Compute</em>}</li>
 *   <li>{@link bpmnchor.impl.MonitoringResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link bpmnchor.impl.MonitoringResourceImpl#getOwnerRef <em>Owner Ref</em>}</li>
 *   <li>{@link bpmnchor.impl.MonitoringResourceImpl#getItemRef <em>Item Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringResourceImpl extends RootElementImpl implements MonitoringResource {
	/**
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanCompute() <em>Can Compute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanCompute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_COMPUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanCompute() <em>Can Compute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanCompute()
	 * @generated
	 * @ordered
	 */
	protected boolean canCompute = CAN_COMPUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MonitoringResType TYPE_EDEFAULT = MonitoringResType.SMART_OBJECT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MonitoringResType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnerRef() <em>Owner Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerRef()
	 * @generated
	 * @ordered
	 */
	protected Participant ownerRef;

	/**
	 * The cached value of the '{@link #getItemRef() <em>Item Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemRef()
	 * @generated
	 * @ordered
	 */
	protected ItemDefinition itemRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnchorPackage.Literals.MONITORING_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.MONITORING_RESOURCE__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanCompute() {
		return canCompute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanCompute(boolean newCanCompute) {
		boolean oldCanCompute = canCompute;
		canCompute = newCanCompute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.MONITORING_RESOURCE__CAN_COMPUTE, oldCanCompute, canCompute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringResType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MonitoringResType newType) {
		MonitoringResType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.MONITORING_RESOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getOwnerRef() {
		if (ownerRef != null && ownerRef.eIsProxy()) {
			InternalEObject oldOwnerRef = (InternalEObject)ownerRef;
			ownerRef = (Participant)eResolveProxy(oldOwnerRef);
			if (ownerRef != oldOwnerRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnchorPackage.MONITORING_RESOURCE__OWNER_REF, oldOwnerRef, ownerRef));
			}
		}
		return ownerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetOwnerRef() {
		return ownerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerRef(Participant newOwnerRef) {
		Participant oldOwnerRef = ownerRef;
		ownerRef = newOwnerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.MONITORING_RESOURCE__OWNER_REF, oldOwnerRef, ownerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getItemRef() {
		if (itemRef != null && itemRef.eIsProxy()) {
			InternalEObject oldItemRef = (InternalEObject)itemRef;
			itemRef = (ItemDefinition)eResolveProxy(oldItemRef);
			if (itemRef != oldItemRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnchorPackage.MONITORING_RESOURCE__ITEM_REF, oldItemRef, itemRef));
			}
		}
		return itemRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetItemRef() {
		return itemRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemRef(ItemDefinition newItemRef) {
		ItemDefinition oldItemRef = itemRef;
		itemRef = newItemRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.MONITORING_RESOURCE__ITEM_REF, oldItemRef, itemRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnchorPackage.MONITORING_RESOURCE__ENDPOINT:
				return getEndpoint();
			case BpmnchorPackage.MONITORING_RESOURCE__CAN_COMPUTE:
				return isCanCompute();
			case BpmnchorPackage.MONITORING_RESOURCE__TYPE:
				return getType();
			case BpmnchorPackage.MONITORING_RESOURCE__OWNER_REF:
				if (resolve) return getOwnerRef();
				return basicGetOwnerRef();
			case BpmnchorPackage.MONITORING_RESOURCE__ITEM_REF:
				if (resolve) return getItemRef();
				return basicGetItemRef();
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
			case BpmnchorPackage.MONITORING_RESOURCE__ENDPOINT:
				setEndpoint((String)newValue);
				return;
			case BpmnchorPackage.MONITORING_RESOURCE__CAN_COMPUTE:
				setCanCompute((Boolean)newValue);
				return;
			case BpmnchorPackage.MONITORING_RESOURCE__TYPE:
				setType((MonitoringResType)newValue);
				return;
			case BpmnchorPackage.MONITORING_RESOURCE__OWNER_REF:
				setOwnerRef((Participant)newValue);
				return;
			case BpmnchorPackage.MONITORING_RESOURCE__ITEM_REF:
				setItemRef((ItemDefinition)newValue);
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
			case BpmnchorPackage.MONITORING_RESOURCE__ENDPOINT:
				setEndpoint(ENDPOINT_EDEFAULT);
				return;
			case BpmnchorPackage.MONITORING_RESOURCE__CAN_COMPUTE:
				setCanCompute(CAN_COMPUTE_EDEFAULT);
				return;
			case BpmnchorPackage.MONITORING_RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BpmnchorPackage.MONITORING_RESOURCE__OWNER_REF:
				setOwnerRef((Participant)null);
				return;
			case BpmnchorPackage.MONITORING_RESOURCE__ITEM_REF:
				setItemRef((ItemDefinition)null);
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
			case BpmnchorPackage.MONITORING_RESOURCE__ENDPOINT:
				return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
			case BpmnchorPackage.MONITORING_RESOURCE__CAN_COMPUTE:
				return canCompute != CAN_COMPUTE_EDEFAULT;
			case BpmnchorPackage.MONITORING_RESOURCE__TYPE:
				return type != TYPE_EDEFAULT;
			case BpmnchorPackage.MONITORING_RESOURCE__OWNER_REF:
				return ownerRef != null;
			case BpmnchorPackage.MONITORING_RESOURCE__ITEM_REF:
				return itemRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (endpoint: ");
		result.append(endpoint);
		result.append(", canCompute: ");
		result.append(canCompute);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MonitoringResourceImpl
