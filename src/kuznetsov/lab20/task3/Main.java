package kuznetsov.lab20.task3;

import java.io.Serializable;

public class Main<T extends Comparable<T>, V extends Animal & Serializable, K>{
    private T t;
    private V v;
    private K k;

    public Main(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "task3{" +
                "t=" + t +
                ", v=" + v +
                ", k=" + k +
                '}';
    }

    public static void main(String[] args) {
        Main<Integer, Dog, String> task3 = new Main<Integer, Dog, String>(123, new Dog("Sharik", 3, "black"), "Java-jun");
        System.out.println(task3);
    }
}
