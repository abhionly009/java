package aaaaaaaaaaaaaaaaaapiStreamString;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindNthLargestStringFromGivenListOfString {

    public static void main(String[] args) {
        List<String> words = List.of(
                "java",
                "microservices",
                "springja",
                "kafka"
        );

        String s = words.stream().sorted(Comparator.comparing(String::length, Comparator.reverseOrder())).skip(1).findFirst().orElse(null);
        ;
        System.out.println(s);
    }
}
