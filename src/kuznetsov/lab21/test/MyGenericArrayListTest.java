package kuznetsov.lab21.test;

public class MyGenericArrayListTest {
    public static void main(String[] args) {
        // безопасный тип для хранения спискаобъектов Strings (строк)
        MyGenericArrayList<String> strLst = new MyGenericArrayList <String>();

        strLst.add("alpha"); // здесь компилятор проверяет, является ли аргумент типом String
        strLst.add("beta");

        for (int i = 0; i < strLst.size(); ++i) {
            String str = strLst.get(i); //компилятор вставляет оператор понижающего преобразования operator (String)
            System.out.println(str);
        }
        //strLst.add(new Integer(1234)); //компилятор обнаруживает аргумент, который не является объектом String, происходит ошибка компиляции
    }
}
