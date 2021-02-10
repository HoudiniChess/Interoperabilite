package test;

import testEMF.Chose;
import testEMF.TestEMFFactory;
import testEMF.Truc;

public class Main
{

  public static void main(String[] args)
  {
    TestEMFFactory usine = TestEMFFactory.eINSTANCE;
    Truc t1 = usine.createTruc();
    t1.setN(18);
    Truc t2 = usine.createTruc();
    t2.setN(51);
    Chose chose = usine.createChose();
    chose.setNom("Clé de 12");
    chose.getTrucs().add(t1);
    chose.getTrucs().add(t2);

    System.out.println(t1.affiche(null));
    System.out.println(t1.affiche(""));
    System.out.println(t1.affiche(chose.getNom()));
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(chose);

  }

}
