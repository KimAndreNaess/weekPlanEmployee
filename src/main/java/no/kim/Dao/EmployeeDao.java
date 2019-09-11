package no.kim.Dao;

import no.kim.Entity.Employee;

import java.util.Collection;

public interface EmployeeDao {
    Collection<Employee> getAllEmployees();

    Employee getEmployeeByID(int id);

    void upDateEmployee(Employee employee);

    void removeEmployeeByID(int id);

    void insertEmployeeToDB(Employee employee);
}
