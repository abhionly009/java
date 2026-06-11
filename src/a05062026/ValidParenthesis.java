package a05062026;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValidParenthesis(String input){

        Stack<Character> stack = new Stack<>();
        for (int i =0;i<=input.length();i++){
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

            else {
                if (stack.isEmpty()){
                    return false;
                }
               char top =  stack.pop();
                if (ch==')' && top != '(' ||ch=='}' && top != '{' || ch==']' && top != '[' ){
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String input = "(()))";
        System.out.println(        isValidParenthesis(input));

    }
}
