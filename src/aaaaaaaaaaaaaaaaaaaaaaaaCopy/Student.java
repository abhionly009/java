package aaaaaaaaaaaaaaaaaaaaaaaaCopy;

public class Student {

    String name;

    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student s) {
        this.name =s.name;
        this.age = s.age;

    }

    public void display(){
        System.out.println(name +" is "  + age +  " old " );
    }
}
