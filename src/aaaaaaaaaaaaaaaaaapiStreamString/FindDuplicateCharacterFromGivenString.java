package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacterFromGivenString {

    public static void main(String[] args) {

        String input = "java programming";

        input.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }
}
