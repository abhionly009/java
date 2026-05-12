package arraysExample;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String input){

        Stack<Character> stack = new Stack<>();
        for (char ch :input.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){

                stack.push(ch);
            }else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{')  || (ch == '[' && top != ']') ){
                    return false;
                }
            }
        }


        return stack.empty();
    }


    public static void main(String[] args) {

        String input = "{{}}()";

        System.out.println(isValid(input));


    }
}
