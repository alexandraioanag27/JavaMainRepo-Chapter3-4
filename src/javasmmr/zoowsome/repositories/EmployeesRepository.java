package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employees;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import javasmmr.zoowsome.services.factories.Constants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.stream.events.Characters;
import javax.xml.stream.XMLEventFactory;

public class EmployeesRepository {
    private static final String XML_FILENAME = "Employees.xml";
    public EmployeesRepository() {
    }
    public void save(ArrayList<Employees> employees) throws FileNotFoundException, XMLStreamException {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));

        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");

        // Start Document
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);

        // Start Content
        StartElement contentStartElement = eventFactory.createStartElement("", "", "content");
        eventWriter.add(contentStartElement);
        eventWriter.add(end);

        for (XML_Parsable employee : employees) {
            // Start Employee Element
            StartElement sElement = eventFactory.createStartElement("", "", "EMPLOYEE");
            eventWriter.add(sElement);
            eventWriter.add(end);

            employee.encodeToXml(eventWriter); // Encode employee details

            // End Employee Element
            EndElement eElement = eventFactory.createEndElement("", "", "EMPLOYEE");
            eventWriter.add(eElement);
            eventWriter.add(end);
        }

        // End Content
        eventWriter.add(eventFactory.createEndElement("", "", "content"));
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }


    public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
        // Create Start node
        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        // Create Content
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
        // Create End node
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);
    }

    public ArrayList<Employees> load() throws ParserConfigurationException, SAXException, IOException {
        ArrayList<Employees> employees = new ArrayList<Employees>();
        File fXmlFile = new File(XML_FILENAME);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String discriminant =
                        element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
                                .getTextContent();
                switch (discriminant) {
                    case Constants.Employees.Caretaker:
                        Employees caretaker = new Caretaker();
                        caretaker.decodeFromXml(element);
                        employees.add(caretaker);
                    default:
                        break;
                }
            }
        }
        return employees;
    }

}
