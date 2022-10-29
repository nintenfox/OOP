import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Practice3 {
    public static void main(String[] args) {

//Task 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

//Task 2
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of elements is: " + sum);

//Task 3
        int sum1 = IntStream.of(array).sum();
        System.out.println("Sum of elements counted by another way is: " + sum1);

//Task 4
        int min = IntStream.of(array).min().getAsInt();
        System.out.println("Minimum element is: " + min);

        int max = IntStream.of(array).max().getAsInt();
        System.out.println("Maximum element is: " + max);

//Task 5
        double average = IntStream.of(array).average().getAsDouble();
        System.out.println("Average is: " + average);

//Task 6
        System.out.println("Sort in ascending order: ");
        Arrays.sort(array);
        for (int asc : array) {
            System.out.println(asc);
        }

        System.out.println("Sort in descending order: ");
        int[] sorted = Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        for (int desc : sorted) {
            System.out.println(desc);
        }
    }
}