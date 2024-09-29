package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javasmmr.zoowsome.services.factories.Constants;

public class BlueJay extends Bird{

    boolean migrates;
    int avgFlightAltitude;

    public BlueJay(int numberOfLegs, String name, boolean migrates, int avgFlightAltitude) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.migrates = migrates;
        this.avgFlightAltitude = avgFlightAltitude;
    }

    public BlueJay(){
        this.nrOfLegs = 2;
        this.name = "Blue Jay";
        this.migrates = true;
        this.avgFlightAltitude = 3500;
    };

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
    {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.BlueJay);
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

    public boolean isMigrates() {
        return migrates;
    }

    public void setMigrates(boolean migrates) {
        this.migrates = migrates;
    }

    public int getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(int avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }
}
