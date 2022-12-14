public class Main {
    public static void main(String[] args) {

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
    }
}