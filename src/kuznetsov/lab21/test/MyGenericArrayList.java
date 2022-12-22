package kuznetsov.lab21.test;

//Динамически выделяемая память для массива с дженериками
public class MyGenericArrayList<E> {
    private int size;
    // количество элементов- емкость списка
    private Object[] elements;

    public MyGenericArrayList() { //конструктор
        elements = new Object[10];
// выделяем память сразу для 10 элементов списка приего создании
        size = 0;
    }

    public void add(E e) {
        if (size < elements.length) {
            elements[size] = e;
        } else {
// добавляем элемент к списку и увеличиваем счетчикколичества элементов
        }
        ++size;
    }

    public E get(int index) {
        if (index >= size)
            throw new
                    IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (E)elements[index];
    }

    public int size() {
        return size;
    }
}
/*
public class MyGenericArrayList {
    private int size; // количество элементов
    private Object[] elements;

    public MyGenericArrayList() { // конструктор
        elements = new Object[10]; // выделяемпамять для первых 10 объектов
        size = 0;
    }

    // Компилятор заменяет параметризованный тип Eна Object, но проверяет, что параметр e имеет тип E,когда //он используется для обеспечения безопасноститипа
    public void add(Object e) {
        if (size < elements.length) {
            elements[size] = e;
        } else {
            // allocate a larger array and add the element, omitted
        }
        ++size;
    }

    // Компилятор заменяет E на Object и вводит оператор понижающего преобразования типов (E <E>) для
    //типа возвращаемого значения при вызове метода
    public Object get(int index) {
        if (index >= size)
            throw new
                    IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (Object)elements[index];
    }

    public int size() {
        return size;
    }
}
*/
