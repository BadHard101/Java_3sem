package kuznetsov.lab20.testing;

public class GenericBox<E> {
    // Private переменная класса
    private E content;
    // конструктор
    public GenericBox(E content) {
        this.content = content;
    }
    public E getContent() {
        return content;
    }
    public void setContent(E content) {
        this.content = content;
    }
    public String toString() {
        return content + " (" + content.getClass() +
                ")";
    }
}
