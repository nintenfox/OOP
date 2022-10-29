package practice4;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape () {}

    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {}

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {}

    public abstract double getArea ();

    public abstract double getPerimeter ();

    @Override
    public String toString() {
        return "Shape{" +
                "color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}