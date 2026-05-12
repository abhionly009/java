package aaaaaaaPracticeForIBS.string;

import java.util.Set;

public class CountVowel {

    public static int count(String input){

        int counter = 0;

        Set<Character> arr = Set.of('a','e','i','o','u');

        for (char ch : input.toLowerCase().toCharArray()){
            if (arr.contains(ch)){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(count("hll"));
    }
}
