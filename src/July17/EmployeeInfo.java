package July17;

import java.time.LocalDate;

public class EmployeeInfo {

    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private String gender;
    private LocalDate joiningDate;
    private String city;
    private boolean active;

    public EmployeeInfo(int id, String name, String department,
                    double salary, int age, String gender,
                    LocalDate joiningDate, String city, boolean active) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.joiningDate = joiningDate;
        this.city = city;
        this.active = active;
    }

    // Getters

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public LocalDate getJoiningDate() { return joiningDate; }
    public String getCity() { return city; }
    public boolean isActive() { return active; }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", joiningDate=" + joiningDate +
                ", city='" + city + '\'' +
                ", active=" + active +
                '}';
    }
}
