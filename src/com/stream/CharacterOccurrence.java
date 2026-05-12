package com.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {




    public static void main(String[] args) {

        String str = "hello world";

        Map<Character, Long> collect = str.chars().
                mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(collect);

    }
}
