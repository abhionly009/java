package aaaaaaaPracticeForIBS.string;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrence {

    public static void count(String input){

        Map<Character,Integer> map = new HashMap<>();

        for (char ch : input.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        System.out.println(map);

    }


    public static void main(String[] args) {

        String string = "hello world ";
        count(string);

    }
}
