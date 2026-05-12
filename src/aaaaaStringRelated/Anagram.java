package aaaaaStringRelated;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String first, String second){

        if (first.length()!=second.length())
            return false;

        char [] arr1 = first.toLowerCase().toCharArray();
        char [] arr2 = second.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }


    public static void main(String[] args) {

        String first = "Silent";
        String second = "listen";

        System.out.println( first +" AND " + second +" are Anagram === " + isAnagram(first,second) );
    }
}
