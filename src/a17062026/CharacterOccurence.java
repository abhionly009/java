package a17062026;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurence {

    public static void main(String[] args) {

        String str = "abhinandan shah";

        str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);
    }
}
