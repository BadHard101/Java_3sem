package kuznetsov.lab09.task01;

public class Student implements Comparable<Student> {
    private final Integer id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                "}";
    }
}