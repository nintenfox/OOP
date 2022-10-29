package practice4;

public class TestShape {
    public static void main (String [] args) {
        Circle s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        System.out.println("Radius: " + s1.getRadius());

        Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
        System.out.println("Color: " + s3.getColor());
        System.out.println("Length: " + s3.getLength());

        Square s4 = new Square(6.6, "RED", true);
        System.out.println(s4);
        System.out.println("Area: " + s4.getArea());
        System.out.println("Color: " + s4.getColor());
        System.out.println("Side: " + s4.getSide());
    }
}