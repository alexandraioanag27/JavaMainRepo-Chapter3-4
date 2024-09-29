package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Mammal extends Animals{
    int numberOfLegs;
    String name;
    float normalBodyTemperature;
    float percBodyHair;

    public Mammal(){
        super(0.1, 6);
    };

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "normalBodyTemperature", String.valueOf(getNormalBodyTemperature()));
        createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
    }

    public void decodeFromXml(Element element) {
        setNormalBodyTemperature(Float.valueOf(element.getElementsByTagName("normalBodyTemperature").item(0).getTextContent()));
        setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public float getNormalBodyTemperature() {
        return normalBodyTemperature;
    }

    public void setNormalBodyTemperature(float normalBodyTemperature) {
        this.normalBodyTemperature = normalBodyTemperature;
    }

    public float getPercBodyHair() {
        return percBodyHair;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }
}
