package kuznetsov.lab20.task2;

public class Main<T, V, K> {
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
        return "task2{" +
                "t= " + t + "(" + t.getClass().getName() + ")" +
                ", v=" + v + "(" + v.getClass().getName() + ")" +
                ", k=" + k + "(" + k.getClass().getName() + ")" +
                '}';
    }

    public static void main(String[] args) {
        Main<Integer, String, Double> task2 = new Main<>(1, "2", 3.0);
        System.out.println(task2);
    }
}
