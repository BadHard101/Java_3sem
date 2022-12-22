package kuznetsov.lab20.testing;
/* Динамически размещаемый массив, котрый содержит
большая часть коллекции java.lang.Object — без
дженериков.
*/
public class MyArrayList {
    private int size;
    // количество элементов – размер коллекции
    private Object[] elements;

    public MyArrayList() {
//конструктор
        elements = new Object[10];
// начальная инициализация емкостью 10 элементов
        size = 0;
    }

    public void add(Object o) {
        if (size < elements.length) {
            elements[size] = o;
        } else {
//выделить массив большего размера и добавить элемент,
        }
        ++size;
    }

    public Object get(int index) {
        if (index >= size)
            throw new
                    IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return elements[index];
    }
    public int size() { return size; }
}
