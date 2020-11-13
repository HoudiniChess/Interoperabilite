package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Carnet {
	protected ArrayList<Contact> contacts;
	protected ArrayList<Autre> autres;
	protected String type;

	public Carnet() {
		this.contacts = new ArrayList<Contact>();
		this.autres = new ArrayList<Autre>();
		type = "commun";
	}

	public void addContact(Contact c) {
		this.contacts.add(c);
	}
	
	public void addAutre(Autre a) {
		this.autres.add(a);
	}

	public String toXmlStringV1() {
		String r = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<!DOCTYPE Carnet PUBLIC \"CarnetId\" \"Carnet.dtd\">\n" + 
				"<Carnet>\n";
		r += "	<type>" + this.type + "</type>\n";
		Iterator<Contact> itor = contacts.iterator();
		while(itor.hasNext()) {
			r += itor.next().toXmlStringV1();		
		}



		r += "</Carnet>\n";
		return r;
	}

	public void toXmlFileV1(File file) {
		OutputStream stream = null;
		try {
			stream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stream.write(toXmlStringV1().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void toXmlFilenamedV1(String filename) {
		File file = new File(filename);
		toXmlFileV1(file);
	}
	
	
	public String toXmlStringV2() {
		String r = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
			"<!DOCTYPE Carnet PUBLIC \"CarnetId\" \"CarnetAttribute.dtd\">\n" + 
				"<Carnet type=" + "\"" + this.type + "\"" + ">\n";
		Iterator<Contact> itor = contacts.iterator();
		while(itor.hasNext()) {
			r += itor.next().toXmlStringV2();
		}
		r += "</Carnet>\n";
		return r;
	}

	public void toXmlFileV2(File file) {
		OutputStream stream = null;
		try {
			stream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stream.write(toXmlStringV2().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void toXmlFilenamedV2(String filename) {
		File file = new File(filename);
		toXmlFileV2(file);
	}

	public ArrayList<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}

	public ArrayList<Autre> getAutres() {
		return autres;
	}

	public void setAutres(ArrayList<Autre> autres) {
		this.autres = autres;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
