/**
 */
package testEMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testEMF.Chose#getNom <em>Nom</em>}</li>
 *   <li>{@link testEMF.Chose#getTrucs <em>Trucs</em>}</li>
 * </ul>
 *
 * @see testEMF.TestEMFPackage#getChose()
 * @model
 * @generated
 */
public interface Chose extends EObject
{
  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see testEMF.TestEMFPackage#getChose_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link testEMF.Chose#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

  /**
   * Returns the value of the '<em><b>Trucs</b></em>' reference list.
   * The list contents are of type {@link testEMF.Truc}.
   * It is bidirectional and its opposite is '{@link testEMF.Truc#getChose <em>Chose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trucs</em>' reference list.
   * @see testEMF.TestEMFPackage#getChose_Trucs()
   * @see testEMF.Truc#getChose
   * @model opposite="chose"
   * @generated
   */
  EList<Truc> getTrucs();

} // Chose
