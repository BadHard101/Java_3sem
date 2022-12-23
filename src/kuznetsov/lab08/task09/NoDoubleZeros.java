package kuznetsov.lab08.task09;

import java.util.Scanner;

public class NoDoubleZeros {
    public static int howMany(int a, int b){
        if (a == 0)
            return b;
        else if (a == 1)
            return b + 1;
        else if (a > 1 && b == 0)
            return 0;
        else
            return howMany(a - 1, b - 1) + howMany(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of 0: ");
        int a = in.nextInt();
        System.out.print("Enter amount of 1: ");
        int b = in.nextInt();
        System.out.print("Amount of all possible sequences: ");
        System.out.println(howMany(a, b));

    }
}