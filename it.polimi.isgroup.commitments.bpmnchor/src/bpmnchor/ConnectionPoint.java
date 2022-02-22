/**
 */
package bpmnchor;

import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.MessageFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmnchor.ConnectionPoint#getSide <em>Side</em>}</li>
 *   <li>{@link bpmnchor.ConnectionPoint#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 * </ul>
 *
 * @see bpmnchor.BpmnchorPackage#getConnectionPoint()
 * @model
 * @generated
 */
public interface ConnectionPoint extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmnchor.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see bpmnchor.MessageType
	 * @see #setSide(MessageType)
	 * @see bpmnchor.BpmnchorPackage#getConnectionPoint_Side()
	 * @model required="true"
	 * @generated
	 */
	MessageType getSide();

	/**
	 * Sets the value of the '{@link bpmnchor.ConnectionPoint#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see bpmnchor.MessageType
	 * @see #getSide()
	 * @generated
	 */
	void setSide(MessageType value);

	/**
	 * Returns the value of the '<em><b>Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flow Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Ref</em>' reference.
	 * @see #setMessageFlowRef(MessageFlow)
	 * @see bpmnchor.BpmnchorPackage#getConnectionPoint_MessageFlowRef()
	 * @model required="true"
	 * @generated
	 */
	MessageFlow getMessageFlowRef();

	/**
	 * Sets the value of the '{@link bpmnchor.ConnectionPoint#getMessageFlowRef <em>Message Flow Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Flow Ref</em>' reference.
	 * @see #getMessageFlowRef()
	 * @generated
	 */
	void setMessageFlowRef(MessageFlow value);

} // ConnectionPoint
