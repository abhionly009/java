package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingStreamAPI {
    public static void main(String[] args) {

        String str = "Hello world";

        String collect = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(collect);
    }
}
