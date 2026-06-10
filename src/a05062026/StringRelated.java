package a05062026;

import java.util.HashSet;
import java.util.Set;

public class StringRelated {

    public static String findNonRepeatingSubString(String str){
        Set<Character> set = new HashSet<>();

        int left =0;
        int maxLen =0;
        int startIndex=0;


        for (int right =0;right<str.length();right++){

            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));

            if (right-left+1>maxLen){
                maxLen = right-left+1;
                startIndex = left;
            }

        }


        return str.substring(startIndex,startIndex+maxLen);
    }

    public static void main(String[] args) {

        System.out.println(findNonRepeatingSubString("pwwkew"));
        System.out.println(findNonRepeatingSubString("bbbbbb"));
        System.out.println(findNonRepeatingSubString("abcabcbb"));

    }
}
