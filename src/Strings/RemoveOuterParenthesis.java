package Strings;

public class RemoveOuterParenthesis {



    public static void main(String[] args) {

        String str = "(()())(())";
        StringBuilder sb = new StringBuilder();
        int open =0;

        for (char ch: str.toCharArray()){
            if (ch == '('){
                if (open>0){
                    sb.append(ch);
                }
                open++;
            }else {

                open--;
                if (open>0){
                    sb.append(ch);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
