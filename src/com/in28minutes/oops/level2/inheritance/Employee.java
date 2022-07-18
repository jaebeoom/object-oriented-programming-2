package com.in28minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
    private String title;
    private String employerName;
    private char employeeGrade;
    private BigDecimal salery;

    public Employee(String name, String title) {
        super(name);
        this.title = title;
        System.out.println("Employee Constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalery() {
        return salery;
    }

    public void setSalery(BigDecimal salery) {
        this.salery = salery;
    }

    public String toString() {
        return super.toString() + "#" + title + "#" + employerName + "#" + employeeGrade;
    }
}
