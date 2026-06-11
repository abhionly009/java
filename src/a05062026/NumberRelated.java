package a05062026;

import java.util.List;
import java.util.stream.Collectors;

public class NumberRelated {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,4,5,6,7,3,8,9,10);

        numbers.stream().collect(Collectors.partitioningBy(input->input%2==0))
                .entrySet().stream().forEach(System.out::println);

        numbers.stream().collect(Collectors.groupingBy(
                input->input%2==0 ?"Even" :"Odd"
        )).entrySet().stream().forEach(System.out::println);





    }
}
