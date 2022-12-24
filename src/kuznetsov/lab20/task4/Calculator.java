package kuznetsov.lab20.task4;

public class Calculator {
    public static <N extends Number> double sum(N a, N b) {
        return a.doubleValue() + b.doubleValue();
    }
    
    public static <N extends Number> double multiply(N a, N b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <N extends Number> double divide(N a, N b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <N extends Number> double subtraction(N a, N b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1 and 2: " + sum(1, 2));
        System.out.println("Multiply of 3 and 4: " + multiply(3, 4));
        System.out.println("Divide of 5 and 6: " + divide(5, 6));
        System.out.println("Subtraction of 7 and 8: " + subtraction(7, 8));
    }
}
