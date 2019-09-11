package no.kim.Entity;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int group;
    LocalDate registrert;



    public Employee(int id, String firstName, String lastName, int group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.registrert = LocalDate.now();
    }



    public Employee() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setRegistrert(LocalDate registrert) {
        this.registrert = registrert;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }
    public LocalDate getRegistrert() {
        return registrert;
    }

}
