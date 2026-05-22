package com.javafactories.employees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void employeeSalaryEqualsBase() {
        Employee e = new Employee("Alice", "E001", 3000);
        assertEquals(3000, e.getSalary());
    }

    @Test
    void managerSalaryIncludesBonus() {
        Manager m = new Manager("Bob", "M001", 4000, 1000);
        assertEquals(5000, m.getSalary());
    }

    @Test
    void directorSalaryIncludesAllBonuses() {
        Director d = new Director("Carol", "D001", 5000, 2000, 1500);
        assertEquals(8500, d.getSalary());
    }

    @Test
    void managerExtendsEmployee() {
        assertInstanceOf(Employee.class, new Manager("Dave", "M002", 4000, 500));
    }

    @Test
    void directorExtendsManager() {
        assertInstanceOf(Manager.class, new Director("Eve", "D002", 5000, 1000, 500));
    }

    @Test
    void employeeWorkReturnsMessage() {
        Employee e = new Employee("Frank", "E002", 2500);
        assertTrue(e.work().contains("Frank"));
    }

    @Test
    void managerWorkDescribesTeamManagement() {
        Manager m = new Manager("Grace", "M003", 4000, 800);
        assertTrue(m.work().contains("managing"));
    }

    @Test
    void approveExpenseIncludesAmount() {
        Manager m = new Manager("Hank", "M004", 4000, 500);
        assertTrue(m.approveExpense(250.0).contains("250.0"));
    }

    @Test
    void evaluateEmployeeNamesEmployee() {
        Manager m = new Manager("Ivy", "M005", 4000, 500);
        Employee e = new Employee("Jack", "E003", 2000);
        assertTrue(m.evaluateEmployee(e).contains("Jack"));
    }
}
