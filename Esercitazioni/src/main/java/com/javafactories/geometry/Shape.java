package com.javafactories.geometry;

public abstract class Shape {

    public abstract double area();

    public abstract String describe();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [area=" + String.format("%.2f", area()) + "]";
    }
}
