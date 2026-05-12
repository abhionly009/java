package copy;

public class User {

    private String name;
    private int age;
    private String city;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public User(User user) {

        this.age = user.age;
        this.city = user.city;
        this.name = user.name;

    }

    public User() {
    }

    public User(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
