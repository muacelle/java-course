import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // REFERENCE TYPES

        class Person {
            String name;

            Person(String name) {
                this.name = name;
            }
        }

        Person alex = new Person("alex");
        System.out.println(alex.name);

        Person marian = alex;

        alex.name = "Alexander";
        System.out.print(marian.name);

        // ARRAYS

        int [] numbers = new int[2];
        System.out.println(Arrays.toString(numbers)); // [0, 0]

        int [] specific = {5, 6, 7};
        System.out.println(Arrays.toString(specific)); // [5, 6, 7]

        boolean [] boos = new boolean[3];
        System.out.println(Arrays.toString(boos)); // [false, false, false]

        String [] strs = new String[2];
        System.out.println(Arrays.toString(strs)); // [null, null]

        // USER INPUT

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int yearBorn = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + yearBorn);

        // OBJECTS

        Lens lensOne = new Lens("Sony", "85mm", true);
        Lens lensTwo = new Lens("Canon", "24-70mm", false);

        System.out.println(lensOne);
    }

    // CLASSES

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        // CONSTRUCTORS

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}