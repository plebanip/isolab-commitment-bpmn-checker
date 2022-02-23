/**
 */
package bpmnchor;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bpmnchor.BpmnchorFactory
 * @model kind="package"
 * @generated
 */
public interface BpmnchorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpmnchor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bpmnchor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmnchor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpmnchorPackage eINSTANCE = bpmnchor.impl.BpmnchorPackageImpl.init();

	/**
	 * The meta object id for the '{@link bpmnchor.impl.MonitoringResourceImpl <em>Monitoring Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnchor.impl.MonitoringResourceImpl
	 * @see bpmnchor.impl.BpmnchorPackageImpl#getMonitoringResource()
	 * @generated
	 */
	int MONITORING_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__EXTENSION_VALUES = Bpmn2Package.ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__DOCUMENTATION = Bpmn2Package.ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__EXTENSION_DEFINITIONS = Bpmn2Package.ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__ID = Bpmn2Package.ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__ANY_ATTRIBUTE = Bpmn2Package.ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__ENDPOINT = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can Compute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__CAN_COMPUTE = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__TYPE = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__OWNER_REF = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE__ITEM_REF = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Monitoring Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RESOURCE_FEATURE_COUNT = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 5;

//	/**
//	 * The number of operations of the '<em>Monitoring Resource</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int MONITORING_RESOURCE_OPERATION_COUNT = Bpmn2Package.ROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnchor.impl.CommitmentExpressionImpl <em>Commitment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnchor.impl.CommitmentExpressionImpl
	 * @see bpmnchor.impl.BpmnchorPackageImpl#getCommitmentExpression()
	 * @generated
	 */
	int COMMITMENT_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION__EXTENSION_VALUES = Bpmn2Package.EXPRESSION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION__DOCUMENTATION = Bpmn2Package.EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION__EXTENSION_DEFINITIONS = Bpmn2Package.EXPRESSION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION__ID = Bpmn2Package.EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION__ANY_ATTRIBUTE = Bpmn2Package.EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION__LANGUAGE = Bpmn2Package.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION__BODY = Bpmn2Package.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION__ITEM_REFS = Bpmn2Package.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Commitment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_EXPRESSION_FEATURE_COUNT = Bpmn2Package.EXPRESSION_FEATURE_COUNT + 3;

//	/**
//	 * The number of operations of the '<em>Commitment Expression</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int COMMITMENT_EXPRESSION_OPERATION_COUNT = Bpmn2Package.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnchor.impl.CommitmentImpl <em>Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnchor.impl.CommitmentImpl
	 * @see bpmnchor.impl.BpmnchorPackageImpl#getCommitment()
	 * @generated
	 */
	int COMMITMENT = 2;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__EXTENSION_VALUES = Bpmn2Package.ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__DOCUMENTATION = Bpmn2Package.ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__EXTENSION_DEFINITIONS = Bpmn2Package.ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__ID = Bpmn2Package.ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__ANY_ATTRIBUTE = Bpmn2Package.ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__TYPE = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antecedent Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__ANTECEDENT_EXPR = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consequent Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__CONSEQUENT_EXPR = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__ACTIVE_EXPR = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__SCOPE_BEGIN = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scope End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__SCOPE_END = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_FEATURE_COUNT = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 6;

//	/**
//	 * The number of operations of the '<em>Commitment</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int COMMITMENT_OPERATION_COUNT = Bpmn2Package.ROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnchor.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnchor.impl.ConnectionPointImpl
	 * @see bpmnchor.impl.BpmnchorPackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__EXTENSION_VALUES = Bpmn2Package.ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DOCUMENTATION = Bpmn2Package.ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__EXTENSION_DEFINITIONS = Bpmn2Package.ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__ID = Bpmn2Package.ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__ANY_ATTRIBUTE = Bpmn2Package.ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__SIDE = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__MESSAGE_FLOW_REF = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = Bpmn2Package.ROOT_ELEMENT_FEATURE_COUNT + 2;

//	/**
//	 * The number of operations of the '<em>Connection Point</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int CONNECTION_POINT_OPERATION_COUNT = Bpmn2Package.ROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnchor.impl.DefinitionsImpl <em>Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnchor.impl.DefinitionsImpl
	 * @see bpmnchor.impl.BpmnchorPackageImpl#getDefinitions()
	 * @generated
	 */
	int DEFINITIONS = 4;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSION_VALUES = Bpmn2Package.DEFINITIONS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DOCUMENTATION = Bpmn2Package.DEFINITIONS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSION_DEFINITIONS = Bpmn2Package.DEFINITIONS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ID = Bpmn2Package.DEFINITIONS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ANY_ATTRIBUTE = Bpmn2Package.DEFINITIONS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__IMPORTS = Bpmn2Package.DEFINITIONS__IMPORTS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSIONS = Bpmn2Package.DEFINITIONS__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ROOT_ELEMENTS = Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DIAGRAMS = Bpmn2Package.DEFINITIONS__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__RELATIONSHIPS = Bpmn2Package.DEFINITIONS__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPORTER = Bpmn2Package.DEFINITIONS__EXPORTER;

	/**
	 * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPORTER_VERSION = Bpmn2Package.DEFINITIONS__EXPORTER_VERSION;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPRESSION_LANGUAGE = Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__NAME = Bpmn2Package.DEFINITIONS__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__TARGET_NAMESPACE = Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__TYPE_LANGUAGE = Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_FEATURE_COUNT = Bpmn2Package.DEFINITIONS_FEATURE_COUNT + 0;

//	/**
//	 * The number of operations of the '<em>Definitions</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int DEFINITIONS_OPERATION_COUNT = Bpmn2Package.DEFINITIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmnchor.MonitoringResType <em>Monitoring Res Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnchor.MonitoringResType
	 * @see bpmnchor.impl.BpmnchorPackageImpl#getMonitoringResType()
	 * @generated
	 */
	int MONITORING_RES_TYPE = 5;

	/**
	 * The meta object id for the '{@link bpmnchor.MessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnchor.MessageType
	 * @see bpmnchor.impl.BpmnchorPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 6;

	/**
	 * The meta object id for the '{@link bpmnchor.CommitmentType <em>Commitment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmnchor.CommitmentType
	 * @see bpmnchor.impl.BpmnchorPackageImpl#getCommitmentType()
	 * @generated
	 */
	int COMMITMENT_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link bpmnchor.MonitoringResource <em>Monitoring Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Resource</em>'.
	 * @see bpmnchor.MonitoringResource
	 * @generated
	 */
	EClass getMonitoringResource();

	/**
	 * Returns the meta object for the attribute '{@link bpmnchor.MonitoringResource#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see bpmnchor.MonitoringResource#getEndpoint()
	 * @see #getMonitoringResource()
	 * @generated
	 */
	EAttribute getMonitoringResource_Endpoint();

	/**
	 * Returns the meta object for the attribute '{@link bpmnchor.MonitoringResource#isCanCompute <em>Can Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Compute</em>'.
	 * @see bpmnchor.MonitoringResource#isCanCompute()
	 * @see #getMonitoringResource()
	 * @generated
	 */
	EAttribute getMonitoringResource_CanCompute();

	/**
	 * Returns the meta object for the attribute '{@link bpmnchor.MonitoringResource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnchor.MonitoringResource#getType()
	 * @see #getMonitoringResource()
	 * @generated
	 */
	EAttribute getMonitoringResource_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnchor.MonitoringResource#getOwnerRef <em>Owner Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Ref</em>'.
	 * @see bpmnchor.MonitoringResource#getOwnerRef()
	 * @see #getMonitoringResource()
	 * @generated
	 */
	EReference getMonitoringResource_OwnerRef();

	/**
	 * Returns the meta object for the reference '{@link bpmnchor.MonitoringResource#getItemRef <em>Item Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Ref</em>'.
	 * @see bpmnchor.MonitoringResource#getItemRef()
	 * @see #getMonitoringResource()
	 * @generated
	 */
	EReference getMonitoringResource_ItemRef();

	/**
	 * Returns the meta object for class '{@link bpmnchor.CommitmentExpression <em>Commitment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commitment Expression</em>'.
	 * @see bpmnchor.CommitmentExpression
	 * @generated
	 */
	EClass getCommitmentExpression();

	/**
	 * Returns the meta object for the attribute '{@link bpmnchor.CommitmentExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see bpmnchor.CommitmentExpression#getLanguage()
	 * @see #getCommitmentExpression()
	 * @generated
	 */
	EAttribute getCommitmentExpression_Language();

	/**
	 * Returns the meta object for the attribute '{@link bpmnchor.CommitmentExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see bpmnchor.CommitmentExpression#getBody()
	 * @see #getCommitmentExpression()
	 * @generated
	 */
	EAttribute getCommitmentExpression_Body();

	/**
	 * Returns the meta object for the reference list '{@link bpmnchor.CommitmentExpression#getItemRefs <em>Item Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item Refs</em>'.
	 * @see bpmnchor.CommitmentExpression#getItemRefs()
	 * @see #getCommitmentExpression()
	 * @generated
	 */
	EReference getCommitmentExpression_ItemRefs();

	/**
	 * Returns the meta object for class '{@link bpmnchor.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commitment</em>'.
	 * @see bpmnchor.Commitment
	 * @generated
	 */
	EClass getCommitment();

	/**
	 * Returns the meta object for the attribute '{@link bpmnchor.Commitment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmnchor.Commitment#getType()
	 * @see #getCommitment()
	 * @generated
	 */
	EAttribute getCommitment_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmnchor.Commitment#getAntecedentExpr <em>Antecedent Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent Expr</em>'.
	 * @see bpmnchor.Commitment#getAntecedentExpr()
	 * @see #getCommitment()
	 * @generated
	 */
	EReference getCommitment_AntecedentExpr();

	/**
	 * Returns the meta object for the reference '{@link bpmnchor.Commitment#getConsequentExpr <em>Consequent Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequent Expr</em>'.
	 * @see bpmnchor.Commitment#getConsequentExpr()
	 * @see #getCommitment()
	 * @generated
	 */
	EReference getCommitment_ConsequentExpr();

	/**
	 * Returns the meta object for the reference '{@link bpmnchor.Commitment#getActiveExpr <em>Active Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Expr</em>'.
	 * @see bpmnchor.Commitment#getActiveExpr()
	 * @see #getCommitment()
	 * @generated
	 */
	EReference getCommitment_ActiveExpr();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnchor.Commitment#getScopeBegin <em>Scope Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope Begin</em>'.
	 * @see bpmnchor.Commitment#getScopeBegin()
	 * @see #getCommitment()
	 * @generated
	 */
	EReference getCommitment_ScopeBegin();

	/**
	 * Returns the meta object for the containment reference '{@link bpmnchor.Commitment#getScopeEnd <em>Scope End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope End</em>'.
	 * @see bpmnchor.Commitment#getScopeEnd()
	 * @see #getCommitment()
	 * @generated
	 */
	EReference getCommitment_ScopeEnd();

	/**
	 * Returns the meta object for class '{@link bpmnchor.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see bpmnchor.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link bpmnchor.ConnectionPoint#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see bpmnchor.ConnectionPoint#getSide()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Side();

	/**
	 * Returns the meta object for the reference '{@link bpmnchor.ConnectionPoint#getMessageFlowRef <em>Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Flow Ref</em>'.
	 * @see bpmnchor.ConnectionPoint#getMessageFlowRef()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_MessageFlowRef();

	/**
	 * Returns the meta object for class '{@link bpmnchor.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see bpmnchor.Definitions
	 * @generated
	 */
	EClass getDefinitions();

	/**
	 * Returns the meta object for enum '{@link bpmnchor.MonitoringResType <em>Monitoring Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitoring Res Type</em>'.
	 * @see bpmnchor.MonitoringResType
	 * @generated
	 */
	EEnum getMonitoringResType();

	/**
	 * Returns the meta object for enum '{@link bpmnchor.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see bpmnchor.MessageType
	 * @generated
	 */
	EEnum getMessageType();

	/**
	 * Returns the meta object for enum '{@link bpmnchor.CommitmentType <em>Commitment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Commitment Type</em>'.
	 * @see bpmnchor.CommitmentType
	 * @generated
	 */
	EEnum getCommitmentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BpmnchorFactory getBpmnchorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bpmnchor.impl.MonitoringResourceImpl <em>Monitoring Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnchor.impl.MonitoringResourceImpl
		 * @see bpmnchor.impl.BpmnchorPackageImpl#getMonitoringResource()
		 * @generated
		 */
		EClass MONITORING_RESOURCE = eINSTANCE.getMonitoringResource();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RESOURCE__ENDPOINT = eINSTANCE.getMonitoringResource_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Can Compute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RESOURCE__CAN_COMPUTE = eINSTANCE.getMonitoringResource_CanCompute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RESOURCE__TYPE = eINSTANCE.getMonitoringResource_Type();

		/**
		 * The meta object literal for the '<em><b>Owner Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_RESOURCE__OWNER_REF = eINSTANCE.getMonitoringResource_OwnerRef();

		/**
		 * The meta object literal for the '<em><b>Item Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_RESOURCE__ITEM_REF = eINSTANCE.getMonitoringResource_ItemRef();

		/**
		 * The meta object literal for the '{@link bpmnchor.impl.CommitmentExpressionImpl <em>Commitment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnchor.impl.CommitmentExpressionImpl
		 * @see bpmnchor.impl.BpmnchorPackageImpl#getCommitmentExpression()
		 * @generated
		 */
		EClass COMMITMENT_EXPRESSION = eINSTANCE.getCommitmentExpression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITMENT_EXPRESSION__LANGUAGE = eINSTANCE.getCommitmentExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITMENT_EXPRESSION__BODY = eINSTANCE.getCommitmentExpression_Body();

		/**
		 * The meta object literal for the '<em><b>Item Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMITMENT_EXPRESSION__ITEM_REFS = eINSTANCE.getCommitmentExpression_ItemRefs();

		/**
		 * The meta object literal for the '{@link bpmnchor.impl.CommitmentImpl <em>Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnchor.impl.CommitmentImpl
		 * @see bpmnchor.impl.BpmnchorPackageImpl#getCommitment()
		 * @generated
		 */
		EClass COMMITMENT = eINSTANCE.getCommitment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITMENT__TYPE = eINSTANCE.getCommitment_Type();

		/**
		 * The meta object literal for the '<em><b>Antecedent Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMITMENT__ANTECEDENT_EXPR = eINSTANCE.getCommitment_AntecedentExpr();

		/**
		 * The meta object literal for the '<em><b>Consequent Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMITMENT__CONSEQUENT_EXPR = eINSTANCE.getCommitment_ConsequentExpr();

		/**
		 * The meta object literal for the '<em><b>Active Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMITMENT__ACTIVE_EXPR = eINSTANCE.getCommitment_ActiveExpr();

		/**
		 * The meta object literal for the '<em><b>Scope Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMITMENT__SCOPE_BEGIN = eINSTANCE.getCommitment_ScopeBegin();

		/**
		 * The meta object literal for the '<em><b>Scope End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMITMENT__SCOPE_END = eINSTANCE.getCommitment_ScopeEnd();

		/**
		 * The meta object literal for the '{@link bpmnchor.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnchor.impl.ConnectionPointImpl
		 * @see bpmnchor.impl.BpmnchorPackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__SIDE = eINSTANCE.getConnectionPoint_Side();

		/**
		 * The meta object literal for the '<em><b>Message Flow Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__MESSAGE_FLOW_REF = eINSTANCE.getConnectionPoint_MessageFlowRef();

		/**
		 * The meta object literal for the '{@link bpmnchor.impl.DefinitionsImpl <em>Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnchor.impl.DefinitionsImpl
		 * @see bpmnchor.impl.BpmnchorPackageImpl#getDefinitions()
		 * @generated
		 */
		EClass DEFINITIONS = eINSTANCE.getDefinitions();

		/**
		 * The meta object literal for the '{@link bpmnchor.MonitoringResType <em>Monitoring Res Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnchor.MonitoringResType
		 * @see bpmnchor.impl.BpmnchorPackageImpl#getMonitoringResType()
		 * @generated
		 */
		EEnum MONITORING_RES_TYPE = eINSTANCE.getMonitoringResType();

		/**
		 * The meta object literal for the '{@link bpmnchor.MessageType <em>Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnchor.MessageType
		 * @see bpmnchor.impl.BpmnchorPackageImpl#getMessageType()
		 * @generated
		 */
		EEnum MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '{@link bpmnchor.CommitmentType <em>Commitment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmnchor.CommitmentType
		 * @see bpmnchor.impl.BpmnchorPackageImpl#getCommitmentType()
		 * @generated
		 */
		EEnum COMMITMENT_TYPE = eINSTANCE.getCommitmentType();

	}

} //BpmnchorPackage
