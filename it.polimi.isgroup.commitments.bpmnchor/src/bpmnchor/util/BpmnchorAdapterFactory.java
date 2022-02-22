/**
 */
package bpmnchor.util;

import bpmnchor.*;

import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.Expression;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.RootElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bpmnchor.BpmnchorPackage
 * @generated
 */
public class BpmnchorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpmnchorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnchorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BpmnchorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpmnchorSwitch<Adapter> modelSwitch =
		new BpmnchorSwitch<Adapter>() {
			@Override
			public Adapter caseMonitoringResource(MonitoringResource object) {
				return createMonitoringResourceAdapter();
			}
			@Override
			public Adapter caseCommitmentExpression(CommitmentExpression object) {
				return createCommitmentExpressionAdapter();
			}
			@Override
			public Adapter caseCommitment(Commitment object) {
				return createCommitmentAdapter();
			}
			@Override
			public Adapter caseConnectionPoint(ConnectionPoint object) {
				return createConnectionPointAdapter();
			}
			@Override
			public Adapter caseDefinitions(Definitions object) {
				return createDefinitionsAdapter();
			}
			@Override
			public Adapter caseBaseElement(BaseElement object) {
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseRootElement(RootElement object) {
				return createRootElementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseFlowElement(FlowElement object) {
				return createFlowElementAdapter();
			}
			@Override
			public Adapter caseBpmn2_Definitions(org.eclipse.bpmn2.Definitions object) {
				return createBpmn2_DefinitionsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link bpmnchor.MonitoringResource <em>Monitoring Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnchor.MonitoringResource
	 * @generated
	 */
	public Adapter createMonitoringResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnchor.CommitmentExpression <em>Commitment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnchor.CommitmentExpression
	 * @generated
	 */
	public Adapter createCommitmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnchor.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnchor.Commitment
	 * @generated
	 */
	public Adapter createCommitmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnchor.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnchor.ConnectionPoint
	 * @generated
	 */
	public Adapter createConnectionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmnchor.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmnchor.Definitions
	 * @generated
	 */
	public Adapter createDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.RootElement
	 * @generated
	 */
	public Adapter createRootElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.bpmn2.Definitions
	 * @generated
	 */
	public Adapter createBpmn2_DefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BpmnchorAdapterFactory
