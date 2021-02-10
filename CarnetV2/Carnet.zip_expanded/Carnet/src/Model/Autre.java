package Model;

import java.util.ArrayList;
import java.util.List;

public class Autre
{
  protected String label;
  protected List<String> valeur;

  public Autre(String label)
  {
    this.label = label;
    this.valeur = new ArrayList<>();
  }

  public Autre()
  {
    this("");
  }

  public Autre(String label, List<String> list)
  {
    this.label = label;
    this.valeur = list;
  }

  public String getLabel()
  {
    return label;
  }

  public void setLabel(String label)
  {
    this.label = label;
  }

  public List<String> getValeur()
  {
    return valeur;
  }

  public void setValeur(List<String> valeur)
  {
    this.valeur = valeur;
  }

}
