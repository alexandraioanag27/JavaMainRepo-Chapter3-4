package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;
import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EmployeesRepository.createNode;

import java.math.BigDecimal;

public class Caretaker extends Employees{
    Double workingHours;

    public Caretaker(String name, BigDecimal salary, Double workingHours) {
        super(name, salary);
        this.workingHours = workingHours;
    }

    public Caretaker() {
        super();
    }

    public String takeCareOf(Animals animal) {
        if (this.workingHours < animal.getMaintenanceCost()) {
            return Constants.Employees.Caretakers.TCO_NO_TIME;
        } else if (animal.kill()) {
            return Constants.Employees.Caretakers.TCO_KILLED;
        } else {
            this.workingHours -= animal.getMaintenanceCost();
            return Constants.Employees.Caretakers.TCO_SUCCESS;
        }
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employees.Caretaker);
    }

    public void decodeFromXml(Element element) {
        String workingHoursStr = element.getElementsByTagName("workingHours").item(0).getTextContent();
        if (workingHoursStr != null && !workingHoursStr.trim().isEmpty() && !"null".equalsIgnoreCase(workingHoursStr)) {
            setWorkingHours(Double.valueOf(workingHoursStr));
        } else {
            setWorkingHours(0.0);
        }
    }

    public Double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }
}
