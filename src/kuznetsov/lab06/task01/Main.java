package kuznetsov.lab06.task01;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle1 = new MovableCircle(0, 0, 1, 2, 5);
        System.out.println(circle1);
        circle1.moveRight();
        System.out.println(circle1);
        circle1.moveUp();
        System.out.println(circle1);
    }
}
