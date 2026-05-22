package com.javafactories.people;

public class Person {

    private String name;
    private int age;
    private boolean online;
    private int favoriteDay;
    private String favoriteSubject;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public Person() {
        this("Unknown", 0);
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isOnline() { return online; }
    public int getFavoriteDay() { return favoriteDay; }
    public String getFavoriteSubject() { return favoriteSubject; }

    /** @throws IllegalArgumentException if age is negative */
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    /** @throws IllegalArgumentException if day is not in [1..7] */
    public void setFavoriteDay(int day) {
        if (day < 1 || day > 7) throw new IllegalArgumentException("Day must be between 1 and 7");
        this.favoriteDay = day;
    }

    public void setFavoriteSubject(String subject) { this.favoriteSubject = subject; }

    public void login() { this.online = true; }
    public void logout() { this.online = false; }
    public void growOlder() { this.age++; }

    public String greet() {
        return "Hello, my name is " + name;
    }

    public String getDayName(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
