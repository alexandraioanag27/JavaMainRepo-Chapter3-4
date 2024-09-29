package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.models.animals.WaterType.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Octopus extends Reptile{

    int avgSwinDepth;
    Enum waterType;

    public Octopus(int numberOfLegs, String name, int avgSwinDepth, Enum waterType) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.avgSwinDepth = avgSwinDepth;
        this.waterType = waterType;
    }

    public Octopus(){
        this.nrOfLegs = 8;
        this.name = "Octopus";
        this.avgSwinDepth = 750;
        this.waterType = SALTWATER;
    };

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
    {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Octopus);
    }

    public Enum getWaterType() {
        return waterType;
    }

    public void setWaterType(Enum waterType) {
        this.waterType = waterType;
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

    public int getAvgSwinDepth() {
        return avgSwinDepth;
    }

    public void setAvgSwinDepth(int avgSwinDepth) {
        this.avgSwinDepth = avgSwinDepth;
    }
}
