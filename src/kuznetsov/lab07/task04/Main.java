package kuznetsov.lab07.task04;

public class Main {
    public static void main(String[] args) {
        MathCalculable ex = new MathFunc();
        System.out.println("Area of the circle with radius = 3: " + ex.PI * ex.pow(3,2));
        System.out.println("module of complex number 2 + 3i: " + ex.complex_m(2, 3));
    }
}