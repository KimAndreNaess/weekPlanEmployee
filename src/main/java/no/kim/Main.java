package no.kim;

import no.kim.Controller.EmployeeController;
import no.kim.Dao.FakeEmployeeRepository;
import no.kim.Entity.WeekPlan;
import no.kim.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args){
        //System.out.println("hei");

        SpringApplication.run(Main.class, args);

 }

}
