/**
 */
package bpmnchor.tests;

import bpmnchor.BpmnchorFactory;
import bpmnchor.Commitment;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Commitment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommitmentTest extends TestCase {

	/**
	 * The fixture for this Commitment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Commitment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommitmentTest.class);
	}

	/**
	 * Constructs a new Commitment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Commitment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Commitment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Commitment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Commitment getFixture() {
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
		setFixture(BpmnchorFactory.eINSTANCE.createCommitment());
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

} //CommitmentTest
