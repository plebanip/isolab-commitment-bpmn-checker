/**
 */
package bpmnchor.tests;

import bpmnchor.BpmnchorFactory;
import bpmnchor.CommitmentExpression;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Commitment Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommitmentExpressionTest extends TestCase {

	/**
	 * The fixture for this Commitment Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitmentExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommitmentExpressionTest.class);
	}

	/**
	 * Constructs a new Commitment Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Commitment Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CommitmentExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Commitment Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitmentExpression getFixture() {
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
		setFixture(BpmnchorFactory.eINSTANCE.createCommitmentExpression());
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

} //CommitmentExpressionTest
