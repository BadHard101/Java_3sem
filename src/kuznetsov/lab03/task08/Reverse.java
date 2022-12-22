package kuznetsov.lab03.task08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) {
        strings.add("ABC");
        strings.add("DFG");
        strings.add("HIJ");
        System.out.println("Normal strings: ");
        for (String s :
                strings) {
            System.out.println(s);
        }
        Collections.reverse(strings);
        System.out.println("Reversed with 'reverse' Collections method");
        for (String s :
                strings) {
            System.out.println(s);
        }
    }
}
