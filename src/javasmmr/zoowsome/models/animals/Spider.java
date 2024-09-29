package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.time.LocalTime;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Spider extends Insect{

    boolean canFly;
    boolean isDangerous;

    public Spider(int numberOfLegs, String name, boolean canFly, boolean isDangerous) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.canFly = canFly;
        this.isDangerous = isDangerous;
    }

    public Spider(){
        this.nrOfLegs = 8;
        this.name = "Spider";
        this.canFly = false;
        this.isDangerous = true;
    };

    @Override
    public double getPredisposition() {
        LocalTime now = LocalTime.now();

        LocalTime start = LocalTime.of(23, 0);
        LocalTime end = LocalTime.of(6, 0);

        if (now.isAfter(start) || now.isBefore(end)) {
            return 0.25;
        } else {
            return 0;
        }
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
    {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.Spider);
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

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }
}
