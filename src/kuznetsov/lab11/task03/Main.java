package kuznetsov.lab11.task03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    private Calendar date_of_birth;

    public Main(Calendar date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String toString(String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(date_of_birth.getTime());
    }

    public static void main(String[] args) {
        Calendar date_of_birth = new GregorianCalendar(2003, 2, 9, 10, 0);
        Main student = new Main(date_of_birth);
        Scanner in = new Scanner(System.in);
        System.out.print("enter format for data output: ");
        System.out.println(student.toString(in.nextLine()));
    }
}