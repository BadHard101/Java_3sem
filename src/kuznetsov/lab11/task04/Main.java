package kuznetsov.lab11.task04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calendar input = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        input.set(Calendar.YEAR, year);
        System.out.print("Enter month: ");
        int month = in.nextInt();
        input.set(Calendar.MONTH, month - 1);
        System.out.print("Enter day of month: ");
        int day = in.nextInt();
        input.set(Calendar.DAY_OF_MONTH, day);
        System.out.print("Enter hour: ");
        int hour = in.nextInt();
        input.set(Calendar.HOUR_OF_DAY, hour);
        System.out.print("Enter minutes: ");
        int minute = in.nextInt();
        input.set(Calendar.MINUTE, minute);

        System.out.println(input.getTime());
    }
}