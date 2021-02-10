package reader.sax;

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import Model.Carnet;

public class FileReaderXMLSAX {

	public Carnet readFileXMLSAX(String sourceFile) throws IOException, ParserConfigurationException, SAXException {
		Carnet carnet = new Carnet();

		URL resource = this.getClass().getClassLoader().getResource(sourceFile);
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {

			SAXParser saxParser = factory.newSAXParser();
			HandlerSAX handler = new HandlerSAX();
			saxParser.parse(resource.getFile(), handler);
			carnet = handler.getCarnet();

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		return carnet;

	}
	
	

}
