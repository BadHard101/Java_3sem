package kuznetsov.lab21;

import java.util.List;

public class Main<N> {
    private final N[] array;

    public Main(N[] array) {
        this.array = array;
    }
    public N get(int index) {
        return array[index];
    }
    public void printArray() {
        for (N n : array) {
            System.out.print(n);
        }
        System.out.println();
    }
    @SafeVarargs
    public final <T> void print5(T... objs) {
        List<Object> list = List.of(objs);
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        Main<Integer> intObj = new Main<>(intArray);
        Main<Double> doubleObj = new Main<>(doubleArray);
        Main<Character> charObj = new Main<>(charArray);

        intObj.printArray();
        doubleObj.printArray();
        charObj.printArray();

        System.out.println(intObj.get(2));
        System.out.println(doubleObj.get(2));
        System.out.println(charObj.get(2));

        intObj.print5(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intObj.print5('I', 'L', 'O', 'V', 'E');
    }
}
