package printers;

import java.util.ArrayList;
import java.util.List;

import Model.Autre;
import Model.Contact;

public class PrinterNoAttribut implements Printer
{

  @Override
  public List<String> print(Contact contact)
  {
    List<String> str = new ArrayList<>();
    for (Autre autre : contact.getAutres())
    {
      StringBuilder sb = new StringBuilder();
      String s;
      sb.append("\t\t<autre>\n");
      sb.append("\t\t\t<label>");
      sb.append(autre.getLabel());
      sb.append("</label>\n");
      sb.append(" ");
      sb.append("\t\t\t<valeur>");
      sb.append(autre.getValeur());
      sb.append("</valeur>\n");
      sb.append("\t\t</autre>\n");
      s = sb.toString();
      str.add(s);
    }
    return str;

  }

}
