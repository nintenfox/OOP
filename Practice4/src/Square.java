package practice4;

public class Square extends Rectangle {
    private double side;
    public Square () {}

    public Square (double side) {
        this.filled = true;
        this.color = "violet";
        this.side = side;
    }

    public Square (double side, String color, boolean filled) {
        this.filled = true;
        this.color = "violet";
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {}

    @Override
    public void setWidth(double width) {}

    @Override
    public void setLength(double length) {}

    @Override
    public String toString() {
        return "Square{" +
                "side = " + side +
                ", color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}
