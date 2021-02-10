/**
 */
package testEMF.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import testEMF.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestEMFFactoryImpl extends EFactoryImpl implements TestEMFFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TestEMFFactory init()
  {
    try
    {
      TestEMFFactory theTestEMFFactory = (TestEMFFactory) EPackage.Registry.INSTANCE
          .getEFactory(TestEMFPackage.eNS_URI);
      if (theTestEMFFactory != null)
      {
        return theTestEMFFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TestEMFFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestEMFFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TestEMFPackage.TRUC:
        return createTruc();
      case TestEMFPackage.CHOSE:
        return createChose();
      case TestEMFPackage.ROOT:
        return createroot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Truc createTruc()
  {
    TrucImpl truc = new TrucImpl();
    return truc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Chose createChose()
  {
    ChoseImpl chose = new ChoseImpl();
    return chose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public root createroot()
  {
    rootImpl root = new rootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestEMFPackage getTestEMFPackage()
  {
    return (TestEMFPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TestEMFPackage getPackage()
  {
    return TestEMFPackage.eINSTANCE;
  }

} //TestEMFFactoryImpl
