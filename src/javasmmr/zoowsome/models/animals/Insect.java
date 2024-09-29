package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animals{
    int numberOfLegs;
    String name;
    boolean canFly;
    boolean isDangerous;

    public Insect(){
        super(0.1, 4);
    };

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
        createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
    }

    public void decodeFromXml(Element element) {
        setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly"). item(0).getTextContent( )));
        setDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()) );
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

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean getIsDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }
}
