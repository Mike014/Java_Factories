package com.javafactories.geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void circleAreaUsesPI() {
        Circle c = new Circle(5);
        assertEquals(Math.PI * 25, c.area(), 1e-9);
    }

    @Test
    void rectangleAreaIsWidthTimesHeight() {
        Rectangle r = new Rectangle(4, 3);
        assertEquals(12.0, r.area());
    }

    @Test
    void squareAreaIsSquaredSide() {
        Square s = new Square(5);
        assertEquals(25.0, s.area());
    }

    @Test
    void squareExtendsRectangle() {
        assertInstanceOf(Rectangle.class, new Square(3));
    }

    @Test
    void setRadiusUpdatesArea() {
        Circle c = new Circle(1);
        c.setRadius(10);
        assertEquals(Math.PI * 100, c.area(), 1e-9);
    }

    @Test
    void toStringIncludesClassName() {
        assertTrue(new Circle(3).toString().contains("Circle"));
        assertTrue(new Rectangle(2, 4).toString().contains("Rectangle"));
    }

    @Test
    void describeReturnsReadableString() {
        assertEquals("Square with side 4.0", new Square(4).describe());
    }
}
