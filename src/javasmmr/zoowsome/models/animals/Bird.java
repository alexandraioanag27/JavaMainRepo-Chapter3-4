package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Bird extends Animals{
    int numberOfLegs;
    String name;
    boolean migrates;
    int avgFlightAltitude;

    public Bird(){
        super(0.1, 4);
    };

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
        createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
    }

    public void decodeFromXml(Element element) {
        setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
        setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
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

    public boolean getMigrates() {
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
