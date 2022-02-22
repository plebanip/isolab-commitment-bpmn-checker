/**
 */
package bpmnchor.impl;

import bpmnchor.BpmnchorPackage;
import bpmnchor.CommitmentExpression;

import java.util.Collection;

import org.eclipse.bpmn2.ItemDefinition;

import org.eclipse.bpmn2.impl.ExpressionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commitment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmnchor.impl.CommitmentExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link bpmnchor.impl.CommitmentExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link bpmnchor.impl.CommitmentExpressionImpl#getItemRefs <em>Item Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitmentExpressionImpl extends ExpressionImpl implements CommitmentExpression {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemRefs() <em>Item Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemDefinition> itemRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitmentExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnchorPackage.Literals.COMMITMENT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT_EXPRESSION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT_EXPRESSION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemDefinition> getItemRefs() {
		if (itemRefs == null) {
			itemRefs = new EObjectResolvingEList<ItemDefinition>(ItemDefinition.class, this, BpmnchorPackage.COMMITMENT_EXPRESSION__ITEM_REFS);
		}
		return itemRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnchorPackage.COMMITMENT_EXPRESSION__LANGUAGE:
				return getLanguage();
			case BpmnchorPackage.COMMITMENT_EXPRESSION__BODY:
				return getBody();
			case BpmnchorPackage.COMMITMENT_EXPRESSION__ITEM_REFS:
				return getItemRefs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnchorPackage.COMMITMENT_EXPRESSION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case BpmnchorPackage.COMMITMENT_EXPRESSION__BODY:
				setBody((String)newValue);
				return;
			case BpmnchorPackage.COMMITMENT_EXPRESSION__ITEM_REFS:
				getItemRefs().clear();
				getItemRefs().addAll((Collection<? extends ItemDefinition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpmnchorPackage.COMMITMENT_EXPRESSION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case BpmnchorPackage.COMMITMENT_EXPRESSION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case BpmnchorPackage.COMMITMENT_EXPRESSION__ITEM_REFS:
				getItemRefs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmnchorPackage.COMMITMENT_EXPRESSION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case BpmnchorPackage.COMMITMENT_EXPRESSION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case BpmnchorPackage.COMMITMENT_EXPRESSION__ITEM_REFS:
				return itemRefs != null && !itemRefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (language: ");
		result.append(language);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //CommitmentExpressionImpl
