/**
 */
package bpmnchor.tests;

import bpmnchor.BpmnchorFactory;
import bpmnchor.Definitions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsTest extends TestCase {

	/**
	 * The fixture for this Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Definitions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DefinitionsTest.class);
	}

	/**
	 * Constructs a new Definitions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Definitions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Definitions getFixture() {
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
		setFixture(BpmnchorFactory.eINSTANCE.createDefinitions());
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

} //DefinitionsTest
