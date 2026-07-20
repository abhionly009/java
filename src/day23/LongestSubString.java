package day23;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {


    public String findLongestSubStringWithoutRepeatingCharacter(String input)
    {

        int left =0;
        int maxLength = 0;
        int startIndex = 0;
        Map<Character,Integer> map = new HashMap<>();

        for (int right =0;right<input.length();right++){
            char ch = input.charAt(right);
            if (map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }

            map.put(ch, right);

            int current = right-left+1;
            if (current>maxLength){
                maxLength = current;
                startIndex = left;

            }
        }

        return  input.substring(startIndex, startIndex+maxLength);
    }

    public static void main(String[] args) {

        String str = "pwwkew";

        LongestSubString longestSubString = new LongestSubString();
       String result = longestSubString.findLongestSubStringWithoutRepeatingCharacter(str);

        System.out.println(result);

    }
}
