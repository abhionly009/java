package Strings;

import java.util.*;

public class LongestSubString {

    public static int findLongestSubString(String input){

        int left = 0;
        int maxLen  = 0;
        int bestStart = 0;
        int bestLen =0;

       Map<Character,Integer> seen = new TreeMap<>();
        for (int right = 0;right <input.length();right++){
            char ch = input.charAt(right);

            if(seen.containsKey(ch) && seen.get(ch)>=left){
                left = seen.get(ch)+1;

            }

            seen.put(ch,right);
            maxLen = Math.max(maxLen,right-left+1);


            if (right-left+1>bestLen){
                bestLen = right-left+1;
                bestStart = left;
            }

        }


        System.out.println(seen);
        System.out.println(input.substring(bestStart,bestLen+bestStart));
        return maxLen;
    }


    public static void main(String[] args) {

        int longest = findLongestSubString("interview");
        System.out.println(longest);
    }
}
