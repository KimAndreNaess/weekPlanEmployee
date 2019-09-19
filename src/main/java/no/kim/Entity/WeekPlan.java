package no.kim.Entity;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class WeekPlan {
    Collection<Employee> workingEmployeesThisWeek;
    int weekNumber;

    public WeekPlan(Collection<Employee> employees) {
        System.out.println("lager");
        this.weekNumber = generateWeekNumber();

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
}
