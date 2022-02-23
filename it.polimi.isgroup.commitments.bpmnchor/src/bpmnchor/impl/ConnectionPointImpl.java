/**
 */
package bpmnchor.impl;

import bpmnchor.BpmnchorPackage;
import bpmnchor.ConnectionPoint;
import bpmnchor.MessageType;

import org.eclipse.bpmn2.MessageFlow;

import org.eclipse.bpmn2.impl.RootElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmnchor.impl.ConnectionPointImpl#getSide <em>Side</em>}</li>
 *   <li>{@link bpmnchor.impl.ConnectionPointImpl#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPointImpl extends RootElementImpl implements ConnectionPoint {
	/**
	 * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected static final MessageType SIDE_EDEFAULT = MessageType.SEND;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected MessageType side = SIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageFlowRef() <em>Message Flow Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFlowRef()
	 * @generated
	 * @ordered
	 */
	protected MessageFlow messageFlowRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnchorPackage.Literals.CONNECTION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSide(MessageType newSide) {
		MessageType oldSide = side;
		side = newSide == null ? SIDE_EDEFAULT : newSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.CONNECTION_POINT__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow getMessageFlowRef() {
		if (messageFlowRef != null && messageFlowRef.eIsProxy()) {
			InternalEObject oldMessageFlowRef = (InternalEObject)messageFlowRef;
			messageFlowRef = (MessageFlow)eResolveProxy(oldMessageFlowRef);
			if (messageFlowRef != oldMessageFlowRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnchorPackage.CONNECTION_POINT__MESSAGE_FLOW_REF, oldMessageFlowRef, messageFlowRef));
			}
		}
		return messageFlowRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow basicGetMessageFlowRef() {
		return messageFlowRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageFlowRef(MessageFlow newMessageFlowRef) {
		MessageFlow oldMessageFlowRef = messageFlowRef;
		messageFlowRef = newMessageFlowRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.CONNECTION_POINT__MESSAGE_FLOW_REF, oldMessageFlowRef, messageFlowRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnchorPackage.CONNECTION_POINT__SIDE:
				return getSide();
			case BpmnchorPackage.CONNECTION_POINT__MESSAGE_FLOW_REF:
				if (resolve) return getMessageFlowRef();
				return basicGetMessageFlowRef();
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
			case BpmnchorPackage.CONNECTION_POINT__SIDE:
				setSide((MessageType)newValue);
				return;
			case BpmnchorPackage.CONNECTION_POINT__MESSAGE_FLOW_REF:
				setMessageFlowRef((MessageFlow)newValue);
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
			case BpmnchorPackage.CONNECTION_POINT__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case BpmnchorPackage.CONNECTION_POINT__MESSAGE_FLOW_REF:
				setMessageFlowRef((MessageFlow)null);
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
			case BpmnchorPackage.CONNECTION_POINT__SIDE:
				return side != SIDE_EDEFAULT;
			case BpmnchorPackage.CONNECTION_POINT__MESSAGE_FLOW_REF:
				return messageFlowRef != null;
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
		result.append(" (side: ");
		result.append(side);
		result.append(')');
		return result.toString();
	}

} //ConnectionPointImpl
