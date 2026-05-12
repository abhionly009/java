package aaaaaaaaaaaaaaCapeGemini;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {

    public static void main(String[] args) {
        String input = "Hello world";

        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }
}
