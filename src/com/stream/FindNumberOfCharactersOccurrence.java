package com.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNumberOfCharactersOccurrence {

    public static void main(String[] args) {

        String input = "hello my name is abhinandan";

        Map<Character, Long> collect = input.chars().mapToObj(i ->(char)  i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);


    }
}
