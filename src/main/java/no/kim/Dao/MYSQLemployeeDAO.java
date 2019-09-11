package no.kim.Dao;

import no.kim.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
    @Repository
    @Qualifier("SQL")
public class MYSQLemployeeDAO implements EmployeeDao {
    @Override
    public Collection<Employee> getAllEmployees() {
        return new ArrayList<Employee>();
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
