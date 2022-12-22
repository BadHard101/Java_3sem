package kuznetsov.lab20.testing;
public class MyArrayListTest {
    public static void main(String[] args) {
/*Предусмотрено для хранения списка строк, но не
является типобезопасным*/
        MyArrayList strLst = new MyArrayList();
/*добавление элементов строк (типа String) –это
повышающее или расширяющее преобразование (upcasting)
к типу Object*/
        strLst.add("alpha");
        strLst.add("beta");
/*при получении – необходимо явное понижающее
преобразование (downcasting) назад к String*/
        for (int i = 0; i < strLst.size(); ++i) {
            String str = (String)strLst.get(i);
            System.out.println(str);
        }

/* случайно добавленный не-String объект, произойдет
вызов во время выполнения ClassCastException.
Компилятор не может отловить ошибку*/
        strLst.add(new Integer(1234));
//компиляция/выполнение - не можем обнаружить этуошибку
        for (int i = 0; i < strLst.size(); ++i) {
            String str = (String)strLst.get(i);
/*компиляция ok, при выполнении (runtime)
ClassCastException*/
            System.out.println(str);
        }
    }
}
