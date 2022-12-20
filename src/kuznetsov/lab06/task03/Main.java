package kuznetsov.lab06.task03;

public class Main {
    public static void main(String[] args) {
        Nameable person1 = new Person("Ivan");
        Nameable person2 = new Person("Kate");
        System.out.printf(person1.getName() + " and " + person2.getName() + " are best friends!");
    }
}