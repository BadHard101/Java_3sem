package kuznetsov.lab06.task03;

public class Person implements Nameable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}