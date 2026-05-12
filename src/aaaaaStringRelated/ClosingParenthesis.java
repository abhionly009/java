package aaaaaStringRelated;

import java.util.Stack;

public class ClosingParenthesis {

    public static boolean isValid(String input){


        int left = 0;
        int right = input.length()-1;

        while(left<right){
            if (input.charAt(left) != '{' && input.charAt(right) == '}'){
                return false;
            }else if (input.charAt(left) != '[' && input.charAt(right) == ']'){
                return false;
            }else if (input.charAt(left) != '(' && input.charAt(right) == ')'){
                return false;
            }else {
                left++;
                right--;
            }

        }
        return true;


//        Stack<Character> stack = new Stack<>();
//        for (char ch :input.toCharArray()){
//
//            if (ch == '{' || ch == '[' || ch== '('){
//
//                stack.push(ch);
//            }else {
//                if (stack.isEmpty()) return false;
//                char top = stack.pop();
//
//                if ((ch == ')' && top != '(') ||
//                        (ch == '}' && top != '{') ||
//                        (ch == ']' && top != '[')) {
//                    return false;
//                }
//            }
//
//
//        }
//        return stack.empty();
    }

    public static void main(String[] args) {


        String string = "{[(])}";

        System.out.println(isValid(string));
    }

}
