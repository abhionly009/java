package day23;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {

    public void separateEvenAndOdd(List<Integer> numbers){

        numbers.stream().collect(Collectors.groupingBy(integer -> integer%2==0))
                .entrySet().stream().forEach(System.out::println);
    }

    public static void main(String[] args) {


        List<Integer> numbers = List.of(1,2,5,6,9,10,11);

        EvenOrOdd evenOrOdd = new EvenOrOdd();
        evenOrOdd.separateEvenAndOdd(numbers);
    }
}
