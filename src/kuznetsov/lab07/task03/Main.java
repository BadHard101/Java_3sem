package kuznetsov.lab07.task03;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle();
        rectangle.moveDown(5.55);
        rectangle.moveRight(4.56);
        System.out.println(rectangle.toString());
        System.out.println("is speed equal? " + rectangle.SpeedTest());
    }
}