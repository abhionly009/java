package a17062026;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {

    public int findLongestSubString(String input){

        if (input== null){
            throw new NullPointerException("Input string should not be null");
        }

        int maxLen =0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int r =0;r<input.length();r++)
        {
            while (set.contains(input.charAt(r))){
                set.remove(input.charAt(left));
                left++;
            }
            set.add(input.charAt(r));
            maxLen = Math.max(maxLen,r-left+1);

        }

        System.out.println(maxLen);
        return maxLen;

    }

    public static void main(String[] args) {

        String input = "abcabcbb";

       LongestSubString longestSubString = new LongestSubString();
       int count = longestSubString.findLongestSubString(input);
        System.out.println(count);

    }
}
