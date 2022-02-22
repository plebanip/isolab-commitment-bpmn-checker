/**
 */
package bpmnchor.impl;

import bpmnchor.BpmnchorFactory;
import bpmnchor.BpmnchorPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.bpmn2.di.BpmnDiPackage;

import org.eclipse.dd.dc.DcPackage;

import org.eclipse.dd.di.DiPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnchorPackageImpl extends EPackageImpl implements BpmnchorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "bpmnchor.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitoringResTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commitmentTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bpmnchor.BpmnchorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BpmnchorPackageImpl() {
		super(eNS_URI, BpmnchorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BpmnchorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static BpmnchorPackage init() {
		if (isInited) return (BpmnchorPackage)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI);

		// Obtain or create and register package
		BpmnchorPackageImpl theBpmnchorPackage = (BpmnchorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BpmnchorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BpmnchorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Bpmn2Package.eINSTANCE.eClass();
		BpmnDiPackage.eINSTANCE.eClass();
		DiPackage.eINSTANCE.eClass();
		DcPackage.eINSTANCE.eClass();

		// Load packages
		theBpmnchorPackage.loadPackage();

		// Fix loaded packages
		theBpmnchorPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBpmnchorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BpmnchorPackage.eNS_URI, theBpmnchorPackage);
		return theBpmnchorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoringResource() {
		if (monitoringResourceEClass == null) {
			monitoringResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI).getEClassifiers().get(0);
		}
		return monitoringResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoringResource_Endpoint() {
        return (EAttribute)getMonitoringResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoringResource_CanCompute() {
        return (EAttribute)getMonitoringResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoringResource_Type() {
        return (EAttribute)getMonitoringResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoringResource_OwnerRef() {
        return (EReference)getMonitoringResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoringResource_ItemRef() {
        return (EReference)getMonitoringResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommitmentExpression() {
		if (commitmentExpressionEClass == null) {
			commitmentExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI).getEClassifiers().get(2);
		}
		return commitmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitmentExpression_Language() {
        return (EAttribute)getCommitmentExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitmentExpression_Body() {
        return (EAttribute)getCommitmentExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommitmentExpression_ItemRefs() {
        return (EReference)getCommitmentExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommitment() {
		if (commitmentEClass == null) {
			commitmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI).getEClassifiers().get(3);
		}
		return commitmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitment_Type() {
        return (EAttribute)getCommitment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommitment_AntecedentExpr() {
        return (EReference)getCommitment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommitment_ConsequentExpr() {
        return (EReference)getCommitment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommitment_ActiveExpr() {
        return (EReference)getCommitment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommitment_ScopeBegin() {
        return (EReference)getCommitment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommitment_ScopeEnd() {
        return (EReference)getCommitment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPoint() {
		if (connectionPointEClass == null) {
			connectionPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI).getEClassifiers().get(4);
		}
		return connectionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Side() {
        return (EAttribute)getConnectionPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_MessageFlowRef() {
        return (EReference)getConnectionPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitions() {
		if (definitionsEClass == null) {
			definitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI).getEClassifiers().get(7);
		}
		return definitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitoringResType() {
		if (monitoringResTypeEEnum == null) {
			monitoringResTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI).getEClassifiers().get(1);
		}
		return monitoringResTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageType() {
		if (messageTypeEEnum == null) {
			messageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI).getEClassifiers().get(5);
		}
		return messageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommitmentType() {
		if (commitmentTypeEEnum == null) {
			commitmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnchorPackage.eNS_URI).getEClassifiers().get(6);
		}
		return commitmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnchorFactory getBpmnchorFactory() {
		return (BpmnchorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("bpmnchor." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //BpmnchorPackageImpl
