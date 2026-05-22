package com.javafactories.people;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void greetIncludesName() {
        Person p = new Person("Alice", 30);
        assertTrue(p.greet().contains("Alice"));
    }

    @Test
    void growOlderIncrementsAge() {
        Person p = new Person("Bob", 20);
        p.growOlder();
        assertEquals(21, p.getAge());
    }

    @Test
    void loginAndLogoutToggleStatus() {
        Person p = new Person("Carol", 25);
        assertFalse(p.isOnline());
        p.login();
        assertTrue(p.isOnline());
        p.logout();
        assertFalse(p.isOnline());
    }

    @Test
    void setAgeRejectsNegativeValue() {
        Person p = new Person("Dave", 25);
        assertThrows(IllegalArgumentException.class, () -> p.setAge(-1));
    }

    @Test
    void setFavoriteDayRejectsOutOfRange() {
        Person p = new Person("Eve", 25);
        assertThrows(IllegalArgumentException.class, () -> p.setFavoriteDay(8));
    }

    @Test
    void getDayNameReturnsCorrectDay() {
        Person p = new Person("Frank", 25);
        assertEquals("Monday", p.getDayName(1));
        assertEquals("Sunday", p.getDayName(7));
    }

    @Test
    void studentGreetIncludesCourse() {
        Student s = new Student("Grace", 20, "Computer Science");
        assertTrue(s.greet().contains("Computer Science"));
    }

    @Test
    void workingStudentImplementsWorkable() {
        WorkingStudent ws = new WorkingStudent("Hank", 22, "Math", 1200);
        assertInstanceOf(Workable.class, ws);
        assertTrue(ws.work().contains("1200"));
    }

    @Test
    void workingStudentStudyIncludesCourse() {
        WorkingStudent ws = new WorkingStudent("Ivy", 23, "Physics", 1000);
        assertTrue(ws.study().contains("Physics"));
    }
}
