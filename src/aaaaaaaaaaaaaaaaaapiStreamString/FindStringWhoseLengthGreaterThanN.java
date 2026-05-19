package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.List;

public class FindStringWhoseLengthGreaterThanN {

    public static void main(String[] args) {

        List<String> list = List.of("abhinandan","shah","java","developer");

        List<Integer> list1 = list.stream().map(String::length).toList();

        System.out.println(list1);

        // find the string whose length is greater than 6
        list.stream().filter(word->word.length()>6).forEach(System.out::println);

    }
}
