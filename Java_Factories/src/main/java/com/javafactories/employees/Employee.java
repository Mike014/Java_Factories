package com.javafactories.employees;

public class Employee {

    private String name;
    private final String employeeId;
    private double baseSalary;

    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName() { return name; }
    public String getEmployeeId() { return employeeId; }

    public double getSalary() { return baseSalary; }

    public String work() {
        return name + " is working";
    }

    public void printSalary() {
        System.out.println("Employee: " + name
                + " | ID: " + employeeId
                + " | Salary: " + getSalary());
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id='" + employeeId + "', salary=" + getSalary() + "}";
    }
}
