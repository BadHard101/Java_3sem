package kuznetsov.lab29;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void print_menu() {
        System.out.println("What to do?");
        System.out.println("1 - Check all orders");
        System.out.println("2 - Add order");
        System.out.println("3 - Edit order");
        System.out.println("4 - Summary cost of all orders");
        System.out.println("0 - Exit");
        System.out.print("Enter command: ");
    }

    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        Order order = new InternetOrder();
        order.add(new Drink("Pepsi", "carbonated drink 1.5 liters", 89));
        Order order2 = new InternetOrder();
        order2.add(new Drink("Dobriy - Apple juice", "not carbonated drink 1.5 liters", 179));
        Order order3 = new InternetOrder();
        order3.add(new Dish("Chicken fillet", "chopped chicken breast meat", 328));
        order3.add(new Dish("Pepsi", "carbonated drink 1.5 liters", 89));

        orderManager.add("Room 1 - window", order);
        orderManager.add("Room 2 - Hall", order2);
        orderManager.add("Room 1 - Hall", order3);

        System.out.println(orderManager.sameDishQuantity("Pepsi"));

        for (Order ord :
                orderManager.getOrders()) {
            System.out.println(Arrays.toString(ord.itemsNames()));

        }

        /*
        Scanner scanner = new Scanner(System.in);
        int menu = -1;
        while (menu != 0) {
            print_menu();

            try {
                menu = Integer.parseInt(scanner.nextLine());
                switch (menu) {
                    case 1: {
                        orderManager.printOrders();
                        break;
                    }
                    case 2: {
                        Order ord = new InternetOrder();
                        int temp = -1;
                        while (menu != 0) {
                            System.out.println("1 - add Dish");
                            System.out.println("2 - add Drink");
                            System.out.println("3 - get Items");
                            System.out.println("4 - total cost");
                            System.out.println("0 - finish order");
                            try {
                                menu = Integer.parseInt(scanner.nextLine());
                                switch (menu) {
                                    case 1: {
                                        String

                                        Dish d = new Dish(scanner.nextLine())
                                        order3.add(new Dish("Pizza", "Pizza", 1000));
                                        break;
                                    }
                                    case 2: {

                                        break;
                                    }
                                    default: {
                                        break;
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("Unknown command");
                            }
                        }
                    }
                    default:
                        break;
                }

            } catch (Exception e) {
                System.out.println("Unknown command, try again.");
            }
        }
        */
    }
}
