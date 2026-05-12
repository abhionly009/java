package aaaaaaaPracticeForIBS.string;

import java.util.Set;

public class CountConsonant {

    public static int count(String input){
        int counter = 0;

        Set<Character> set = Set.of('a','e','o','i','u');

        for (char ch : input.toLowerCase().toCharArray()){

            if (Character.isLetter(ch)){

                if (!set.contains(ch)){
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        System.out.println(count("Input"));

    }
}
