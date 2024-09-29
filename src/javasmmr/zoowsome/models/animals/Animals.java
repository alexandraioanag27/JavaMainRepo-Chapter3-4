package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

public abstract class Animals implements Killer, XML_Parsable {
    int nrOfLegs;
    String name;
    final Double maintenanceCost;
    final double dangerPerc;
    boolean takenCareOf = false;

    protected Animals(Double maintenanceCost, double dangerPerc) {
        this.maintenanceCost = ((maintenanceCost >= 0.1) && (maintenanceCost <= 8.0)) ? maintenanceCost : 0.1;
        this.dangerPerc = ((dangerPerc >= 0) && (dangerPerc <= 1)) ? dangerPerc : 0;
    }

    // Chapter 5
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
        createNode(eventWriter, "name", String.valueOf(this.name));
        createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
        createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
        createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
    }

    public void decodeFromXml(Element element) {
        setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
        setName(element.getElementsByTagName("name").item(0).getTextContent());
        setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
    }

//    public boolean kill() {
//        double randomValue = Math.random();
//        return randomValue < this.dangerPerc;
//    }

    // Chapter 4 - 4.2

    public boolean kill() {

        double randomValue = Math.random();
        double predisposition = getPredisposition();

        if(randomValue<(dangerPerc +predisposition)) {
            return true;
        } else {
        return false;
        }
    }

    public double getPredisposition(){
        return 0;
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final Double getMaintenanceCost() {
        return maintenanceCost;
    }

    public final double getDangerPerc() {
        return dangerPerc;
    }

    public boolean isTakenCareOf() {
        return takenCareOf;
    }

    public void setTakenCareOf(boolean takenCareOf) {
        this.takenCareOf = takenCareOf;
    }
}
