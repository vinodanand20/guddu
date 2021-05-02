package info.ibn;

import java.io.File;
import java.io.IOException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class App {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse( new File("emp.xml"));
		
	Element element = document.getDocumentElement();
	
	System.out.println(element.getNodeName());
	System.out.println(element.getNodeValue());
	System.out.println(element.getTextContent());
	System.out.println(element.getTagName());
	

	}

}
