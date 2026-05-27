package Strings;

import java.util.Stack;

public class CountNumberOfMissingParenthesisToMakeValid {

    public static void main(String[] args) {

        String input = "())))(";
        int open = 0;
        int unmatched = 0;


        for (char ch : input.toCharArray()){

            if (ch=='('){
                open++;
            }else {
                if (open>0){
                    open--;
                }else {
                    unmatched++;
                }
            }

        }

        System.out.println("Total Number of parenthesis required " + (open+unmatched));

    }

}
