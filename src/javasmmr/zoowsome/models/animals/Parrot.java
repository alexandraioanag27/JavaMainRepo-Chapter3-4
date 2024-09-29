package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Parrot extends Bird {

    boolean migrates;
    int avgFlightAltitude;

    public Parrot(int numberOfLegs, String name, boolean migrates, int avgFlightAltitude) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.migrates = migrates;
        this.avgFlightAltitude = avgFlightAltitude;
    }

    public Parrot(){
        this.nrOfLegs = 2;
        this.name = "Parrot";
        this.migrates = false;
        this.avgFlightAltitude = 3500;
    };

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
    {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.Parrot);
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
