package numberRelated;

public class NumberPalindrome {
    public static boolean isPalindrome(int input){

        int original = input;
        int rev =0;

        while (input>0){
            int  rem = input%10;
            rev = rev * 10 + rem;
            input = input/10;
        }

       return original == rev;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1213));
    }

}
