package PredicateExample;

public class Employee {
    private String name;
    private int age;
    private boolean isHavingGf;

    public Employee(String name, int age, boolean isHavingGf) {

        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    public String getName() {
        return this.name;
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

    public boolean isHavingGf() {
        return isHavingGf;
    }

    public void setHavingGf(boolean havingGf) {
        isHavingGf = havingGf;
    }
}
