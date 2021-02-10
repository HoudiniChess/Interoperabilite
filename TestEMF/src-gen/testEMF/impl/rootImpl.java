/**
 */
package testEMF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testEMF.Chose;
import testEMF.TestEMFPackage;
import testEMF.Truc;
import testEMF.root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testEMF.impl.rootImpl#getChose <em>Chose</em>}</li>
 *   <li>{@link testEMF.impl.rootImpl#getTruc <em>Truc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class rootImpl extends MinimalEObjectImpl.Container implements root
{
  /**
   * The cached value of the '{@link #getChose() <em>Chose</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChose()
   * @generated
   * @ordered
   */
  protected EList<Chose> chose;

  /**
   * The cached value of the '{@link #getTruc() <em>Truc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTruc()
   * @generated
   * @ordered
   */
  protected EList<Truc> truc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TestEMFPackage.Literals.ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Chose> getChose()
  {
    if (chose == null)
    {
      chose = new EObjectContainmentEList<Chose>(Chose.class, this, TestEMFPackage.ROOT__CHOSE);
    }
    return chose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Truc> getTruc()
  {
    if (truc == null)
    {
      truc = new EObjectContainmentEList<Truc>(Truc.class, this, TestEMFPackage.ROOT__TRUC);
    }
    return truc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TestEMFPackage.ROOT__CHOSE:
        return ((InternalEList<?>) getChose()).basicRemove(otherEnd, msgs);
      case TestEMFPackage.ROOT__TRUC:
        return ((InternalEList<?>) getTruc()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TestEMFPackage.ROOT__CHOSE:
        return getChose();
      case TestEMFPackage.ROOT__TRUC:
        return getTruc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TestEMFPackage.ROOT__CHOSE:
        getChose().clear();
        getChose().addAll((Collection<? extends Chose>) newValue);
        return;
      case TestEMFPackage.ROOT__TRUC:
        getTruc().clear();
        getTruc().addAll((Collection<? extends Truc>) newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TestEMFPackage.ROOT__CHOSE:
        getChose().clear();
        return;
      case TestEMFPackage.ROOT__TRUC:
        getTruc().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TestEMFPackage.ROOT__CHOSE:
        return chose != null && !chose.isEmpty();
      case TestEMFPackage.ROOT__TRUC:
        return truc != null && !truc.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //rootImpl
