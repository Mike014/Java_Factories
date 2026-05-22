package com.javafactories.people;

public class Student extends Person {

    private String studyCourse;

    public Student(String name, int age, String studyCourse) {
        super(name, age);
        this.studyCourse = studyCourse;
    }

    public String getStudyCourse() { return studyCourse; }

    public String study() {
        return "Student " + getName() + " is studying " + studyCourse;
    }

    @Override
    public String greet() {
        return super.greet() + " - I study " + studyCourse;
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", course='" + studyCourse + "'}";
    }
}
