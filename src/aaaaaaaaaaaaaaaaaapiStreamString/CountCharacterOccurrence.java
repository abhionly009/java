package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurrence {

    public static void main(String[] args) {

        String input = "banana is fruit";
        Map<Character, Long> collect = input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
    
}
