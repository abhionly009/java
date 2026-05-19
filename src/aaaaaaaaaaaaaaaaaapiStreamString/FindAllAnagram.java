package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAllAnagram {

    public static void main(String[] args) {
        List<String> words = List.of("cat", "act", "dog", "god", "java");

        Map<String, List<String>> collect = words.stream().collect(Collectors.groupingBy(word -> word.chars().sorted().
                mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())
        ));

        collect.values().stream().filter(strings -> strings.size()>1).forEach(System.out::println);
    }
}
