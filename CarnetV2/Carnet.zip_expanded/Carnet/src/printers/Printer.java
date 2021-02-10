package printers;

import java.util.List;

import Model.Contact;

public interface Printer
{
  public List<String> print(Contact contact);
}
