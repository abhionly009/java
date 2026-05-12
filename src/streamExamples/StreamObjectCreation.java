package streamExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjectCreation {

    public static void main(String[] args) {


        String str = "hello world";

//        1st way
//       Stream<String> stream =  Stream.of(str);
//
//       stream.forEach(System.out::println);


//       2nd way

//        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println(collect);

//        3rd way


//        int [] grr = {4,68,3,2,44,55,11,33,65,80,90,23,44,55,33,55,22,66};
//
//        IntStream data = Arrays.stream(grr);
//        Stream<Integer> limit = data.distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).limit(1);
//
//        limit.forEach(System.out::println);
//

        List<String> list = new ArrayList<>();

        list.add("Abhinandan");
        list.add("Harshit");
        list.add("Pratap");
        list.add("Sunil");
        list.add("Mayank");


        List<String> collect = list.stream().filter((item) -> item.length() > 6).toList();

        collect.forEach(System.out::println);

    }
}
