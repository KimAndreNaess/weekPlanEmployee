package no.kim.Controller;

import no.kim.Entity.Employee;
import no.kim.Service.EmployeeService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public Collection<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
