package no.kim.Controller;

import no.kim.Entity.Employee;
import no.kim.Service.weekPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/weekPlan")

public class weekPlanController {


    @Autowired
    private weekPlanService weekPlanServiceervice;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Employee> getThisWeekPlan(){
        return weekPlanService.getThisWeekPlan();}
}
