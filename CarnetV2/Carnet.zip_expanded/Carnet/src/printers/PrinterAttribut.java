package printers;

import java.util.ArrayList;
import java.util.List;

import Model.Autre;
import Model.Contact;

public class PrinterAttribut implements Printer
{

  @Override
  public List<String> print(Contact contact)
  {
    List<String> str = new ArrayList<>();
    for (Autre autre : contact.getAutres())
    {
      StringBuilder sb = new StringBuilder();
      String s;
      sb.append("\t\t<autre ");
      sb.append("label=");
      sb.append("\"");
      sb.append(autre.getLabel());
      sb.append("\" ");
      sb.append("valeur=");
      sb.append("\"");
      sb.append(autre.getValeur());
      sb.append("\"");
      sb.append("/>\n");
      s = sb.toString();
      str.add(s);
    }
    return str;
  }
}
