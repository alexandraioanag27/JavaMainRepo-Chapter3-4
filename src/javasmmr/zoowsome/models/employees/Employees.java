package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.EmployeesRepository.createNode;


import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.math.BigDecimal;

public abstract class Employees implements XML_Parsable {
    String name;
    Long id;
    BigDecimal salary;
    boolean isDead;

    public Employees(String name, BigDecimal salary) {
        this.name = name;
        this.id = generateId();
        this.salary = salary;
        this.isDead = false;
    }

    public Employees() {
        name = "Caretaker";
        id = generateId();
        salary = BigDecimal.ZERO;
        isDead = false;
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        createNode(eventWriter, "name", String.valueOf(this.name));
        createNode(eventWriter, "id", String.valueOf(this.id));
        createNode(eventWriter, "salary", String.valueOf(this.salary));
        createNode(eventWriter, "isDead", String.valueOf(this.isDead));
    }

    public void decodeFromXml( Element element) {
        setName(element.getElementsByTagName("name").item(0).getTextContent()) ;
        setId(Long.valueOf(element.getElementsByTagName( "id").item(0).getTextContent())) ;
        setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));
        setDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()) );
    }

    private Long generateId(){
        return Math.round(Math.random() * 1_000_000_000_000L);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public boolean setIsDead() {
        return isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

}
