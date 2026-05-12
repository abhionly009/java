package FunctionalExampleDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class CollectDataUsingCollectors {


    public static void main(String[] args) {



        List<User> users = new ArrayList<>();
        users.add(new User("Abhinandan",32,1,"Bangalore"));
        users.add(new User("Rohit",32,5,"Delhi"));
        users.add(new User("Rohit",32,2,"Siwan"));
        users.add(new User("Seema",30,3,"Pune"));
        users.add(new User("Kunal",29,10,"Bangalore"));
        users.add(new User("Kunal",29,16,"Bangalore"));
        users.add(new User("Sonali",20,6,"Delhi"));

//        Map<Integer, String> collect = users.stream().collect(Collectors.toMap(User::getUserId, User::getName));
//
//
//        System.out.println(collect);

//
//        Map<Integer, Long> collect = users.stream().collect(Collectors.groupingBy(User::getAge, counting()));
//
//collect.entrySet().stream().forEach(System.out::println);



        Map<String, List<String>> nameByCity = users.stream()
                .collect(Collectors.groupingBy(
                        User::getCity,
                        Collectors.mapping(User::getName, Collectors.toList())
                ));

        System.out.println(nameByCity);

//        System.out.println(collect);
    }
}
