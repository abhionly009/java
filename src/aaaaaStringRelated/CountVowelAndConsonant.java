package aaaaaStringRelated;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountVowelAndConsonant {

    public static Map<String,Integer>count(String input){
        int vowelCount = 0;
        int consonantCount = 0;
        int otherCharacters = 0;
        Set<Character> vowels = Set.of('a','e','o','i','u');
        for(char ch :input.toLowerCase().toCharArray()){
            if (Character.isLetter(ch)){
                if (vowels.contains(ch)){

                    vowelCount++;
                }else {
                    consonantCount++;
                }
            }
            else{
                otherCharacters++;
            }

        }
        Map<String, Integer> totalCount = new HashMap<>();
        totalCount.put("Vowels", vowelCount);
        totalCount.put("Consonants", consonantCount);
        totalCount.put("Other Character", otherCharacters);
        return totalCount;
    }

    public static void main(String[] args) {

        String str = "Hello world! in j$ava";
        Map<String, Integer> data = count(str);

//        System.out.println(data);
        Set<Map.Entry<String, Integer>> entries = data.entrySet();

        for (Map.Entry<String,Integer> entry :entries){
            System.out.println(entry);
        }

//        System.out.println("Total count of vowels "+ data[0] );
//        System.out.println("Total count of consonants "+ data[1] );
//        System.out.println("Total count of Other characters "+ data[2] );

    }
}
