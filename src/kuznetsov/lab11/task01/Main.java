package kuznetsov.lab11.task01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calendar now = new GregorianCalendar();
        System.out.println("developer: kuznetsov");
        System.out.println("task accepted: " + now.getTime());

        Thread.sleep(4000);
        Date after = new Date();
        System.out.println("task completed: " + after);
    }
}