package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Cow extends Mammal {
    private float normalBodyTemperature;
    private float percBodyHair;

    // Constructor
    public Cow(int nrOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        this.nrOfLegs = nrOfLegs;
        this.name = name;
        this.normalBodyTemperature = normalBodyTemperature;
        this.percBodyHair = percBodyHair;
    }

    // Default constructor
    public Cow() {
        this.nrOfLegs = 4;
        this.name = "Cow";
        this.normalBodyTemperature = 37.0f;
        this.percBodyHair = 80.0f;
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
    {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammal.Cow);
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
