/**
 */
package testEMF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testEMF.TestEMFPackage
 * @generated
 */
public interface TestEMFFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TestEMFFactory eINSTANCE = testEMF.impl.TestEMFFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Truc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Truc</em>'.
   * @generated
   */
  Truc createTruc();

  /**
   * Returns a new object of class '<em>Chose</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chose</em>'.
   * @generated
   */
  Chose createChose();

  /**
   * Returns a new object of class '<em>root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>root</em>'.
   * @generated
   */
  root createroot();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TestEMFPackage getTestEMFPackage();

} //TestEMFFactory
