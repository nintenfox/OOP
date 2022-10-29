package practice4;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle () {
        this.filled = false;
        this.color = "green";
        this.width = 8;
        this.length = 31;
    }

    public Rectangle (double width, double length) {
        this.filled = false;
        this.color = "green";
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width, double length, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {}

    public double getLength() {
        return length;
    }

    public void setLength(double length) {}

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", length = " + length +
                ", color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}