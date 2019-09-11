package no.kim.Dao;

import no.kim.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;

    @Qualifier("SQL")
public class MYSQLemployeeDAO implements EmployeeDao {
    @Override
    public Collection<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeByID(int id) {
        return null;
    }

    @Override
    public void upDateEmployee(Employee employee) {

    }

    @Override
    public void removeEmployeeByID(int id) {

    }

    @Override
    public void insertEmployeeToDB(Employee employee) {

    }
}
