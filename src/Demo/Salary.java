package Demo;

import FunctionalExampleDemo.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Salary {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Abhinandan",32,1,"Bangalore"));
        users.add(new User("Rohit",32,5,"Delhi"));
        users.add(new User("Rohit",32,2,"Siwan"));
        users.add(new User("Seema",30,3,"Pune"));
        users.add(new User("Kunal",29,10,"Bangalore"));
        users.add(new User("Kunal",29,16,"Bangalore"));
        users.add(new User("Sonali",20,6,"Delhi"));

        Stream<User> sorted = users.stream().sorted(Comparator.comparing(User::getCity)
                .thenComparing(User::getAge));

        sorted.forEach(System.out::println);
    }
}
