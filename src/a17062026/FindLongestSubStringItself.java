package a17062026;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubStringItself {

    public String findSubString(String input){
        if (input == null){
            throw new NullPointerException("Input can not be null");
        }

        int left =0;
        int maxLength = 0;
        int startIndex = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right =0;right<input.length();right++){
            char ch = input.charAt(right);
            if (map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);

            int current = right- left+1;

            if (current>maxLength){
                maxLength = current;
                startIndex = left;
            }
        }


//        System.out.println(maxLength);
        return input.substring(startIndex, startIndex+maxLength);
    }

    public static void main(String[] args) {

        String input = "";
        FindLongestSubStringItself subStringItself = new FindLongestSubStringItself();
        String output = subStringItself.findSubString(input);
        System.out.println(output);
    }

}
