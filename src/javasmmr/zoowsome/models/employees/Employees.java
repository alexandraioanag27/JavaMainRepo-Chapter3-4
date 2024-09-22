package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employees {
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

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
