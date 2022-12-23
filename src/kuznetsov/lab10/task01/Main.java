package kuznetsov.lab10.task01;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Andrew", "Kuznetsov", "Java-programmer", 2, 1);
        System.out.println("Student:" +
                "\nName - " + student.getName() +
                "\nSurname - " + student.getSurname() +
                "\nSpeciality - " + student.getSpeciality() +
                "\nCourse - "+ student.getCourse() +
                "\nGroup - "+ student.getGroup());
    }
}