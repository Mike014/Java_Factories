package Hereditary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void printEmployeers(Employee[] emp) {
        for (Employee e : emp)
            System.out.println(e);
    }

    private static void printSalaries(Employee[] emp) {
        for (Employee e : emp)
            e.printSalary(e);
    }

    private static void printListSalaries(List<Employee> emp) {
        for (Employee e : emp)
            e.printSalary(e);
    }

    private static boolean checkIsIstanceOf(Employee e) {
        return e instanceof Manager;
    }

    private static List<Employee> howMuchIstanceOf(Employee[] e) {
        List<Employee> managers = new ArrayList<>();

        for (Employee emp : e)
            if (emp instanceof Manager)
                managers.add(emp);

        return managers;
    }

    private static void vehicleIsMoving(Veicolo[] vehicles) {
        for (Veicolo v : vehicles)
            v.accendiMotore();
    }

    private static void printAreaShape(Shape[] s) {
        for (Shape p : s)
            System.out.println(p.area());
    }


    public static void main(String[] args) {
        // Test the class

    }
}
