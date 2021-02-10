package Model;

import java.util.ArrayList;
import java.util.List;

import printers.PrinterAttribut;
import printers.PrinterNoAttribut;

public class Contact
{
  protected String nom;
  protected String prenom;
  protected String adresse;
  protected int age;
  protected String numero;
  protected List<Autre> autres;
  protected PrinterNoAttribut printer;
  protected PrinterAttribut printer2;

  public Contact(String nom, String prenom, String adresse, int age, String numero, List<Autre> autres)
  {
    this.nom = nom;
    this.prenom = prenom;
    this.adresse = adresse;
    this.age = age;
    this.numero = numero;
    this.autres = autres;
    this.printer = new PrinterNoAttribut();
    this.printer2 = new PrinterAttribut();
  }

  public Contact(String nom, String prenom, String adresse, int age, String numero)
  {
    this.nom = nom;
    this.prenom = prenom;
    this.adresse = adresse;
    this.age = age;
    this.numero = numero;
    this.autres = new ArrayList<>();
    this.printer = new PrinterNoAttribut();
    this.printer2 = new PrinterAttribut();
  }

  public Contact()
  {
    this("", "", "", 0, "");
  }

  public void addAutreToContact(Autre a)
  {
    this.autres.add(a);
  }

  public String toXmlStringV1()
  {
    return "\t<contact>\n" + "\t\t<nom>" + this.nom + "</nom>\n" + "\t\t<prenom>" + this.prenom + "</prenom>\n"
        + "\t\t<adresse>" + this.adresse + "</adresse>\n" + "\t\t<age>" + this.age + "</age>\n" + "\t\t<numero>"
        + this.numero + "</numero>\n"
        + this.printer.print(this).toString().replaceAll("]", "").replace(",", "").replace("[", "") + "\t</contact>\n";
  }

  public String toXmlStringV2()
  {
    StringBuilder sb = new StringBuilder();
    String s;
    sb.append("\t<contact ");
    sb.append("nom=\"");
    sb.append(this.nom);
    sb.append("\" ");
    sb.append("prenom=\"");
    sb.append(this.prenom);
    sb.append("\" ");
    sb.append("adresse=\"");
    sb.append(this.adresse);
    sb.append("\" ");
    sb.append(" age=\"");
    sb.append(this.age);
    sb.append("\" ");
    sb.append("numero=\"");
    sb.append(this.numero);
    sb.append("\" ");
    sb.append(">\n");
    sb.append(this.printer2.print(this).toString().replaceAll("]", "").replace(",", "").replace("[", ""));
    sb.append("\t</contact>\n");
    s = sb.toString();
    return s;
  }

  public String getNom()
  {
    return nom;
  }

  public void setNom(String nom)
  {
    this.nom = nom;
  }

  public String getPrenom()
  {
    return prenom;
  }

  public void setPrenom(String prenom)
  {
    this.prenom = prenom;
  }

  public String getAdresse()
  {
    return adresse;
  }

  public void setAdresse(String adresse)
  {
    this.adresse = adresse;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public String getNumero()
  {
    return numero;
  }

  public void setNumero(String numero)
  {
    this.numero = numero;
  }

  public List<Autre> getAutres()
  {
    return autres;
  }

  public void setAutres(List<Autre> autres)
  {
    this.autres = autres;
  }

}
