package a17062026;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenAndOddFromGivenListUsingStream {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,4,5,1,3,6,7,11,8,13);

      Map<String, List<Integer>> collect = numbers.stream().collect(Collectors.groupingBy(input -> input % 2 == 0
                ? "Even":"Odd"
                )

        );

        collect.entrySet().stream().forEach(System.out::println);
    }
}
