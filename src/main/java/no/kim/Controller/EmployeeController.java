package no.kim.Controller;

import no.kim.Entity.Employee;
import no.kim.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getEmployeeByID(@PathVariable("id") int id){
        return employeeService.getEmployeeByID(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteEmployeeByID(@PathVariable("id") int id){
        employeeService.removeEmployeeByID(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void upDateEmployeeByID(@RequestBody Employee employee){
        employeeService.upDateEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertEmployee(@RequestBody Employee employee){
        employeeService.insertEmployee(employee);
    }
}
