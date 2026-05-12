package aaaaaaaaaaaaaaCapeGemini;

import java.util.List;

public class Employee {
    private String name;

    private String dept;

    private int age;

    private long salary;

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    private List<String> city;


    public Employee() {
    }

    public Employee(String name, String dept, int age, long salary, List<String> city) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
