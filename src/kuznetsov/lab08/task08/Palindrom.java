package kuznetsov.lab08.task08;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrom(String str){
        if(str.length() > 1 && str.endsWith(String.valueOf(str.charAt(0)))) {
            return isPalindrom(str.substring(1, str.length() - 1));
        }
        if(str.length() <= 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.print("String is palindrom: ");
        System.out.println(isPalindrom(str));
    }
}