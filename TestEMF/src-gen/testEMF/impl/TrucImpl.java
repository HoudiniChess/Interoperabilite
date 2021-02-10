/**
 */
package testEMF.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import testEMF.Chose;
import testEMF.TestEMFPackage;
import testEMF.Truc;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Truc</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testEMF.impl.TrucImpl#getN <em>N</em>}</li>
 *   <li>{@link testEMF.impl.TrucImpl#getChose <em>Chose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrucImpl extends MinimalEObjectImpl.Container implements Truc
{
  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final int N_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected int n = N_EDEFAULT;

  /**
   * The cached value of the '{@link #getChose() <em>Chose</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getChose()
   * @generated
   * @ordered
   */
  protected Chose chose;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected TrucImpl()
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
    return TestEMFPackage.Literals.TRUC;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN(int newN)
  {
    int oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestEMFPackage.TRUC__N, oldN, n));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Chose getChose()
  {
    if (chose != null && chose.eIsProxy())
    {
      InternalEObject oldChose = (InternalEObject) chose;
      chose = (Chose) eResolveProxy(oldChose);
      if (chose != oldChose)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestEMFPackage.TRUC__CHOSE, oldChose, chose));
      }
    }
    return chose;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Chose basicGetChose()
  {
    return chose;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChose(Chose newChose, NotificationChain msgs)
  {
    Chose oldChose = chose;
    chose = newChose;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestEMFPackage.TRUC__CHOSE,
          oldChose, newChose);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setChose(Chose newChose)
  {
    if (newChose != chose)
    {
      NotificationChain msgs = null;
      if (chose != null)
        msgs = ((InternalEObject) chose).eInverseRemove(this, TestEMFPackage.CHOSE__TRUCS, Chose.class, msgs);
      if (newChose != null)
        msgs = ((InternalEObject) newChose).eInverseAdd(this, TestEMFPackage.CHOSE__TRUCS, Chose.class, msgs);
      msgs = basicSetChose(newChose, msgs);
      if (msgs != null)
        msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestEMFPackage.TRUC__CHOSE, newChose, newChose));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public boolean affiche(String ch)
  {
    if (ch == null || ch.isEmpty())
    {
      return false;
    }
    System.out.println(ch);
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TestEMFPackage.TRUC__CHOSE:
        if (chose != null)
          msgs = ((InternalEObject) chose).eInverseRemove(this, TestEMFPackage.CHOSE__TRUCS, Chose.class, msgs);
        return basicSetChose((Chose) otherEnd, msgs);
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
      case TestEMFPackage.TRUC__CHOSE:
        return basicSetChose(null, msgs);
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
      case TestEMFPackage.TRUC__N:
        return getN();
      case TestEMFPackage.TRUC__CHOSE:
        if (resolve)
          return getChose();
        return basicGetChose();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TestEMFPackage.TRUC__N:
        setN((Integer) newValue);
        return;
      case TestEMFPackage.TRUC__CHOSE:
        setChose((Chose) newValue);
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
      case TestEMFPackage.TRUC__N:
        setN(N_EDEFAULT);
        return;
      case TestEMFPackage.TRUC__CHOSE:
        setChose((Chose) null);
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
      case TestEMFPackage.TRUC__N:
        return n != N_EDEFAULT;
      case TestEMFPackage.TRUC__CHOSE:
        return chose != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case TestEMFPackage.TRUC___AFFICHE__STRING:
        return affiche((String) arguments.get(0));
    }
    return super.eInvoke(operationID, arguments);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} // TrucImpl
