package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortCharacterInGivenString {

    public static void main(String[] args) {

        String input = "abhinandan";

        String collect = input.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

        System.out.println(collect);
    }
}
