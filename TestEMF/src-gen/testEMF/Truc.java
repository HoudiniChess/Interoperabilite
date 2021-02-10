/**
 */
package testEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Truc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testEMF.Truc#getN <em>N</em>}</li>
 *   <li>{@link testEMF.Truc#getChose <em>Chose</em>}</li>
 * </ul>
 *
 * @see testEMF.TestEMFPackage#getTruc()
 * @model
 * @generated
 */
public interface Truc extends EObject
{
  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see testEMF.TestEMFPackage#getTruc_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link testEMF.Truc#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

  /**
   * Returns the value of the '<em><b>Chose</b></em>' reference.
   * It is bidirectional and its opposite is '{@link testEMF.Chose#getTrucs <em>Trucs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chose</em>' reference.
   * @see #setChose(Chose)
   * @see testEMF.TestEMFPackage#getTruc_Chose()
   * @see testEMF.Chose#getTrucs
   * @model opposite="trucs"
   * @generated
   */
  Chose getChose();

  /**
   * Sets the value of the '{@link testEMF.Truc#getChose <em>Chose</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chose</em>' reference.
   * @see #getChose()
   * @generated
   */
  void setChose(Chose value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  boolean affiche(String ch);

} // Truc
