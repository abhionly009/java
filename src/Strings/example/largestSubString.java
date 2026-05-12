package Strings.example;

import java.util.HashMap;
import java.util.Map;

public class largestSubString {

    public static String findLongestUniqueSubString(String str){


        int start =0; int maxLen =0; int maxStart =0;

        Map<Character,Integer> map = new HashMap<>();

        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if (map.containsKey(c) && map.get(c)>=start){
                start = map.get(c)+1;
            }
            map.put(c,i);

            if (i-start+1>maxLen){
                maxLen = i-start+1;
                maxStart = start;
            }

        }

        return str.substring(maxStart,maxStart+maxLen);
    }
    public static void main(String[] args) {


        String input = "abcabcbb";
        System.out.println("Longest unique substring: " + findLongestUniqueSubString(input));

    }
}
