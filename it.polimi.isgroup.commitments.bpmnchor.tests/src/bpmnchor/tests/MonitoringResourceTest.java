/**
 */
package bpmnchor.tests;

import bpmnchor.BpmnchorFactory;
import bpmnchor.MonitoringResource;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Monitoring Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitoringResourceTest extends TestCase {

	/**
	 * The fixture for this Monitoring Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringResource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MonitoringResourceTest.class);
	}

	/**
	 * Constructs a new Monitoring Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringResourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Monitoring Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MonitoringResource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Monitoring Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringResource getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmnchorFactory.eINSTANCE.createMonitoringResource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MonitoringResourceTest
