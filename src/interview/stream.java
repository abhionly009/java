package interview;

import copy.User;

import java.util.Arrays;
import java.util.List;

public class stream {



    public static void main(String[] args) {

        List<User> users = Arrays.asList(new User(30,"abhinandan","Bangalore"),new User(34,"Sandeep","Bangalore"),new User(32,"Mayank","Lucknow"));

                   users.stream().filter((user) -> user.getAge() >= 30 && user.getCity().equals("Bangalore")).map((user)->user.getName().toUpperCase())

            .forEach(System.out::println);


    }
}
