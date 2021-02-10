/**
 */
package testEMF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testEMF.Chose;
import testEMF.TestEMFPackage;
import testEMF.Truc;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Chose</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testEMF.impl.ChoseImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link testEMF.impl.ChoseImpl#getTrucs <em>Trucs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoseImpl extends MinimalEObjectImpl.Container implements Chose
{
  /**
   * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected static final String NOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected String nom = NOM_EDEFAULT;

  /**
   * The cached value of the '{@link #getTrucs() <em>Trucs</em>}' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTrucs()
   * @generated
   * @ordered
   */
  protected EList<Truc> trucs;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ChoseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TestEMFPackage.Literals.CHOSE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNom()
  {
    return nom;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNom(String newNom)
  {
    String oldNom = nom;
    nom = newNom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestEMFPackage.CHOSE__NOM, oldNom, nom));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Truc> getTrucs()
  {
    if (trucs == null)
    {
      trucs = new EObjectWithInverseResolvingEList<Truc>(Truc.class, this, TestEMFPackage.CHOSE__TRUCS,
          TestEMFPackage.TRUC__CHOSE);
    }
    return trucs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TestEMFPackage.CHOSE__TRUCS:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getTrucs()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TestEMFPackage.CHOSE__TRUCS:
        return ((InternalEList<?>) getTrucs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TestEMFPackage.CHOSE__NOM:
        return getNom();
      case TestEMFPackage.CHOSE__TRUCS:
        return getTrucs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TestEMFPackage.CHOSE__NOM:
        setNom((String) newValue);
        return;
      case TestEMFPackage.CHOSE__TRUCS:
        getTrucs().clear();
        getTrucs().addAll((Collection<? extends Truc>) newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TestEMFPackage.CHOSE__NOM:
        setNom(NOM_EDEFAULT);
        return;
      case TestEMFPackage.CHOSE__TRUCS:
        getTrucs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TestEMFPackage.CHOSE__NOM:
        return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
      case TestEMFPackage.CHOSE__TRUCS:
        return trucs != null && !trucs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    return this.nom.toUpperCase();
  }

} // ChoseImpl
