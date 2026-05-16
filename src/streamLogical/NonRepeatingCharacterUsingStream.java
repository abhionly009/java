package streamLogical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacterUsingStream {

    public static void main(String[] args) {

        String input = "Java is Jrogramming language";

        Optional<Character> first = input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

            first.ifPresent(System.out::println);

    }
}
