package javasmmr.zoowsome.services.factories.EmployeesFactory;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employees;
import javasmmr.zoowsome.services.factories.Constants;

import java.math.BigDecimal;

public class CaretakerFactory extends EmployeesFactory {

    @Override
    public Employees getEmployee(String type) throws Exception {
        if (Constants.Roles.CARETAKER.equals(type)) {
            return new Caretaker("John Doe", new BigDecimal("3000"), 40.0);
        } else {
            throw new Exception("Invalid employee type: " + type);
        }
    }
}
