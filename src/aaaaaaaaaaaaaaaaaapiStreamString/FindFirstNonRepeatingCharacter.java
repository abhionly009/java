package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "swiss";

        Character c = input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity()
                        , LinkedHashMap::new, Collectors.counting()
                )).entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(c);
    }
}
