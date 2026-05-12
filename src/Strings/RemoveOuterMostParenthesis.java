package Strings;

public class RemoveOuterMostParenthesis {

    public static String removeParenthesis(String str)
    {
        String result = "";
        int count =0 ;
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            if (str.charAt(i)=='(' && count++ >0){
                System.err.println(count);
                result += str.charAt(i);
            }

            if (str.charAt(i)==')' && count-- >1){
                System.err.println(count);

                result += str.charAt(i);
            }

        }
        return result;
    }
    public static void main(String[] args) {

        String s = "(()()())(())()";
        System.out.println(removeParenthesis(s));

    }
}
