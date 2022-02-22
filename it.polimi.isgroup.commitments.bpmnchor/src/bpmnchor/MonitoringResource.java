/**
 */
package bpmnchor;

import org.eclipse.bpmn2.ItemDefinition;
import org.eclipse.bpmn2.Participant;
import org.eclipse.bpmn2.RootElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmnchor.MonitoringResource#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link bpmnchor.MonitoringResource#isCanCompute <em>Can Compute</em>}</li>
 *   <li>{@link bpmnchor.MonitoringResource#getType <em>Type</em>}</li>
 *   <li>{@link bpmnchor.MonitoringResource#getOwnerRef <em>Owner Ref</em>}</li>
 *   <li>{@link bpmnchor.MonitoringResource#getItemRef <em>Item Ref</em>}</li>
 * </ul>
 *
 * @see bpmnchor.BpmnchorPackage#getMonitoringResource()
 * @model
 * @generated
 */
public interface MonitoringResource extends RootElement {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see bpmnchor.BpmnchorPackage#getMonitoringResource_Endpoint()
	 * @model
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link bpmnchor.MonitoringResource#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Can Compute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Compute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Compute</em>' attribute.
	 * @see #setCanCompute(boolean)
	 * @see bpmnchor.BpmnchorPackage#getMonitoringResource_CanCompute()
	 * @model required="true"
	 * @generated
	 */
	boolean isCanCompute();

	/**
	 * Sets the value of the '{@link bpmnchor.MonitoringResource#isCanCompute <em>Can Compute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Compute</em>' attribute.
	 * @see #isCanCompute()
	 * @generated
	 */
	void setCanCompute(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmnchor.MonitoringResType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmnchor.MonitoringResType
	 * @see #setType(MonitoringResType)
	 * @see bpmnchor.BpmnchorPackage#getMonitoringResource_Type()
	 * @model required="true"
	 * @generated
	 */
	MonitoringResType getType();

	/**
	 * Sets the value of the '{@link bpmnchor.MonitoringResource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmnchor.MonitoringResType
	 * @see #getType()
	 * @generated
	 */
	void setType(MonitoringResType value);

	/**
	 * Returns the value of the '<em><b>Owner Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Ref</em>' reference.
	 * @see #setOwnerRef(Participant)
	 * @see bpmnchor.BpmnchorPackage#getMonitoringResource_OwnerRef()
	 * @model
	 * @generated
	 */
	Participant getOwnerRef();

	/**
	 * Sets the value of the '{@link bpmnchor.MonitoringResource#getOwnerRef <em>Owner Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Ref</em>' reference.
	 * @see #getOwnerRef()
	 * @generated
	 */
	void setOwnerRef(Participant value);

	/**
	 * Returns the value of the '<em><b>Item Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Ref</em>' reference.
	 * @see #setItemRef(ItemDefinition)
	 * @see bpmnchor.BpmnchorPackage#getMonitoringResource_ItemRef()
	 * @model required="true"
	 * @generated
	 */
	ItemDefinition getItemRef();

	/**
	 * Sets the value of the '{@link bpmnchor.MonitoringResource#getItemRef <em>Item Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Ref</em>' reference.
	 * @see #getItemRef()
	 * @generated
	 */
	void setItemRef(ItemDefinition value);

} // MonitoringResource
