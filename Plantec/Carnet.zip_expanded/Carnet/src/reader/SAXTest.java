package reader;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

import Model.Carnet;

public class SAXTest {

	@Test
	public void test3() throws IOException, ParserConfigurationException, SAXException {
		Carnet carnet = new Carnet();
		FileReaderXMLSAX reader = new FileReaderXMLSAX();
		carnet = reader.readFileXMLSAX("carnet_test.xml");
		assertTrue(carnet != null);
		assertTrue(carnet.getContacts().size() == 3);
		assertTrue(carnet.getType().equals("commun"));
	}
	
}
