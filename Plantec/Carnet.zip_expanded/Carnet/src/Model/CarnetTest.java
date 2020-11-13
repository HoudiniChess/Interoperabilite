package Model;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class CarnetTest {

	@Test
	void test() {
		Carnet carnet = new Carnet();
		String fileName = "Resource/carnet_test.xml";
		
		Autre a1 = new Autre("Hobby");
		a1.valeur.add("Lecture");
		a1.valeur.add("Echecs");
		Autre a2 = new Autre("Plat");
		a2.valeur.add("Cassoulet");
		
		Contact c1 = new Contact("Le Bris", "Yann", "1 route de brest", 22, "06 95 46 66 66", a1);
		Contact c2 = new Contact("Anchyse", "Kilian", "14 route des cerises", 21, "06 95 36 45 59", a2);
		Contact c3 = new Contact("Barre", "Samuel", "3 rue des oranges", 21, "06 00 01 02 03");
		
		carnet.addContact(c1);
		carnet.addContact(c2);
		carnet.addContact(c3);
		
		carnet.toXmlFilenamedV1(fileName);

		try (FileInputStream fis = new FileInputStream(fileName)) {
			byte[] buf = new byte[10240];
			int size = fis.read(buf);

			String contents = new String(buf,0,size);
			System.out.println(contents);
			assertTrue(contents.equals(
					"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
					"<!DOCTYPE Carnet PUBLIC \"CarnetId\" \"Carnet.dtd\">\n" + 
					"<Carnet>\n" + 
							"\t<type>commun</type>\n" + 	
							"\t<contact>\n" +
									"\t\t<nom>Le Bris</nom>\n" +
									"\t\t<prenom>Yann</prenom>\n" +
									"\t\t<adresse>1 route de brest</adresse>\n" +
									"\t\t<age>22</age>\n" +
									"\t\t<numero>06 95 46 66 66</numero>\n" +
									"\t\t<autre>\n" +
											"\t\t\t<label>Hobby</label>\n" +
											"\t\t\t<valeur>[Lecture, Echecs]</valeur>\n" +
									"\t\t</autre>\n" +
							"\t</contact>\n" +
							"\t<contact>\n" +
									"\t\t<nom>Anchyse</nom>\n" +
									"\t\t<prenom>Kilian</prenom>\n" +
									"\t\t<adresse>14 route des cerises</adresse>\n" +
									"\t\t<age>21</age>\n"+
									"\t\t<numero>06 95 36 45 59</numero>\n" +
									"\t\t<autre>\n" +
											"\t\t\t<label>Plat</label>\n" +
											"\t\t\t<valeur>[Cassoulet]</valeur>\n" +
									"\t\t</autre>\n" +
							"\t</contact>\n" +
							"\t<contact>\n" +
									"\t\t<nom>Barre</nom>\n" +
									"\t\t<prenom>Samuel</prenom>\n" +
									"\t\t<adresse>3 rue des oranges</adresse>\n" +
									"\t\t<age>21</age>\n"+
									"\t\t<numero>06 00 01 02 03</numero>\n" +
									"\t\t<autre>\n" +
											"\t\t\t<label></label>\n" +
											"\t\t\t<valeur>[]</valeur>\n" +
									"\t\t</autre>\n" +
							"\t</contact>\n" +	
					"</Carnet>\n"));
		} catch (FileNotFoundException e) {
			fail("");
		} catch (IOException e) {
			fail("");
		}

	}
	
	@Test
	void test2() {
		Carnet carnet = new Carnet();
		String fileName = "Resource/carnet_test2.xml";
		
		Autre a1 = new Autre("Hobby");
		a1.valeur.add("Lecture");
		Autre a2 = new Autre("Plat");
		a2.valeur.add("Cassoulet");
		a2.valeur.add("Poivrons");
		Autre a3 = new Autre("Etudes");
		
		Contact c1 = new Contact("Le Bris", "Yann", "1 route de brest", 22, "06 95 46 66 66", a1);
		Contact c2 = new Contact("Anchyse", "Kilian", "14 route des cerises", 21, "06 95 36 45 59", a2);
		Contact c3 = new Contact("Barre", "Samuel", "3 rue des oranges", 21, "06 00 01 02 03");
		Contact c4 = new Contact("Pech", "Erwan", "20 piste de Ski", 24, "07 05 36 46 73", a3);
		
		carnet.addContact(c1);
		carnet.addContact(c2);
		carnet.addContact(c3);
		carnet.addContact(c4);
		
		carnet.toXmlFilenamedV2(fileName);

		try (FileInputStream fis = new FileInputStream(fileName)) {
			byte[] buf = new byte[10240];
			int size = fis.read(buf);

			String contents = new String(buf,0,size);
			System.out.println(contents);
			assertTrue(contents.equals(
					"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
					"<!DOCTYPE Carnet PUBLIC \"CarnetId\" \"CarnetAttribute.dtd\">\n" + 
					"<Carnet type=\"commun\">\n" +
						"\t<contact nom=\"Le Bris\" prenom=\"Yann\" adresse=\"1 route de brest\" age=\"22\" numero=\"06 95 46 66 66\">\n" +
								"\t\t<autre label=\"Hobby\" valeur=\"[Lecture]\"/>\n" +
						"\t</contact>\n" +
						"\t<contact nom=\"Anchyse\" prenom=\"Kilian\" adresse=\"14 route des cerises\" age=\"21\" numero=\"06 95 36 45 59\">\n" +
								"\t\t<autre label=\"Plat\" valeur=\"[Cassoulet, Poivrons]\"/>\n" +
						"\t</contact>\n" +
						"\t<contact nom=\"Barre\" prenom=\"Samuel\" adresse=\"3 rue des oranges\" age=\"21\" numero=\"06 00 01 02 03\">\n" +
								"\t\t<autre label=\"\" valeur=\"[]\"/>\n" +
						"\t</contact>\n" +
						"\t<contact nom=\"Pech\" prenom=\"Erwan\" adresse=\"20 piste de Ski\" age=\"24\" numero=\"07 05 36 46 73\">\n" +
								"\t\t<autre label=\"Etudes\" valeur=\"[]\"/>\n" +
						"\t</contact>\n" +
					"</Carnet>\n"));
		} catch (FileNotFoundException e) {
			fail("");
		} catch (IOException e) {
			fail("");
		}

	}
}
