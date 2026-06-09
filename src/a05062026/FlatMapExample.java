package a05062026;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<List<String>> names = List.of(
                List.of("John", "Alice"),
                List.of("Bob", "Emma"),
                List.of("David")
        );


        names.stream().flatMap(List::stream)
                .forEach(System.out::println);


        List<List<Integer>> numbers = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );

        numbers.stream().flatMap(List::stream)
                .forEach(System.out::println);

        


    }
}
