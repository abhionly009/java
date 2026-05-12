package streamExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {


    static class Person {
        String name;
        String city;
        Person(String name, String city) {
            this.name = name;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

      //  Stream.of() method used when there is hardcoded value there and want to get stream out of it.
        Stream<String> abc = Stream.of("A","B","C");
//        System.out.println(abc.count());

        // Arrays.stream(arr[]);
        // you can not apply stream related function directly
//        int [] arr = {1,3,5,7,9};
//        Stream<int[]> arr1 = Stream.of(arr);
//
//        arr1.filter((num)->num>3);
                int [] arr = {1,3,5,7,9};


                int [] marks  ={98, 100, 35, 75, 73, 81, 86, 75, 100, 75, 35, 75, 17, 98, 100, 35, 75, 73, 81, 86};


                IntStream intStream = Arrays.stream(marks);

                String input = "My name is Kol";

        char[] charArray = input.toCharArray();

        Stream<char[]> charArray1 = Stream.of(charArray);

//        charArray1.filter()


//        skip.forEach(System.out::println);

//        IntStream intStream = Arrays.stream(arr);
//        intStream.filter((num)->num>3).forEach(System.out::println);




        List<Person> people = List.of(
                new Person("Amit", "Delhi"),
                new Person("Neha", "Mumbai"),
                new Person("Raj", "Delhi")
        );

        Map<String, List<Person>> groupedByCity = people.stream()
                .collect(Collectors.groupingBy(p -> p.city));


//        System.out.println(groupedByCity.entrySet().stream().forEach(System.out::println));


    }
}
