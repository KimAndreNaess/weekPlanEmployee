package no.kim.Service;

import no.kim.Entity.Employee;
import no.kim.Entity.WeekPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class weekPlanService {
    @Autowired

    public static Collection<Employee> getThisWeekPlan() {
        WeekPlan weekPlan = new WeekPlan();
        return weekPlan.getEmployees();
        }

    public static int getWeekNumber() {
        WeekPlan weekPlan = new WeekPlan();
        return weekPlan.getWeekNumber();
    }
}

