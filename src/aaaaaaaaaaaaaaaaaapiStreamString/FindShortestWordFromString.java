package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Arrays;
import java.util.Comparator;

public class FindShortestWordFromString {

    public static void main(String[] args) {

        String input  = "Hello Mr. Andy this is Java class";

       String result = Arrays.stream(input.split(" ")).min(Comparator.comparing(String::length)).orElse(null);

        System.out.println(result);
    }
}
