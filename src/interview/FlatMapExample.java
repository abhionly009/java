package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<Integer>> data = Arrays.asList(Arrays.asList(12,42,54,12,55),Arrays.asList(32,45,22,55,90),Arrays.asList(90,44,22,51,44));

        Stream<Integer> integerStream = data.stream().flatMap(List::stream).filter((item) -> item >= 20);

        System.out.println(integerStream);
        integerStream.forEach(System.out::println);
    }

}
