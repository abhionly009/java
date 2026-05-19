package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindLongestWordInString {

    public static void main(String[] args) {

        String input = "Hello mr. Andy this is java class";

        String s = Arrays.stream(input.split(" "))
                .max(Comparator.comparing(String::length)).orElse(null);

        System.out.println(s);
    }
}
