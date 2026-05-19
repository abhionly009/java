package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Arrays;

public class CountTheWordsInString {
    public static void main(String[] args) {

        String input = "Java stream is more powerful";

        long count = Arrays.stream(input.split(" ")).count();
        System.out.println(count);
    }
}
