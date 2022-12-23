package kuznetsov.lab06.task11;

public class Celsius implements Convertable {
    private double value;

    public Celsius(double value) {
        this.value = value;
    }

    @Override
    public double convertF() {
        return (value * 1.8 + 32);
    }

    @Override
    public double convertK() {
        return (value + 273.15);
    }

    public static void main(String[] args) {
        Celsius c = new Celsius(12);
        System.out.println("Celsius (12) to Fahrenheit = " + c.convertF() + "F");
        System.out.println("Celsius (12) to Kelvin = " + c.convertK() + "K");


    }
}