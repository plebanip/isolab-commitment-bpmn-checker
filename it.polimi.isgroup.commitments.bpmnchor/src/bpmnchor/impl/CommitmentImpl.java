/**
 */
package bpmnchor.impl;

import bpmnchor.BpmnchorPackage;
import bpmnchor.Commitment;
import bpmnchor.CommitmentExpression;
import bpmnchor.CommitmentType;
import bpmnchor.ConnectionPoint;

import org.eclipse.bpmn2.impl.FlowElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commitment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmnchor.impl.CommitmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link bpmnchor.impl.CommitmentImpl#getAntecedentExpr <em>Antecedent Expr</em>}</li>
 *   <li>{@link bpmnchor.impl.CommitmentImpl#getConsequentExpr <em>Consequent Expr</em>}</li>
 *   <li>{@link bpmnchor.impl.CommitmentImpl#getActiveExpr <em>Active Expr</em>}</li>
 *   <li>{@link bpmnchor.impl.CommitmentImpl#getScopeBegin <em>Scope Begin</em>}</li>
 *   <li>{@link bpmnchor.impl.CommitmentImpl#getScopeEnd <em>Scope End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitmentImpl extends FlowElementImpl implements Commitment {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CommitmentType TYPE_EDEFAULT = CommitmentType.GOAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CommitmentType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAntecedentExpr() <em>Antecedent Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentExpr()
	 * @generated
	 * @ordered
	 */
	protected CommitmentExpression antecedentExpr;

	/**
	 * The cached value of the '{@link #getConsequentExpr() <em>Consequent Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequentExpr()
	 * @generated
	 * @ordered
	 */
	protected CommitmentExpression consequentExpr;

	/**
	 * The cached value of the '{@link #getActiveExpr() <em>Active Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveExpr()
	 * @generated
	 * @ordered
	 */
	protected CommitmentExpression activeExpr;

	/**
	 * The cached value of the '{@link #getScopeBegin() <em>Scope Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeBegin()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPoint scopeBegin;

	/**
	 * The cached value of the '{@link #getScopeEnd() <em>Scope End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeEnd()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPoint scopeEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnchorPackage.Literals.COMMITMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CommitmentType newType) {
		CommitmentType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentExpression getAntecedentExpr() {
		if (antecedentExpr != null && antecedentExpr.eIsProxy()) {
			InternalEObject oldAntecedentExpr = (InternalEObject)antecedentExpr;
			antecedentExpr = (CommitmentExpression)eResolveProxy(oldAntecedentExpr);
			if (antecedentExpr != oldAntecedentExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnchorPackage.COMMITMENT__ANTECEDENT_EXPR, oldAntecedentExpr, antecedentExpr));
			}
		}
		return antecedentExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentExpression basicGetAntecedentExpr() {
		return antecedentExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentExpr(CommitmentExpression newAntecedentExpr) {
		CommitmentExpression oldAntecedentExpr = antecedentExpr;
		antecedentExpr = newAntecedentExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT__ANTECEDENT_EXPR, oldAntecedentExpr, antecedentExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentExpression getConsequentExpr() {
		if (consequentExpr != null && consequentExpr.eIsProxy()) {
			InternalEObject oldConsequentExpr = (InternalEObject)consequentExpr;
			consequentExpr = (CommitmentExpression)eResolveProxy(oldConsequentExpr);
			if (consequentExpr != oldConsequentExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnchorPackage.COMMITMENT__CONSEQUENT_EXPR, oldConsequentExpr, consequentExpr));
			}
		}
		return consequentExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentExpression basicGetConsequentExpr() {
		return consequentExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequentExpr(CommitmentExpression newConsequentExpr) {
		CommitmentExpression oldConsequentExpr = consequentExpr;
		consequentExpr = newConsequentExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT__CONSEQUENT_EXPR, oldConsequentExpr, consequentExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentExpression getActiveExpr() {
		if (activeExpr != null && activeExpr.eIsProxy()) {
			InternalEObject oldActiveExpr = (InternalEObject)activeExpr;
			activeExpr = (CommitmentExpression)eResolveProxy(oldActiveExpr);
			if (activeExpr != oldActiveExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnchorPackage.COMMITMENT__ACTIVE_EXPR, oldActiveExpr, activeExpr));
			}
		}
		return activeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentExpression basicGetActiveExpr() {
		return activeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveExpr(CommitmentExpression newActiveExpr) {
		CommitmentExpression oldActiveExpr = activeExpr;
		activeExpr = newActiveExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT__ACTIVE_EXPR, oldActiveExpr, activeExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint getScopeBegin() {
		return scopeBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopeBegin(ConnectionPoint newScopeBegin, NotificationChain msgs) {
		ConnectionPoint oldScopeBegin = scopeBegin;
		scopeBegin = newScopeBegin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT__SCOPE_BEGIN, oldScopeBegin, newScopeBegin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeBegin(ConnectionPoint newScopeBegin) {
		if (newScopeBegin != scopeBegin) {
			NotificationChain msgs = null;
			if (scopeBegin != null)
				msgs = ((InternalEObject)scopeBegin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnchorPackage.COMMITMENT__SCOPE_BEGIN, null, msgs);
			if (newScopeBegin != null)
				msgs = ((InternalEObject)newScopeBegin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnchorPackage.COMMITMENT__SCOPE_BEGIN, null, msgs);
			msgs = basicSetScopeBegin(newScopeBegin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT__SCOPE_BEGIN, newScopeBegin, newScopeBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint getScopeEnd() {
		return scopeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopeEnd(ConnectionPoint newScopeEnd, NotificationChain msgs) {
		ConnectionPoint oldScopeEnd = scopeEnd;
		scopeEnd = newScopeEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT__SCOPE_END, oldScopeEnd, newScopeEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeEnd(ConnectionPoint newScopeEnd) {
		if (newScopeEnd != scopeEnd) {
			NotificationChain msgs = null;
			if (scopeEnd != null)
				msgs = ((InternalEObject)scopeEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnchorPackage.COMMITMENT__SCOPE_END, null, msgs);
			if (newScopeEnd != null)
				msgs = ((InternalEObject)newScopeEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnchorPackage.COMMITMENT__SCOPE_END, null, msgs);
			msgs = basicSetScopeEnd(newScopeEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnchorPackage.COMMITMENT__SCOPE_END, newScopeEnd, newScopeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnchorPackage.COMMITMENT__SCOPE_BEGIN:
				return basicSetScopeBegin(null, msgs);
			case BpmnchorPackage.COMMITMENT__SCOPE_END:
				return basicSetScopeEnd(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnchorPackage.COMMITMENT__TYPE:
				return getType();
			case BpmnchorPackage.COMMITMENT__ANTECEDENT_EXPR:
				if (resolve) return getAntecedentExpr();
				return basicGetAntecedentExpr();
			case BpmnchorPackage.COMMITMENT__CONSEQUENT_EXPR:
				if (resolve) return getConsequentExpr();
				return basicGetConsequentExpr();
			case BpmnchorPackage.COMMITMENT__ACTIVE_EXPR:
				if (resolve) return getActiveExpr();
				return basicGetActiveExpr();
			case BpmnchorPackage.COMMITMENT__SCOPE_BEGIN:
				return getScopeBegin();
			case BpmnchorPackage.COMMITMENT__SCOPE_END:
				return getScopeEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnchorPackage.COMMITMENT__TYPE:
				setType((CommitmentType)newValue);
				return;
			case BpmnchorPackage.COMMITMENT__ANTECEDENT_EXPR:
				setAntecedentExpr((CommitmentExpression)newValue);
				return;
			case BpmnchorPackage.COMMITMENT__CONSEQUENT_EXPR:
				setConsequentExpr((CommitmentExpression)newValue);
				return;
			case BpmnchorPackage.COMMITMENT__ACTIVE_EXPR:
				setActiveExpr((CommitmentExpression)newValue);
				return;
			case BpmnchorPackage.COMMITMENT__SCOPE_BEGIN:
				setScopeBegin((ConnectionPoint)newValue);
				return;
			case BpmnchorPackage.COMMITMENT__SCOPE_END:
				setScopeEnd((ConnectionPoint)newValue);
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
			case BpmnchorPackage.COMMITMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BpmnchorPackage.COMMITMENT__ANTECEDENT_EXPR:
				setAntecedentExpr((CommitmentExpression)null);
				return;
			case BpmnchorPackage.COMMITMENT__CONSEQUENT_EXPR:
				setConsequentExpr((CommitmentExpression)null);
				return;
			case BpmnchorPackage.COMMITMENT__ACTIVE_EXPR:
				setActiveExpr((CommitmentExpression)null);
				return;
			case BpmnchorPackage.COMMITMENT__SCOPE_BEGIN:
				setScopeBegin((ConnectionPoint)null);
				return;
			case BpmnchorPackage.COMMITMENT__SCOPE_END:
				setScopeEnd((ConnectionPoint)null);
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
			case BpmnchorPackage.COMMITMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case BpmnchorPackage.COMMITMENT__ANTECEDENT_EXPR:
				return antecedentExpr != null;
			case BpmnchorPackage.COMMITMENT__CONSEQUENT_EXPR:
				return consequentExpr != null;
			case BpmnchorPackage.COMMITMENT__ACTIVE_EXPR:
				return activeExpr != null;
			case BpmnchorPackage.COMMITMENT__SCOPE_BEGIN:
				return scopeBegin != null;
			case BpmnchorPackage.COMMITMENT__SCOPE_END:
				return scopeEnd != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CommitmentImpl
