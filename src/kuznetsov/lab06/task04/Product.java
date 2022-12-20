package kuznetsov.lab06.task04;

public class Product implements Priceable{
    private int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}