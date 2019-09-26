package no.kim.Service;

import no.kim.Dao.EmployeeDao;
import no.kim.Entity.Employee;
import no.kim.Entity.WeekPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class EmployeeService {
    @Autowired
    @Qualifier("fakedata")
    private EmployeeDao employeeDao;
    private WeekPlan weekPlan;

    public Collection<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }

    public void removeEmployeeByID(int id) {
        this.employeeDao.removeEmployeeByID(id);
    }

    public Employee getEmployeeByID(int id){
        return this.employeeDao.getEmployeeByID(id);
    }

    public void upDateEmployee(Employee employee){
        if(checkValidGroup(employee.getGroup())) {
            this.employeeDao.upDateEmployee(employee);
        }
        else
            System.out.println("Error in input, can not update a new employee");
    }

    public void insertEmployee(Employee employee) {
        if(checkValidGroup(employee.getGroup()))
            this.employeeDao.insertEmployeeToDB(employee);
        else
            System.out.println("Error in input, can not insert a new employee");
    }


    //the group can only be from 1 to 3
    private boolean checkValidGroup(int group) {
        return group >= 1 && group <= 3;
    }
}
