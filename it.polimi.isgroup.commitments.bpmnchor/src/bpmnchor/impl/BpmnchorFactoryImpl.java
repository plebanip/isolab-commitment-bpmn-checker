/**
 */
package bpmnchor.impl;

import bpmnchor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnchorFactoryImpl extends EFactoryImpl implements BpmnchorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpmnchorFactory init() {
		try {
			BpmnchorFactory theBpmnchorFactory = (BpmnchorFactory)EPackage.Registry.INSTANCE.getEFactory(BpmnchorPackage.eNS_URI);
			if (theBpmnchorFactory != null) {
				return theBpmnchorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpmnchorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnchorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BpmnchorPackage.MONITORING_RESOURCE: return createMonitoringResource();
			case BpmnchorPackage.COMMITMENT_EXPRESSION: return createCommitmentExpression();
			case BpmnchorPackage.COMMITMENT: return createCommitment();
			case BpmnchorPackage.CONNECTION_POINT: return createConnectionPoint();
			case BpmnchorPackage.DEFINITIONS: return createDefinitions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BpmnchorPackage.MONITORING_RES_TYPE:
				return createMonitoringResTypeFromString(eDataType, initialValue);
			case BpmnchorPackage.MESSAGE_TYPE:
				return createMessageTypeFromString(eDataType, initialValue);
			case BpmnchorPackage.COMMITMENT_TYPE:
				return createCommitmentTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BpmnchorPackage.MONITORING_RES_TYPE:
				return convertMonitoringResTypeToString(eDataType, instanceValue);
			case BpmnchorPackage.MESSAGE_TYPE:
				return convertMessageTypeToString(eDataType, instanceValue);
			case BpmnchorPackage.COMMITMENT_TYPE:
				return convertCommitmentTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringResource createMonitoringResource() {
		MonitoringResourceImpl monitoringResource = new MonitoringResourceImpl();
		return monitoringResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentExpression createCommitmentExpression() {
		CommitmentExpressionImpl commitmentExpression = new CommitmentExpressionImpl();
		return commitmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commitment createCommitment() {
		CommitmentImpl commitment = new CommitmentImpl();
		return commitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint createConnectionPoint() {
		ConnectionPointImpl connectionPoint = new ConnectionPointImpl();
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringResType createMonitoringResTypeFromString(EDataType eDataType, String initialValue) {
		MonitoringResType result = MonitoringResType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringResTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageTypeFromString(EDataType eDataType, String initialValue) {
		MessageType result = MessageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentType createCommitmentTypeFromString(EDataType eDataType, String initialValue) {
		CommitmentType result = CommitmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommitmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnchorPackage getBpmnchorPackage() {
		return (BpmnchorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpmnchorPackage getPackage() {
		return BpmnchorPackage.eINSTANCE;
	}

} //BpmnchorFactoryImpl
