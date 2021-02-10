/**
 */
package testEMF.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testEMF.Chose;
import testEMF.TestEMFFactory;
import testEMF.TestEMFPackage;
import testEMF.Truc;
import testEMF.root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestEMFPackageImpl extends EPackageImpl implements TestEMFPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trucEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

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
   * @see testEMF.TestEMFPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TestEMFPackageImpl()
  {
    super(eNS_URI, TestEMFFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TestEMFPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TestEMFPackage init()
  {
    if (isInited)
      return (TestEMFPackage) EPackage.Registry.INSTANCE.getEPackage(TestEMFPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTestEMFPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TestEMFPackageImpl theTestEMFPackage = registeredTestEMFPackage instanceof TestEMFPackageImpl
        ? (TestEMFPackageImpl) registeredTestEMFPackage
        : new TestEMFPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTestEMFPackage.createPackageContents();

    // Initialize created meta-data
    theTestEMFPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTestEMFPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TestEMFPackage.eNS_URI, theTestEMFPackage);
    return theTestEMFPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTruc()
  {
    return trucEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTruc_N()
  {
    return (EAttribute) trucEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTruc_Chose()
  {
    return (EReference) trucEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOperation getTruc__Affiche__String()
  {
    return trucEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChose()
  {
    return choseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getChose_Nom()
  {
    return (EAttribute) choseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChose_Trucs()
  {
    return (EReference) choseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getroot()
  {
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getroot_Chose()
  {
    return (EReference) rootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getroot_Truc()
  {
    return (EReference) rootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestEMFFactory getTestEMFFactory()
  {
    return (TestEMFFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    trucEClass = createEClass(TRUC);
    createEAttribute(trucEClass, TRUC__N);
    createEReference(trucEClass, TRUC__CHOSE);
    createEOperation(trucEClass, TRUC___AFFICHE__STRING);

    choseEClass = createEClass(CHOSE);
    createEAttribute(choseEClass, CHOSE__NOM);
    createEReference(choseEClass, CHOSE__TRUCS);

    rootEClass = createEClass(ROOT);
    createEReference(rootEClass, ROOT__CHOSE);
    createEReference(rootEClass, ROOT__TRUC);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(trucEClass, Truc.class, "Truc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTruc_N(), ecorePackage.getEInt(), "n", null, 0, 1, Truc.class, !IS_TRANSIENT, !IS_VOLATILE,
                   IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTruc_Chose(), this.getChose(), this.getChose_Trucs(), "chose", null, 0, 1, Truc.class,
                   !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                   IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getTruc__Affiche__String(), ecorePackage.getEBoolean(), "affiche", 0, 1, IS_UNIQUE,
                                   IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "ch", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(choseEClass, Chose.class, "Chose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChose_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Chose.class, !IS_TRANSIENT,
                   !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChose_Trucs(), this.getTruc(), this.getTruc_Chose(), "trucs", null, 0, -1, Chose.class,
                   !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                   IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rootEClass, root.class, "root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getroot_Chose(), this.getChose(), null, "chose", null, 0, -1, root.class, !IS_TRANSIENT,
                   !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                   !IS_DERIVED, IS_ORDERED);
    initEReference(getroot_Truc(), this.getTruc(), null, "truc", null, 0, -1, root.class, !IS_TRANSIENT, !IS_VOLATILE,
                   IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                   IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TestEMFPackageImpl
