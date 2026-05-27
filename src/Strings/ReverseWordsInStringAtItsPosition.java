package Strings;

import java.util.ArrayList;

public class ReverseWordsInStringAtItsPosition {

    public static String reverse(String input){
        int left = 0;
        int right = input.length()-1;
        char [] arr = input.toCharArray();
        while (left<right){
            char ch = arr[right];
            arr[right] = arr[left];
            arr[left] = ch;
            left++;
            right--;

        }
        return new String(arr);
    }

    public static void main(String[] args) {

        String str = "Hi I am Abhinandan";
       String [] list = str.split(" ");

       StringBuilder stringBuilder = new StringBuilder();
       for (String st:list){
           stringBuilder.append(reverse(st) +" ");
       }

        System.out.println(stringBuilder);

    }
}
