package Hereditary;

public class Employee implements Ufficio {
    private String name;
    private final String employeeId;
    private double baseSalary;

    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public void work() {
        System.out.println(this.name + " sta lavorando ");
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + ", ID: " + getEmployeeId() + ", Salario: " + getSalary();
    }

    public double getSalary() {
        return this.baseSalary;
    }

    @Override
    public void printSalary(Employee e) {
        System.out.println(e.getEmployeeId());
        System.out.println(e.getSalary());
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

