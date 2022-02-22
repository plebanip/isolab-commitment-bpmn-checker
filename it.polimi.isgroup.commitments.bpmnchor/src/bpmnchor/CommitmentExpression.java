/**
 */
package bpmnchor;

import org.eclipse.bpmn2.Expression;
import org.eclipse.bpmn2.ItemDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commitment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmnchor.CommitmentExpression#getLanguage <em>Language</em>}</li>
 *   <li>{@link bpmnchor.CommitmentExpression#getBody <em>Body</em>}</li>
 *   <li>{@link bpmnchor.CommitmentExpression#getItemRefs <em>Item Refs</em>}</li>
 * </ul>
 *
 * @see bpmnchor.BpmnchorPackage#getCommitmentExpression()
 * @model
 * @generated
 */
public interface CommitmentExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see bpmnchor.BpmnchorPackage#getCommitmentExpression_Language()
	 * @model required="true"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link bpmnchor.CommitmentExpression#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see bpmnchor.BpmnchorPackage#getCommitmentExpression_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link bpmnchor.CommitmentExpression#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Item Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.bpmn2.ItemDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Refs</em>' reference list.
	 * @see bpmnchor.BpmnchorPackage#getCommitmentExpression_ItemRefs()
	 * @model
	 * @generated
	 */
	EList<ItemDefinition> getItemRefs();

} // CommitmentExpression
