package Hereditary;

public class Cerchio extends Shape {

    private double radius;

    public Cerchio(double radius) {
        this.radius = radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void descrivi() {
        System.out.println("Questo è il cerchio");
    }
}
