package reader.sax;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

import Model.Carnet;
import Model.Contact;

public class SAXTest
{

  @Test
  public void test() throws IOException, ParserConfigurationException, SAXException
  {
    Carnet carnet = new Carnet();
    FileReaderXMLSAX reader = new FileReaderXMLSAX();
    carnet = reader.readFileXMLSAX("carnet_test.xml");
    assertTrue(carnet != null);
    assertTrue(carnet.getContacts().size() == 3);
    assertTrue(carnet.getType().equals("commun"));

    Contact contact = carnet.getContacts().get(0);
    assertTrue(contact.getAdresse().equals("1 route de brest"));
    assertTrue(contact.getAge() == 22);
    assertTrue(contact.getPrenom().equals("Yann"));
    assertTrue(contact.getNumero().equals("06 95 46 55 65"));
    assertTrue(contact.getNom().equals("Le Bris"));
    assertTrue(contact.getAutres().get(0).getLabel().equals("Hobby"));
    assertTrue(contact.getAutres().get(0).getValeur().get(0).equals("Lecture"));
    assertTrue(contact.getAutres().get(1).getLabel().equals("Plat"));
    assertTrue(contact.getAutres().get(1).getValeur().get(0).equals("Cassoulet"));

    Contact contact1 = carnet.getContacts().get(1);
    assertTrue(contact1.getAdresse().equals("14 route des cerises"));
    assertTrue(contact1.getAge() == 21);
    assertTrue(contact1.getPrenom().equals("Kilian"));
    assertTrue(contact1.getNumero().equals("06 95 36 45 59"));
    assertTrue(contact1.getNom().equals("Anchyse"));
    assertTrue(contact1.getAutres().get(0).getLabel().equals("Sports"));
    assertTrue(contact1.getAutres().get(0).getValeur().get(0).equals("Foot"));
    assertTrue(contact1.getAutres().get(1).getLabel().equals("Ordinateur"));
    assertTrue(contact1.getAutres().get(1).getValeur().get(0).equals("MSI"));

    Contact contact2 = carnet.getContacts().get(2);
    assertTrue(contact2.getAdresse().equals("3 rue des oranges"));
    assertTrue(contact2.getAge() == 21);
    assertTrue(contact2.getPrenom().equals("Samuel"));
    assertTrue(contact2.getNumero().equals("06 00 01 02 03"));
    assertTrue(contact2.getNom().equals("Barre"));
    assertTrue(contact2.getAutres().isEmpty());

  }

  /*
   * Test du carnet vide
   */
  @Test
  public void test2() throws IOException, ParserConfigurationException, SAXException
  {
    Carnet carnet = new Carnet();
    FileReaderXMLSAX reader = new FileReaderXMLSAX();
    carnet = reader.readFileXMLSAX("carnet_vide.xml");
    assertTrue(carnet != null);
    assertTrue(carnet.getContacts().size() == 0);
    assertTrue(carnet.getType().equals("commun"));

  }

}
