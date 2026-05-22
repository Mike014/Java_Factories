package com.javafactories.geometry;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String describe() {
        return "Square with side " + getWidth();
    }
}
