package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.List;
import java.util.stream.Stream;

public class ConvertStringsToUpperCase {

    public static void main(String[] args) {

        String [] input = {"hello", "abhinandan", "shah"};

        List<String> list = Stream.of(input).map(String::toUpperCase).toList();
        System.out.println(list);
    }
}
