package no.kim.Entity;

import no.kim.Dao.EmployeeDao;
import no.kim.Service.EmployeeService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class WeekPlanTest {
    EmployeeService employeService;
    Collection<Employee> employees = employeService.getAllEmployees();

    @Test
    public void testWeekPlan(){
        WeekPlan testNow = new WeekPlan(employees);
        LocalDate thisDate = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = thisDate.get(weekFields.weekOfWeekBasedYear());
        Assert.assertEquals(weekNumber,testNow.getWeekNumber());
    }

}