package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Monkey extends Mammal{

    float normalBodyTemperature;
    float percBodyHair;

    public Monkey(int numberOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.normalBodyTemperature = normalBodyTemperature;
        this.percBodyHair = percBodyHair;
    }

    public Monkey(){
        this.nrOfLegs = 4;
        this.name = "Monkey";
        this.normalBodyTemperature = 36F;
        this.percBodyHair = 80F;
    };

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
    {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammal.Monkey);
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
