package cats;

public class Cat {
    private String name;
    private char gender;
    private String color;

    public Cat () {}
    public Cat (String name, char gender, String color) {
        this.name = name;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public  char getGender() {
        return gender;
    }

    public String getColor () {
        return color;
    }

    @Override
    public String toString () {
        return  "cats.Cat{" +
                "Name - " + name +
                ", Gender - " + gender +
                ", Color - " + color +
                '}';
    }
}
