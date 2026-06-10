package a05062026;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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







        Integer maxNumber = numbers.stream().reduce(Integer.MIN_VALUE,Integer::max);
        System.out.println(maxNumber);


        String str = "Hello world";

        // count number of vowel in given String using stream api

        long count = str.chars().mapToObj(c -> (char) c)
                .filter(ch -> "aieou".indexOf(ch) == -1)
                .count();

        System.out.println(count);


        String input = "Hi I am abhinandan shah";

        input.replace(" ","").chars().mapToObj(c->(char)c)
                .filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);



        input.chars().mapToObj(c->(char)c)
                .collect(Collectors.partitioningBy(ch->"aeiouAEIOU".indexOf(ch)!=-1))
                .entrySet().stream().forEach(System.out::println);




        String va = "andjin23d3e2";

        va.chars().mapToObj(c->(char)c)
                .filter(ch->Character.isLetter(ch))
                .forEach(System.out::print);


    }
}
