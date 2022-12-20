package kuznetsov.lab06.task06_07_08_09;

public class Main {
    public static void main(String[] args) {
        Printable shop = new Shop(9990, "OZON");
        Printable book = new Book("Harry Potter", "Joanne Rowling", 2001);
        shop.print();
        book.print();
    }
}