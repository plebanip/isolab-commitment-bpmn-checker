/**
 */
package bpmnchor;

import org.eclipse.bpmn2.FlowElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commitment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmnchor.Commitment#getType <em>Type</em>}</li>
 *   <li>{@link bpmnchor.Commitment#getAntecedentExpr <em>Antecedent Expr</em>}</li>
 *   <li>{@link bpmnchor.Commitment#getConsequentExpr <em>Consequent Expr</em>}</li>
 *   <li>{@link bpmnchor.Commitment#getActiveExpr <em>Active Expr</em>}</li>
 *   <li>{@link bpmnchor.Commitment#getScopeBegin <em>Scope Begin</em>}</li>
 *   <li>{@link bpmnchor.Commitment#getScopeEnd <em>Scope End</em>}</li>
 * </ul>
 *
 * @see bpmnchor.BpmnchorPackage#getCommitment()
 * @model
 * @generated
 */
public interface Commitment extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmnchor.CommitmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bpmnchor.CommitmentType
	 * @see #setType(CommitmentType)
	 * @see bpmnchor.BpmnchorPackage#getCommitment_Type()
	 * @model required="true"
	 * @generated
	 */
	CommitmentType getType();

	/**
	 * Sets the value of the '{@link bpmnchor.Commitment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bpmnchor.CommitmentType
	 * @see #getType()
	 * @generated
	 */
	void setType(CommitmentType value);

	/**
	 * Returns the value of the '<em><b>Antecedent Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent Expr</em>' reference.
	 * @see #setAntecedentExpr(CommitmentExpression)
	 * @see bpmnchor.BpmnchorPackage#getCommitment_AntecedentExpr()
	 * @model required="true"
	 * @generated
	 */
	CommitmentExpression getAntecedentExpr();

	/**
	 * Sets the value of the '{@link bpmnchor.Commitment#getAntecedentExpr <em>Antecedent Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent Expr</em>' reference.
	 * @see #getAntecedentExpr()
	 * @generated
	 */
	void setAntecedentExpr(CommitmentExpression value);

	/**
	 * Returns the value of the '<em><b>Consequent Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent Expr</em>' reference.
	 * @see #setConsequentExpr(CommitmentExpression)
	 * @see bpmnchor.BpmnchorPackage#getCommitment_ConsequentExpr()
	 * @model required="true"
	 * @generated
	 */
	CommitmentExpression getConsequentExpr();

	/**
	 * Sets the value of the '{@link bpmnchor.Commitment#getConsequentExpr <em>Consequent Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent Expr</em>' reference.
	 * @see #getConsequentExpr()
	 * @generated
	 */
	void setConsequentExpr(CommitmentExpression value);

	/**
	 * Returns the value of the '<em><b>Active Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Expr</em>' reference.
	 * @see #setActiveExpr(CommitmentExpression)
	 * @see bpmnchor.BpmnchorPackage#getCommitment_ActiveExpr()
	 * @model
	 * @generated
	 */
	CommitmentExpression getActiveExpr();

	/**
	 * Sets the value of the '{@link bpmnchor.Commitment#getActiveExpr <em>Active Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Expr</em>' reference.
	 * @see #getActiveExpr()
	 * @generated
	 */
	void setActiveExpr(CommitmentExpression value);

	/**
	 * Returns the value of the '<em><b>Scope Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Begin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Begin</em>' containment reference.
	 * @see #setScopeBegin(ConnectionPoint)
	 * @see bpmnchor.BpmnchorPackage#getCommitment_ScopeBegin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionPoint getScopeBegin();

	/**
	 * Sets the value of the '{@link bpmnchor.Commitment#getScopeBegin <em>Scope Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Begin</em>' containment reference.
	 * @see #getScopeBegin()
	 * @generated
	 */
	void setScopeBegin(ConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>Scope End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope End</em>' containment reference.
	 * @see #setScopeEnd(ConnectionPoint)
	 * @see bpmnchor.BpmnchorPackage#getCommitment_ScopeEnd()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionPoint getScopeEnd();

	/**
	 * Sets the value of the '{@link bpmnchor.Commitment#getScopeEnd <em>Scope End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope End</em>' containment reference.
	 * @see #getScopeEnd()
	 * @generated
	 */
	void setScopeEnd(ConnectionPoint value);

} // Commitment
