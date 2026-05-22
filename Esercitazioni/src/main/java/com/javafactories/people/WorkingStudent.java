package com.javafactories.people;

public class WorkingStudent extends Student implements Workable {

    private int salary;

    public WorkingStudent(String name, int age, String studyCourse, int salary) {
        super(name, age, studyCourse);
        this.salary = salary;
    }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    @Override
    public String work() {
        return "Working student " + getName() + " earns " + salary;
    }

    @Override
    public String study() {
        return "I work, but I also study. " + super.study();
    }

    @Override
    public String toString() {
        return "WorkingStudent{name='" + getName() + "', age=" + getAge()
                + ", course='" + getStudyCourse() + "', salary=" + salary + "}";
    }
}
