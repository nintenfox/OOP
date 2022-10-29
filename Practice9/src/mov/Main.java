package mov;

public class Main {
    public static void main (String[] args) {
        Movable a = new MovablePoint(2, 3, 4, 5);
        a.moveUp();
        a.moveDown();
        a.moveLeft();
        a.moveRight();
        System.out.println(a);

        Movable b = new MovableCircle(2, new MovablePoint(2, 2, 2, 2));
        b.moveUp();
        b.moveDown();
        b.moveLeft();
        b.moveRight();
        System.out.println(b);
    }
}
