package kuznetsov.lab10.task02_03;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getGpa().compareTo(o2.getGpa());
    }
}