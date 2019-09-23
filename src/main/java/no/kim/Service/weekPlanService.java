package no.kim.Service;

import no.kim.Entity.Employee;
import no.kim.Entity.WeekPlan;

import java.util.Collection;

public class weekPlanService {
    public static Collection<Employee> getThisWeekPlan() { return new WeekPlan().getEmployees();}
    }

