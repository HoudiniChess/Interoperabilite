/**
 */
package testEMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testEMF.root#getChose <em>Chose</em>}</li>
 *   <li>{@link testEMF.root#getTruc <em>Truc</em>}</li>
 * </ul>
 *
 * @see testEMF.TestEMFPackage#getroot()
 * @model
 * @generated
 */
public interface root extends EObject
{
  /**
   * Returns the value of the '<em><b>Chose</b></em>' containment reference list.
   * The list contents are of type {@link testEMF.Chose}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chose</em>' containment reference list.
   * @see testEMF.TestEMFPackage#getroot_Chose()
   * @model containment="true"
   * @generated
   */
  EList<Chose> getChose();

  /**
   * Returns the value of the '<em><b>Truc</b></em>' containment reference list.
   * The list contents are of type {@link testEMF.Truc}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Truc</em>' containment reference list.
   * @see testEMF.TestEMFPackage#getroot_Truc()
   * @model containment="true"
   * @generated
   */
  EList<Truc> getTruc();

} // root
