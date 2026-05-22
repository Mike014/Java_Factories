package Hereditary;

public class Manager extends Employee {
    private double managementBonus;

    public Manager(String name, String employeeId, double baseSalary, double managementBonus) {
        super(name, employeeId, baseSalary);
        this.managementBonus = managementBonus;
    }

    public void approveExpense() {
        System.out.println("Manager " + this.getName() + " ha approvato una spesa.");
    }

    public void valutaDipendente(Employee e) {
        System.out.println(getName() + " sta valutando " + e.getName());
    }

    @Override
    public void work() {
        System.out.println(getName() + " sta gestendo il team.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + managementBonus;
    }

    @Override
    public double getSalary() {
        double employeeSalary = super.getSalary();
        return employeeSalary + this.managementBonus;
    }
}
