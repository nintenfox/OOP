package print;

public class Main {
    public static void main(String[] args) {
        Book a = new Book("Robinson Crusoe", "Daniel Defoe");
        Book b = new Book("Alice Through the Looking-Glass", "Lewis Carroll");
        Shop c = new Shop("Powell’s Book Store", "USA", "Portland");
        Shop d = new Shop("Cook & Book", "Belgium", "Brussels");

        Printable[] printables = {a, b, c, d};
        for (Printable printable : printables) {
            printable.print();
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
