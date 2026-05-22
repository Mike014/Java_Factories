package Hereditary;

abstract class Shape {
    public abstract double area();

    public abstract void descrivi();

    @Override
    public String toString() {
        return "Il tipo è : " + this.getClass().getSimpleName() + " " + this.area();
    }
}
