package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaximumCharacterInString {
    public static void main(String[] args) {

        String input = "abhinandan";

        Map.Entry<Character, Long> characterLongEntry = input.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println(characterLongEntry);
    }
}
