package kuznetsov.lab11.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> testAL = new ArrayList<>();
        LinkedList<Integer> testLL = new LinkedList<>();
        long time;
        long temp_time;


        /*---------Add operation----------*/
        time  = System.nanoTime();
        testAL.add(1);
        time = System.nanoTime() - time;
        temp_time = time;
        System.out.printf("ArrayList 'add' operation time: %,9.5f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testLL.add(1);
        time = System.nanoTime() - time;
        System.out.printf("LinkedList 'add' operation time: %,9.5f ms\n", time /1_000_000.0);

        System.out.printf("The difference in the execution time of 'add' operation: %9.5f ms\n\n", (time-temp_time) /1_000_000.0);


        /*---------Insert operation----------*/
        time = System.nanoTime();
        testAL.add(0, 1);
        time = System.nanoTime() - time;
        System.out.printf("ArrayList 'insert' operation time: %,9.5f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testLL.add(0, 1);
        time = System.nanoTime() - time;
        System.out.printf("LinkedList 'insert' operation time: %,9.5f ms\n", time /1_000_000.0);

        System.out.printf("The difference in the execution time of 'insert' operation: %9.5f ms\n\n", (time-temp_time) /1_000_000.0);


        /*---------Remove operation----------*/
        time = System.nanoTime();
        testAL.remove(0);
        time = System.nanoTime() - time;
        System.out.printf("ArrayList 'remove' operation time: %,9.5f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testLL.remove(0);
        time = System.nanoTime() - time;
        System.out.printf("LinkedList 'remove' operation time: %,9.5f ms\n", time /1_000_000.0);

        System.out.printf("The difference in the execution time of 'remove' operation: %9.5f ms\n\n", (time-temp_time) /1_000_000.0);


        /*---------Get operation----------*/
        time = System.nanoTime();
        testAL.get(0);
        time = System.nanoTime() - time;
        System.out.printf("ArrayList 'get' operation time: %,9.5f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testLL.add(0, 1);
        time = System.nanoTime() - time;
        System.out.printf("LinkedList 'get' operation time: %,9.5f ms\n", time /1_000_000.0);

        System.out.printf("The difference in the execution time of 'get' operation: %9.5f ms\n\n", (time-temp_time) /1_000_000.0);

    }
}