package aOperationOnyourName;

import java.util.HashMap;
import java.util.Map;

public class SubStringWithOutRepeatingInName {

    public String findSubstring(String name){

        int left = 0;
        int maxLen = 0;
        int startIndex = 0;

        Map<Character,Integer> map = new HashMap<>();

        for (int right =0;right<name.length();right++){
            char ch = name.charAt(right);
            if (map.containsKey(ch)){
                left = Math.max(left, map.get(ch)+1);
            }
            map.put(ch,right);

            int current = right-left+1;

            if (current>maxLen){
                maxLen = current;
                startIndex = left;
            }
        }

        System.out.println("Maximum " + maxLen +" length is without repeating character");
        return name.substring(startIndex, startIndex+maxLen);


    }

    public static void main(String[] args) {

        SubStringWithOutRepeatingInName subStringWithOutRepeatingInName = new SubStringWithOutRepeatingInName();

        System.out.println(subStringWithOutRepeatingInName.findSubstring("abhinandan"));

    }
}
