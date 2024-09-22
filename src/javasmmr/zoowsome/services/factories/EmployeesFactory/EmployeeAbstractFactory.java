package javasmmr.zoowsome.services.factories.EmployeesFactory;

import javasmmr.zoowsome.models.employees.Employees;

public abstract class EmployeeAbstractFactory {

    public abstract Employees getEmployee(String type) throws Exception;

}
