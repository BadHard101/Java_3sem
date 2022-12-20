package kuznetsov.lab06.task04;

public class Main {
    public static void main(String[] args) {
        Priceable bread = new Product(100);
        Priceable milk = new Product(149);
        System.out.printf("cola and cheese sticks cost: %d", bread.getPrice() + milk.getPrice());
    }
}