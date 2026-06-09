package a05062026;

import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Integer reduce = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println(reduce);

        Integer reduce1 = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce1);


        Integer reduce2 = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println(reduce2);

        // cleaner version

        Integer max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(max);

        Integer min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(min);

        List<String> words =
                List.of("Java", "Spring", "Kafka");

     String sentence =   words.stream().reduce("", (a,b)->a+ " " +b);

        System.out.println(sentence);




    }
}
