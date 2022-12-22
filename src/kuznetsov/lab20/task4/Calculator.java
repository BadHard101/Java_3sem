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
        System.out.println(sum(1, 2));
        System.out.println(multiply(3, 4));
        System.out.println(divide(5, 6));
        System.out.println(subtraction(7, 8));
    }
}
