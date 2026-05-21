package aaaaaaaaaaaaaaaaaaaaaaaaCopy;

public class MainForCopy {

    public static void main(String[] args) {

        Student student = new Student("Abhinandan",34);
        student.display();

        Student student1 = new Student(student);
        student1.display();
    }
}
