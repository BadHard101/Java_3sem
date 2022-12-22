package kuznetsov.lab06.task02;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle1 = new MovableRectangle(0, 0, 6, 3, 2, 3);
        System.out.println(rectangle1);
        rectangle1.moveRight();
        System.out.println(rectangle1);
        rectangle1.moveDown();
        System.out.println(rectangle1);
        rectangle1.moveRight();
        System.out.println();
    }
}
