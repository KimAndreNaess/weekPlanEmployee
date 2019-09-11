package no.kim.Dao;

import no.kim.Entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakedata")
public class FakeEmployeeDaoImpl implements EmployeeDao {
    private static Map<Integer, Employee> employees;

    static {
        employees = new HashMap<Integer, Employee>(){
            {
                put(1,new Employee(1,"Kim","Næss",1));
                put(2,new Employee(2,"Kim","Etternavn",2));
                put(3,new Employee(3,"Kim","Næ",3));
                put(4,new Employee(4,"Kim","NoCreativity",2));
                put(5,new Employee(5,"Kim","Næs",3));
            }
        };
    }
    @Override
    public Collection<Employee> getAllEmployees(){
        return this.employees.values();
    }

    @Override
    public Employee getEmployeeByID(int id){
        return this.employees.get(id);
    }
    @Override
    public void upDateEmployee(Employee employee){
        Employee e = employees.get(employee.getId());
        e.setGroup(employee.getGroup());
        e.setFirstName(e.getFirstName());
        e.setLastName(e.getLastName());
        employees.put(employee.getId(), employee);
    }


    @Override
    public void removeEmployeeByID(int id) {
        this.employees.remove(id);
    }

    @Override
    public void insertEmployeeToDB(Employee employee) {
        this.employees.put(employee.getId(),employee);
    }
}
