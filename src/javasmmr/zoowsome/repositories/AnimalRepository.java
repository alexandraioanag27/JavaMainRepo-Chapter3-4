package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Butterfly;
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
import javax.xml.stream.*;
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

public class AnimalRepository {
    private static final String XML_FILENAME = "Animals.xml";
    public AnimalRepository() {
    }
    public void save(ArrayList<Animals> animals) throws FileNotFoundException, XMLStreamException {
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

        for (XML_Parsable animal : animals) {
            // Start Animal Element
            StartElement sElement = eventFactory.createStartElement("", "", "ANIMAL");
            eventWriter.add(sElement);
            eventWriter.add(end);

            animal.encodeToXml(eventWriter); // Encode animal details

            // End Animal Element
            EndElement eElement = eventFactory.createEndElement("", "", "ANIMAL");
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

    public ArrayList<Animals> load() throws ParserConfigurationException, SAXException, IOException {
        ArrayList<Animals> animals = new ArrayList<Animals>();
        File fXmlFile = new File(XML_FILENAME);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String discriminant =
                        element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
                                .getTextContent();
                switch (discriminant) {
                    case Constants.Animals.Insect.Butterfly:
                        Animals butterfly = new Butterfly();
                        butterfly.decodeFromXml(element);
                        animals.add(butterfly);
                    default:
                        break;
                }
            }
        }
        return animals;
    }

}
