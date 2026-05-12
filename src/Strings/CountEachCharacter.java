package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountEachCharacter {

    public static void main(String[] args) {


        String input = "hello world";

        Integer [] arr = {1,4,5,6,3,6,4,6,8,9};

        List<Integer> sorted = Arrays.stream(arr)
                .sorted(Collections.reverseOrder()).toList();

        sorted.forEach(System.out::print);
        System.out.println();
        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }
    }
