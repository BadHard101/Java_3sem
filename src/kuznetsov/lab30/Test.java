package kuznetsov.lab30;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        TableOrdersManager tableOrdersManager = new TableOrdersManager();
        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();

        Customer customer;
        String firstName = "Andrew";
        String lastName = "Kuznetsov";
        int age = 19;

        String city = "Moscow";
        String street = "Pushkinskaya";
        int building = 3;
        int apartment = 2;
        int zipCode = 123456;
        char letter = 'A';
        Address address = new Address(city, street, building, apartment, zipCode, letter);

        customer = new Customer(firstName, lastName, address, age);

        Order order = new InternetOrder(customer);
        Order order1 = new TableOrder();
        Order order2 = new TableOrder();
        Order order3 = new InternetOrder(customer);
        Order order4 = new InternetOrder(customer);

        order.add(new Drink("BEER", "1.5", 320, DrinkTypeEnum.BEER, 5));
        order1.add(new Drink("BRANDY", "0.5", 512, DrinkTypeEnum.BRANDY, 24));
        order2.add(new Drink("CHAMPAGNE", "1.0", 233, DrinkTypeEnum.CHAMPAGNE, 2));
        order3.add(new Drink("BEER", "1.2", 290, DrinkTypeEnum.BEER, 5));
        order4.add(new Drink("COFFEE", "0.3", 109, DrinkTypeEnum.COFFEE, 0));

        tableOrdersManager.add(order1, 5);
        tableOrdersManager.add(order2, 7);
        internetOrdersManager.add(order);
        internetOrdersManager.add(order3);
        internetOrdersManager.add(order4);

        System.out.println("Amount of BRANDY in table orders: " + tableOrdersManager.itemsQuantity("BRANDY"));
        System.out.println("Amount of BEER in table orders: " + internetOrdersManager.itemsQuantity("BEER"));

        System.out.println("Amount of tables orders: " + tableOrdersManager.ordersQuantity());
        System.out.println("Amount of internet orders: " + internetOrdersManager.ordersQuantity());

        System.out.println("Full cost of table orders: " + tableOrdersManager.ordersCostSummary());
        System.out.println("Full cost of internet orders: " + internetOrdersManager.ordersCostSummary());


        System.out.println("Remove the 5th table order: " + tableOrdersManager.remove(5));
        System.out.println("Amount of tables orders: " + tableOrdersManager.ordersQuantity());
        System.out.println("Amount of internet orders: " + internetOrdersManager.ordersQuantity());

        System.out.println("Removed the head internet order with items: " + Arrays.toString(internetOrdersManager.remove().getItems()));
        System.out.println("Amount of tables orders: " + tableOrdersManager.ordersQuantity());
        System.out.println("Amount of internet orders: " + internetOrdersManager.ordersQuantity());
    }
}
