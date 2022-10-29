package practice4;

public class Circle extends Shape {
    protected double radius;

    public Circle () {
        this.filled = true;
        this.color = "red";
        radius = 4;
    }

    public Circle (double radius) {
        this.filled = true;
        this.color = "red";
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {}

    @Override
    public double getArea () {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double getPerimeter () {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}