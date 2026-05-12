package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");

        String input = sc.next();
        input =  input.toLowerCase();
        char [] arrayOriginal  = input.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for ( int i = arrayOriginal.length-1; i>=0;i--){
           reversed.append(arrayOriginal[i]);
        }

        System.out.println("printing...");

        if (input.contentEquals(reversed))
        {
            System.out.println( input + "is a palindrome "  + reversed);
        }else {
            System.out.println( input + " is not a palindrome "  + reversed);
        }



    }
}
