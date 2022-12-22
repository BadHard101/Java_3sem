package kuznetsov.lab20.testing;

public class TestGenericBox {
    public static void main(String[] args) {

        GenericBox<String> box1 = new GenericBox<String>("Hello");
        String str = box1.getContent(); // явного понижающего преобразования (downcasting) не требуется
        System.out.println(box1);

        GenericBox<Integer> box2 = new GenericBox<Integer>(123); //автоупаковка типа int в тип Integer
        int i = box2.getContent(); // (downcast) понижающее преобр. к типу Integer, автоупаковка в тип int
        System.out.println(box2);

        GenericBox<Double> box3 = new GenericBox<Double>(55.66); //автоупаковка типа double в тип Double
        double d = box3.getContent(); //(downcast) понижающее преобр. к типу Double, автоупаковка в тип double
        System.out.println(box3);

    }
}
