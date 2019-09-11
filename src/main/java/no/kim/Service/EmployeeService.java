package no.kim.Service;

import no.kim.Dao.EmployeeDao;
import no.kim.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class EmployeeService {

    private EmployeeDao employeeDao;

    public Collection<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }
}
