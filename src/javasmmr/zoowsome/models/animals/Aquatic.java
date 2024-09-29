package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Aquatic extends Animals{
    int numberOfLegs;
    String name;
    int avgSwimDepth;
    Enum waterType;

    public Aquatic(){
        super(0.1, 2);
    };

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
        createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
    }

    public void decodeFromXml(Element element) {
        setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwinDepth").item(0).getTextContent()));
        setWaterType(String.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
    }

    public Enum getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = WaterType.valueOf(waterType.toUpperCase());
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

    public int getAvgSwimDepth() {
        return avgSwimDepth;
    }

    public void setAvgSwimDepth(int avgSwinDepth) {
        this.avgSwimDepth = avgSwinDepth;
    }
}
