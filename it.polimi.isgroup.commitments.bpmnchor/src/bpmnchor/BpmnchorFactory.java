/**
 */
package bpmnchor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bpmnchor.BpmnchorPackage
 * @generated
 */
public interface BpmnchorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpmnchorFactory eINSTANCE = bpmnchor.impl.BpmnchorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Monitoring Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitoring Resource</em>'.
	 * @generated
	 */
	MonitoringResource createMonitoringResource();

	/**
	 * Returns a new object of class '<em>Commitment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commitment Expression</em>'.
	 * @generated
	 */
	CommitmentExpression createCommitmentExpression();

	/**
	 * Returns a new object of class '<em>Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commitment</em>'.
	 * @generated
	 */
	Commitment createCommitment();

	/**
	 * Returns a new object of class '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Point</em>'.
	 * @generated
	 */
	ConnectionPoint createConnectionPoint();

	/**
	 * Returns a new object of class '<em>Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definitions</em>'.
	 * @generated
	 */
	Definitions createDefinitions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BpmnchorPackage getBpmnchorPackage();

} //BpmnchorFactory
