package com.javafactories.employees;

public class Director extends Manager {

    private double directorBonus;

    public Director(String name, String employeeId, double baseSalary,
                    double managementBonus, double directorBonus) {
        super(name, employeeId, baseSalary, managementBonus);
        this.directorBonus = directorBonus;
    }

    public double getDirectorBonus() { return directorBonus; }

    @Override
    public double getSalary() {
        return super.getSalary() + directorBonus;
    }

    @Override
    public String toString() {
        return "Director{name='" + getName() + "', id='" + getEmployeeId()
                + "', totalSalary=" + getSalary() + "}";
    }
}
