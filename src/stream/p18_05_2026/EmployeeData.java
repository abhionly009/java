package stream.p18_05_2026;

public class EmployeeData {


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

    public EmployeeData(String name,String dept,int yoe, int age, double annualSalary) {
        this.name = name;
        this.dept = dept;
        this.yoe = yoe;
        this.age = age;
        this.annualSalary = annualSalary;
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
        return "EmployeeData{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yoe=" + yoe +
                ", annualSalary=" + annualSalary +
                ", dept=" + dept +

                '}';
    }

}
