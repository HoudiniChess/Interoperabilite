/**
 */
package testEMF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testEMF.TestEMFFactory
 * @model kind="package"
 * @generated
 */
public interface TestEMFPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "testEMF";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/testEMF";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "testEMF";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TestEMFPackage eINSTANCE = testEMF.impl.TestEMFPackageImpl.init();

  /**
   * The meta object id for the '{@link testEMF.impl.TrucImpl <em>Truc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see testEMF.impl.TrucImpl
   * @see testEMF.impl.TestEMFPackageImpl#getTruc()
   * @generated
   */
  int TRUC = 0;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUC__N = 0;

  /**
   * The feature id for the '<em><b>Chose</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUC__CHOSE = 1;

  /**
   * The number of structural features of the '<em>Truc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUC_FEATURE_COUNT = 2;

  /**
   * The operation id for the '<em>Affiche</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUC___AFFICHE__STRING = 0;

  /**
   * The number of operations of the '<em>Truc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUC_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link testEMF.impl.ChoseImpl <em>Chose</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see testEMF.impl.ChoseImpl
   * @see testEMF.impl.TestEMFPackageImpl#getChose()
   * @generated
   */
  int CHOSE = 1;

  /**
   * The feature id for the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOSE__NOM = 0;

  /**
   * The feature id for the '<em><b>Trucs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOSE__TRUCS = 1;

  /**
   * The number of structural features of the '<em>Chose</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOSE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Chose</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOSE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link testEMF.impl.rootImpl <em>root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see testEMF.impl.rootImpl
   * @see testEMF.impl.TestEMFPackageImpl#getroot()
   * @generated
   */
  int ROOT = 2;

  /**
   * The feature id for the '<em><b>Chose</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__CHOSE = 0;

  /**
   * The feature id for the '<em><b>Truc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__TRUC = 1;

  /**
   * The number of structural features of the '<em>root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_OPERATION_COUNT = 0;

  /**
   * Returns the meta object for class '{@link testEMF.Truc <em>Truc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Truc</em>'.
   * @see testEMF.Truc
   * @generated
   */
  EClass getTruc();

  /**
   * Returns the meta object for the attribute '{@link testEMF.Truc#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see testEMF.Truc#getN()
   * @see #getTruc()
   * @generated
   */
  EAttribute getTruc_N();

  /**
   * Returns the meta object for the reference '{@link testEMF.Truc#getChose <em>Chose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Chose</em>'.
   * @see testEMF.Truc#getChose()
   * @see #getTruc()
   * @generated
   */
  EReference getTruc_Chose();

  /**
   * Returns the meta object for the '{@link testEMF.Truc#affiche(java.lang.String) <em>Affiche</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Affiche</em>' operation.
   * @see testEMF.Truc#affiche(java.lang.String)
   * @generated
   */
  EOperation getTruc__Affiche__String();

  /**
   * Returns the meta object for class '{@link testEMF.Chose <em>Chose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chose</em>'.
   * @see testEMF.Chose
   * @generated
   */
  EClass getChose();

  /**
   * Returns the meta object for the attribute '{@link testEMF.Chose#getNom <em>Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nom</em>'.
   * @see testEMF.Chose#getNom()
   * @see #getChose()
   * @generated
   */
  EAttribute getChose_Nom();

  /**
   * Returns the meta object for the reference list '{@link testEMF.Chose#getTrucs <em>Trucs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Trucs</em>'.
   * @see testEMF.Chose#getTrucs()
   * @see #getChose()
   * @generated
   */
  EReference getChose_Trucs();

  /**
   * Returns the meta object for class '{@link testEMF.root <em>root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>root</em>'.
   * @see testEMF.root
   * @generated
   */
  EClass getroot();

  /**
   * Returns the meta object for the containment reference list '{@link testEMF.root#getChose <em>Chose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Chose</em>'.
   * @see testEMF.root#getChose()
   * @see #getroot()
   * @generated
   */
  EReference getroot_Chose();

  /**
   * Returns the meta object for the containment reference list '{@link testEMF.root#getTruc <em>Truc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Truc</em>'.
   * @see testEMF.root#getTruc()
   * @see #getroot()
   * @generated
   */
  EReference getroot_Truc();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TestEMFFactory getTestEMFFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link testEMF.impl.TrucImpl <em>Truc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see testEMF.impl.TrucImpl
     * @see testEMF.impl.TestEMFPackageImpl#getTruc()
     * @generated
     */
    EClass TRUC = eINSTANCE.getTruc();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUC__N = eINSTANCE.getTruc_N();

    /**
     * The meta object literal for the '<em><b>Chose</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUC__CHOSE = eINSTANCE.getTruc_Chose();

    /**
     * The meta object literal for the '<em><b>Affiche</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation TRUC___AFFICHE__STRING = eINSTANCE.getTruc__Affiche__String();

    /**
     * The meta object literal for the '{@link testEMF.impl.ChoseImpl <em>Chose</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see testEMF.impl.ChoseImpl
     * @see testEMF.impl.TestEMFPackageImpl#getChose()
     * @generated
     */
    EClass CHOSE = eINSTANCE.getChose();

    /**
     * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOSE__NOM = eINSTANCE.getChose_Nom();

    /**
     * The meta object literal for the '<em><b>Trucs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOSE__TRUCS = eINSTANCE.getChose_Trucs();

    /**
     * The meta object literal for the '{@link testEMF.impl.rootImpl <em>root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see testEMF.impl.rootImpl
     * @see testEMF.impl.TestEMFPackageImpl#getroot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getroot();

    /**
     * The meta object literal for the '<em><b>Chose</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__CHOSE = eINSTANCE.getroot_Chose();

    /**
     * The meta object literal for the '<em><b>Truc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__TRUC = eINSTANCE.getroot_Truc();

  }

} //TestEMFPackage
