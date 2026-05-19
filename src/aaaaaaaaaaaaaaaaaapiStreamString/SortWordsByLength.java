package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Comparator;
import java.util.List;

public class SortWordsByLength {

    public static void main(String[] args) {

        List<String> list = List.of("Hi","Hello","Java","programming","language");

        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
