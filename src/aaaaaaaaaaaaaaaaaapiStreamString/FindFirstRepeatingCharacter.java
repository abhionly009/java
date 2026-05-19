package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatingCharacter {

    public static void main(String[] args) {

        String input = "abccde";

        Character c = input.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity()
                        , LinkedHashMap::new, Collectors.counting()
                )).entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);

        System.out.println(c);
    }
}
