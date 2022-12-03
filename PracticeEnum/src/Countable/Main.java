package Countable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        DayOfWeek friday = DayOfWeek.FRIDAY;
        System.out.println(sunday);
        System.out.println(friday);
        System.out.println(Arrays.toString(DayOfWeek.values()));
    }
}
