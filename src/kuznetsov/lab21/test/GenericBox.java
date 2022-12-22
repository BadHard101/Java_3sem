package kuznetsov.lab21.test;

public class GenericBox {
    // Private переменная
    private Object content;
    // Конструктор
    public GenericBox(Object content) {
        this.content = content;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }
    public String toString() {
        return content + " (" + content.getClass() + ")";
    }

    public static void main(String[] args) {
        GenericBox box1 = new GenericBox("Hello"); //upcast безопасно для типов
        String str = (String)box1.getContent(); //компилятор вставляет операцию понижения типа (downcast)
        System.out.println(box1);
    }
}