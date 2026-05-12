package aaaaaaaPracticeForIBS.string;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String input1, String input2){

        char [] arr1 = input1.toLowerCase().toCharArray();
        char [] arr2 = input2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }

    public static void main(String[] args) {

        System.out.println(isAnagram("Silent","listen"));


    }
}
