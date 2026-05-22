package com.javafactories.employees;

public class Manager extends Employee {

    private double managementBonus;

    public Manager(String name, String employeeId, double baseSalary, double managementBonus) {
        super(name, employeeId, baseSalary);
        this.managementBonus = managementBonus;
    }

    public double getManagementBonus() { return managementBonus; }

    public String approveExpense(double amount) {
        return "Manager " + getName() + " approved expense of " + amount;
    }

    public String evaluateEmployee(Employee employee) {
        return getName() + " is evaluating " + employee.getName();
    }

    @Override
    public String work() {
        return getName() + " is managing the team";
    }

    @Override
    public double getSalary() {
        return super.getSalary() + managementBonus;
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() + "', id='" + getEmployeeId()
                + "', salary=" + getSalary() + ", bonus=" + managementBonus + "}";
    }
}
