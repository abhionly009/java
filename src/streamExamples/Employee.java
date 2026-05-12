package streamExamples;


public class Employee {

    private String name;
    private int age;
    private int yoe;
    private double annualSalary;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    private String dept;

    public Employee(String name, int age, int yoe, double annualSalary, String dept) {
        this.name = name;
        this.age = age;
        this.yoe = yoe;
        this.annualSalary = annualSalary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yoe=" + yoe +
                ", annualSalary=" + annualSalary +
                ", dept=" + dept +

                '}';
    }






}
