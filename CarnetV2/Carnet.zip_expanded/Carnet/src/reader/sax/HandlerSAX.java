package reader.sax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import Model.Autre;
import Model.Carnet;
import Model.Contact;
import constants.IAutreConstant;
import constants.IContactConstant;

public class HandlerSAX extends DefaultHandler
{

  boolean attContact = false;
  boolean nom = false;
  boolean prenom = false;
  boolean adresse = false;
  boolean age = false;
  boolean numero = false;
  boolean label = false;
  boolean valeur = false;
  boolean autreContact = false;
  Contact contact = null;
  Autre autre = null;
  Carnet carnet = new Carnet();
  StringBuilder data = new StringBuilder();
  int monInt = 0;

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
  {

    if (qName.equals(IContactConstant.NAMEXMLContact))
    {
      contact = new Contact();
      attContact = true;
    }

    else if (qName.equals(IContactConstant.NOM))
    {
      nom = true;
    }

    else if (qName.equals(IContactConstant.PRENOM))
    {
      prenom = true;
    }

    else if (qName.equals(IContactConstant.ADRESSE))
    {
      adresse = true;
    }

    else if (qName.equals(IContactConstant.AGE))
    {
      age = true;
    }
    else if (qName.equals(IContactConstant.NUMERO))
    {
      numero = true;
    }
    else if (qName.equals(IContactConstant.AUTRE))
    {
      autreContact = true;
    }

    else if (qName.equals(IAutreConstant.LABEL))
    {
      label = true;
    }

    else if (qName.equals(IAutreConstant.VALEUR))
    {
      valeur = true;
    }

    data = new StringBuilder();

  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException
  {

    if (attContact)
    {
      carnet.addContact(contact);
      attContact = false;
    }

    if (nom)
    {
      nom = false;
      contact.setNom(data.toString());
    }

    if (prenom)
    {
      prenom = false;
      contact.setPrenom(data.toString());
    }

    if (adresse)
    {
      adresse = false;
      contact.setAdresse(data.toString());
    }

    if (age)
    {
      age = false;
      monInt = Integer.parseInt(data.toString());
      contact.setAge(monInt);
    }

    if (numero)
    {
      numero = false;
      contact.setNumero(data.toString());
    }

    if (autreContact)
    {
      autre = new Autre(data.toString());
      autreContact = false;
      contact.addAutreToContact(autre);
    }

    if (label)
    {
      label = false;
      autre.setLabel(data.toString());
    }

    if (valeur)
    {
      valeur = false;
      String[] MesValeurs = data.toString().split(" ");
      List<String> list = new ArrayList<String>(Arrays.asList(MesValeurs));
      autre.setValeur(list);

    }

  }

  @Override
  public void characters(char ch[], int start, int length) throws SAXException
  {

    data.append(new String(ch, start, length));
  }

  public Carnet getCarnet()
  {
    return carnet;
  }

  public void setModel(Carnet carnet)
  {
    this.carnet = carnet;
  }

}
