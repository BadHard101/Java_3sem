package kuznetsov.lab09.task01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[10];
        for(int i = 0; i < 10; i++){
            iDNumber[i] = new Student((int) (Math.random() * 1000));
        }
        for(int i = 1; i < 10; i++)
            for(int j = i; j > 0 && iDNumber[j - 1].compareTo(iDNumber[j]) > 0; j--){
                Student tmp = iDNumber[j - 1];
                iDNumber[j - 1] = iDNumber[j];
                iDNumber[j] = tmp;
            }
        System.out.print(Arrays.toString(iDNumber));
    }
}