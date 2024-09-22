package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;

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

    public Double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }
}
