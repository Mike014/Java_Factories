package com.javafactories.vehicles;

public abstract class Vehicle {

    public abstract String move();

    public String startEngine() {
        return getClass().getSimpleName() + " engine started";
    }
}
