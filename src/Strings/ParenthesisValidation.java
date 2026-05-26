package Strings;

import java.util.Iterator;
import java.util.Stack;

public class ParenthesisValidation {

    public static boolean isValid(String input){

        Stack<Character> stack = new Stack<>();

        for (int i =0;i<input.length();i++){
            char ch = input.charAt(i);
            if (ch =='(' || ch == '{' || ch=='['){
                stack.push(ch);
            }else {

                if (stack.empty()){
                    return false;
                }
                char top = stack.pop();
                if ((ch== '(' && top!=')') || (ch == '[' && top!=']') || (ch=='{' && top!='}')){
                    return false;
                }

            }

        }


        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String st = new String("(())");
        System.out.println(isValid(st));
    }
}
