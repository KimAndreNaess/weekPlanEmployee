package no.kim.Entity;

import no.kim.Service.EmployeeService;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class WeekPlan {
    Collection<Employee> workingEmployeesThisWeek;
    int weekNumber;
    Collection<Employee> allEmployees;
    EmployeeService service;

    public WeekPlan() {
        allEmployees = service.getAllEmployees();
        weekNumber = generateWeekNumber();
        System.out.println(weekNumber);
        //allEmployees.stream().filter(e->e.getGroup()%weekNumber==0).forEach(e->workingEmployeesThisWeek.add(e));


    }

    private int generateWeekNumber() {
        LocalDate thisDate = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = thisDate.get(weekFields.weekOfWeekBasedYear());
        return weekNumber;

    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public Collection<Employee> getEmployees() {
        return allEmployees;
    }
}
