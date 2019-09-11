package no.kim.Service;

import no.kim.Dao.EmployeeDao;
import no.kim.Dao.FakeEmployeeDaoImpl;
import no.kim.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class EmployeeService {
    @Autowired
    @Qualifier("fakedata")
    private EmployeeDao employeeDao;

    public Collection<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }
    public Employee getEmployeeByID(int id){
        return this.employeeDao.getEmployeeByID(id);
    }

    public void removeEmployeeByID(int id) {
        this.employeeDao.removeEmployeeByID(id);
    }
    public void upDateEmployee(Employee employee){
        this.employeeDao.upDateEmployee(employee);
    }

    public void insertEmployee(Employee employee) {
        this.employeeDao.insertEmployeeToDB(employee);
    }
}
