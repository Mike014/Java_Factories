package Hereditary;

public class Director extends Manager {
    private double managementDirectorBonus;

    public Director(String name, String employeeId, double baseSalary, double managementBonus, double managementDirectorBonus) {
        super(name, employeeId, baseSalary, managementBonus);
        this.managementDirectorBonus = managementDirectorBonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + managementDirectorBonus;
    }
}
