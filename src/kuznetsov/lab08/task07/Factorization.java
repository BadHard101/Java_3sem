package kuznetsov.lab08.task07;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorization {
    public static ArrayList<Integer> factorization(int x, ArrayList<Integer> factors){
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0) {
                factors.add(i);
                return factorization(x / i, factors);
            }
        }
        if(x != 1) factors.add(x);
        return factors;
    }

    public static void main(String[] args) {
        ArrayList<Integer> factors = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Result of factorization: ");
        System.out.println(factorization(n, factors));
    }
}
