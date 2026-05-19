package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindFrequencyOfWordInString {

    public static void main(String[] args) {
        String input = "java spring java kafka spring";

 Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(string -> string, Collectors.counting()))
         .entrySet().stream().forEach(System.out::println);
 ;

    }
}
