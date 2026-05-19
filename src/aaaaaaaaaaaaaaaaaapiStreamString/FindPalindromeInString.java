package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Arrays;

public class FindPalindromeInString {

    public static void main(String[] args) {

        String str = "madam level java racecar";

        Arrays.stream(str.split(" "))
                .filter(word->word.equals(new StringBuilder(word).reverse().toString()))
                .forEach(System.out::println);

    }
}
